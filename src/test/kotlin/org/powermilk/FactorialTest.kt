package org.powermilk

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource
import java.math.BigInteger
import kotlin.test.assertEquals

@Suppress("UnusedPrivateMember")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FactorialTest {
    @ParameterizedTest(name = "[{index}] should throws ArithmeticException for {0}")
    @ValueSource(ints = [-2, -1])
    fun `should throws ArithmeticException - negative number as input`(expected: Int) =
        assertEquals(assertThrows<ArithmeticException> { factorial(expected) }.message, MESSAGE)

    @ParameterizedTest(name = "should return \"{1}\" for terms \"{0}\"")
    @MethodSource("calculateFactorialProvider")
    @DisplayName("should calculate factorial")
    fun `should calculate factorial`(number: Int, expected: BigInteger) = assertEquals(expected, factorial(number))

    @ParameterizedTest(name = "should display \"{1}\" for terms \"{0}\"")
    @MethodSource("printFactorialProvider")
    fun `should display factorial `(number: Int, expected: String) = assertEquals(expected, printFactorial(number))

    private fun calculateFactorialProvider() = listOf(
        Arguments.of(0, BigInteger.ZERO),
        Arguments.of(1, BigInteger.ONE),
        Arguments.of(2, BigInteger("2")),
        Arguments.of(5, BigInteger("120")),
        Arguments.of(16, BigInteger("20922789888000"))
    )

    private fun printFactorialProvider() = listOf(
        Arguments.of(-1, ""),
        Arguments.of(1, "0, 1"),
        Arguments.of(2, "0, 1, 2"),
        Arguments.of(6, "0, 1, 2, 6, 24, 120, 720"),
    )
}
