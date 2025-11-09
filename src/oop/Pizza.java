package oop;


class main{
    public static void main(String[] args) {
//        Pizza pizza=new Pizza(false);
//        pizza.addExtraCheese();
//        pizza.addExtraToppings();
//        pizza.tackAway();
//        pizza.getBill();

        DeluxPizza deluxPizza=new DeluxPizza(true);
        deluxPizza.getBill();
    }
}

public class Pizza {

    private int price;
    private boolean veg;
    private  int basePizzaPrice;
    private int extraCheesePrice=300;
    private int backPackPrice=20;
    private int extraToppingsPrice=200;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraTopingsAdded=false;
    private boolean isTakeAway=false;

    Pizza(boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        this.basePizzaPrice=this.price;
    }
    void addExtraCheese(){
        this.price+=extraCheesePrice;
        this.isExtraCheeseAdded=true;
    }

    void tackAway(){
        this.price+=backPackPrice;
        this.isTakeAway=true;
    }

    void addExtraToppings(){
    this.price+=extraToppingsPrice;
    this.isExtraTopingsAdded=true;
    }
    void getBill(){
        System.out.println("Base Pizza Price : "+this.basePizzaPrice);
        if(isExtraCheeseAdded){
            System.out.println("Extra Cheese :"+this.extraCheesePrice);
        }
        if(isExtraTopingsAdded){
            System.out.println("Extra Toopings :"+this.extraToppingsPrice);
        }
        if(isTakeAway){
            System.out.println("Back Pack prize:"+this.backPackPrice);
        }

        System.out.println("Total price: "+this.price);
    }
}

class DeluxPizza extends Pizza{

    DeluxPizza(boolean veg) {
        super(veg);
        super.addExtraToppings();
        super.addExtraCheese();
    }
}
