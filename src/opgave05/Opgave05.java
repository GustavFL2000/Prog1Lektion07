package opgave05;

public class Opgave05 {

    public static void main(String[] args) {
        System.out.println("Test af intArrayFourInrow: (True expected)");
        int[] integerArray = {1,2,3,4,4,4,4,5,6,7,8};
        System.out.println(intArrayFourInrow(integerArray)); 
        
        System.out.println("Test af intArrayFourInrow: (False expected)");
        integerArray = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(intArrayFourInrow(integerArray));
    }

    public static boolean intArrayFourInrow(int[] array){
        for(int i = 0; i<array.length -3; i++){
            if(array[i] == array[i+1] && array[i] == array[i+2] && array[i] == array[i+3]){
                return true;
            }
        }
        return false;
    }
}
