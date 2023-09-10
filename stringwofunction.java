import java.util.Scanner;

public class stringwofunction{
	 static class StringAssignment {
	        // All the methods of the StringAssignment class go here...
	    	 public static void trim(String str) {
			        System.out.println("String after trim: " + str.trim());
			    }

			    public static int charCount(String str) {
			        System.out.println("Character count: " + str.length());
			        return str.length();
			    }

			    public static int frequenceCount(String str, char ch) {
			        int c = 0;
			        for (int i = 0; i < str.length(); i++) {
			            if (ch == str.charAt(i)) {
			                c++;
			            }
			        }
			        System.out.println("Frequency: " + c);
			        return c;
			    }

			    public static int frequencyWord(String str, String str1) {
			        String[] str2 = str.split("\\s+");
			        int count = 0;
			        for (String st : str2) {
			            if (st.equals(str1)) {
			                count++;
			            }
			        }
			        System.out.println("Word count: " + count);
			        return count;
			    }

			    public static boolean myCompare(String str1, String str2) {
			        if (str1.length() != str2.length()) {
			            System.out.println("false");
			            return false;
			        } else {
			            for (int i = 0; i < str1.length(); i++) {
			                if (str1.charAt(i) != str2.charAt(i)) {
			                    System.out.println("false");
			                    return false;
			                }
			            }
			            System.out.println("true");
			            return true;
			        }
			    }

			    public static boolean myEquals(String str1, String str2) {
			        if (str1.length() != str2.length()) {
			            System.out.println("false");
			            return false;
			        } else {
			            for (int i = 0; i < str1.length(); i++) {
			                char ch1 = str1.charAt(i);
			                char ch2 = str2.charAt(i);
			                if (ch1 != ch2) {
			                    System.out.println("false");
			                    return false;
			                }
			            }
			            System.out.println("true");
			            return true;
			        }
			    }

			    public static String replace(String str, String str1, String str2) {
			        if (str == null || str1 == null || str2 == null) {
			            System.out.println("Entered string cannot be null.");
			            return str; // Return the original string in case of null inputs.
			        } else {
			            String re = str.replaceAll(str1, str2);
			            return re;
			        }
			    }

			    public static int spaceCount(String str) {
			        int count = 0;
			        for (int i = 0; i < str.length(); i++) {
			            if (str.charAt(i) == ' ') {
			                count++;
			            }
			        }
			        System.out.println("Space count: " + count);
			        return count;
			    }

			    public static int vowelCount(String str) {
			        int count = 0;
			        for (char ch : str.toCharArray()) {
			            if ("aeiouAEIOU".indexOf(ch) != -1) {
			                count++;
			            }
			        }
			        System.out.println("Vowel count: " + count);
			        return count;
			    }
	    }

	    public static void main(String[] args) {
	        Scanner yt1 = new Scanner(System.in);

	        System.out.println("Enter choice:");
	        System.out.println("1. Trim");
	        System.out.println("2. Character count");
	        System.out.println("3. Frequency count");
	        System.out.println("4. Frequency word");
	        System.out.println("5. My compare");
	        System.out.println("6. My equals");
	        System.out.println("7. Replace");
	        System.out.println("8. Space count");
	        System.out.println("9. Vowel count");

	        int choice = yt1.nextInt();
	        yt1.nextLine(); // Consume the newline character

	        switch (choice) {
	            case 1:
	                System.out.print("Enter string for trim: ");
	                String s = yt1.nextLine();
	                StringAssignment.trim(s);
	                break;

	            case 2:
	                System.out.print("Enter string for character count: ");
	                String charCountInput = yt1.nextLine();
	                StringAssignment.charCount(charCountInput);
	                break;

	            case 3:
	                System.out.println("Enter string for frequency count: ");
	                String freqCountInput = yt1.nextLine();

	                System.out.print("Enter character: ");
	                char freqChar = yt1.next().charAt(0);

	                StringAssignment.frequenceCount(freqCountInput, freqChar);
	                break;

	            case 4:
	                System.out.print("Enter input string: ");
	                String inputString = yt1.nextLine();

	                System.out.print("Enter word to search: ");
	                String searchWord = yt1.nextLine();

	                StringAssignment.frequencyWord(inputString, searchWord);
	                break;

	            case 5:
	                System.out.print("Enter first string: ");
	                String str1 = yt1.nextLine();

	                System.out.print("Enter second string: ");
	                String str2 = yt1.nextLine();

	                StringAssignment.myCompare(str1, str2);
	                break;

	            case 6:
	                System.out.print("Enter first string: ");
	                String myEqualsStr1 = yt1.nextLine();

	                System.out.print("Enter second string: ");
	                String myEqualsStr2 = yt1.nextLine();

	                StringAssignment.myEquals(myEqualsStr1, myEqualsStr2);
	                break;

	            case 7:
	                System.out.println("Enter the input string: ");
	                String replaceInput = yt1.nextLine();

	                System.out.println("Enter the string to replace: ");
	                String replaceStr1 = yt1.nextLine();

	                System.out.println("Enter the replacement string: ");
	                String replaceStr2 = yt1.nextLine();

	                String modifiedString = StringAssignment.replace(replaceInput, replaceStr1, replaceStr2);
	                System.out.println("Modified string: " + modifiedString);
	                break;

	            case 8:
	                System.out.print("Enter string for space count: ");
	                String spaceCountInput = yt1.nextLine();
	                StringAssignment.spaceCount(spaceCountInput);
	                break;

	            case 9:
	                System.out.print("Enter string for vowel count: ");
	                String vowelCountInput = yt1.nextLine();
	                StringAssignment.vowelCount(vowelCountInput);
	                break;

	            default:
	                System.out.println("Enter a valid choice.");
	        }
	    }
	}