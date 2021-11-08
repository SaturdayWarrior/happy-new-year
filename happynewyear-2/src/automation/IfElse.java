package automation;

public class IfElse {
    public boolean isTeen(int  age) {

        if (age < 18) {
            return false;
        } else return true;
    }
    public static void main(String[] args) {
        IfElse obj = new IfElse();

        System.out.println(obj.isTeen(18));
    }
}
