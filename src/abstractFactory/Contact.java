package abstractFactory;

public class Contact {
    private final Address address;
    private final Phone phone;

    public Contact(ContactFactory factory) {
        this.address = factory.createAddress();
        this.phone = factory.createPhone();
    }

    @Override
    public String toString() {
        return "Address: " + address.getFormatAddress() +
                " | Phone: " + phone.getFormatPhone();
    }
}
