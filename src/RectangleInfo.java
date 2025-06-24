import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area;
        double perimeter;
        double diagonal;
        String trash = "";
        boolean done;

        done = false;
        do{
            System.out.print("Enter the width: ");
            if(in.hasNextDouble()){
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }else {
                trash = in.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("Enter a valid number");
            }
        }while(!done);

        done = false;
        do{
            System.out.print("Enter the height: ");
            if(in.hasNextDouble()){
                height = in.nextDouble();
                in.nextLine();
                done = true;
            }else {
                trash = in.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("Enter a valid number");
            }
        }while(!done);
        area = width * height;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt((width*width) + (height*height));

        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Diagonal: %.2f\n", diagonal);
    }
}
