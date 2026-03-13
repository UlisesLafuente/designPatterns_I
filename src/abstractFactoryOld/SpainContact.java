package abstractFactoryOld;

public class SpainContact implements Contact {
    private final String address;
    private final String phone;

    public SpainContact(
            String inputAddress,
            String inputCity,
            String inputStateZip,
            String inputPhone){

        this.address=createAddress(inputAddress,inputCity,inputStateZip);
        this.phone=createPhone(inputPhone);
    }
    @Override
    public String createAddress(String address, String city, String stateZip) {
        return address.trim() + ", " + stateZip + " " + city;
    }
    @Override
    public String createPhone(String phone) {
        if (phone.length() != 9) {
            throw new IllegalArgumentException("Invalid phone number length");
        }
        return "+34 " + phone.substring(0, 2) + " " + phone.substring(2, 4) + " " + phone.substring(4, 6) + " " + phone.substring(6);
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
    @Override
    public String toString() {
        return "Address: " + address + " | Phone: " + phone;
    }
}