package TipsPolimorf;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TipsTest {
    @Test
    public void terribleTest() {
        Tips tips = new Terrible();
        double totalBillSum = tips.calculateTips(500);
        assertThat(totalBillSum, is(500.0));
    }
    @Test
    public void poorTest() {
        Tips tips = new Poor();
        double totalBillSum = tips.calculateTips(500);
        assertThat(totalBillSum, is(525.0));
    }
    @Test
    public void goodTest() {
        Tips tips = new Good();
        double totalBillSum = tips.calculateTips(500);
        assertThat(totalBillSum, is(550.0));
    }
    @Test
    public void greatTest() {
        Tips tips = new Great();
        double totalBillSum = tips.calculateTips(500);
        assertThat(totalBillSum, is(575.0));
    }
    @Test
    public void ecxellentTest() {
        Tips tips = new Excellent();
        double totalBillSum = tips.calculateTips(500);
        assertThat(totalBillSum, is(600.0));
    }
}
