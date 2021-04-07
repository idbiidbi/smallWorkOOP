package poly;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Fauna fauna = new Fauna();
        fauna.name = "FAUNA";

        Animals animal = new Animals();
        animal.name = "Animal world";
        animal.size1 = 0.14f;
        animal.size2 = 33f;

        Birds bird = new Birds();
        bird.name = "SEAGULL";
        bird.size1 = 0.5f;
        bird.wings = 2;

        Mammals mammal = new Mammals();
        mammal.name = "LION";
        mammal.size1 = 1.7f;
        mammal.legs = 4;

        ArrayList<Fauna> all= new ArrayList<>();
        all.add(fauna);
        all.add(animal);
        all.add(bird);
        all.add(mammal);


        for (Fauna each: all) {
            each.showInfo();
        }


    }
}
