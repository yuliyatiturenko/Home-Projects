package String;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AddressTest {
    Address a;

    @Test
    public void newAddress(){
        a  = new Address("YuliyaTiturenko@mail.ru");
        String  result= a.newAddress();
        assertThat(result,is("YuliyaTiturenko[at]mail[dot]ru"));
    }
}
