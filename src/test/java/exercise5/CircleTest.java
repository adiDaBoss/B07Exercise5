package exercise5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTest {
    
    @Test
    void perimeterIsZero() {
        Circle c = new Circle(new Point(3, 5), 0);
        assertEquals(c.perimeter(), 0);
    }

    @Test
    void areaIsZero() {
        Circle c = new Circle(new Point(1, -4), 0);
        assertEquals(c.area(), 0);
    }

    @Test
    void pointOnCircumferenceContained() {
        Point p = new Point(2, -4);
        Circle c = new Circle(new Point(1, -3), Math.sqrt(2));
        assertTrue(c.contains(p));
    }

    @Test
    void pointNotContained() {
        Point p = new Point(2, 8);
        Circle c = new Circle(new Point(-2, -3), 5);
        assertFalse(c.contains(p));
    }

    @Test
    void testIsUnitCircle() {
        Circle c = new Circle(new Point(-7, 5), 1);
        assertTrue(c.isUnitCircle());
    }

    @Test
    void testIsNotUnitCircle() {
        Circle c = new Circle(new Point(-7, 5), 3);
        assertFalse(c.isUnitCircle());
    }
}
