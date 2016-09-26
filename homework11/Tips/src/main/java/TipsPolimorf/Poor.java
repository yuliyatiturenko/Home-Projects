package TipsPolimorf;

public class Poor implements Tips {

    public double calculateTips(double sumOfBill) {
        return sumOfBill * 0.05 + sumOfBill;
    }
}
