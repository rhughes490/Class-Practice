import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
        private Calculator calculator;

        @Before
        public void before() {
            this.calculator = new Calculator(10, 5);
        }

        @Test
        public void canAdd() {
            assertEquals(15, calculator.add());
        }

        @Test
        public void canSubtract() {
            assertEquals(5, calculator.subtract());
        }

        @Test
        public void canMultiply() {
            assertEquals(50, calculator.multiply());
        }

}
