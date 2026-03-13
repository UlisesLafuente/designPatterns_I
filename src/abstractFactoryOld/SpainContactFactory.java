package abstractFactoryOld;

public class SpainContactFactory implements ContactFactory{
    String inputAddress = " 154 5th Avenue";
    String inputCity = "New York";
    String inputStateZip = "NY 10001";
    String inputPhone = "987654321";

    public SpainContactFactory(String Address, String city, String ZIP, String phone) {
    this.inputAddress=Address;
    this.inputCity=city;
    this.inputStateZip=ZIP;
    this.inputPhone=phone;
    }

    @Override
    public Contact createUser() {
        return new SpainContact(inputAddress, inputCity, inputStateZip, inputPhone);
    }
}
