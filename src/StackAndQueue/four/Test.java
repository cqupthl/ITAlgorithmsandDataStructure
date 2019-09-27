package StackAndQueue.four;

public class Test {
    public static void main(String[] args) {
         DogCatQueue dogCatQueue=new DogCatQueue();
         Pet dog1=new Dog();
         Pet dog2=new Dog();
         Pet Cat1=new Cat();
         Pet Cat2=new Cat();

         dogCatQueue.add(dog1);
         dogCatQueue.add(Cat1);
         dogCatQueue.add(Cat2);
         dogCatQueue.add(dog2);
        System.out.println(dogCatQueue.pollAll());
        System.out.println(dogCatQueue.pollAll());
        System.out.println(dogCatQueue.pollAll());
        System.out.println(dogCatQueue.pollAll());
    }
}
