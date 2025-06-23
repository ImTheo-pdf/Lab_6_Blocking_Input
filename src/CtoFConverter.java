import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit;
        String trash = "";
        boolean done = false;

        do{
            System.out.print("Enter temperature in Celsius: ");
            if(in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            }else{
                trash = in.nextLine();
                System.out.println("You said your temperature was: " + trash);
                System.out.println("Enter a valid number");
            }
        }while(!done);

        fahrenheit = (celsius * (9.0/5)) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f°F\n", fahrenheit);

    }
}
