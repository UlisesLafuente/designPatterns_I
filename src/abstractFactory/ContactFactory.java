package abstractFactory;

public interface ContactFactory {
    Address createAddress();

    Phone createPhone();
}
