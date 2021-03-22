import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void hasPaper() {
        assertEquals(50, printer.getSheetsLeft());
    }

    @Test
    public void willPrint() {
        printer.getSheetsLeft();
        printer.print(4,3);
        assertEquals(38, printer.getSheetsLeft());

    }

    @Test
    public void hasToner() {
        assertEquals(15, printer.getTonerVolume());
    }

    @Test
    public void usesToner() {
        printer.print(4, 3);
        assertEquals(3, printer.getTonerVolume());
    }




}
