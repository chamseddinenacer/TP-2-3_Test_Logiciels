
import org.example.IntNumber;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class IntNumberTest {

    @TestFactory
    Collection<DynamicTest> testIsPair() {
        return Arrays.asList(
                dynamicTest("Even number is detected as pair", () -> {
                    IntNumber evenNumber = new IntNumber(8);
                    assertTrue(evenNumber.isPair());
                }),
                dynamicTest("Odd number is not detected as pair", () -> {
                    IntNumber oddNumber = new IntNumber(7);
                    assertFalse(oddNumber.isPair());
                })
        );
    }

    @TestFactory
    Collection<DynamicTest> testIsOdd() {
        return Arrays.asList(
                dynamicTest("Odd number is detected as odd", () -> {
                    IntNumber oddNumber = new IntNumber(3);
                    assertTrue(oddNumber.isOdd());
                }),
                dynamicTest("Even number is not detected as odd", () -> {
                    IntNumber evenNumber = new IntNumber(8);
                    assertFalse(evenNumber.isOdd());
                })
        );
    }

    @TestFactory
    Collection<DynamicTest> testIsPrime() {
        return Arrays.asList(
                dynamicTest("Prime number is detected as prime", () -> {
                    IntNumber primeNumber = new IntNumber(17);
                    assertTrue(primeNumber.isPrime());
                }),
                dynamicTest("Non-prime number is not detected as prime", () -> {
                    IntNumber nonPrimeNumber = new IntNumber(9);
                    assertFalse(nonPrimeNumber.isPrime());
                })
        );
    }
}
