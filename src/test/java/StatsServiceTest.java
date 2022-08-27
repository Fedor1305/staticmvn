import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void T1() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 180;
        int actual = service.totalOfAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void T2() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 15;
        int actual = service.averageAmountOfSalesPerMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void T3() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void T4() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void T5() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 5;
        int actual = service.belowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void T6() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 5;
        int actual = service.aboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }




}
