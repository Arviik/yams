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

    @Test
    void testCarre() {
        assertEquals(35, Yams.getScore(List.of(1, 1, 2, 1, 1)));
        assertEquals(35, Yams.getScore(List.of(2, 4, 2, 2, 2)));
        assertEquals(35, Yams.getScore(List.of(3, 6, 3, 3, 3)));
        assertEquals(35, Yams.getScore(List.of(4, 4, 4, 4, 5)));
        assertEquals(35, Yams.getScore(List.of(5, 5, 5, 5, 1)));
        assertEquals(35, Yams.getScore(List.of(6, 5, 6, 6, 6)));
    }

    @Test
    void testBrelan() {
        assertEquals(28, Yams.getScore(List.of(1, 5, 2, 1, 1)));
        assertEquals(28, Yams.getScore(List.of(2, 4, 1, 2, 2)));
        assertEquals(28, Yams.getScore(List.of(3, 6, 2, 3, 3)));
        assertEquals(28, Yams.getScore(List.of(4, 4, 2, 4, 5)));
        assertEquals(28, Yams.getScore(List.of(5, 3, 5, 5, 1)));
        assertEquals(28, Yams.getScore(List.of(6, 5, 6, 4, 6)));
    }

    @Test
    void testFull() {
        assertEquals(30, Yams.getScore(List.of(1, 5, 5, 1, 1)));
        assertEquals(30, Yams.getScore(List.of(2, 4, 4, 2, 2)));
        assertEquals(30, Yams.getScore(List.of(3, 6, 6, 3, 3)));
        assertEquals(30, Yams.getScore(List.of(4, 4, 2, 4, 2)));
        assertEquals(30, Yams.getScore(List.of(5, 1, 5, 5, 1)));
        assertEquals(30, Yams.getScore(List.of(6, 4, 6, 4, 6)));
    }

    @Test
    void testGrandeSuite() {
        assertEquals(40, Yams.getScore(List.of(1, 2, 3, 4, 5)));
        assertEquals(40, Yams.getScore(List.of(5, 4, 3, 2, 1)));
        assertEquals(40, Yams.getScore(List.of(1, 3, 2, 5, 4)));
        assertEquals(40, Yams.getScore(List.of(4, 5, 2, 3, 1)));
    }

}
