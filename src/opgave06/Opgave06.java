package opgave06;

public class Opgave06 {
    public static void main(String[] args) {
        char[] romanNumber = {'X', 'I', 'X'}; //19
        System.out.println("Roman number to Arabic number conversion from: " + String.valueOf(romanNumber));
        System.out.println(romanNumberToArabicNumber(romanNumber));
    }

    private static int romanNumberToArabicNumber(char[] romanNumber) {
        int total = 0;
        for (int i = 0; i < romanNumber.length; i++) {
            if (i < romanNumber.length - 1 && SingleRomanNumberToArabicNumber(romanNumber[i]) < SingleRomanNumberToArabicNumber(romanNumber[i + 1])) {
                total -= SingleRomanNumberToArabicNumber(romanNumber[i]);
            } else {
                total += SingleRomanNumberToArabicNumber(romanNumber[i]);
            }
        }
        return total;
    }

    private static int SingleRomanNumberToArabicNumber(char roman) {
        return switch (roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException(roman + " is not a valid roman number literal.");
        };
    }
}
