package automation;

public class ForLoop {
    public  void printMyName(String name, int homeManyTime){
        for (int i = 1; i <= homeManyTime; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        ForLoop obj = new ForLoop();
        obj.printMyName("Priyank",5);
    }
}
