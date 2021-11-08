package automation;

public class Variable {
    int id;
    String name;

    Variable(int id, String name){
        this.id =id;
        this.name=name;
    }
    public void display(){

        System.out.println(id +" "+ name);
    }
    public static void main(String[] args) {
        Variable obj= new Variable(101, "priyank");
        obj.display();
        Variable obj1 =new Variable(202,"patel");
        obj1.display();
    }
}
