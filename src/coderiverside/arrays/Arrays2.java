package coderiverside.arrays;

public class Arrays2 {
    public static void main(String[] args) {

        int[][] numbers = new int[2][3];
        numbers[0][0] = 2;
        numbers[1][1] = 5;
        numbers[0][2] = 17;

        int[][] matrix2 = {
                {2,5,4},
                {1,7}
        };

        Product[][] products2 = new Product[][]{
                { new Food("Pizza"), new Drink("Water") },
                { new Drink("Coffee")}
        };

        for (int row = 0; row < products2.length; row++) {
            for (int column = 0; column < products2[row].length; column++) {
                System.out.print(products2[row][column] + " ");
            }
            System.out.println();
        }
    }
}
