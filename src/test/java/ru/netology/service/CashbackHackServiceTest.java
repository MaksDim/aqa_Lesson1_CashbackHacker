package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void schould100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void schould1000IfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void schould900IfAmountIs1100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int expected = 900;

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}