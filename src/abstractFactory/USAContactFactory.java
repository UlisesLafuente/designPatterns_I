package abstractFactory;

public class USAContactFactory implements ContactFactory {
    private final ContactData data;

    public USAContactFactory(String address, String city, String ZIP, String phone) {
        this.data = new ContactData(address, city, ZIP, phone);
    }

    @Override
    public Address createAddress() {
        return new USAAddress(data);
    }

    @Override
    public Phone createPhone() {
        return new USAPhone(data);
    }
}
