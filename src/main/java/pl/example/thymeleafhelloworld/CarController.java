package pl.example.thymeleafhelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model){
        Car car1 = new Car("BMW", "i8");
        Car car2 = new Car("Toyota", "Camry");
        Car car3 = new Car("Audi", "Q7");
        Car car4 = new Car("Fiat", "Punto");
        Car car5 = new Car("Renault", "Laguna");
        List<Car>cars = Arrays.asList(car1, car2, car3,  car4, car5);

        model.addAttribute("cars", cars);
        return "car";
    }
}
