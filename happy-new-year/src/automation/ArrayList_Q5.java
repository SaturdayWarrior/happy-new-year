package automation;

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); //generic array list( use without any data type)

        list.add("Scrum");
        list.add("Java");
        list.add("Jira");
        list.add("Selenium");
        list.add("Cucumber");
        list.add("Postman");

        for (String value : list) {
            System.out.println(value);

        }

    }
}
