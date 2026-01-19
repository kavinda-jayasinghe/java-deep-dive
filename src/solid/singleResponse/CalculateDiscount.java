package solid.singleResponse;

public class CalculateDiscount {
    public static void main(String[] args) {
        RegularCustomer regularCustomer=new RegularCustomer();
        regularCustomer.calculate(100.00);
    }
}
interface calculate{
    void calculate(double price);
}
class RegularCustomer implements calculate {

    public void calculate(double price) {
        price = price + price * 0.01;
        System.out.println(price);
    }
}