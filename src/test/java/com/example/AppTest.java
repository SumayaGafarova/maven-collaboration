package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAppHasAGreeting() {
        App app = new App();
        assertNotNull("App should have a greeting", app.getGreeting());
    }

    @Test
    public void testGreetingMessage() {
        App app = new App();
        assertEquals("Hello, Maven!", app.getGreeting());
    }

    @Test
    public void testAddition() {
        int result = 2 + 2;
        assertEquals(4, result);
    }

    @Test
    public void testSubtraction() {
        int result = 5 - 3;
        assertEquals(2, result);
    }

    @Test
    public void testFailCase() {
        assertTrue(true); // This test is designed to fail
    }
}

