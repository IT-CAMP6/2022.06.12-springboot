package pl.camp.it.first.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.camp.it.first.app.model.Product;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SimpleController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String cos() {
        System.out.println("metoda cos");
        System.out.println("zadanie na adres /jakisadres metoda GET");
        return "jakis";
    }

    @RequestMapping(value = "/kontakt", method = RequestMethod.GET)
    public String cos2() {
        System.out.println("metoda cos2");
        System.out.println("zadanie na adres /jakisadres2 metoda GET");
        return "szablon2";
    }

    @RequestMapping(value = "/parametry", method = RequestMethod.GET)
    public String zadanieZParametrami(@RequestParam("abc") String imie, @RequestParam("p1") String nazwisko) {
        System.out.println(imie);
        System.out.println(nazwisko);
        return "szablon2";
    }


    @RequestMapping(value = "/parametry2/{wiek}/{imie}/{nazwisko}/{cos}", method = RequestMethod.GET)
    public String zadanieZParametramiWAdresie(@PathVariable int wiek,
                                              @PathVariable String imie,
                                              @PathVariable String nazwisko,
                                              @PathVariable boolean cos) {
        System.out.println(wiek);
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(cos);
        return "szablon2";
    }

    @RequestMapping(value = "/parametry3/{wiek}/{cos}", method = RequestMethod.GET)
    public String zadanieZMieszanymiParametrami(@PathVariable int wiek,
                                                @PathVariable boolean cos,
                                                @RequestParam String imie,
                                                @RequestParam String nazwisko,
                                                Model model) {
        System.out.println(wiek);
        System.out.println(cos);
        System.out.println(imie);
        System.out.println(nazwisko);
        model.addAttribute("wiek", wiek+15);
        model.addAttribute("cos", !cos);
        model.addAttribute("imie", "imie: " + imie);
        model.addAttribute("nazwisko", "nazwisko: " + nazwisko);

        List<Product> produkty = new ArrayList<>();
        produkty.add(new Product(1000, "Komputer"));
        produkty.add(new Product(100, "Myszka"));
        produkty.add(new Product(600, "Monitor"));
        produkty.add(new Product(200, "Klawiatura"));
        produkty.add(new Product(150, "Głośniki"));

        model.addAttribute("products", produkty);


        return "info";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "form";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginForm(@RequestParam String login, @RequestParam String pass) {
        System.out.println(login);
        System.out.println(pass);
        return "jakis";
    }


}
