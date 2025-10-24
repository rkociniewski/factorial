# Kotlin Factorial Calculator

[![version](https://img.shields.io/badge/version-1.1.11-yellow.svg)](https://semver.org)
[![Awesome Kotlin Badge](https://kotlin.link/awesome-kotlin.svg)](https://github.com/KotlinBy/awesome-kotlin)
[![Build](https://github.com/rkociniewski/factorial/actions/workflows/main.yml/badge.svg)](https://github.com/rkociniewski/factorial/actions/workflows/main.yml)
[![codecov](https://codecov.io/gh/rkociniewski/factorial/branch/main/graph/badge.svg)](https://codecov.io/gh/rkociniewski/factorial)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.2.20-blueviolet?logo=kotlin)](https://kotlinlang.org/)
[![Gradle](https://img.shields.io/badge/Gradle-9.10-blue?logo=gradle)](https://gradle.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-greem.svg)](https://opensource.org/licenses/MIT)

## Overview

This is a simple Kotlin project demonstrating a **tail-recursive implementation** of the factorial function using
`BigInteger`, along with utility functions and unit tests written with JUnit 5.

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
```

## License

This project is licensed under the MIT License.

## Built With

* [Gradle](https://gradle.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Rafał Kociniewski** - [PowerMilk](https://github.com/rkociniewski)
