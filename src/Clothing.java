import java.text.DecimalFormat;

//SEAN TRAN, PSID- 1521713
public class Clothing extends Item implements Tax, Discount{
    private String brand;
    private double price;
    private double units;
    private double discount;
    final double taxp=8.5;
    private static DecimalFormat df = new DecimalFormat("0.00");

    Clothing(int i, String n, String b, double p, double u, double d){
        super(i,n);
        brand = b;
        price=p;
        units=u;
        discount=d;
    }

    public double computeDiscount(){
        double disc=price*units*(discount/100);
        return disc;
    }

    public double computeTax(){
        double taxamount=(units*price-computeDiscount())*(taxp/100);
       //double taxamount= (taxp/100)*units*price;
        return taxamount;
    }

    public double computeTotalPrice(){
        double finalPrice=units*price-computeDiscount()+computeTax();
        return finalPrice;
    }

    public void displayClothing(){
        display();
        System.out.print("Brand- "+brand+",\t");
        System.out.print("Units- "+units+",\t");
        System.out.print("Unit Price- $"+df.format(price)+",\t");
        System.out.print("Subtotal- $"+df.format((units*price))+",\t");
        System.out.print("Savings- $"+df.format(computeDiscount())+",\t");
        System.out.print("Tax Amount- $"+df.format(computeTax())+",\t");
        System.out.print("Final Price- $"+df.format(computeTotalPrice()));
    }
}
