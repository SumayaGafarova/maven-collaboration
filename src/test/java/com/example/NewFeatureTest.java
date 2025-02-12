package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class NewFeatureTest {

    @Test
    public void testGreet() {
        NewFeature newFeature = new NewFeature();
        assertEquals("Hello, John", newFeature.greet("John"));
    }
}

