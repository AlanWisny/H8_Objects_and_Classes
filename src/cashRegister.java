import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cashRegister {
    private int saleItems;
    private double saleSum;
    private int totalItems;
    private double totalSum;
    private List<Double> priceList = new ArrayList<>(Arrays.asList(0.00,0.00,0.00,0.00));


    public cashRegister(int saleItems, double saleSum, int totalItems, double totalSum) {
        this.totalItems = totalItems;
        this.saleSum = saleSum;
        this.saleItems = saleItems;
        this.totalSum = totalSum;
    }

    public void addItem(double price) {
        priceList.set(saleItems, price);
        saleItems++;
        saleSum = saleSum + price;
        System.out.println("Amount of items = " + saleItems);
        System.out.println("The price of the sale is: " + saleSum);
    }

      public double getTotal() {
        totalSum = totalSum + saleSum;
        totalItems = totalItems + saleItems;
        System.out.println();
        int dollarValue = (int)Math.round(totalSum);
        System.out.println("Total amount of sold items is: " + totalItems);
        System.out.println("Total amount of $ in the register is: " + dollarValue);
        System.out.println();
        System.out.println(priceList);
        return totalSum;
    }

    public void undo(double remove) {
        saleItems--;
        saleSum = saleSum - remove;
        priceList.remove(saleItems);
        System.out.println();
        System.out.println("Subtracted previous price. New total is;");
        System.out.println("Amount of items = " + saleItems);
        System.out.println("The price of the sale is: " + saleSum);
        System.out.println();
    }




    public void clear() {
        saleItems = 0;
        saleSum = 0;
        priceList.clear();
        System.out.println(priceList);
    }


    public int getTotalItems() {
        return totalItems;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public double getSaleSum() {
        return saleSum;
    }
}
