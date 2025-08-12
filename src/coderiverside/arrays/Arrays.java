package coderiverside.arrays;

public class Arrays {
    public static void main(String[] args) {
        // Declaration & Creation
        int[] numbers = new int[3];
        numbers[0] = 2;
        numbers[1] = 5;
        numbers[2] = 17;

        Product[] products = new Product[3];
        products[0] = new Food("Pizza");
        products[1] = new Drink("Water");

        // Creation & initialization
        int[] primes;
        primes = new int[]{2,3,5};

        Product[] otherProducts;
        otherProducts = new Product[]{
                new Product("any"),
                new Food("Pizza"),
                new Drink("Water")
        };

        // Declaration, Creation, Initialization
        int[] odds = {1,3,5};

        Product[] someProducts = {
                new Drink("Coffee"),
                new Food("Cookie")
        };

        int length = someProducts.length;

        for (int i = 0; i < length; i++) {
            System.out.println(someProducts[i] + " ");
        }
    }
}
