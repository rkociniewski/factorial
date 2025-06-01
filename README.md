# Kotlin Factorial Calculator

![Kotlin](https://img.shields.io/badge/kotlin-1.9+-blue.svg)
![Build](https://img.shields.io/github/actions/workflow/status/your-username/factorial-calculator/build.yml?label=build)
![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)

## Overview

This is a simple Kotlin project demonstrating a **tail-recursive implementation** of the factorial function using `BigInteger`, along with utility functions and unit tests written with JUnit 5.

The project includes:
- Recursive factorial calculation
- Safe input handling (throws on negative values)
- Formatted string output of factorial steps
- Unit tests with multiple input cases and edge cases

---

## Usage

### Factorial Calculation

```kotlin
val result = factorial(5)
println(result) // Output: 120
