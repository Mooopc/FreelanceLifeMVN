package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CountRestServiceTest {
    @Test
    public void testLowExpences() {
        CountRestService service = new CountRestService();

        int threshold = 150_000;
        int income = 100_000;
        int expenses = 60_000;
        int expected = 2;
        int actual = service.calculate(threshold, income, expenses);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHighExpences() {
        CountRestService service = new CountRestService();

        int threshold = 20_000;
        int income = 10_000;
        int expenses = 3_000;
        int expected = 3;
        int actual = service.calculate(threshold, income, expenses);

        Assertions.assertEquals(expected, actual);
    }

}
