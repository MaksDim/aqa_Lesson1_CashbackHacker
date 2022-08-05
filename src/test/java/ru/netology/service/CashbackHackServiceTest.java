package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void schould100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void schould1000IfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;

        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void schould900IfAmountIs1100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int expected = 900;

        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}