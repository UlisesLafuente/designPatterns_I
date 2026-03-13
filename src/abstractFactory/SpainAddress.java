package abstractFactory;

public class SpainAddress implements Address {

    private final ContactData data;

    public SpainAddress(ContactData data) {
        this.data = data;
    }

    @Override
    public String getFormatAddress() {
        return data.getAddress().trim() + ", " + data.getZip() + " " + data.getCity();
    }
}
