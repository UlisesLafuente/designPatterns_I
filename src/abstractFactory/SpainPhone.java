package abstractFactory;

public class SpainPhone implements Phone {

    private final ContactData data;

    public SpainPhone(ContactData data) {
        this.data = data;
    }

    @Override
    public String getFormatPhone() {
        String phone = data.getPhoneNumber();
        if (phone.length() != 9) {
            throw new IllegalArgumentException("Invalid phone number length");
        }
        return "+34 " + phone.substring(0, 2) + " " + phone.substring(2, 4) + " " + phone.substring(4, 6) + " " + phone.substring(6);
    }
}
