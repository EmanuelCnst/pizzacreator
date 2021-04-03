package ch.bbw.ec.pizzacreator.Model;

import java.util.List;

/**
 * Klasse Model
 * @Datum 29.03.2021
 * @author Emanuel Constanti
 */

public class PizzaCreatorModel {

    private String nameofPizza;
    private String size;
    private double price = 17.0;
    private List<String> checkedItemsIngrediants;
    private String errorMessage;

    public PizzaCreatorModel(){

    }

    public double calculatePrice(){

        if(size.equals("250")){
            price = 17;
        }else if(size.equals("320")){
            price = 20;
        }
        return price = price + (checkedItemsIngrediants.toArray().length + 0.50);
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<String> getCheckedItemsIngrediants() {
        return checkedItemsIngrediants;
    }

    public void setCheckedItemsIngrediants(List<String> checkedItemsIngrediants) {
        this.checkedItemsIngrediants = checkedItemsIngrediants;

    }

    public String getNameofPizza() {
        return nameofPizza;
    }

    public void setNameofPizza(String nameofPizza) {
        this.nameofPizza = nameofPizza;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
