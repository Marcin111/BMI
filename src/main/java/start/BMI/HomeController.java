package start.BMI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;


@Controller
public class HomeController {

    @GetMapping("/")
    public String Home() {
        return "Home";
    }

    @GetMapping("/bmi")
    public String bmi() {
        return "bmi";
    }

    @GetMapping("/calorieCalculator")
    public String calorieCalculator() {
        return "calorieCalculator";
    }

    @GetMapping("/resultBMI")
    public String resultBMI(@RequestParam double weight,
                      @RequestParam double height,
                      ModelMap map) {
        Data data = new Data();
        data.setWeight(weight);
        data.setHeight(height);
        map.put("data", data);
        return "resultBMI";
    }

    @GetMapping("/resultCalorieCalculator")
    public String resultCalorieCalculator(@RequestParam double weight,
                                          @RequestParam double height,
                                          @RequestParam int age,
                                          @RequestParam String sex,
                                          @RequestParam int param,
                                          ModelMap map) {

        DataCalorieCalculator dataCalorieCalculator = new DataCalorieCalculator(sex, weight, height, age, param);

        double valueW = Math.round(dataCalorieCalculator.woman(weight, height, age));
        valueW /= 100;
        double valueM = Math.round(dataCalorieCalculator.man(weight, height, age));
        valueM /= 100;

        if (sex.equals("Kobieta")) {
            if (param==0){
                map.put("dataCalorieCalculator", String.format("%.2f%n", valueW*1.2));
            } else if (param==1) {
                map.put("dataCalorieCalculator", String.format("%.2f%n", valueW*1.4));
            } else if (param==2) {
                map.put("dataCalorieCalculator", String.format("%.2f%n", valueW*1.6));
            } else if (param==3) {
                map.put("dataCalorieCalculator", String.format("%.2f%n", valueW*1.8));
            } else if (param==4) {
                map.put("dataCalorieCalculator", String.format("%.2f%n", valueW*2.2));
            }

        } else if (sex.equals("Mężczyzna")) {
            if (param==0){
                map.put("dataCalorieCalculator", String.format("%.2f%n", valueM*1.2));
            } else if (param==1) {
                map.put("dataCalorieCalculator", String.format("%.2f%n", valueM*1.4));
            } else if (param==2) {
                map.put("dataCalorieCalculator", String.format("%.2f%n", valueM*1.6));
            } else if (param==3) {
                map.put("dataCalorieCalculator", String.format("%.2f%n", valueM*1.8));
            } else if (param==4) {
                map.put("dataCalorieCalculator", String.format("%.2f%n", valueM*2.2));
            }
        }
        return "resultCalorieCalculator";
    }
}
