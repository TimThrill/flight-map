package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by cong on 22/05/17.
 */
@Controller
public class GreetingMVCController {
    @RequestMapping("/greetingMVC")
    public String greetingMVC(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "/greeting";
    }
    
    @RequestMapping("/flightMapMVC")
    public String flightMapMVC(Model model) {
    	return "/map";
    }
}
