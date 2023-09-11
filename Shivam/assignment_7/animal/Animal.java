package assignment7;

public abstract class Animal {
	
	 public abstract void makeNoise();

	    public void eat() {
	        System.out.println("Animal is eating");
	    }

	    public void walk() {
	        System.out.println("Animal is walking");
	    }
	}

	class Dog extends Animal {
	    @Override
	    public void makeNoise() {
	        System.out.println("Barking...");
	    }

	    public void handShake() {
	        System.out.println("Dog is handshaking");
	    }
	}

	class Cat extends Animal {
	    @Override
	    public void makeNoise() {
	        System.out.println("Meow...");
	    }
	}

	class Tiger extends Animal {
	    @Override
	    public void makeNoise() {
	        System.out.println("Roaring...");
	    }
	}
	
	class Demo {
	    public Animal[] getAnimals() {
	        Animal[] animals = new Animal[3];
	        animals[0] = new Dog();
	        animals[1] = new Cat();
	        animals[2] = new Tiger();
	        return animals;
	    }
	    

	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
        Animal[] animals = demo.getAnimals();
        
        for (Animal animal : animals) {
            animal.eat();
            animal.walk();
            animal.makeNoise();
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.handShake();
            }
            System.out.println();
		
	}
	}

}
