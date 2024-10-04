package Test;

 class Over {
    void dog(int b)
    {
        System.out.println("barking");
    }
}
class animal extends Over{
    void dog(int a){
        System.out.println("fish");
    }

    public static void main(String[] args) {
        Over d=new Over();
        d.dog(10);
       animal j=new animal();
       j.dog(10);

    }
}
