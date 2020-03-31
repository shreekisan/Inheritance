package inheritance;

public class Dog extends  Animal
{
    public static void main(String[] args)
    {
        Dog obj = new Dog();
        //to produce the own sound dog should inherit the properties of produce sound from animal class.
        //And used the dog class object.
        // If we create the object of animal class and call the sound method, this sound is not by the dog
        // but it is by the animal, so we applied the inherit concept
        // only child class inherit the properties of parent class not the parent inherit the child
        obj.sound();
    }
}
