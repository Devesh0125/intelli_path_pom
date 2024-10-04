package Smart_programming;

 class Inheritance {
    void eat(){
        System.out.println("I M EATING");
    }
}
class Dog extends Inheritance{
     void run(){
         System.out.println("I M RuNNing");
     }
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.run();

    }
}
