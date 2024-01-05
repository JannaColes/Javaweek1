public class InvestmentCalculator {
  public static void main(String[]args) {
    double principal = 1000.0;

    double rateOfProfit = 0.05;

    int numYears = 10;

    System.out.println("Year\tAmount on deposit");

    for (int year = 1; year <= numYears; year++){
      double amountOnDeposit = principal * Math.pow(1 + rateOfProfit, year);

      System.out.printf("%d\t%.2f\n", year, amountOnDeposit);
    }
  }
  
}
