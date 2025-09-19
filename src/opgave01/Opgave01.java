package opgave01;

public class Opgave01 {
    public static void main(String[] args) {
        int[] integerArray = getIntegerArray();
    
        System.out.println("Cross sums:");
        System.out.println(crossSum(9));
        System.out.println(crossSum(123));

        //Opgave a
        System.out.println("Array:");
        printArray(integerArray);

        //Opgave b
        System.out.println("Sum of array:");
        System.out.println(sumArray(integerArray));

        //Opgave c
        System.out.println("Average of array:");
        System.out.println(averageArray(integerArray));

        //Opgave d
        System.out.println("Cross sum array:");
        printArray(crossSumArray(integerArray));

        //Opgave e
        System.out.println("Single digit cross sum counts:");
        int[] counts = singleDigitCrossSumCounts(integerArray);
        for (int i = 0; i < counts.length; i++) {
            System.out.println((i + 1) + ": " + counts[i]);
        }


    }

    // Opgave a:
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Opgave b:
    public static int sumArray(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum +=array[i];
        }
        return sum;
    }

    // Opgave c:
    public static double averageArray(int[] array){
        return (double) sumArray(array) / array.length;
    }

    //Opgave d:
    public static int[] crossSumArray(int[] array){
        int[] crossSumArray = new int[array.length];
        for(int i = 0; i<array.length; i++){
            crossSumArray[i] = crossSum(array[i]);
        }
        return crossSumArray;
    }

    //Opgave e:
     public static int[] singleDigitCrossSumCounts(int[] array) {
        int[] counts = new int[9]; // counts[0] for 1, counts[1] for 2, ..., counts[8] for 9
        for (int value : array) {
            int singleDigit = value;
            while (singleDigit > 9) {
                singleDigit = crossSum(singleDigit);
            }
            if (singleDigit >= 1 && singleDigit <= 9) {
                counts[singleDigit - 1]++;
            }
        }
        return counts;
    }


    public static int crossSum(int number) {
        int crossSum = 0;
        while (number > 9) {
            crossSum += number % 10;
            number = number / 10;
        }
        return crossSum + number;
    }
    private static int[] getIntegerArray() {
        int[] integerArray =  { 1095, 12, 9065, 387, 700, 20, 5, 2065, 97654, 103, 789, 50, 1972, 200, 35, 98, 1002 };
        return integerArray;
    }
}
