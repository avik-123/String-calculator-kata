import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StringCalculatorTest {


    @Test
    void testAdd_EmptyString_ReturnsZero() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }


    void testSingleNumberReturnsValue() {
       StringCalculator calculator = new StringCalculator();
       System.out.println("testing the single number return value 5");
       assertEquals(5, calculator.add("5"));
    }



}









