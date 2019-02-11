import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){

        printer = new Printer(50);

    }

    @Test
    public void hasSheetsOfPaper(){
        assertEquals(50, printer.getPaperQuantity());
    }

    @Test
    public void canPrint(){
        printer.print(1, 2);
        assertEquals(48, printer.getPaperQuantity());
    }

    @Test
    public void cannotPrintWhenNotEnoughPaper(){
        printer.print(50, 3);
        assertEquals(50, printer.getPaperQuantity());
    }

    @Test
    public void canRefillPaper(){
        printer.print(10, 4);
        printer.fillPaper(100);
        assertEquals(110, printer.getPaperQuantity());
    }

    @Test
    public void hasTonerProperty(){
        assertEquals(1000, printer.checkTonerVolume());
    }

    @Test
    public void printingReducesTonerBy1PerPage(){
        printer.print(20, 2);
        assertEquals(960, printer.checkTonerVolume());
    }

    @Test
    public void canRefillToner(){
        printer.print(20, 2);
        printer.refillToner();
        assertEquals(1000, printer.checkTonerVolume());
    }
}
