//import scanner
import java.util.Scanner;

public class LetingTipCalculator {
    public static void main(String[] args){
        //Scanner Set Up//
        Scanner scan = new Scanner(System.in);

        //Asking for user input to set up variables//
        System.out.print("Enter bill amount: ");
        double billAmount = scan.nextDouble();
        
        System.out.print("Enter the number of people: ");
        int numberOfPeople = scan.nextInt();
        
        System.out.print("Enter tip Percentage: ");
        int tipPercentage = scan.nextInt();

        //Initializing and creating variables.
        double totalBill = Math.round(100*billAmount*(tipPercentage/100.0+1))/100.0;
        double totalTip = Math.round(100*billAmount*(tipPercentage/100.0))/100.0;
        double tipPerPerson = Math.round(totalTip/numberOfPeople*100)/100.0;
        double billPerPerson = Math.round(totalBill/numberOfPeople*100)/100.0;

        //Display result
        System.out.println();
        System.out.println("Total bill amount(including tip): "+totalBill);
        System.out.println("Total tip amount: "+ totalTip);
        System.out.println("Total bill amount per person: "+billPerPerson);
        System.out.println("Total tip amount per person: "+tipPerPerson);
    }
}
