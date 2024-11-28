import com.example.Yams;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class YamsTest {

    @Test
    void testChance() {
        assertEquals(11, Yams.getScore(List.of(3, 1, 2, 1, 4)));
    }

    @Test
    void testYams() {
        assertEquals(50, Yams.getScore(List.of(1, 1, 1, 1, 1)));
        assertEquals(50, Yams.getScore(List.of(2, 2, 2, 2, 2)));
        assertEquals(50, Yams.getScore(List.of(3, 3, 3, 3, 3)));
        assertEquals(50, Yams.getScore(List.of(4, 4, 4, 4, 4)));
        assertEquals(50, Yams.getScore(List.of(5, 5, 5, 5, 5)));
        assertEquals(50, Yams.getScore(List.of(6, 6, 6, 6, 6)));
    }

}
