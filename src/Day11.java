import java.util.LinkedList;
public class day11 {
    public static void main(String[] args) {
        LinkedList<String> set = new LinkedList<String>();
        set.add("student 1");
        set.add("student 2");
        set.add("student 1");
        set.add("student 2");
        set.add("student 1");
        set.add("student 2");
        for (String s : set)
            System.out.println(s);
    }
}