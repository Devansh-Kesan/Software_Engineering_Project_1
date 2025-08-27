package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test ShapeDrawer class
 */
public class ShapeDrawerTest {

    @Test
    void testCircleDraw() {
        Shape shape = new Circle();
        assertDoesNotThrow(shape::draw);
    }

    @Test
    void testRectangleDraw() {
        Shape shape = new Rectangle();
        assertDoesNotThrow(shape::draw);
    }

    @Test
    void testTriangleDraw() {
        Shape shape = new Triangle();
        assertDoesNotThrow(shape::draw);
    }
}
