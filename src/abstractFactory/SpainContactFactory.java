package abstractFactory;

public class SpainContactFactory implements ContactFactory {

    private final ContactData data;

    public SpainContactFactory(String address, String city, String ZIP, String phone) {
        this.data = new ContactData(address, city, ZIP, phone);
    }

    @Override
    public Address createAddress() {
        return new SpainAddress(data);
    }

    @Override
    public Phone createPhone() {
        return new SpainPhone(data);
    }
}
