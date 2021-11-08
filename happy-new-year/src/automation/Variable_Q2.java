package automation;

public class Variable_Q2 {
    int id;
    String name;

    Variable_Q2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("id: " + id + " \n Name: " + name);
    }

    public static void main(String[] args) {
        Variable_Q2 obj = new Variable_Q2(101, "Priyank");
        obj.display();
        Variable_Q2 obj1 = new Variable_Q2(102, "Prime");
        obj1.display();
    }
}
