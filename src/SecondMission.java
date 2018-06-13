import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondMission {

    private String name;
    private List<Character> forName = new ArrayList<Character>();
    final List<Character> repeat = new ArrayList<>();


    public SecondMission(String name) {
        this.name=name;
    }

    public void inti(){
        this.switchToChar(name);
        this.isCheck(name);
        duplicates();
        print();
    }

    private void switchToChar (String name){
        this.name = name;
        String lowCaseName = name.toLowerCase();
        char[] x = lowCaseName.toCharArray();
        for (char c:x){
            forName.add(c);
        }
        forName.sort(Character::compareTo);

    }

    private boolean isCheck(String name){
        if (repeat==null){
            return false;
        }
        else
            return true;
    }

    private List<Character> duplicates(){
        final Set<Character > duplikat = new HashSet<>();

        for (char s:forName){
            if (!duplikat.add(s))
                repeat.add(s);
        }
        return repeat;
    }

    private void print(){
        System.out.println(name + "-" + isCheck(name));
    }

}
