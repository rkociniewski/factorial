package rk.powermilk

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FactorialTest {
    @ParameterizedTest(name = "[{index}] should throw ArithmeticException for {0}")
    @ValueSource(ints = [-2, -1])
    fun `should throw ArithmeticException - negative number as input`(input: Int) {
        val exception = assertThrows<ArithmeticException> { factorial(input) }
        assertEquals(MESSAGE, exception.message)
    }

    @ParameterizedTest(name = "should return {1} for factorial({0})")
    @MethodSource("calculateFactorialProvider")
    fun `should calculate factorial`(number: Int, expected: BigInteger) {
        assertEquals(expected, factorial(number))
    }

    @ParameterizedTest(name = "should display \"{1}\" for printFactorial({0})")
    @MethodSource("printFactorialProvider")
    fun `should display factorial string`(number: Int, expected: String) {
        assertEquals(expected, printFactorial(number))
    }

    @Test
    fun `should return empty string for negative number in printFactorial`() {
        assertEquals("", printFactorial(-5))
    }

    @Test
    fun `should calculate factorial for large number`() {
        val result = factorial(1000)
        assertTrue(result > BigInteger.ZERO)
    }

    private fun calculateFactorialProvider() = listOf(
        Arguments.of(0, BigInteger.ONE),
        Arguments.of(1, BigInteger.ONE),
        Arguments.of(2, BigInteger("2")),
        Arguments.of(5, BigInteger("120")),
        Arguments.of(10, BigInteger("3628800")),
        Arguments.of(16, BigInteger("20922789888000")),
    )

    private fun printFactorialProvider() = listOf(
        Arguments.of(0, "1"),
        Arguments.of(1, "1, 1"),
        Arguments.of(2, "1, 1, 2"),
        Arguments.of(3, "1, 1, 2, 6"),
        Arguments.of(6, "1, 1, 2, 6, 24, 120, 720"),
    )
}
