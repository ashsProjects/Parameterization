package com.foo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

public class SphereTest {
    private Sphere sphere;

    @BeforeEach
    public void setUp() {
        sphere = new Sphere();
    }

    @Test
    @DisplayName("Test radius of 0 returns a volume of 0")
    public void testZeroRadius() {
        double actual = sphere.calculateVolume(0);
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Test radius of 1000 returns correct value")
    public void testLargeRadius() {
        double actual = sphere.calculateVolume(1000);
        assertEquals(4188790204.78, actual, 0.01);
    }

    @Test
    @DisplayName("Test sphere is an instance of ThreeDimShape")
    public void testInstanceOf() {
        assertTrue(sphere instanceof ThreeDimShape);
    }
}
