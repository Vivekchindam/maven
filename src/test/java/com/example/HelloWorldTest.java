package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testSayHello() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello from Maven!", hw.sayHello());
    }
}

