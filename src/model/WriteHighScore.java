package model;

import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteHighScore {

	public void WriteHighScore(ArrayList<HighScore> scores, String filePath) {
		PrintWriter prnt = null;
		try {
			prnt = new PrintWriter(filePath);
			for (HighScore s : scores) {
				prnt.write(s.name + ";" + s.score + System.lineSeparator());

			}
			prnt.flush();
			prnt.close();

		} catch (Exception ex) {
			System.out.println("Nicht möglich!");
			ex.printStackTrace();
		} 
	}
}
