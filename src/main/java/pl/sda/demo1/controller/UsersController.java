package pl.sda.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.demo1.model.User;

import java.util.Arrays;
import java.util.List;

@RestController
public class UsersController {

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return Arrays.asList(
                new User("Monika", "Kowalska"),
                new User("Ania", "Nowik")
        );
    }

    @GetMapping("/getValue")
    public String getValue() {
        return "Monika poszła na grzyby";
    }
}
