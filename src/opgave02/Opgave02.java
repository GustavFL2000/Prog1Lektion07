package opgave02;
import java.util.*;

public class Opgave02 {
    public static void main(String[] args) {
        char[] characterArray = getCharacterArray();

        System.out.println("Vowel counts:");
        int[] counts = vokalCount(characterArray);
        String[] vowels = {"a", "e", "i", "o", "u", "æ", "ø", "å"};
        for (int i = 0; i < counts.length; i++) {
            System.out.println(vowels[i] + ": " + counts[i]);
        }

        /*System.out.println("Scrambled array:");
        scrambleCharArray(characterArray);*/

        System.out.println("Leet speak conversion:");
        convertToLeetSpeak(characterArray);
    }   

    private static int[] vokalCount(char[] array) {
        int[] counts = new int[8]; // a, e, i, o, u, æ, ø, å
        for (char c : array) { // For each character in the array
            switch (Character.toLowerCase(c)) {
                case 'a' -> counts[0]++;
                case 'e' -> counts[1]++;
                case 'i' -> counts[2]++;
                case 'o' -> counts[3]++;
                case 'u' -> counts[4]++;
                case 'æ' -> counts[5]++; 
                case 'ø' -> counts[6]++;
                case 'å' -> counts[7]++;
            }
        }
        return counts;
    }

    /*public static void scrambleCharArray(char[] array){
        for(char c: array){
            int randomIndex = (int) (Math.random() * array.length);
            char temp = c;
            c = array[randomIndex];
            array[randomIndex] = temp;
            System.out.println(Arrays.toString(array));
        }
    }*/

    public static void convertToLeetSpeak(char[] array){
        for(int i = 0; i<array.length; i++){
            switch (array[i]){
                case 'a' -> array[i] = '4';
                case 'e' -> array[i] = '3';
                case 'i' -> array[i] = '1';
                case 'o' -> array[i] = '0';
                case 's' -> array[i] = '5';
                case 't' -> array[i] = '7';
                }

                
        }
        System.out.println(array);
    }

    private static char[] getCharacterArray() {
        return ("Der var så dejligt ude på landet; det var sommer, kornet stod gult, havren grøn, " +
                "høet var rejst i stakke nede i de grønne enge, og der gik storken på sine lange, " +
                "røde ben og snakkede ægyptisk, for det sprog havde han lært af sin moder. Rundt om" +
                " ager og eng var der store skove, og midt i skovene dybe søer; jo, der var rigtignok " +
                "dejligt derude på landet! Midt i solskinnet lå der en gammel herregård med dybe kanaler" +
                " rundt om, og fra muren og ned til vandet voksede store skræppeblade, der var så høje," +
                " at små børn kunne stå oprejste under de største; der var lige så vildsomt derinde, som " +
                "i den tykkeste skov, og her lå en and på sin rede; hun skulle ruge sine små ællinger ud, " +
                "men nu var hun næsten ked af det, fordi det varede så længe, og hun sjælden fik visit;" +
                " de andre ænder holdt mere af at svømme om i kanalerne, end at løbe op og sidde under " +
                "et skræppeblad for at snadre med hende." +
                "Endelig knagede det ene æg efter det andet: pip! pip! sagde det, alle æggeblommerne " +
                "var blevet levende og stak hovedet ud." +
                "Rap! rap! sagde hun, og så rappede de sig alt hvad de kunne, og så til alle sider " +
                "under de grønne blade, og moderen lod dem se så meget de ville, for det grønne er godt for " +
                "øjnene. Hvor dog verden er stor! sagde alle ungerne; thi de havde nu rigtignok ganske " +
                "anderledes plads, end da de lå inde i ægget. Tror I, det er hele verden! sagde moderen, " +
                "den strækker sig langt på den anden side haven, lige ind i præstens mark! " +
                "men der har jeg aldrig været! – I er her dog vel alle sammen! – og så rejste hun sig" +
                " op, nej, jeg har ikke alle! det største æg ligger der endnu; hvor længe skal det vare! nu er " +
                "jeg snart ked af det! og så lagde hun sig igen.").toCharArray();
    }
}
