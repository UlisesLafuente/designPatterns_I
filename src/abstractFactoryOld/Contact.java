package abstractFactoryOld;

public interface Contact {
    String createAddress(String address, String city, String stateZip);
    String createPhone(String phone);
}
