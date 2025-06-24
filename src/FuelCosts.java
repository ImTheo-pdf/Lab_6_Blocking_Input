import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double efficiency = 0;
        double pricePerGal = 0;
        double costPer100Miles;
        double distanceOnFull;
        String trash = "";
        boolean done;

        done = false;
        do{
            System.out.print("Enter the number of gallons in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("Enter a valid number for gallons.");
            }
        }while(!done);

        done = false;
        do{
            System.out.print("Enter fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble()) {
                efficiency = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("Enter a valid number for fuel efficiency.");
            }
        }while(!done);

        done = false;
        do{
            System.out.print("Enter price per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGal = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("Enter a valid number for price.");
            }

        }while(!done);

        costPer100Miles = (100 / efficiency) * pricePerGal;
        distanceOnFull = gallons * efficiency;

        System.out.printf("Cost to drive 100 miles: $%.2f\n", costPer100Miles);
        System.out.printf("Distance car can go on full tank: %.2f miles\n", distanceOnFull);
    }
}
