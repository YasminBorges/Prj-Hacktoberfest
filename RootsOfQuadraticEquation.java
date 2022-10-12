import java.util.Scanner;

public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of Coefficients.");
        System.out.print("a = ");
        float a = sc.nextFloat();
        System.out.print("b = ");
        float b = sc.nextFloat();
        System.out.print("c = ");
        float c = sc.nextFloat();
        float root1, root2, determinant = b*b-4*a*c;
        if(determinant > 0) {
            root1 = (float) (-b + Math.sqrt(determinant)/(2*a));
            root2 = (float) (-b - Math.sqrt(determinant)/(2*a));
            System.out.printf("Root1 = %.2f and Root2 = %.2f", root1, root2);
        } else if(determinant == 0){
            root1 = root2 = (-b)/(2*a);
            System.out.format("Root1 = Root2 = %.2f", root1);
        } else if (determinant<0){
            float real = (-b)/(2*a);
            float imaginary = (float) (Math.sqrt(-determinant)/(2*a));
            System.out.format("Root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nRoot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
