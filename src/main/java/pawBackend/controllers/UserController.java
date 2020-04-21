package pawBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pawBackend.model.User;
import pawBackend.services.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/userById/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/userByLogin/{login}")
    public User getUserByLogin(@PathVariable String login) {
        return userService.getUserByLogin(login);
    }

    @PostMapping("/addUser")
    @CrossOrigin(origins = "http://localhost:4200")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

}
