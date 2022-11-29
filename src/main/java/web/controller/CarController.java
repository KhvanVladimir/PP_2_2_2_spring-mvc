package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;
import java.util.List;

@Controller
@RequestMapping("cars")
public class CarController {

    @GetMapping
    public String allCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count,
                          Model model) {
        CarService car = new CarServiceImpl();
        List<Car> messages = car.getCars(count > 5 ? 5 : count);
        model.addAttribute("messages", messages);
        return "cars";
    }
}