import javax.swing.JFrame;
import javax.swing.JOptionPane;
// note that a keyword can be as long as you like - in fact this makes the 
// cipher more secure! A passage from a book is a good idea for this 

	public class Vigenere_Square_Encode extends JFrame {
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
		// method to encipher a character passed to it
		public static String encipher(String textInput, String keyword, int[][] vigenere, int i) {
			int character = 0;
			int keywordLetter = 0;
			// convert the text letter to its corresponding number
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
			// match up the keyword and text letters to produce the enciphered letter (as its 
			// corresponding number) 
			int encipheredInteger = vigenere[keywordLetter][character];
			String cipherText = "";
			// convert the cipher number to its corresponding letter 
			if (encipheredInteger == 0) {
				cipherText = cipherText.concat("a");
			} else if (encipheredInteger == 1) {
				cipherText = cipherText.concat("b");
			} else if (encipheredInteger == 2) {
				cipherText = cipherText.concat("c");
			} else if (encipheredInteger == 3) {
				cipherText = cipherText.concat("d");
			} else if (encipheredInteger == 4) {
				cipherText = cipherText.concat("e");
			} else if (encipheredInteger == 5) {
				cipherText = cipherText.concat("f");
			} else if (encipheredInteger == 6) {
				cipherText = cipherText.concat("g");
			} else if (encipheredInteger == 7) {
				cipherText = cipherText.concat("h");
			} else if (encipheredInteger == 8) {
				cipherText = cipherText.concat("i");
			} else if (encipheredInteger == 9) {
				cipherText = cipherText.concat("j");
			} else if (encipheredInteger == 10) {
				cipherText = cipherText.concat("k");
			} else if (encipheredInteger == 11) {
				cipherText = cipherText.concat("l");
			} else if (encipheredInteger == 12) {
				cipherText = cipherText.concat("m");
			} else if (encipheredInteger == 13) {
				cipherText = cipherText.concat("n");
			} else if (encipheredInteger == 14) {
				cipherText = cipherText.concat("o");
			} else if (encipheredInteger == 15) {
				cipherText = cipherText.concat("p");
			} else if (encipheredInteger == 16) {
				cipherText = cipherText.concat("q");
			} else if (encipheredInteger == 17) {
				cipherText = cipherText.concat("r");
			} else if (encipheredInteger == 18) {
				cipherText = cipherText.concat("s");
			} else if (encipheredInteger == 19) {
				cipherText = cipherText.concat("t");
			} else if (encipheredInteger == 20) {
				cipherText = cipherText.concat("u");
			} else if (encipheredInteger == 21) {
				cipherText = cipherText.concat("v");
			} else if (encipheredInteger == 22) {
				cipherText = cipherText.concat("w");
			} else if (encipheredInteger == 23) {
				cipherText = cipherText.concat("x");
			} else if (encipheredInteger == 24) {
				cipherText = cipherText.concat("y");
			} else if (encipheredInteger == 25) {
				cipherText = cipherText.concat("z");
			}
			return cipherText;
		}
		public static void main(String[] args) { 
			// create the Vigenere table as a 2D array
			int[][] vigenere = create_Array();
			boolean valid = false;
			// the keyword used to encrypt the text
			String keyword = "";
			// the text to be encrypted
			String textInput = "";
			// the validation mechanism for the keyword
			while (valid == false) { 
				keyword = JOptionPane.showInputDialog(null,"Please enter your keyword"); 
				keyword = keyword.trim(); 
				keyword = keyword.toLowerCase();
				valid = true;
				// check if there are any spaces 
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
				textInput = JOptionPane.showInputDialog(null,"Please enter the text that you wish to encipher");
				textInput = textInput.trim(); 
				textInput = textInput.replaceAll(" ", "");
				textInput = textInput.toLowerCase();
				valid = true;
				// check that text has been entered 
				if (textInput.length() < 1) { 
					valid = false;
				// check that there are no numbers 
				} else if (textInput.matches(".*[0-9].*") == true) {
					valid = false;
					System.out.println("The text cannot contain any numbers!");
				// check that there are no special characters 
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
			String cipherText = "";
			// encipher the text, letter by letter 
			for (int i = 0; i < textInputLength; i++) {
				cipherText = cipherText.concat(encipher(textInput, keyword, vigenere, i));
			}
			// show the cipher text 
			JOptionPane.showMessageDialog(null, cipherText);
		}
	}
