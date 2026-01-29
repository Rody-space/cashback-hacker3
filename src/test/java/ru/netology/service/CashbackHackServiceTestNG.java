package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTestNG {

    @Test
    public void testRemain_BelowBoundary() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        assertEquals(result, 100, "Should return 100 for 900 rubles");
    }

    @Test
    public void testRemain_ExactBoundary() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        assertEquals(result, 1000, "Should return 0 for exact 1000 rubles");
    }
}
