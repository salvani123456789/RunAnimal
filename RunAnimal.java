abstract class Animal {
    abstract void eat();
    abstract void sleep();
    abstract void makeSound();
}

class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Birds love to eat seeds.");
    }

    @Override
    void sleep() {
        System.out.println("Birds sleep for 10-12 hours a day.");
    }

    @Override
    void makeSound() {
        System.out.println("Tweet tweet");
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cats love to eat fish.");
    }

    @Override
    void sleep() {
        System.out.println("Cats sleep for 12-16 hours a day.");
    }

    @Override
    void makeSound() {
        System.out.println("Meow meow");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dogs love to eat bones.");
    }

    void sleep() {
        System.out.println("Dogs sleep for 12-14 hours a day.");
    }

    void makeSound() {
        System.out.println("Woof woof");
    }
}

public class RunAnimal {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Choose an animal. Press B for Bird, C for Cat, or D for Dog:");
        String choice = scanner.nextLine();

        Animal animal = null;

        if (choice.equalsIgnoreCase("B")) {
            animal = new Bird();
        } else if (choice.equalsIgnoreCase("C")) {
            animal = new Cat();
        } else if (choice.equalsIgnoreCase("D")) {
            animal = new Dog();
        } else {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }

        animal.eat();
        animal.sleep();
        animal.makeSound();
        scanner.close();
    }
}
