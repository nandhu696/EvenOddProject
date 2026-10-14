package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AppTest {
    @Test public void testEvenNumber() { assertEquals("Even", new App().evenOrOdd(8)); }
    @Test public void testOddNumber() { assertEquals("Odd", new App().evenOrOdd(7)); }
}
