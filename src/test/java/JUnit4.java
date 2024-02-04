
import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class JUnit4 {
    @Test
    public void calculateBonusTest() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}