package opgave03;

public class Opgave03 {
    public static void main(String[] args) {
        System.out.println(weekday(4, 14));
        String[] days = {"Mandag", "Tirsdag", "Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag"};
        printArray(days);

    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static String weekday(int dayOfWeek, int daysInTheFuture) {
        dayOfWeek = (dayOfWeek + daysInTheFuture) % 7;
        if (dayOfWeek == 0) {
            return "Mandag";
        } else if (dayOfWeek == 1) {
            return "Tirsdag";
        } else if (dayOfWeek == 2) {
            return "Onsdag";
        } else if (dayOfWeek == 3) {
            return "Torsdag";
        } else if (dayOfWeek == 4) {
            return "Fredag";
        } else if (dayOfWeek == 5) {
            return "Lørdag";
        } else {
            return "Søndag";
        }
    }
}
