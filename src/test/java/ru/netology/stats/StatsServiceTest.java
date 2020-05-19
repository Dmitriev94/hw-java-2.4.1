package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    StatsService service = new StatsService();

    long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {

        long expected = 180;
        long actual = service.calculateSum(salesData);
        assertEquals(expected, actual);
    }


    @Test
    void calculateAverage() {

        long expected = 15;
        long actual = service.calculateAverage(salesData);
        assertEquals(expected, actual);

    }

    @Test
    void findMonthWithMax() {
        long expected = 8;
        long actual = service.findMonthWithMax(salesData);
        assertEquals(expected,actual);

    }

    @Test
    void findMonthWithMin() {
        long expected = 9;
        long actual = service.findMonthWithMin(salesData);
        assertEquals(expected,actual);
    }

    @Test
    void amountOfMonthsBelowAverage() {
        long expected = 5;
        long actual = service.amountOfMonthsBelowAverage(salesData);
        assertEquals(expected,actual);
    }

    @Test
    void amountOfMonthsAboveAverage() {

        long expected = 5;
        long actual = service.amountOfMonthsAboveAverage(salesData);
        assertEquals(expected,actual);
    }
}
