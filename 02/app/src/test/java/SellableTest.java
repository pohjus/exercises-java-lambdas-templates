package exercise.sellablethings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SellableTest {

    @Test
    public void testSellableInterface() {
        Sellable sellable = () -> "Item is sold.";
        String result = sellable.sell();
        assertEquals("Item is sold.", result);
    }
}
