package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.breed = "Husky";
        dog1.name = "AnyName";
        dog1.color = "AnyColor";

        dog1.bark();
        dog1.run();
        dog1.play();

        Dog dog2 = new Dog();

        dog2.breed = "Bulldog";
        dog2.name = "AnyName";
        dog2.color = "AnyColor";

        dog2.bark();
        dog2.run();
        dog2.play();

        Dog dog3 = new Dog();

        dog3.breed = "Labrador";
        dog3.name = "AnyName";
        dog3.color = "AnyColor";

        dog3.bark();
        dog3.run();
        dog3.play();

    }
}
