package Smart_programming;

 class Over_rid {
    void show(){
        System.out.println("1 METHOD");

    }
}
 class Over_rid2 extends Over_rid{
    void show(){
        System.out.println("2 METHOD");
    }

    public static void main(String[] args) {
        Over_rid t=new Over_rid();
        t.show();
        Over_rid2 t2=new Over_rid2();
        t2.show();

    }
}
