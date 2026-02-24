 Quantity Measurement App

A Java-based application that performs quantity measurement, unit comparison, addition, and conversion across different measurement types like Length and Weight.

This project follows clean coding principles, DRY design, and is developed using feature-based branches (UC-wise implementation).

 Features Implemented
 UC1 – Feet Equality

Compare two values in feet.

Validate equality using proper unit handling.

 UC2 – Inch Equality

Compare inch values.

Supports cross-unit comparison (e.g., feet to inch).

UC3 – Generic Quantity Class (DRY Principle)

Implemented a reusable Quantity class.

Avoids code duplication.

Centralized unit handling logic.

UC4 – Yard Equality

Compare yard values.

Supports cross-unit comparison.

UC5 – Unit Conversion

Convert values between units.

Example:

Feet → Inch

Yard → Feet

UC6 – Unit Addition

Add two quantities.

Handles unit normalization before addition.

UC7 – Target Unit Addition

Add quantities and return result in a specified target unit.

UC8 – Standalone Unit Handling

Unit abstraction implemented.

Clean separation of logic.

UC9 – Weight Measurement

Added support for weight units.

Example:

Gram

Kilogram

UC10 – Generic Quantity Extension

Fully generic measurement handling.

Supports multiple measurement types.
