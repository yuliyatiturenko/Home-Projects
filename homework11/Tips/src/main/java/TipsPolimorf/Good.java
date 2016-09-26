package TipsPolimorf;

public class Good implements Tips {

    public double calculateTips(double sumOfBill) {
        return sumOfBill * 0.1 + sumOfBill;
    }
}
