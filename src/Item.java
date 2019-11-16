public class Item {
    private int itemCode;
    private String Name;

    Item(int i, String n){
        itemCode=i;
        Name=n;
    }

    public void display(){
        System.out.print("\nItem Code- "+itemCode+",\t");
        System.out.print("Name- "+Name+",\t");
    }
}
