package ru.Netology.stats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSalesSum() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSalesSum(sale);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverageSum(sale);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateMonthNumberOfMaxSale() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.calculateMonthNumberOfMaxSale (sale);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthNumberOfMinSale() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.calculateMonthNumberOfMinSale(sale);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateQuantityMonthWithSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service. calculateQuantityMonthWithSalesBelowAverage(sale);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateQuantityMonthWithSalesUnderAverage() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateQuantityMonthWithSalesUnderAverage(sale);
        assertEquals(expected, actual);
    }
}