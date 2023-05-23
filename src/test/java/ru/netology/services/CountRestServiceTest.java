package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CountRestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/restMonths.csv")
    public void testLowExpences(int expected, int threshold, int income, int expenses) {
        CountRestService service = new CountRestService();

        int actual = service.calculate(threshold, income, expenses);

        Assertions.assertEquals(expected, actual);
    }
}
