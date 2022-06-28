abstract class Animal {
  public abstract void animalSound();

  public void sleep() {
    System.out.println("Zzzz");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("Dog sound");
  }
}

class Cat extends Animal {
  public void animalSound() {
    System.out.println("Cat sound");
  }
}

// multiple inheritances
interface AnimalInterface {
  public void animalWalk();
}

interface AnimalInterface2 {
  public void animalEat();
}

class wolf implements AnimalInterface, AnimalInterface2 {
  public void animalWalk() {
    System.out.println("Wolf walk");
  }

  public void animalEat() {
    System.out.println("Wolf eat");
  }
}

enum Level {
  LOW,
  MEDIUM,
  HIGH
}
