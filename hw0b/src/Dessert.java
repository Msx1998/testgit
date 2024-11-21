public class Dessert {
    int flavor;
    int price;
    static int numDesserts = 0;
    public Dessert(int f, int p) {
        flavor = f;
        price = p;
        numDesserts += 1;
    }
    public void printDessert() {
        System.out.print(flavor);
        System.out.print(" ");
        System.out.print(price);
        System.out.print(" ");
        System.out.print(numDesserts);
    }
    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }

}
