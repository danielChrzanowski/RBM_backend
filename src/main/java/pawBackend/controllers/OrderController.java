package pawBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pawBackend.model.Order;
import pawBackend.services.OrderService;

import java.util.List;


@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/getAllOrders")
    public List<Order> getAllOrders(){return orderService.getAllOrders();}

}
