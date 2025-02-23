package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testPurchaseAmountIsLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 234;
        int actual = service.remain(amount);
        int expected = 766;

        assertEquals(actual, expected);

    }

    @Test
    public void testPurchaseAmount0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);

    }

    @Test
    public void testPurchaseAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @Test
    public void testPurchaseAmountIsMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1542;
        int actual = service.remain(amount);
        int expected = 458;

        assertEquals(actual, expected);

    }

}