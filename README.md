# Design Patterns Demo

Java demonstrations of classic GoF design patterns.

## Patterns Included

### Strategy
Behavioral pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. Located in `src/strategy/`.

- `ReportStrategy`: Interface for different report formats
- Implementations: CSV, Excel, HTML, JSON, PDF, Word, XML

### Abstract Factory
Creational pattern that provides an interface for creating families of related objects. Located in `src/abstractFactory/`.

- `ContactFactory`: Factory for creating contact-related objects
- `SpainContactFactory`, `USAContactFactory`: Regional implementations
- Creates Address, Phone, and Contact objects specific to each region

### Singleton
Creational pattern that ensures a class has only one instance. Located in `src/singleton/`.

- `Undo`: Example of singleton for managing undo functionality

## License

Apache License 2.0 - See LICENSE file for details.