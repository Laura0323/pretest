package com.tdea.pretest;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PretestApplicationTests {

    @Test
    public void isPasswordEqual() {

        String dbPassword = "hola";
        String password = "hola";

        boolean result = UserUtils.isPasswordEqual(dbPassword, password);
        assertTrue(result);
    }
}