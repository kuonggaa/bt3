import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTypeTest2 {

    @Test
    void testEquilateralTriangle() {
        String result = TriangleType.determineTriangleType(3, 3, 3);
        assertEquals("Equilateral", result);
    }

    @Test
    void testIsoscelesTriangle() {
        String result = TriangleType.determineTriangleType(3, 3, 4);
        assertEquals("Isosceles", result);
    }

    @Test
    void testScaleneTriangle() {
        String result = TriangleType.determineTriangleType(2, 3, 4);
        assertEquals("Scalene", result);
    }

    @Test
    void testRightTriangle() {
        String result = TriangleType.determineTriangleType(3, 4, 5);
        assertEquals("RightTriangle", result);
    }

    @Test
    void testNotATriangle() {
        String result = TriangleType.determineTriangleType(0, 3, 4);
        assertEquals("NotATriangle", result);
    }

    @Test
    void testNegativeSide() {
        String result = TriangleType.determineTriangleType(-1, 3, 4);
        assertEquals("NotATriangle", result);
    }

    @Test
    void testAllSidesZero() {
        String result = TriangleType.determineTriangleType(0, 0, 0);
        assertEquals("NotATriangle", result);
    }

    @Test
    void testOneSideZero() {
        String result = TriangleType.determineTriangleType(0, 3, 4);
        assertEquals("NotATriangle", result);
    }

    @Test
    void testAllSidesNegative() {
        String result = TriangleType.determineTriangleType(-1, -3, -4);
        assertEquals("NotATriangle", result);
    }
}
