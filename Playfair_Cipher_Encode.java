import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Playfair_Cipher_Encode {
		public static void main(String[] args) { 
			String inputKeyword = ""; 
			boolean valid = false; 
			// the validation mechanism for the keyword
			while (valid == false) { 
				inputKeyword = JOptionPane.showInputDialog(null,"Please enter your keyword"); 
				inputKeyword = inputKeyword.trim(); 
				inputKeyword = inputKeyword.toLowerCase();
				valid = true;
				// check if there are any spaces 
				if (inputKeyword.contains(" ") == true) { 
					valid = false;
					System.out.println("The key word cannot contain any spaces!");
				// check if there are any numbers 
				} else if (inputKeyword.matches(".*[0-9].*") == true) {
					valid = false;
					System.out.println("The key word cannot contain any numbers!");
				// check if there are any special characters 
				} else if (inputKeyword.matches("[a-zA-Z0-9 ]*") == false) {
					valid = false;
					System.out.println("The key word cannot contain any special characters!");
				// check if a keyword has been entered 
				} else if (inputKeyword.length() < 1 == true) {
					valid = false;
				}
			} 
			inputKeyword = inputKeyword.toLowerCase(); 
			String inputText = "";
			valid = false;
			// the validation method for the text
			while (valid == false) { 
				inputText = JOptionPane.showInputDialog(null,"Please enter the text that you wish to encipher");
				inputText = inputText.trim(); 
				inputText = inputText.replaceAll(" ", "");
				valid = true;
				// check that text has been entered 
				if (inputText.length() < 1) { 
					valid = false;
				// check that there are no numbers 
				} else if (inputText.matches(".*[0-9].*") == true) {
					valid = false;
					System.out.println("The text cannot contain any numbers!");
				// check that there are no special characters 
				} else if (inputText.matches("[a-zA-Z0-9 ]*") == false) {
					valid = false;
					System.out.println("The text cannot contain any special characters!");
				}
			} 
			// create the letter square in the form of a 5x5 array 
			String[][] array = new String[5][5]; 
			// initialise the array - ex is just an initial value string 
			for (int i = 0; i < 5; i++) { 
				for (int j = 0; j < 5; j++) { 
					array[i][j] = "ex";   
				} 
			}		
			String string1 = ""; 
			String string2 = ""; 
			boolean accept = false;                           
			int count = 1; 
			// remove repeat letter's in key word 
			if (inputKeyword.substring(0, 1).equalsIgnoreCase("j") == true) { 
				inputKeyword = inputKeyword.substring(1, inputKeyword.length()); 
			} 
			// remove the letter j from the keyword (Playfair ciphers are 5x5 = 25 letters, so i and j are used interchangeably) 
			while (accept == false) { 
					if (inputKeyword.indexOf(inputKeyword.substring(count, count + 1)) != inputKeyword.lastIndexOf(inputKeyword.substring(count, count + 1)) || inputKeyword.substring(count, count + 1).equalsIgnoreCase("j") == true) { 
						string1 = inputKeyword.substring(0, inputKeyword.lastIndexOf(inputKeyword.substring(count, count + 1))); 
						string2 = inputKeyword.substring(inputKeyword.lastIndexOf(inputKeyword.substring(count, count + 1)) + 1, inputKeyword.length()); 
						inputKeyword = string1.concat(string2); 
					} else { 
						count++; 
					} 
					if (count == inputKeyword.length()) { 
						accept = true; 
					} 				
			} 
			int count1 = 0; 
			// fill the array with the key word 
			for (int i = 0; i < 5 && count1 < inputKeyword.length(); i++) { 
				for (int j = 0; j < 5 && count1 < inputKeyword.length(); j++) { 
					array[i][j] = inputKeyword.substring(count1, count1 + 1); 
					count1++;  				
				} 
			} 
			// eliminate character's which are not required (by comparison to a string of all alphabet letters) 
			String list = "abcdefghiklmnopqrstuvwxyz "; 
			for (int a = 0; a < inputKeyword.length(); a++) { 
				for (int q = 0; q < list.length(); q++) {   
					if (inputKeyword.substring(a, a + 1).equalsIgnoreCase(list.substring(q, q + 1)) == true) { 
						string1 = list.substring(0, q); 
						string2 = list.substring(q + 1, list.length()); 
						list = string1.concat(string2); 
					} 
				} 
			} 
			int count2 = 0; 
			// fill rest of the array 
			for (int i = 0; i < 5; i++) { 
				for (int j = 0; j < 5; j++) { 	
					if (array[i][j].equalsIgnoreCase("ex") == true) { 
						array[i][j] = list.substring(count2, count2 + 1); 
						count2++; 
					} 
				} 
			} 
			// add x to the	middle of any letter pair's 
			for (int a = 0; a < (inputText.length() - 1); a++) { 
				if (inputText.substring(a, a + 1).equalsIgnoreCase(inputText.substring(a + 1, a + 2)) == true && inputText.substring(a, a + 1).equalsIgnoreCase(" ") == false) { 
					string1 = inputText.substring(0, a + 1).concat("x"); 
					string2 = inputText.substring(a + 1, inputText.length()); 
					inputText = string1.concat(string2);         
				} 
			} 

			// add x if parity of a word isn't even 
			string1 = " "; 
			inputText = string1.concat(inputText); 
			inputText = inputText + " "; 
			boolean done = false; 
			int place = 0; 
			while (done == false) { 
				if (place == inputText.length() - 1) { 
					done = true; 
				} else if (inputText.substring(place, inputText.indexOf(" ", place + 1)).length()%2 == 0) { 
					string1 = inputText.substring(0, inputText.indexOf(" ", place + 1)).concat("x"); 
					string2 = inputText.substring(inputText.indexOf(" ", place + 1), inputText.length()); 
					inputText = string1.concat(string2); 
				} 
				place = inputText.indexOf(" ", place + 1); 
			} 
			String output = ""; 
			int position11 = 0; 
			int position12 = 0;         
			int position21 = 0; 
			int position22 = 0; 
			int last = 2;   
			char c1 = inputText.charAt(0); 
			char c2 = inputText.charAt(0); 
			// encipher the text, 2 letters at a time 
			// If the letters are in the same column, then they move one down from each other 
			// If they are in the same row, then they move one to the right from each other 
			// If they are in neither the same row nor the same column, then they move to the 
			// letter in their own row that lies in the same column as the other letter! 
			for (int a = 1; a < inputText.length(); a++) { 
				if (inputText.substring(a, a + 1).equalsIgnoreCase(" ") != true && inputText.substring(a + 1, a + 2).equalsIgnoreCase(" ") != true && a != last) { 
					// find the position of the first letter in the array/square
					for (int i = 0; i < 5; i++) { 
						for (int j = 0; j < 5; j++) { 
							if (inputText.substring(a, a + 1).equalsIgnoreCase(array[i][j]) == true) { 
								position11 = i; 
								position12 = j; 
								c1 = inputText.charAt(a); 
							}
						} 
					} 
					// find the position of the second letter in the array/square
					for (int k = 0; k < 5; k++) { 
						for (int l = 0; l < 5; l++) { 
							if (inputText.substring(a + 1, a + 2).equalsIgnoreCase(array[k][l]) == true) { 
								position21 = k; 
								position22 = l; 
								c2 = inputText.charAt(a + 1); 
							}
						} 
					} 
					// are they in the same row? 
					if (position11 == position21) { 
						// is the first letter at the far right of the square/array? 
						if (position12 != 4) { 
							position12++; 
							if (Character.isUpperCase(c1) == true) { 
								// add the enciphered letter to the cipher text string 
								output = output + array[position11][position12].toUpperCase();  
					 		} else { 
								output = output + array[position11][position12]; 
					 		}
						} else { 
							position12 = 0; 
							if (Character.isUpperCase(c1) == true) { 
								output = output + array[position11][position12].toUpperCase();  
					 		} else { 
								output = output + array[position11][position12]; 
					 		}
						} 
						// is the second letter at the far right of the square/array? 
						if (position22 != 4) { 
							position22++;
							if (Character.isUpperCase(c2) == true) { 
								output = output + array[position21][position22].toUpperCase(); 
							} else { 
								output = output + array[position21][position22]; 
							} 
						} else { 
							position22 = 0; 
							if (Character.isUpperCase(c2) == true) { 
								output = output + array[position21][position22].toUpperCase(); 
							} else { 
								output = output + array[position21][position22]; 
							} 
						} 
					// are they in the same column? 
					} else if (position12 == position22) { 
						// is the first letter at the bottom of the square/array? 
						if (position11 != 0) { 
							position11--; 
							if (Character.isUpperCase(c1) == true) { 
								output = output + array[position11][position12].toUpperCase(); 
							} else { 
								output = output + array[position11][position12];
							}
						} else { 
							position11 = 4; 
							if (Character.isUpperCase(c1) == true) { 
								output = output + array[position11][position12].toUpperCase(); 
							} else { 
								output = output + array[position11][position12];
							}
						} 
						// is the second letter at the bottom of the square/array? 
						if (position21 != 0) { 
							position21--; 
							if (Character.isUpperCase(c2) == true) { 
								output = output + array[position21][position22].toUpperCase(); 
							} else { 
								output = output + array[position21][position22]; 
							} 
						} else { 
							position21 = 4; 
							if (Character.isUpperCase(c2) == true) { 
								output = output + array[position21][position22].toUpperCase(); 
							} else { 
								output = output + array[position21][position22]; 
							}
						} 
					// the letters are in neither the same row nor the same column! 
					} else { 
						if (Character.isUpperCase(c1) == true) { 
							output = output + array[position11][position22].toUpperCase(); 
						} else { 
							output = output + array[position11][position22]; 
						}
						if (Character.isUpperCase(c2) == true) { 
							output = output + array[position21][position12].toUpperCase(); 
						} else { 
							output = output + array[position21][position12]; 
						} 
					}
					last = a + 1; 
				} else if (inputText.substring(a, a + 1).equalsIgnoreCase(" ") == true) { 
					output = output + " "; 
				} 
			} 
			JOptionPane.showMessageDialog(null, output);
		} 
	} 
