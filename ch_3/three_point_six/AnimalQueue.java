import java.util.LinkedList;

public class AnimalQueue
{
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	private int age = 0;

	public void enqueue(Animal a)
	{
		a.setAge(age);
		age++;

		if(a instnaceof Dog) dogs.addLast((Dog) a);
		else cats.addLast((Cat) a);
	}

	public Animal dequeueAny()
	{
		if (dogs.size() == 0)
		{
			return dequeueCat();
		}
		else if (cats.size() == 0)
		{
			return dequeueDog();
		}

		Dog d = dogs.peek();
		Cat c = cats.peek();
		if (d.isOlderThan(c))
		{
			return dequeueDog();
		}
		else
		{
			return dequeueCat();
		}
	}

	public Animal dequeueDog()
	{
		return dogs.poll();
	}

	public Animal dequeueCat()
	{
		return cats.poll();
	}

	public class Dog extends Animal
	{
		public Dog(String n)
		{
			super(n);
		}
	}

	public class Cat extends Animal
	{
		public Cat(String n)
		{
			super(n);
		}
	}
}


