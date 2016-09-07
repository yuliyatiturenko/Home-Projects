
public class total_price {
    public static void main(String[] args) {
        int days = 8;
        int pricePerDay = 40;
        int totalPrice;
        if (days <= 5) System.out.println("Total Price for " + days + " days is " + (days * pricePerDay));
        else if (days <= 7) System.out.println("Total Price for " + days + " days is " + (days * pricePerDay - 20));
        else System.out.println("Total Price for " + days + " days is " + (days * pricePerDay - 50));


    }
}



