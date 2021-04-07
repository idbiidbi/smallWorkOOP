package poly;

public class Mammals extends Animals{

    public int legs;
    public void showInfo() {
        System.out.println("I am a mammal and my name is: " + name + ". I am a big - my size is: " + size1 + " m");
        System.out.println("I have " + legs + " legs");
    }
}
