import java.text.DecimalFormat;
public class Grocery extends Item implements Tax, Discount{
    private double price;
    private double units;
    private double discount;
    private static DecimalFormat df = new DecimalFormat("0.00");

    Grocery(int i, String n, double u, double p, double d){
        super(i,n);
        price=p;
        units=u;
        discount=d;
    }

    public double computeDiscount(){
        double disc=price*units*(discount/100);
        return disc;
    }

    public double computeTax(){
        return 0.0;
    }

    public double computeTotalPrice(){
        double finalPrice=units*price-computeDiscount();
        return finalPrice;
    }

    public void displayGrocery(){
        display();
        System.out.print("Units- "+units+",\t");
        System.out.print("Unit Price- $"+df.format(price)+",\t");
        System.out.print("Savings- $ "+df.format(computeDiscount())+",\t");
        System.out.print("Subtotal- $"+df.format((units*price))+",\t");
        System.out.print("Tax Amount- $"+df.format(computeTax())+",\t");
        System.out.print("Final Price- $"+df.format(computeTotalPrice()));
    }
}
