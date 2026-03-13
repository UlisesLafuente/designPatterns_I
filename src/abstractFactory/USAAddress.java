package abstractFactory;

public class USAAddress implements Address {
    private ContactData data;

    public USAAddress(ContactData data) {
        this.data = data;
    }

    @Override
    public String getFormatAddress() {
        return data.getAddress().trim() + ", " + data.getCity() + ", " + data.getZip();
    }
}
