class main{
    public static void main(String[] args) {
        Pizza pizza=new Pizza(true);
        pizza.addExtraCheese();
        pizza.addExtraToppings();
    }
}

 class Pizza {

    private int price;
    private boolean veg;

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
        this.price+=300;
    }

    void addExtraToppings(){

    }
    void getBill(){
        System.out.println(this.price);
    }
}
