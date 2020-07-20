import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before() {
        this.printer = new Printer(100, 90);
    }

    @Test
    public void hasPagesLeft() {
        assertEquals(100, printer.getPagesLeft());
    }

    @Test
    public void hasTonerLeft() {
        assertEquals(90, printer.getTonerLeft());
    }

    @Test
    public void canPrint() {
        printer.print(10, 5);
        assertEquals(50, printer.getPagesLeft());
        assertEquals(40, printer.getTonerLeft());
    }

}