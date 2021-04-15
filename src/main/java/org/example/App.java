package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal dog1 = new Animal();
        dog1.name = "Ursa";
        dog1.race = "Labrador";
        dog1.color = "Black";
        dog1.maxSpeedRun = 20;

        System.out.println("The dog's name is " + dog1.name);
        System.out.println("Race of this dog is " + dog1.race);
        System.out.println("Color of this dog is " + dog1.color);
        System.out.println("The speed of the dog is" + dog1.maxSpeedRun);

        AnimalAdopter adopter1 = new AnimalAdopter();
        adopter1.name = "John";
        adopter1.age = 21;
        adopter1.married = true;

        System.out.println("The adopter's name is " + adopter1.name);
        System.out.println("Adopter age is " + adopter1.age);
        System.out.println("Marital status is " + adopter1.married);

        PetFood food = new PetFood();
        food.name = "Brit Premium";
        food.maxKiloFood = 0.5;

        System.out.println("Dog food names " + food.name);
        System.out.println("The amount of food an animal eats " + food.maxKiloFood );

        Veterinarian doctor = new Veterinarian();
        doctor.name = "Michael";
        doctor.age = 30;
        doctor.region = "Cluj-Napoca";

        System.out.println("The doctor's name" + doctor.name);
        System.out.println("The doctor's age " + doctor.age);
        System.out.println("The doctor's region " + doctor.region);

        Fish fish1 = new Fish();
        fish1.name = "Rosito";
        fish1.color = "Yellow";
        fish1.liveInFreshWater = true;

        System.out.println("The name of the fish is  " + fish1.name);
        System.out.println("The color of the fish is  " + fish1.color);
        System.out.println("Fish live in fresh water " + fish1.liveInFreshWater);

        Shark shark1 = new Shark();
        shark1.name = "Eat All ";
        shark1.color = "white";

        System.out.println("The name of the shark " + shark1.name);
        System.out.println("The Color of the fish is " + shark1.color);







    }

}
