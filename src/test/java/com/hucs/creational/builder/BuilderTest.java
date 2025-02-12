package com.hucs.creational.builder;

import junit.framework.Assert;
import junit.framework.TestCase;

public class BuilderTest extends TestCase {

    public void testBuilder() {
        Foguete foguete = FogueteBuilder.builder()
                .nome("Space1")
                .tripulado(true)
                .build();

        Assert.assertEquals("Space1",foguete.getNome());
        Assert.assertTrue(foguete.isTripulado());
    }
}