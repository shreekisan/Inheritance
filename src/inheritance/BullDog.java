package inheritance;

public class BullDog extends Dog
{
    public static void main(String[] args) {
        BullDog bd=new BullDog(); // here bull dog has the access of get properties of dog and animal class.
        bd.sound();
    }
}
