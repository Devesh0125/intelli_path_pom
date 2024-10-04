package Smart_programming;

 class Has_inheri {
    void  Dog(){
        System.out.println("I M EATING");
    }
   static class Has_inheri_1 {
        void Bird(){
            System.out.println("I M FLYING");
        }
    }
  static class  Has_inheri_2 {
            void Animal(){
                System.out.println("BOTH DOG AND Bird");
            }
 public static void main(String[] args)
 {
        Has_inheri d =new Has_inheri() ;
        Has_inheri_1 d1= new Has_inheri_1();
        Has_inheri_2 d3 = new Has_inheri_2();
       d.Dog();
       d1.Bird();
       d3.Animal();
    }
        }
}

