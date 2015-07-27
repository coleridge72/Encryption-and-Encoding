import javax.swing.JFrame;
import javax.swing.JOptionPane;

	public class Vigenere_Square_Decode extends JFrame {
		// method to create Vigenere table as 2D array
		// a to z are represented by numbers 0 to 25
		// we shift the numbers down by 1 in each column to create the square
		public static int[][] create_Array() {
			//create array
			int[][] vigenere = new int[26][26];
			//initialize array
			int count = 0;
			for (int i = 0; i < 26; i++) {
				vigenere[0][i] = count; 
				count++;
			}
			count = 1;
			for (int i = 0; i < 26; i++) {
				vigenere[1][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 2;
			for (int i = 0; i < 26; i++) {
				vigenere[2][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 3;
			for (int i = 0; i < 26; i++) {
				vigenere[3][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 4;
			for (int i = 0; i < 26; i++) {
				vigenere[4][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 5;
			for (int i = 0; i < 26; i++) {
				vigenere[5][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 6;
			for (int i = 0; i < 26; i++) {
				vigenere[6][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 7;
			for (int i = 0; i < 26; i++) {
				vigenere[7][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 8;
			for (int i = 0; i < 26; i++) {
				vigenere[8][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 9;
			for (int i = 0; i < 26; i++) {
				vigenere[9][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 10;
			for (int i = 0; i < 26; i++) {
				vigenere[10][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 11;
			for (int i = 0; i < 26; i++) {
				vigenere[11][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 12;
			for (int i = 0; i < 26; i++) {
				vigenere[12][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 13;
			for (int i = 0; i < 26; i++) {
				vigenere[13][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 14;
			for (int i = 0; i < 26; i++) {
				vigenere[14][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 15;
			for (int i = 0; i < 26; i++) {
				vigenere[15][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 16;
			for (int i = 0; i < 26; i++) {
				vigenere[16][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 17;
			for (int i = 0; i < 26; i++) {
				vigenere[17][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 18;
			for (int i = 0; i < 26; i++) {
				vigenere[18][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 19;
			for (int i = 0; i < 26; i++) {
				vigenere[19][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 20;
			for (int i = 0; i < 26; i++) {
				vigenere[20][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 21;
			for (int i = 0; i < 26; i++) {
				vigenere[21][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 22;
			for (int i = 0; i < 26; i++) {
				vigenere[22][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 23;
			for (int i = 0; i < 26; i++) {
				vigenere[23][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 24;
			for (int i = 0; i < 26; i++) {
				vigenere[24][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			count = 25;
			for (int i = 0; i < 26; i++) {
				vigenere[25][i] = count; 
				if (count < 25) {
					count++;
				} else {
					count = 0;
				}
			}
			return vigenere;
		}
		// method to decipher a character passed to it 
		public static String decipher(String textInput, String keyword, int[][] vigenere, int i) { 
			int character = 0;
			int keywordLetter = 0;
			// convert the cipher text letter to its corresponding number
			if (textInput.substring(i, (i + 1)).equalsIgnoreCase("a") == true) {
				character = 0;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("b") == true) {
				character = 1;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("c") == true) {
				character = 2;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("d") == true) {
				character = 3;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("e") == true) {
				character = 4;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("f") == true) {
				character = 5;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("g") == true) {
				character = 6;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("h") == true) {
				character = 7;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("i") == true) {
				character = 8;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("j") == true) {
				character = 9;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("k") == true) {
				character = 10;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("l") == true) {
				character = 11;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("m") == true) {
				character = 12;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("n") == true) {
				character = 13;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("o") == true) {
				character = 14;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("p") == true) {
				character = 15;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("q") == true) {
				character = 16;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("r") == true) {
				character = 17;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("s") == true) {
				character = 18;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("t") == true) {
				character = 19;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("u") == true) {
				character = 20;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("v") == true) {
				character = 21;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("w") == true) {
				character = 22;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("x") == true) {
				character = 23;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("y") == true) {
				character = 24;
			} else if (textInput.substring(i, (i + 1)).equalsIgnoreCase("z") == true) {
				character = 25;
			}
			// convert the keyword letter to its corresponding number
			if (keyword.substring(i, (i + 1)).equalsIgnoreCase("a") == true) {
				keywordLetter = 0;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("b") == true) {
				keywordLetter = 1;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("c") == true) {
				keywordLetter = 2;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("d") == true) {
				keywordLetter = 3;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("e") == true) {
				keywordLetter = 4;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("f") == true) {
				keywordLetter = 5;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("g") == true) {
				keywordLetter = 6;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("h") == true) {
				keywordLetter = 7;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("i") == true) {
				keywordLetter = 8;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("j") == true) {
				keywordLetter = 9;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("k") == true) {
				keywordLetter = 10;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("l") == true) {
				keywordLetter = 11;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("m") == true) {
				keywordLetter = 12;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("n") == true) {
				keywordLetter = 13;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("o") == true) {
				keywordLetter = 14;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("p") == true) {
				keywordLetter = 15;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("q") == true) {
				keywordLetter = 16;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("r") == true) {
				keywordLetter = 17;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("s") == true) {
				keywordLetter = 18;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("t") == true) {
				keywordLetter = 19;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("u") == true) {
				keywordLetter = 20;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("v") == true) {
				keywordLetter = 21;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("w") == true) {
				keywordLetter = 22;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("x") == true) {
				keywordLetter = 23;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("y") == true) {
				keywordLetter = 24;
			} else if (keyword.substring(i, (i + 1)).equalsIgnoreCase("z") == true) {
				keywordLetter = 25;
			}
			boolean found = false;
			int plainText = 27;
			// match up the letters from the keyword row and the enciphered character to the plain 
			// text column, giving the plain text character 
			for (int j = 0; (j < 26) && (found == false); j++) {
				if (vigenere[keywordLetter][j] == character) {
					plainText = j;
				}
			}
			String text = "";
			// convert the plain text number to its corresponding character 
			if (plainText == 0) {
				text = text.concat("a");
			} else if (plainText == 1) {
				text = text.concat("b");
			} else if (plainText == 2) {
				text = text.concat("c");
			} else if (plainText == 3) {
				text = text.concat("d");
			} else if (plainText == 4) {
				text = text.concat("e");
			} else if (plainText == 5) {
				text = text.concat("f");
			} else if (plainText == 6) {
				text = text.concat("g");
			} else if (plainText == 7) {
				text = text.concat("h");
			} else if (plainText == 8) {
				text = text.concat("i");
			} else if (plainText == 9) {
				text = text.concat("j");
			} else if (plainText == 10) {
				text = text.concat("k");
			} else if (plainText == 11) {
				text = text.concat("l");
			} else if (plainText == 12) {
				text = text.concat("m");
			} else if (plainText == 13) {
				text = text.concat("n");
			} else if (plainText == 14) {
				text = text.concat("o");
			} else if (plainText == 15) {
				text = text.concat("p");
			} else if (plainText == 16) {
				text = text.concat("q");
			} else if (plainText == 17) {
				text = text.concat("r");
			} else if (plainText == 18) {
				text = text.concat("s");
			} else if (plainText == 19) {
				text = text.concat("t");
			} else if (plainText == 20) {
				text = text.concat("u");
			} else if (plainText == 21) {
				text = text.concat("v");
			} else if (plainText == 22) {
				text = text.concat("w");
			} else if (plainText == 23) {
				text = text.concat("x");
			} else if (plainText == 24) {
				text = text.concat("y");
			} else if (plainText == 25) {
				text = text.concat("z");
			}
			return text;
		}
		public static void main(String[] args) {
			// create vigenere square in the form of an array 
			int[][] vigenere = create_Array();
			String keyword = "";
			String textInput = "";
			boolean valid = false;
			while (valid == false) { 
				keyword = JOptionPane.showInputDialog(null,"Please enter your keyword"); 
				keyword = keyword.trim(); 
				keyword = keyword.toLowerCase();
				valid = true;
				// check if there are spaces 
				if (keyword.contains(" ") == true) { 
					valid = false;
					System.out.println("The key word cannot contain any spaces!");
				// check if there are any numbers 
				} else if (keyword.matches(".*[0-9].*") == true) {
					valid = false;
					System.out.println("The key word cannot contain any numbers!");
				// check if there are any special characters 
				} else if (keyword.matches("[a-zA-Z0-9 ]*") == false) {
					valid = false;
					System.out.println("The key word cannot contain any special characters!");
				// check if a keyword has been entered 
				} else if (keyword.length() < 1 == true) {
					valid = false;
				}
			} 
			valid = false; 
			// the validation method for the text
			while (valid == false) { 
				textInput = JOptionPane.showInputDialog(null,"Please enter the text that you wish to decipher");
				textInput = textInput.trim(); 
				textInput = textInput.replaceAll(" ", "");
				textInput = textInput.toLowerCase();
				valid = true;
				// check if text has been entered 
				if (textInput.length() < 1) { 
					valid = false;
					// check if there are any numbers  
				} else if (textInput.matches(".*[0-9].*") == true) {
					valid = false;
					System.out.println("The text cannot contain any numbers!");
				// check if there are any special characters 
				} else if (textInput.matches("[a-zA-Z0-9 ]*") == false) {
					valid = false;
					System.out.println("The text cannot contain any special characters!");
				}
			} 
			boolean correctLength = false;
			int textInputLength = textInput.length();
			// the keyword is repeated multiple times to form a single string (that is compared to the 
			// text during the enciphering process)
			for (int i = 0; correctLength == false; i++) {
				keyword = keyword.concat(keyword);
				if (keyword.length() > textInputLength) {
					correctLength = true;
				}
			}
			String text = "";
			// decipher the text, letter by letter 
			for (int i = 0; i < textInputLength; i++) {
				text = text.concat(decipher(textInput, keyword, vigenere, i));
			}
			// show deciphered plain text 
			JOptionPane.showMessageDialog(null, text);
		}
	}
