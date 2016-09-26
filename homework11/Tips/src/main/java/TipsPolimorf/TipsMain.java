package TipsPolimorf;


public class TipsMain {
    public static void main(String[] args) {

        double sumOfBill = 500;

        Tips tips = new Terrible();
        double resultTerrible = tips.calculateTips(sumOfBill);
        Tips tips1 = new Poor();
        double resultPoor = tips.calculateTips(sumOfBill);
        Tips tips2 = new Good();
        double resultGood = tips.calculateTips(sumOfBill);
        Tips tips3 = new Great();
        double resultGreat = tips.calculateTips(sumOfBill);
        Tips tips4 = new Excellent();
        double resultEcxellent = tips.calculateTips(sumOfBill);


    }

}


