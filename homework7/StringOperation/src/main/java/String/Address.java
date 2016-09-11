package String;


public class Address {
   String address;

    public Address(String address) {

        this.address = address;
    }

    public  String newAddress() {

        String newStr = address.replace(".", "[dot]");
        String newAddress = newStr.replace("@", "[at]");

        return newAddress;
    }
}
