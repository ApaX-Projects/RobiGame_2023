package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HighScoreReader {

	public static void main(String[] args)
	{
		File liste = new File("HighScore.txt");
		try {
			FileReader reader = new FileReader(liste);
			BufferedReader bReader = new BufferedReader(reader);
			
			String zeile = "";
			while(bReader.ready())
			{
				zeile = bReader.readLine();
				System.out.println(zeile);
			}
			reader.close(); // Datei Ressourcen wieder freigeben
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Datei nicht gefunden...");
			//e.printStackTrace();
		} catch (IOException f) {
			// TODO Auto-generated catch block
			
			System.out.println("Fehler: Kann nicht lesen...");
			f.printStackTrace();
		}
		

	}
	
	public ArrayList<HighScore> readHighScores(String filePath)
	{
		ArrayList<HighScore> highscores = new ArrayList<>();
		
		File liste = new File(filePath);
		try {
			FileReader reader = new FileReader(liste);
			BufferedReader bReader = new BufferedReader(reader);
			
			String zeile = "";
			while(bReader.ready())
			{
				zeile = bReader.readLine();
				
				HighScore hs = parseHighScore(zeile);
				highscores.add(hs);
				
				System.out.println(zeile);
			}
			reader.close(); // Datei Ressourcen wieder freigeben
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Datei nicht gefunden...");
			//e.printStackTrace();
		} catch (IOException f) {
			// TODO Auto-generated catch block
			
			System.out.println("Fehler: Kann nicht lesen...");
			f.printStackTrace();
		}
		
		return highscores;
		
	}
	
	/**
	 * lese Highscoreliste und gib Array von Highscore Objekten zurück
	 * @param linePath
	 * @return
	 */
	private HighScore parseHighScore(String linePath)
	{
			
		String[] parts = linePath.split(";");
		String name = parts[0];
		int score = Integer.parseInt(parts[1]);
		HighScore result = new HighScore(parts[0], Integer.parseInt(parts[1]));
		
		return result;
	}

}
