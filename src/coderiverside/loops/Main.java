package coderiverside.loops;

public class Main {
    public static void main(String[] args) {
//        for(;;){
//            System.out.println(" CodeRiverside ");
//        }

        int sum = 0;
        int[] array = {17, 25, 4, 7, 2};
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }
        //System.out.println("sum = " + sum);


        int s = 0;
        for (int i = 0; i < 9; s = s + i++) {
            System.out.println("i = " + i);
        }
        System.out.println("s = " + s);



        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0, j = 2; !(i == 3 || j == -1); i++, j--) {
            System.out.println("matrix[i][j] = " + matrix[i][j]);
        }



        boolean flag = true;

//        for (int i = 0, System.out.println("This won't do!"); flag; i++) {
//            // loop body
//        }

        int i;
        for (i = 0, System.out.println("This is legal!"); flag; i++) {
            // loop body
        }

















    }
}
