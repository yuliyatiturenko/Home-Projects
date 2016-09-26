package TipsPolimorf;

public class Great implements Tips {

    public double calculateTips(double sumOfBill) {
        return sumOfBill * 0.15 + sumOfBill;
    }
}
