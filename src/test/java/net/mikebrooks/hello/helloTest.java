package net.mikebrooks.hello;
//import net.mikebrooks.hello.helloTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.jupiter.api.Assertions.*;

class helloTest {
    private static final Logger logger = LogManager.getLogger("hello");

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        logger.info("Test: Setup");
    }


    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        logger.info("Test: tear down");
    }

    @org.junit.jupiter.api.Test
    void Tadd() {
        logger.info("Test: add");
        assertEquals(2, 2);
    }

    @org.junit.jupiter.api.Test
    void Tsubtract() {
        logger.info("Test: subtract");
       assertEquals(2, 2);
    }

    @org.junit.jupiter.api.Test
    void Tmul() {
        logger.info("Test: multiply");
        assertEquals(2, 2);
    }

    @org.junit.jupiter.api.Test
    void Tdiv() {
        logger.info("Test: divide");
        assertEquals(2, 2);
    }
}