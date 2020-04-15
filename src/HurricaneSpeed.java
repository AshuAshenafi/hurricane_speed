import java.util.Scanner;

public class HurricaneSpeed {
    public static void main(String[] args) {
        int speed;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Wind Speed in mph: ");
        speed = input.nextInt();

        if(speed < 74){
            System.out.println("That is below the minimum Hurricane Speed.");
        }
        else if(speed >= 74 && speed <= 95){
            System.out.println("Hurricane is in Category 1.");
        }
        else if(speed >= 96 && speed <= 110){
            System.out.println("Hurricane is in Category 2.");
        }
        else if(speed >= 111 && speed <= 129){
            System.out.println("Hurricane is in Category 3.");
        }
        else if(speed >= 130 && speed <= 156){
            System.out.println("Hurricane is in Category 4.");
        }
        else {
            System.out.println("Hurricane is in Category 5.");
        }

    }
}
