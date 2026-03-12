# Singleton
Exercise:

    Singleton pattern implementation with a class Undo

Objective

Implement a class that replicates the basic operation of the command Undo, using the Singleton design pattern to ensure that there is only one instance shared throughout the application.
Description

Create a class called Undothat is capable of:

    Add orders to your history.
    Undo the last order (type functionality undo).
    List all stored orders (similar to historyin Linux).

The class Undomust implement the Singleton pattern to ensure that the entire program shares the same history.
Requirements

    The builder must be private.
    Access to the instance must be done using a static method getInstance().
    The class must use a data structure such as Stack<String>or List<String>to store orders.
    Implement the following methods:
        void addCommand(String command);
        String undoCommand();– returns and removes the last order.
        void showHistory();– shows all orders stored so far.
    The implementation of the code must be demonstrated by unit tests.
