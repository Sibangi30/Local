public class GfG {
    public static int oppositeFaceOfDice(int n) {
        
        // Stores number on opposite face
        // of dice
        int ans = 7 - n;
        return ans;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(oppositeFaceOfDice(n));
    }
}