package entities;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {

	public static String converteJsonString(BufferedReader bufferedReader) throws IOException {
		String resp, jsonString = "";
		while ((resp = bufferedReader.readLine()) != null) {
			jsonString += resp;
		}

		return jsonString;
	}

}
