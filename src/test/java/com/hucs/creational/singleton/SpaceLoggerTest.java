package com.hucs.creational.singleton;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SpaceLoggerTest extends TestCase {

    public void testGetInstance() {
        SpaceLogger logger1 = SpaceLogger.getInstance();
        SpaceLogger logger2 = SpaceLogger.getInstance();

        logger1.info("Initiate launch");
        logger2.warn("Instability capture");
        logger1.erro("Signal lost");

        Assert.assertEquals(logger1.toString(),logger2.toString());
    }
}