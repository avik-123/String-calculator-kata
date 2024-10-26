import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    void testingCodeIsAddValue() {
        StringCalculator calculator = new StringCalculator();
        System.out.println("testing the single number return value 5");
        assertEquals(5, calculator.add(",\n"));
    }


    void testTwoNumberReturnsSum() {
       StringCalculator calculator = new StringCalculator();
        System.out.println("testing two numbers returns the sum '3'");
       assertEquals(3, calculator.add("1,2"));
    }


    void testNumberWithNewLineDelimiter() {
       StringCalculator calculator = new StringCalculator();
        System.out.println("test Number With NewLine Delimiter and perform add operation 1,2,3 =6");
       assertEquals(6, calculator.add("1\n2,3"));
     }

    void testCustomDelimiter(){
        StringCalculator calculator = new StringCalculator();
        System.out.println("Testing the string is separated to ; 1;2;3");
        assertEquals(3, calculator.add("//;\n1;2"));


//        void testNegativeNumber(){
//            StringCalculator calculator1 = new StringCalculator();
//            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
//                calculator.add("1,-2,3,-4");
//            });
//            assertEquals("Negative numbers not allowed: [-2, -4]", exception.getMessage());
//        }


    }
}












