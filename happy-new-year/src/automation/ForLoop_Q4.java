package automation;

public class ForLoop_Q4 {
    public  void printMyName(String name, int homeManyTime){
        for (int i = 1; i <= homeManyTime; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        ForLoop_Q4 obj = new ForLoop_Q4();
        obj.printMyName("prime",5);
    }

}
