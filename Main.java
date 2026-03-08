package Local ;
import java.util.Scanner;
class StringOperations {
    private String str;   
    public StringOperations(String str) {
        this.str = str;
    }
    public String changeCase() {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) result += Character.toLowerCase(c);
            else result += Character.toUpperCase(c);
        }
        return result;
    }
    public String reverse() {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
    public String compare(String other) {
        if (str.equals(other)) return "Strings are equal";
        else return "Strings are not equal";
    }
    public String insert(String other, int pos) {
        return str.substring(0, pos) + other + str.substring(pos);
    }
    public void convertCase() {
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    public void checkCharacter(char ch) {
        int pos = str.indexOf(ch);
        if (pos == -1) System.out.println("Character not found");
        else System.out.println("Character found at position: " + (pos + 1));
    }

    public boolean isPalindrome() {
        return str.equalsIgnoreCase(reverse());
    }

 
    public void countWordsVowelsConsonants() {
        String[] words = str.trim().split("\\s+");
        int vowels = 0, consonants = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) vowels++;
            else if (Character.isLetter(c)) consonants++;
        }
        System.out.println("Words: " + words.length);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        StringOperations ops = new StringOperations(str1);
        System.out.println("Change case: " + ops.changeCase());
        System.out.println("Reverse: " + ops.reverse());
        System.out.println("Compare: " + ops.compare(str2));
        System.out.println("Insert: " + ops.insert(str2, 2));
        ops.convertCase();
        ops.checkCharacter(ch);
        System.out.println("Palindrome? " + (ops.isPalindrome() ? "Yes" : "No"));
        ops.countWordsVowelsConsonants();

        sc.close();
    }
}
