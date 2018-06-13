import java.util.*;

public class FirsMission {

    private Scanner scanInt = new Scanner(System.in);
    private Scanner scanStr = new Scanner(System.in);
    private Scanner scanSwitch = new Scanner(System.in);
    private List<String> names = new ArrayList<>();


    public void init(){
        this.task();
    }

    private void task(){
        System.out.println("Enter what do you want to do: \n" +
                ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\n" +
                "If you want to  add name enter: add\n" +
                ".................................................................\n" +
                "If you want to print list enter: print\n" +
                ".................................................................\n" +
                "If you want to print shortest and longest name enter: short_long\n" +
                ".................................................................\n" +
                "If you want to see duplicates enter: duplicate\n" +
                ".................................................................\n" +
                "If you want to see length list enter: length");
        String task = scanSwitch.nextLine();
        switch (task){
            case "add":
                addToList();
                break;
            case "print":
                printList();
                break;
            case "short_long":
                shortLong();
                break;
            case "duplicate":
                numberOfDuplicate();
                break;
            case "length":
                lengthList();
        }
    }



    private void addToList(){
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
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()<o2.length())
                    return -1;
                else if (o1.length()>o2.length())
                    return 1;
                else
                    return 0;
            }
        });
        System.out.println("short: " + names.get(0));
        System.out.println("long: " + names.get(names.size()-1));
    }
    private List<String> duplicates(){
        final Set<String > duplikat = new HashSet<>();
        final List<String> repeat = new ArrayList<>();

        for (String s:names){
            if (!duplikat.add(s))
                repeat.add(s);
        }
        System.out.println(repeat);
        return repeat;
    }

    private void numberOfDuplicate(){
        List<String> repleacementList = new ArrayList<>();
        for (String s:names){
            repleacementList.add(s);
        }

        repleacementList.sort(String::compareTo);

//        for (String s:repleacementList){
//            System.out.println(s);
//        }

        for (int i=0; i<repleacementList.size(); i++){
            if (repleacementList.get(i).equals(repleacementList.get(i++))){
                System.out.println(repleacementList.get(i++) + "(" + (i+1) + ")");
            }
        }
    }


    private void lengthList() {
        System.out.println(names.size());
    }




}
