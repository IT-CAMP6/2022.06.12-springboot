package pl.camp.it.first.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.camp.it.first.app.model.Client;

@Controller
public class BigFormController {
    @RequestMapping(value = "/bigform", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("clinet", new Client());
        return "form2";
    }

    @RequestMapping(value = "/bigform", method = RequestMethod.POST)
    public String form(@ModelAttribute Client client) {
        System.out.println(client.getName());
        System.out.println(client.getCity());
        System.out.println(client.getAge());
        System.out.println(client.getPassword2());
        System.out.println(client.getPhone());
        System.out.println(client.getStreet());

        return "szablon2";
    }
}
