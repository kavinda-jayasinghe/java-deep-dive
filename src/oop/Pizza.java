package oop;

class main{
    public static void main(String[] args) {
        Pizza pizza=new Pizza(true);
        pizza.addExtraCheese();
        pizza.addExtraToppings();
    }
}

public class Pizza {

    private int price;
    private boolean veg;
    private  final int addExtraCheese=300;
    private  final int addExtraToppings=100;

    Pizza(boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
    }
    void addExtraCheese(){
    this.price=this.price+addExtraCheese;
    }
//this.price = +300;	Assigns positive 300	Always sets to 300
//this.price += 300;	Adds 300 to current value	Increases by 300
//this.price = this.price + 300;	Same as above	Increases by 300

    void addExtraToppings(){
        this.price=this.price+addExtraToppings;
    }
    void getBill(){
        System.out.println(this.price);
    }
}

