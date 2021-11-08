package automation;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<String>(); //generic array list( use without any data type)

        list.add("Scrum");
        list.add("Java");
        list.add("Jira");
        list.add("Selenium");
        list.add("Postman");
        list.add("Cucumber");
        for (String value : list) {
            System.out.println(value);

        }

    }
}
