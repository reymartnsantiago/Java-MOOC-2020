
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = number; i > 0; i--) {
            System.out.print("");
        }
    }

    public static void printTriangle(int size) {
        int iteration = 1;
        for (int j = size; j > 0; j--) {
            printSpaces(j);
            printStars(iteration);
            iteration++;
        }
    }

    public static void christmasTree(int height) {
        int iteration = 1;
        for (int j = height; j > 0; j--) {
            printSpaces(j);
            printStars(iteration);
            iteration += 2;
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 1);
            printStars(3);

        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(3);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(7);
    }
}
