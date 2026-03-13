package abstractFactory;

public class USAPhone implements Phone {
    private final ContactData data;

    public USAPhone(ContactData data) {
        this.data = data;
    }

    @Override
    public String getFormatPhone() {
        String phone = data.getPhoneNumber();
        if (phone.length() != 9) {
            throw new IllegalArgumentException("Invalid phone number length");
        }
        return "+1 (" + phone.substring(0, 3) + ") " + phone.substring(3, 6) + "-" + phone.substring(6);
    }
}
