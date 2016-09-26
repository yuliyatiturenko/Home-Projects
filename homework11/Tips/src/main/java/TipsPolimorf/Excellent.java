package TipsPolimorf;

public class Excellent implements Tips {

    public double calculateTips(double sumOfBill) {
        return sumOfBill * 0.2 + sumOfBill;
    }
}
