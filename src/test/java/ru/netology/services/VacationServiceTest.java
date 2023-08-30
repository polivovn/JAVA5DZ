package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VacationServiceTest {
    @Test
    public void testCalculate() {
        VacationService service = new VacationService();
        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;


        Assertions.assertEquals(actual, expected);
    }

}
