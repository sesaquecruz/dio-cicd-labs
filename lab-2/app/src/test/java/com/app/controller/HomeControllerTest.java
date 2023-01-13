package com.app.controller;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;


class HomeControllerTest {

    @Test
    void home() {
        var homeController = new HomeController();
        var responseExpected = ResponseEntity.ok("Welcome");
        var responseActual = homeController.home();
        assertEquals(responseExpected, responseActual);
    }

    @Test
    void greeting() {
        var homeController = new HomeController();
        var name = "Don Corleone";
        var responseExpected = ResponseEntity.ok(String.format("Hello %s!", name));
        var responseActual = homeController.greeting(name);
        assertEquals(responseExpected, responseActual);
    }
}