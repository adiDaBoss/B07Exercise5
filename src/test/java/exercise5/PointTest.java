package exercise5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

// It seems junit tests are typically formatted as name_Situation_Result form what I can tell
// 100% coverage
public class PointTest {
    @Test
    void equals_Self_True() {
        Point p1 = new Point(2, 4);
        assertEquals(p1, p1);
    }

    @Test
    void equals_SameCoordinates_True() {
        Point p1 = new Point(2, 4);
        Point p2 = new Point(2, 4);
        assertEquals(p1, p2);
    }

    @Test
    void equals_DifferentYCoordinate_False() {
        Point p1 = new Point(2, 4);
        Point p2 = new Point(2, 5);
        assertNotEquals(p1, p2);
    }

    @Test
    void equals_DifferentXCoordinate_False() {
        Point p1 = new Point(2, 4);
        Point p2 = new Point(3, 4);
        assertNotEquals(p1, p2);
    }

    @Test
    void equals_Distance_True() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(24, 10);
        assertEquals(p1.distance(p2), 26);
    }

    @Test
    void equals_Null_False() {
        Point p1 = new Point(2, 3);
        assertNotNull(p1);
    }

    @Test
    void equals_DifferentClass_False() {
        Point p1 = new Point(2, 3);
        String s = new String("Bonjour");
        assertNotEquals(p1, s);
    }

    @Test
    void hashCode_SamePoints_True() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(2, 3);
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    void hashCode_DifferentPoints_False() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(3, 3);
        assertNotEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    void perimeter_RightTriangle_True() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 3);
        Point p3 = new Point(4, 0);
        Triangle t = new Triangle(p1, p2, p3);
        assertEquals(t.perimeter(), 12);
    }

    @Test
    void isEquilateral_AllSidesSame_True() {
         Point p1 = new Point(0, 0);
         Point p2 = new Point(Math.sqrt(5), 0);
         Point p3 = new Point(Math.sqrt(5) / 2, Math.sqrt(15) / 2);
         Triangle t = new Triangle(p1, p2, p3);
         assertTrue(t.isEquilateral());
    }

    @Test
    void isEquilateral_FirstTwoSidesEqualOnly_False() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(Math.sqrt(5), 0);
        Point p3 = new Point(Math.sqrt(5), Math.sqrt(5));
        Triangle t = new Triangle(p1, p2, p3);
        assertFalse(t.isEquilateral());
    }

    @Test
    void isEquilateral_FirstTwoSidesNotEqual_False() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 0);
        Point p3 = new Point(6, 0); 
        Triangle t = new Triangle(p1, p2, p3);
        assertFalse(t.isEquilateral());
    }
}