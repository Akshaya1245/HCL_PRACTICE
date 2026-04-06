public class DiscountCalculator {
    public static void main(String[] args) {

        double cartValue = 3000; 
        double discount = 0;

        if (cartValue > 5000) {
            discount = cartValue * 0.20;
        } else if (cartValue > 2000) {
            discount = cartValue * 0.10;
        } else {
            discount = 0;
        }

        double finalAmount = cartValue - discount;

        System.out.println("Cart Value: " + cartValue);
        System.out.println("Discount: " + discount);
        System.out.println("Final Payable Amount: " + finalAmount);
    }
}