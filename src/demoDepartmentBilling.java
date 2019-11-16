public class demoDepartmentBilling {
    public static void main(String[] args){
        //create new objects of the Grocery class
        Grocery g1=new Grocery(11,"Bread",2.0,1.50,0.0);
        Grocery g2=new Grocery(12,"Apple",6.0,.75,1.0);
        //create new objects of the Clothing class
        Clothing c1=new Clothing(21, "Jeans", "Levis", 35.0, 1.0, 0.0);
        Clothing c2=new Clothing(22, "Dress Shirt", "Izod", 25.0, 2.0, 10.0);
        //print details of Grocery objects
        g1.displayGrocery();
        g2.displayGrocery();
        //print details of Clothing objects
        c1.displayClothing();
        c2.displayClothing();
        //print total bill amount
        System.out.print("\nTotal Bill Amount- $"+Math.round((g1.computeTotalPrice()+g2.computeTotalPrice()+c1.computeTotalPrice()
        +c2.computeTotalPrice())*100.0)/100.0);
    }
}
