package exercise5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

// It seems junit tests are typically formatted as name_Situation_Result form what I can tell
// 100% coverage
public class RectangleTest {

    @Test
    void perimeter_Rectanle_True() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 3);
        Point p3 = new Point(4, 3);
        Point p4 = new Point(4, 0);
        Rectangle r = new Rectangle(p1, p2, p3, p4);
        assertEquals(r.perimeter(), 14);
    }

    @Test
    void isSquare_AllSidesSame_True() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 4);
        Point p3 = new Point(4, 4);
        Point p4 = new Point(4, 0);
        Rectangle r = new Rectangle(p1, p2, p3, p4);
        assertTrue(r.isSquare());
    }

    @Test
    void isSquare_FirstSecondDifferent_False() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 4);
        Point p3 = new Point(4, 5);
        Point p4 = new Point(4, 0);
        Rectangle r = new Rectangle(p1, p2, p3, p4);
        assertFalse(r.isSquare());
    }

    @Test
    void isSquare_SecondThirdDifferent_False() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 4);
        Point p3 = new Point(4, 4);
        Point p4 = new Point(4, 1);
        Rectangle r = new Rectangle(p1, p2, p3, p4);
        assertFalse(r.isSquare());
    }

    @Test
    void isSquare_ThirdFourthDifferent_False() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 4);
        Point p3 = new Point(4, 4);
        Point p4 = new Point(4, 8);
        Rectangle r = new Rectangle(p1, p2, p3, p4);
        assertFalse(r.isSquare());
    }
}