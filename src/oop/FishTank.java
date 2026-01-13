package oop;

public class FishTank {
    public static void main(String[] args) {
        Fish fish=new Fish("gold fish");
        fish.display();

//
//        TankCleanFish tankCleanFish=new TankCleanFish();
//        tankCleanFish.fishType("tank cleaner");

        Robot robot=new Robot();
        robot.clean();
    }
}

class Fish{

    String name;
    Fish(String name){
        this.name=name;
        swim();
        eat();
    }

    void display(){
        System.out.println("====this is"+getName()+"===\n");
    }
    public void swim(){
        System.out.println(getName()+" can swim");
    }
    void eat(){
        System.out.println(getName()+" can eat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Robot{
    void clean(){
        System.out.println("robot can clean tank");
    }
}
class TankCleanFish extends Fish{
    TankCleanFish(String name) {
        super(name);
        clean();
    }

    void clean(){
        System.out.println(name+" can clean tank");};
}

