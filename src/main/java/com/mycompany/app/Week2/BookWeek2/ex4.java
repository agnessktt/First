
public abstract class Animal {

    
  
  }
  
  public class Dog extends Animal {
  
    public void speak() {
      System.out.println("Woof!");
    }
  
  }
  
  public static void makeAnimalSpeak(Animal animal) {
    Dog dog = (Dog) animal; 
    dog.speak();
  }
  
  public class Main {
  
    public static void main(String[] args) {
      Dog dog = new Dog();
      makeAnimalSpeak(dog);
  
      
    }
  
  }