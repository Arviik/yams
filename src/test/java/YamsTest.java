import com.example.Yams;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class YamsTest {

    @Test
    void testChance() {
        assertEquals(11, Yams.getScore(List.of(3, 1, 2, 1, 4)));
    }

}
