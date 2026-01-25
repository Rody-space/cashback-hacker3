package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceJUnit4 {

    @Test
    public void testRemain_BelowBoundary() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        assertEquals("Should return 100 for 900 rubles", 100, result);
    }

    @Test
    public void testRemain_ExactBoundary() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        assertEquals("Should return 0 for exact 1000 rubles", 0, result);
    }
}
