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
    public String bmi(){
        return "bmi";
    }

    @GetMapping("/score")
    public String add(@RequestParam double weight,
                      @RequestParam double height,
                      @RequestParam int age,
                      @RequestParam double param,
                      ModelMap map) {
        Data data = new Data();
        data.setWeight(weight);
        data.setHeight(height);
        data.setAge(age);
        data.setParam(param);
        map.put("data", data);
        return "score";
    }

//    @ModelAttribute("activityLvl")
//    public Map<String, String> getActivityLvl() {
//        Map<String, String> activityLvl = new HashMap<String, String>();
//        activityLvl.put("1", "Brak aktywności fizycznej");
//        activityLvl.put("2", "Średnia aktyność fizyczna (ćwiczenia 3-5 tygodniowo)");
//        activityLvl.put("3", "Duża aktywność fizyczna (ćwiczenia codziennie)");
//        activityLvl.put("4", "Bardzo duża aktywność fizyczna");
//        return activityLvl;
//    }
}
