import java.util.LinkedList;
class Day10student{
    String name;
    int regno;
    int marks;
    Student(String name ,int regno,int marks){
        this.name=name;
        this.regno=regno;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return "Name:"+name+
                ",regno:"+regno+
                ", Marks:"+marks;
    }
}
public class Day10student{
    static void main(){
        LinkedList<Student>students=new LinkedList<>();
        students.add(new Student("vasanth",101,85));
        students.add(new Student("saran",102,90));
        students.add(new Student("gokul",103,87));
        students.add(new Student("rithik",104,78));
        students.add(new Student("comes",105,89));
        System.out.println();
        for(Student s:students){
            System.out.println(s);
        }
        students.removeFirst();
        System.out.println("\nAfter removing first student");
        for(Student s:students){
            System.out.println(s);
        }
        String searchvalue="vasanth";
        for(Student s:students) {
            if (s.name.equalsIgnoreCase(searchvalue)) {
                s.marks = 95;
                break;
            }
        }
        System.out.println("\nAfter updating vasanth's marks:");
        for(Student s:students){
            System.out.println(s);

        }
    }
}