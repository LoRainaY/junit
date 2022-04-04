import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter first side of triangle");

        Scanner scanner = new Scanner(System.in);
        int firstSide = scanner.nextInt();
        System.out.println("Enter second side of triangle");
        int secondSide = scanner.nextInt();
        System.out.println("Enter third side of triangle");
        int thirdSide = scanner.nextInt();


        Triangle triangle1 = new Triangle(firstSide, secondSide, thirdSide);

        System.out.println(triangle1.answer());


    }
}
