package rk.powermilk

import java.math.BigInteger

/**
 * Exception message.
 */
internal const val MESSAGE = "The number should be greater or equal to 0"

/**
 * Function creates a string with n! steps.
 *
 * @param number number to calculate n!.
 * @return string with a factorial step for 0 to [number].
 */
fun printFactorial(number: Int) = IntRange(0, number).map { factorial(it).toString() }.joinToString { it }

/**
 * Function to calculate factorial number (n!).
 *
 * @param number number to calculate n!.
 * @return factorial (n! = [number]!).
 * @exception ArithmeticException when [number] is negative number.
 */
tailrec fun factorial(number: Int, run: BigInteger = BigInteger.ONE): BigInteger = if (number < 0) {
    throw ArithmeticException(MESSAGE)
} else {
    when (number) {
        0 -> BigInteger.ZERO
        1 -> run
        else -> factorial(number - 1, run.multiply(number.toBigInteger()))
    }
}
