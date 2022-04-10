import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.BinOps;
import ru.netology.BinOpsImpl;

public class BinOpsTest {

    private final BinOps binOps = new BinOpsImpl();

    @Test
    @DisplayName("Sum test")
    public void sumTest() {
        String result = binOps.sum("10101010","11001100");
        Assertions.assertEquals(result,"101110110");
    }

    @Test
    @DisplayName("Mult test")
    public void multTest() {
        String result = binOps.mult("10101010","11001100");
        Assertions.assertEquals(result,"1000011101111000");
    }
}
