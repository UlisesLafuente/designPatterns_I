package abstractFactory;

public class ContactData {
    private final String address;
    private final String city;
    private final String zip;
    private final String phone;

    public ContactData(String street, String city, String zip, String phone) {
        this.address = street;
        this.city = city;
        this.zip = zip;
        this.phone = phone;
    }

    public String getPhoneNumber() {
        return this.phone;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }
}
