import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.ArrayHw.service.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldCalcSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSale(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        long actual = service.maxSale(sales);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldCalcMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        long actual = service.minSale(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.aboveAverage(sales);
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldCalcLessThanAverage(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.lessThanAverage(sales);
        Assertions.assertEquals(expected,actual);
    }

}
