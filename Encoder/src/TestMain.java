import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestMain {

	public static void main(String[] args) throws IOException {

		long timeStart = System.currentTimeMillis();
		dateiLesen("insert.txt");
		final long timeEnd = System.currentTimeMillis();
        System.out.println("Laufzeit des Programmes " + (timeEnd - timeStart) + " Millisek.");
	}

	public static void dateiLesen(String datName) throws IOException {

		String nachricht;
		int anzahl = 0;
		File file = new File(datName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		nachricht = br.readLine();
		br.close();
		System.out.println(nachricht);
		char[] cArray = nachricht.toCharArray();
		int[] iArray = new int[cArray.length];
		for (int i = 0; i < cArray.length; i++) {
			if (cArray[i] == 'a') {
				iArray[i] = 0;
			}
			if (cArray[i] == 'b') {
				iArray[i] = 1;
			}
			if (cArray[i] == 'c') {
				iArray[i] = 2;
			}
			if (cArray[i] == 'd') {
				iArray[i] = 3;
			}
			if (cArray[i] == 'e') {
				iArray[i] = 4;
			}
			if (cArray[i] == 'f') {
				iArray[i] = 5;
			}
			if (cArray[i] == 'g') {
				iArray[i] = 6;
			}
			if (cArray[i] == 'h') {
				iArray[i] = 7;
			}
			if (cArray[i] == 'i') {
				iArray[i] = 8;
			}
			if (cArray[i] == 'j') {
				iArray[i] = 9;
			}

		}
		int[] rArray = new int[iArray.length];
		int code = 0;
		int y = 0;
		for (int i = 0; i < i + 1; i++) {
			String sCode = String.valueOf(code);
			char[] cCode = sCode.toCharArray();
			if (sCode.length() > 4) {
				break;
			}
			for (int j = 0; j < iArray.length; j++) {
				rArray[j] = iArray[j] - Integer.valueOf(cCode[y] - 48);
				y++;
				if (y == cCode.length) {
					y = 0;
				}
			}
			code++;

			char[] arArray = new char[rArray.length];
			for (int z = 0; z < rArray.length; z++) {
				if (rArray[z] < 0) {
					rArray[z] = 10 + rArray[z];
				}
				if (rArray[z] == 0) {
					arArray[z] = 'a';
				}
				if (rArray[z] == 1) {
					arArray[z] = 'b';
				}
				if (rArray[z] == 2) {
					arArray[z] = 'c';
				}
				if (rArray[z] == 3) {
					arArray[z] = 'd';
				}
				if (rArray[z] == 4) {
					arArray[z] = 'e';
				}
				if (rArray[z] == 5) {
					arArray[z] = 'f';
				}
				if (rArray[z] == 6) {
					arArray[z] = 'g';
				}
				if (rArray[z] == 7) {
					arArray[z] = 'h';
				}
				if (rArray[z] == 8) {
					arArray[z] = 'i';
				}
				if (rArray[z] == 9) {
					arArray[z] = 'j';
				}

			}
			int counter = 0;
			for (int j = 0; j < arArray.length - 2; j++) {
				if (arArray[j] == arArray[j+1]&&arArray[j+1]==arArray[j+2]&&arArray[j]=='a') {
					counter++;
				}
			}
			if (counter == 1) {
				anzahl++;
				for (int k = 0; k < arArray.length; k++) {
					System.out.print("" + arArray[k]);
				}
				System.out.print(" Code: ");
				System.out.println(code-1);
				System.out.println();
			}
		}
		System.out.println("Es wurden: "+anzahl+" Möglichkeiten gefunden.");
	}
}
