package String;


public class MainAddress {
    public static void main(String[] args) {

        Address address = new Address("YuliyaTiturenko@mail.ru");
        String address1 = address.newAddress();
        System.out.println(address1);
    }
}
