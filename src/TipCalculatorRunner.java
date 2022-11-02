import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter bill amount: ");
        double billAmount = scan.nextDouble();

        System.out.print("Enter the number of people: ");
        int numberOfPeople = scan.nextInt();

        System.out.print("Enter tip Percentage: ");
        int tipPercentage = scan.nextInt();

        TipCalculator calculator = new TipCalculator(numberOfPeople,tipPercentage);
        calculator.addMeal(billAmount);

        System.out.println();
        System.out.println("Total bill amount(including tip): "+calculator.totalBill());
        System.out.println("Total tip amount: "+ calculator.tipAmount());
        System.out.println("Total bill amount per person: "+calculator.perPersonTotalCost());
        System.out.println("Total tip amount per person: "+calculator.perPersonTipAmount());
    }
}
