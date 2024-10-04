package Smart_programming;

public class Constructor {
    String name;
    int Emp_id;
    // Constructor name should be the same as that of class name do not have any return type== void

    Constructor ( String name,int Emp_id) {
        this.name = name;
        this.Emp_id = Emp_id;

    }

    public static void main(String[] args) {
        Constructor e1=new Constructor("Davesh",43819);
        System.out.println(e1.name);
        System.out.println(e1.Emp_id);
    }
}

