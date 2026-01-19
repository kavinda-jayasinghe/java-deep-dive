package solid.openClose;

/*
* You add new behavior
* without changing existing working code
*
* */

public class OpenClosed {

    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService();
        paymentService.pay("CARD",1000.00);
    }
}

class PaymentService{
    void pay(String type,double amount){
        if (type.equalsIgnoreCase("CASH")){
            System.out.println("paid by cash "+amount);
        } else if (type.equalsIgnoreCase("CARD")) {
            System.out.println("paid by card "+amount);
        }
    }
}

//if new payment meth introduce we need to modify the whole code again.so here we use interface.no need to modify code,just only add new class  for new method
//payment is common for all  and also payment amount is also common,,,then use interface for that...
//payment method is change.

class OpenClosedNew{
    public static void main(String[] args) {
        CardPayment payment=new CardPayment();
        payment.pay(2000.00);

        GooglePayment gPayment=new GooglePayment();
        gPayment.pay(1000.00);
    }
}

interface payment{
    void pay(double amount);
}

class CardPayment implements payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by card");
    }
}

class CashPayment implements payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by cash");
    }
}

class GooglePayment implements payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by gPay");
    }
}

