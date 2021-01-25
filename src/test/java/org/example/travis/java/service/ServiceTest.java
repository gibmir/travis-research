package org.example.travis.java.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServiceTest {

    @Test
    void testToUpperCase() {
        Assertions.assertArrayEquals(new String[]{"ASD"}, Service.toUpperCase(new String[]{"asd"}));
    }
}