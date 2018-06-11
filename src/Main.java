import java.util.*;

public class Main  {

    private int numberOfPeople;

    Scanner scan = new Scanner(System.in);
    Scanner scan1 = new Scanner(System.in);


    String [] name;
    List <String> names;

    public static void main(String[] args) {

        Main main = new Main();

        main.init();
    }

    public void init(){
        System.out.println("Enter the number of names: ");
        int numberOfNames = scan.nextInt();
        this.newTab(numberOfNames);
        this.writteName();
//        this.longestName();
//        this.shortestName();
        this.addtoList();
        firstToLast();
        longestAndShortest();
        //this.findDuplicates(names);
        this.findDuplicates();

    }


    public  void newTab(int numberOfPeople){
        this.numberOfPeople=numberOfPeople;

        name = new String[numberOfPeople];

        for (int i=0; i<name.length; i++){
            System.out.println("Enter name: ");
            String tabName = scan1.nextLine();
            name[i]=tabName;
        }
    }

    public void writteName(){
        System.out.println("Names: ");
        for (String x:name){
            System.out.println(x);
        }
        System.out.println(".....................................\n");
    }

//    public void longestName(){
//        int maxName = 0;
//        String longestName = null;
//        for (String n:name){
//            if (n.length()>maxName){
//                maxName = n.length();
//                longestName = n;
//            }
//
//        }
//        System.out.println("The longest name: " + longestName);
//    }
//
//    public void shortestName(){
//        String shortesName = name[0];
//        for (String n:name){
//            if ((n.compareTo(shortesName)<0)){
//                shortesName = n;
//            }
//        }
//        System.out.println("Shortest name: " + shortesName);
//    }
//
    public void addtoList(){
        names = new ArrayList<>();
        for (String n:name){
            names.add(n);
        }

    }

//    public Set<String> findDuplicates (List <String> listDuplicates){
//        Set<String> setToReturn = new HashSet<>();
//        Set<String> set1 = new HashSet<>();
//
//        for (String sth:listDuplicates){
//            if (!set1.add(sth)){
//                setToReturn.add(sth);
//            }
//        }
//        System.out.println(setToReturn);
//        return setToReturn;

    public void firstToLast(){
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() < o2.length()) {
                    return -1;
                }
                else if(o1.length() > o2.length()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });
        System.out.println("Sorted names: ");
        System.out.println(".....................................\n");

    }

    public void longestAndShortest(){
        System.out.println("Shotest names: " + names.get(0));
        System.out.println("Longest name: " + names.get(names.size()-1));
        System.out.println(".....................................\n");
        System.out.println("");


    }

        public Set<String> findDuplicates (){
        Set<String> setToReturn = new HashSet<>();
        Set<String> set1 = new HashSet<>();

        for (String s:names){
            if (!set1.add(s)){
                setToReturn.add(s);
            }
        }
        System.out.println(setToReturn);
        return setToReturn;

    }
}
