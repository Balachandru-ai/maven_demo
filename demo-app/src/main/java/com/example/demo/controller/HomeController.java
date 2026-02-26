package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return """
        <html>
        <title>MAVEN_SPRINGBOOT</title>    
        <head>ADDING PRODUCTS ON SP FILE</HEAD>
        <style>
          body {
              background-color: lightblue;
             }
        </style>
        <body>
            <h2>Add Products</h2>
            <form method='post' action='/products'>
                Name: <input type='text' name='name'/><br/><br/>
                Price: <input type='number' name='price'/><br/><br/>
                <button type='submit'>Add Product</button>
            </form>
        </body>
        </html>
        """;
    }
}
