import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void isTriangleWithInteger() {
        Triangle triangle1 = new Triangle(2, 5, 4);
        boolean expected = true;
        boolean result = triangle1.isTriangle();
        assertEquals(expected, result);
    }
    @Test
    public void isNotTriangle() {
        Triangle triangle2 = new Triangle(12, 9, 30);
        boolean expected = true;
        boolean result = triangle2.isTriangle();
        assertNotEquals(expected, result);
    }

    @Test
    public void isTriangleWithString() {
        Triangle triangle3 = new Triangle("10", "15", "12");
        boolean expected = true;
        boolean result = triangle3.isTriangle();
        assertEquals(expected, result);
    }

    @Test(expected = NumberFormatException.class)
    public void isTriangleWhenInputNumberFormatException() {
        Triangle triangle4 = new Triangle("1fe0", "15", "12");
        boolean expected = true;
        boolean result = triangle4.isTriangle();
        assertEquals(expected, result);
    }

    @Test
    public void isEquilateral() {
        Triangle triangle5=new Triangle(34,34,34);
        assertEquals(true,triangle5.isEquilateral());
    }
    @Test
    public void isNotEquilateral() {
        Triangle triangle6=new Triangle(34,31,34);
        assertNotEquals(true,triangle6.isEquilateral());
    }

    @Test
    public void isIsosceles() {
        Triangle triangle7=new Triangle(32,15,32);
        assertEquals(true,triangle7.isIsosceles());
    }
    @Test
    public void isNotIsosceles() {
        Triangle triangle8=new Triangle(31,15,32);
        assertNotEquals(true,triangle8.isIsosceles());
    }

    @Test
    public void isScalene() {
        Triangle triangle9=new Triangle(31,15,32);
        assertEquals(true,triangle9.isScalene());
    }
    @Test
    public void isNotScalene() {
        Triangle triangle9=new Triangle(12, 9, 30);
        assertNotEquals(true,triangle9.isScalene());
    }
    @Test
    public void answerWithNumbers34and31and34() {
        Triangle triangle10=new Triangle(34,31,34);
        assertEquals("Этот треугольник равнобедренный",triangle10.answer());
    }
    @Test
    public void answerWithNumbers34and34and34() {
        Triangle triangle11=new Triangle(34,34,34);
        assertEquals("Этот треугольник равносторонний",triangle11.answer());
    }
    @Test
    public void answerWithNumbers34and15and31() {
        Triangle triangle12=new Triangle(34,15,31);
        assertEquals("Этот треугольник разносторонний",triangle12.answer());
    }
    @Test
    public void answerWithNumbers34and10and11() {
        Triangle triangle13=new Triangle(34,10,11);
        assertEquals("Значения сторон не подходят для построения сторон",triangle13.answer());
    }
    @Test
    public void answerWithString34and10and11() {
        Triangle triangle14=new Triangle("34","10","11");
        assertEquals("Значения сторон не подходят для построения сторон",triangle14.answer());
    }
    @Test(expected = NumberFormatException.class)
    public void answerWithString34opAnd10and11WhenInputNumberFormatException() {
        Triangle triangle15=new Triangle("34op","10","11");
        assertEquals("Значения сторон не подходят для построения сторон",triangle15.answer());
    }
}