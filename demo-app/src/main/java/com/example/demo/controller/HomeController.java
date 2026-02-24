package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return """
        <html>
        <body>
            <h2>Add Product</h2>
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
