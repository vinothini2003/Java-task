abstract class Animals{
abstract void eat();

 void sleep(){
System.out.println("sleep 8 hours");
}
}

class Dog extends Animals{
void eat(){
System.out.println("Dog eat Bone");
}
}

public class Abstraction{
public static void main (String[] args){
 Dog v = new Dog();
 v.eat();
 v.sleep();

}
}
