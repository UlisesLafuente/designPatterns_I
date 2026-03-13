package abstractFactoryOld;

public class USAContact implements Contact {
    private final String address;
    private final String phone;

    public USAContact(
            String inputAddress,
            String inputCity,
            String inputStateZip,
            String inputPhone){

        this.address=createAddress(inputAddress,inputCity,inputStateZip);
        this.phone=createPhone(inputPhone);
    }

    @Override
    public String createAddress(String address, String city, String stateZip) {
        return address.trim() + ", " + city + ", " + stateZip;
    }
    @Override
    public String createPhone(String phone) {
        if (phone.length() != 9) {
            throw new IllegalArgumentException("Invalid phone number length");
        }
        return "+1 (" + phone.substring(0, 3) + ") " + phone.substring(3, 6) + "-" + phone.substring(6);
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
