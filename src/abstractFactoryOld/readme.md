Exercise:

    Implementation of an international address and phone number manager with the Abstract Factory pattern.

Objective

Create a contact manager capable of automatically formatting addresses and phone numbers according to the country of origin using the Abstract Factory pattern.

Each specific factory will be responsible for offering the specific format of each country, ensuring that the customer can obtain the correct representation of contact without depending on the specific classes.
Description

Imagine that you are developing an international application that needs to manage contact data of users from different countries. Each country has:

    A specific address format (e.g., the order of the fields, separators, etc.).
    A specific phone format, with a specific prefix and a specific pattern.

You need to implement a system that can:

    Create addresses and telephone numbers correctly formed according to the selected country.
    Facilitate the extension to add new countries in the future without modifying the existing code.

To achieve this, you will use the Abstract Factory pattern.
Requirements

    Define abstract products : Address, Phone
    Create abstract factory : ContactFactory
    Implements at least two specific factories: SpainContactFactoryand USAContactFactory
    Implement the specific product classes. Each class will need to implement the specific format for your country:
        Ex. Spain: Carrer Example, 08001 Barcelona | USA: Example Street, New York, NY 10001
        Prefix phone Spain: +34 | Prefix telephone USA: +1
    Create a class ContactAct as a customer.
        Receive an instance of a specific factory.
        Allow you to create addresses and telephone numbers without knowing the specific classes.
    The result of the contact data generated must be demonstrated by unit tests.

Requisits

    Defineix els productes abstractes: Address, Phone
    Crea la fàbrica abstracta: ContactFactory
    Implementa almenys dues fàbriques concretes: SpainContactFactory i USAContactFactory
    Implementa les classes concretes de productes. Cada classe haurà d’implementar el format específic per al seu país:
        Ex. Spain: Carrer Example, 08001 Barcelona | USA: Example Street, New York, NY 10001
        Prefix telèfon Spain: +34 | Prefix telèfon USA: +1
    Crea una classe Contact que actuï com client.
        Rebi una instància d’una fàbrica concreta.
        Permeti crear adreces i telèfons sense conèixer les classes concretes.
    El resultat de les dades de contacte generades ha de ser demostrat mitjançant tests unitaris.

Example of expected use

        // Spain
        ContactFactory spainFactory = new SpainContactFactory(
            "Carrer Major 34", "Barcelona", "08001", "123456789"
        );
        Contact contactSpain = new Contact(spainFactory);
        System.out.println(contactSpain.toString());
        //OUTPUT: Address: Carrer Major 34, 08001 Barcelona | Phone: +34 623 45 67 89

        // USA
        ContactFactory usaFactory = new USAContactFactory(
            " 154 5th Avenue", "New York", "NY 10001", "987654321"
        );
        Contact contactUSA = new Contact(usaFactory);
        System.out.println(contactUSA.toString());
        //OUTPUT: Address: 154 5th Avenue, New York, NY 10001 | Phone: +1 (098) 765-4321

