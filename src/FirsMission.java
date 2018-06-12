import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirsMission {

    private Scanner scanInt = new Scanner(System.in);
    private Scanner scanStr = new Scanner(System.in);
    private Scanner scanSwitch = new Scanner(System.in);
    private List<String> names;

    public void init(){
        this.task();
    }

    private void task(){
        System.out.println("Enter what do you want to do: \n" +
                ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\n" +
                "If you want add name enter: add\n" +
                ".................................................................\n" +
                "If you want print list enter: print\n" +
                ".................................................................\n" +
                "If you want print shortest and longest name enter: short_long");
        String task = scanSwitch.nextLine();
        switch (task){
            case "add":
                addToList();
            case "print":
                printList();
            case "short_long":
                shortLong();



        }
    }

    private void addToList(){
        names = new ArrayList<>();
        System.out.println("Enter names: ");
        while (true){
            String element = scanStr.nextLine();
            if (!element.equals("break")){
               names.add(element);
                System.out.println("Enter next name or 'break'");
            }
            if (element.equals("break")){
                break;
            }

        }
        task();

    }

    private void printList(){
        System.out.println("Names on list: ");
        for (String s:names){
            System.out.println(s);
        }
        System.out.println("Enter: menu");
        String menu = scanStr.nextLine();
        if (menu.equals("menu")){
            task();
        }
    }

    private void shortLong(){

    }
}
