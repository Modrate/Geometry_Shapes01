import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to My Geometry Project! \n\n");

        System.out.println("Select the Shape from the following: \n\n");
        System.out.println("For Circle enter 1: ");
        Circle c = new Circle();
        System.out.println("For Rectangle enter 2 : ");
        System.out.println("For Square enter 3: ");
        System.out.println("For Triangle enter 3: ");
        System.out.println("For Cuboid enter 5: ");
        Box b = new Box();

        System.out.print("Enter Here:-->> ");

        Scanner s = new Scanner(System.in);
        double in = s.nextDouble();

//        Circle
         if (in == 1){
             System.out.println("You have selected Circle!\n\n");
             System.out.print("Enter the Radius: ");
             c.r = s.nextDouble();
             System.out.println("The Area is:  "+ c.area()+"\n");
             System.out.println("The Circumference is:  "+ c.circum()+"\n");

         } else if (in == 5) {
            // Cuboid
             System.out.println("You have Selected Cuboid!\n\n");
             System.out.print("Enter Width: ");
             b.width = s.nextDouble();
             System.out.print("Enter Height: ");
             b.height = s.nextDouble();
             System.out.print("Enter Depth:" );
             b.depth = s.nextDouble();

             System.out.println("The area is: " + b.area()+"\n");
             System.out.println("The Volume is: "+b.volume()+"\n");




         } else {
             System.out.println("Sorry we are not available for this Shape");
         }
        System.out.println("Thank You!!");

    }
}