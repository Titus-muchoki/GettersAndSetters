package org.example.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
   public   void intanciate_rectangleCorrectly() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(true, testRectangle instanceof Rectangle);
    }

    @Test
    public void isRectangle_getLength_2() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(2, testRectangle.isRectangle());
    }

    @Test
    public void  rectangle_getLength_4() {
        Rectangle   testRectangle = new Rectangle(2, 4);
        assertEquals(4, testRectangle.getLength());
    }

    @Test
    public void isSquare_notSquare_False() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(false, testRectangle.isSquare);
    }

    @Test
    public void allSideEqual_isSquare_True() {
        Rectangle testRectangle = new Rectangle(2, 2);
        assertEquals(true, testRectangle.allSideEqual);
    }
}