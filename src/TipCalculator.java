public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int numPeople,int tipPercentage){
        this.numPeople=numPeople;
        this.tipPercentage=tipPercentage;
    }

    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }

    public int getTipPercentage(){
        return tipPercentage;
    }

    public double tipAmount(){
        return Math.round(100*totalBillBeforeTip*(tipPercentage/100.0))/100.0;
    }

    public double totalBill(){
        return Math.round(100*totalBillBeforeTip*(tipPercentage/100.0+1))/100.0;
    }

    public double perPersonCostBeforeTip(){
        return Math.round(totalBillBeforeTip/numPeople*100)/100.0;
    }

    public double perPersonTipAmount(){
        return Math.round(tipAmount()/numPeople*100)/100.0;
    }

    public double perPersonTotalCost(){
        return Math.round(totalBill()/numPeople*100)/100.0;
    }

    public void addMeal(double cost){
        totalBillBeforeTip+=cost;
    }
}
