package ch.bbw.ec.pizzacreator.Controller;

import ch.bbw.ec.pizzacreator.Model.PizzaCreatorModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class PizzaCreatorController {

    @GetMapping("/pizzacreator")
    public String pizzaForm(Model model){

        //This is for the Checkboxes
        List<String> ingredients = new ArrayList<String>();
        ingredients.add("Oliven");
        ingredients.add("Kapern");
        ingredients.add("Sardellen");
        ingredients.add("Peporoni");
        ingredients.add("Spinat");
        ingredients.add("Pilze");
        ingredients.add("Salami");
        ingredients.add("Basilikum");
        ingredients.add("Cherry Tomaten");
        ingredients.add("Chalapenios");
        ingredients.add("Speck");
        ingredients.add("Schinken");
        ingredients.add("Extra Käse");
        ingredients.add("Kapern");
        ingredients.add("Sardellen");
        model.addAttribute("ingredients", ingredients);



        PizzaCreatorModel pizzaCreatorModel = new PizzaCreatorModel();

        List<String> checkedItems = new ArrayList<String>();
        // value1 will be checked by default.
        checkedItems.add("Oliven");
        pizzaCreatorModel.setCheckedItemsIngrediants(checkedItems);
        model.addAttribute("pizzaCreatorModel",pizzaCreatorModel);

        return "pizzacreator";
    }


    @PostMapping("/pizzacreator")
    public String pizzaSubmit(@ModelAttribute PizzaCreatorModel myPizzacreator){

      myPizzacreator.calculatePrice();
        return "showpizza";

    }

}
