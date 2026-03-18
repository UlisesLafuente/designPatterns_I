Exercise:

    Implementation of the Strategy pattern for a reporting generation system.

Objective

Build a system that can generate reports in different formats (CSV, JSON, PDF, HTML, XML, Word, Excel), using the Strategy pattern.
Description

Implement a reporting service that is:

    Flexible and extensible: it must allow you to easily add new types of reports without having to modify the existing code (Opened by extension, closed by modification).
    Coupled download: the class using the reports should not be dependent on any specific implementation (Dependency Investment).

Requirements

    Defines an interface ReportStrategy.
    It implements several reporting strategies:
        HTMl
        Json
        XML
        PDF
        CSV
        Excel
        Word
    The demonstration of the use of strategies through a reporting service that accepts any implementation must be carried out through unit tests.