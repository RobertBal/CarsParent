package pl.balys;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Unit test for simple CarsData.
 */
public class CarsDataTest
    extends TestCase {

    @Test
    public void testConstructor() {
        //given
        String sam1 = "Ford,Fiesta,1973,100";
        String expectedBrand = "Ford";
        String expectedModel = "Fiesta";
        int expectedManufactureYear = 1973;
        double expectedPower = 100;
        //when
        CarsData car1 = new CarsData(sam1);
        //then
        assertEquals(expectedBrand, car1.getBrand());
        assertEquals(1973, car1.getManufactureYear());
        assertEquals("Fiesta", car1.getModel());
        assertEquals(expectedPower, car1.getPower(), 0.00001);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullString() {
        CarsData car1 = new CarsData(null);
    }
}