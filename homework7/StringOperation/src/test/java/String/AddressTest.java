package String;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AddressTest {
    Address newAddress;

    @Test
    public void newAddress(){
        newAddress  = new Address("YuliyaTiturenko@mail.ru");
        String  result= newAddress.newAddress();
        assertThat(result,is("YuliyaTiturenko[at]mail[dot]ru"));
    }
}
