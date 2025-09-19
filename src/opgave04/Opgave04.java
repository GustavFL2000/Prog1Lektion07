package opgave04;

public class Opgave04 {
     public static void main(String[] args) {
        System.out.println("Test af pallindromeCheckWithArray: (True expected)");
        String text = "ABBA";
        System.out.println(pallindromeCheckWithArray(text));

        System.out.println("Test af pallindromeCheckWithArray: (False expected)");
        text = "SHUBIDUA";
        System.out.println(pallindromeCheckWithArray(text));

    }

    public static boolean pallindromeCheckWithArray(String text){
        char[] charArray = text.toCharArray();
        for(int i = 0; i<charArray.length/2; i++){
            if(charArray[i] != charArray[charArray.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
