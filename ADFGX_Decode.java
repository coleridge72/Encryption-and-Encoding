import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.*; 

public class ADFGX_Decode { 
	public static void main(String[] args) { 
		String input = ""; 
		String inputKeyword = ""; 
		boolean valid = false; 
		// check key word length 
		while (valid == false) { 
			inputKeyword = JOptionPane.showInputDialog(null,"Please enter your keyword");  
			inputKeyword.trim(); 
			if (inputKeyword.contains(" ") == false) { 
				valid = true; 
			} else { 
				System.out.println("The key word cannot contain any spaces ! "); 
			} 
		} 
		inputKeyword = inputKeyword.toLowerCase(); 
		// check text length 
		String inputText = ""; 
		valid = false; 
		while (valid == false) { 
			inputText = JOptionPane.showInputDialog(null,"Please enter the text that you wish to decipher"); 
			inputText.trim(); 
			if (inputText.length() > 2) { 
				valid = true; 
			} else { 
				System.out.println("The length of the text must be 3 or greater ! "); 
			} 
		} 
		inputText = inputText + " "; 
		String keyword = ""; 
		// alphabetically order the key word 
				if (inputKeyword.contains("a") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("a", track) != -1) { 
							keyword = keyword + "a"; 
							track = inputKeyword.indexOf("a", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("b") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("b", track) != -1) { 
							keyword = keyword + "b"; 
							track = inputKeyword.indexOf("b", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("c") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("c", track) != -1) { 
							keyword = keyword + "c"; 
							track = inputKeyword.indexOf("c", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("d") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("d", track) != -1) { 
							keyword = keyword + "d"; 
							track = inputKeyword.indexOf("d", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("e") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("e", track) != -1) { 
							keyword = keyword + "e"; 
							track = inputKeyword.indexOf("e", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("f") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("f", track) != -1) { 
							keyword = keyword + "f"; 
							track = inputKeyword.indexOf("f", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("g") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("g", track) != -1) { 
							keyword = keyword + "g"; 
							track = inputKeyword.indexOf("g", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("h") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("h", track) != -1) { 
							keyword = keyword + "h"; 
							track = inputKeyword.indexOf("h", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("i") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("i", track) != -1) { 
							keyword = keyword + "i"; 
							track = inputKeyword.indexOf("i", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("j") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("j", track) != -1) { 
							keyword = keyword + "j"; 
							track = inputKeyword.indexOf("j", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("k") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("k", track) != -1) { 
							keyword = keyword + "k"; ; 
							track = inputKeyword.indexOf("k", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("l") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("l", track) != -1) { 
							keyword = keyword + "l"; 
							track = inputKeyword.indexOf("l", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("m") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("m", track) != -1) { 
							keyword = keyword + "m"; 
							track = inputKeyword.indexOf("m", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("n") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("n", track) != -1) { 
							keyword = keyword + "n"; 
							track = inputKeyword.indexOf("n", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("o") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("o", track) != -1) { 
							keyword = keyword + "o"; 
							track = inputKeyword.indexOf("o", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("p") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("p", track) != -1) { 
							keyword = keyword + "p"; 
							track = inputKeyword.indexOf("p", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("q") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("q", track) != -1) { 
							keyword = keyword + "q"; 
							track = inputKeyword.indexOf("q", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("r") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("r", track) != -1) { 
							keyword = keyword + "r"; 
							track = inputKeyword.indexOf("r", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("s") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("s", track) != -1) { 
							keyword = keyword + "s"; 
							track = inputKeyword.indexOf("s", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("t") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("t", track) != -1) { 
							keyword = keyword + "t"; 
							track = inputKeyword.indexOf("t", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} if (inputKeyword.contains("u") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("u", track) != -1) { 
							keyword = keyword + "u"; 
							track = inputKeyword.indexOf("u", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					} 
				} 
				if (inputKeyword.contains("v") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("v", track) != -1) { 
							keyword = keyword + "v"; 
							track = inputKeyword.indexOf("v", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("w") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("w", track) != -1) { 
							keyword = keyword + "w"; 
							track = inputKeyword.indexOf("w", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("x") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("x", track) != -1) { 
							keyword = keyword + "x"; 
							track = inputKeyword.indexOf("x", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("y") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("y", track) != -1) { 
							keyword = keyword + "y"; 
							track = inputKeyword.indexOf("y", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				} 
				if (inputKeyword.contains("z") == true) { 
					boolean valid1 = false; 
					int track = 0; 
					while (valid1 == false) { 
						if (inputKeyword.indexOf("z", track) != -1) { 
							keyword = keyword + "z"; 
							track = inputKeyword.indexOf("z", track) + 1; 
						} else { 
							valid1 = true; 
						} 
					}
				}                  
		int dimension = 0;  
		if (inputText.length()%inputKeyword.length() != 0) { 
			dimension = (int)Math.floor((inputText.length()/inputKeyword.length())) + 1; 
		} else { 
			dimension = inputText.length()/inputKeyword.length();          
		}      
		int counter1 = 0; 
		int counter2 = -1;         
		boolean end = false; 
		int number = 0; 
		int number1 = 1; 
		int track = 0;  
		while (end == false) { 
			if (inputText.indexOf(" ", track + 1) == inputText.lastIndexOf(" ")) { 
				end = true; 
			} else { 
				number1++; 
				track = inputText.indexOf(" ", track + 1); 
			}
		} 
		// order the ciphertext into each column of the key word 
		end = false; 
		String[] strings = new String[number1]; 
		String[][] array1 = new String[dimension][inputKeyword.length()]; 
		counter1 = 0; 
		counter2 = -1; 
		number = 0; 
		while (end == false) {
			counter2++; 
			counter1 = counter2; 
			counter2 = inputText.indexOf(" ", counter1); 
			if (counter2 == inputText.lastIndexOf(" ")) {          
				end = true; 
			} 
			strings[number] = inputText.substring(counter1, counter2); 
			number++;   
		}         
		int[] order = new int[inputKeyword.length()]; 
		int numbera = 0; 
		for (int a = 0; a < keyword.length(); a++) { 
			String s = inputKeyword.substring(a, a + 1); 
			order[a] = keyword.indexOf(s, numbera);      
			if (inputKeyword.indexOf(s, numbera) == inputKeyword.lastIndexOf(s)) { 
				numbera = 0;         
			}          
		} 
		for (int a = 0; a < keyword.length(); a++) { 
			System.out.print(order[a]); 
		} 
		int counter = 0; 
		for (int z = 0; z < inputKeyword.length(); z++) {   
			for (int a = 0; a < dimension; a++) { 
				if (counter < strings[order[z]].length()) { 
					array1[a][z] = strings[order[z]].substring(counter, counter + 1); 
					System.out.println(array1[a][z]); 
					counter++;     
				} else { 
					array1[a][z] = ""; 
				}
			} 
			counter = 0; 
		} 
		String output = ""; 
		for (int a = 0; a < dimension; a++) { 
			for (int z = 0; z < inputKeyword.length(); z++) {   
				output = output + array1[a][z]; 
			} 
		} 
		String[][] array = new String[5][5];       
		// initialise the array 
		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < 5; j++) { 
				array[i][j] = "ex"; 
			} 
		} 
			// have user enter their own polybius square 
				boolean check = false; 
				while (check == false) { 
					input = JOptionPane.showInputDialog(null,"Please enter your polybius square line by line from left to right (as one string)");
					input = input.toLowerCase(); 
					if (input.length() == 25 && input.contains("a") == true && input.contains("b") == true && input.contains("c") == true && input.contains("d") == true && input.contains("e") == true && input.contains("f") == true && input.contains("g") == true && input.contains("h") == true && input.contains("i") == true && input.contains("k") == true && input.contains("l") == true && input.contains("m") == true && input.contains("n") == true && input.contains("o") == true && input.contains("p") == true && input.contains("q") == true && input.contains("r") == true && input.contains("s") == true && input.contains("t") == true && input.contains("u") == true && input.contains("v") == true && input.contains("w") == true && input.contains("x") == true && input.contains("y") == true && input.contains("z") == true) { 
						int x = 0; 
						for (int i = 0; i < 5; i++) { 
							for (int y = 0; y < 5; y++) { 
								array[i][y] = input.substring(x, x + 1); 
								x++; 
							}   
					    } 
						check = true; 
					} else { 
						System.out.println("Please enter the letters together in a block of 25,omit the letter j, and do not repeat any letters!"); 
					}
				} 
		// show square ! 
		System.out.println("The following is your unique Polybius Square : "); 
		System.out.println("  A D F G X"); 
		System.out.println("A " + array[0][0] + " " + array[0][1] + " " + array[0][2] + " " + array[0][3] + " " + array[0][4]);
		System.out.println("D " + array[1][0] + " " + array[1][1] + " " + array[1][2] + " " + array[1][3] + " " + array[1][4]);
		System.out.println("F " + array[2][0] + " " + array[2][1] + " " + array[2][2] + " " + array[2][3] + " " + array[2][4]);
		System.out.println("G " + array[3][0] + " " + array[3][1] + " " + array[3][2] + " " + array[3][3] + " " + array[3][4]);
		System.out.println("X " + array[4][0] + " " + array[4][1] + " " + array[4][2] + " " + array[4][3] + " " + array[4][4]); 
		String output1 = ""; 
		for (int a = 0; a < output.length(); a = a + 2) { 
			String letter1 = output.substring(a, a + 1); 
			String letter2 = output.substring(a + 1, a + 2); 
			int num1 = 0; 
			int num2 = 0; 
			if (letter1.equals("A") == true) { 
				num1 = 0; 
			} else if (letter1.equals("D") == true) { 
				num1 = 1; 
			} else if (letter1.equals("F") == true) { 
				num1 = 2; 
			} else if (letter1.equals("G") == true) { 
				num1 = 3; 
			} else if (letter1.equals("X") == true) { 
				num1 = 4; 
			} 
			if (letter2.equals("A") == true) { 
				num2 = 0; 
			} else if (letter2.equals("D") == true) { 
				num2 = 1; 
			} else if (letter2.equals("F") == true) { 
				num2 = 2; 
			} else if (letter2.equals("G") == true) { 
				num2 = 3; 
			} else if (letter2.equals("X") == true) { 
				num2 = 4; 
			} 
			output1 = output1 + array[num1][num2]; 
		} 
		JOptionPane.showMessageDialog(null, output1); 
	} 
} 
