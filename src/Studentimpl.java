import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Studentimpl {
    public static void main(String[] args) {
        Studentimpl impl = new Studentimpl();
        Set<Student> studentSet = impl.createSet();
        impl.display(studentSet);


        System.out.println("impl = " + impl.removeByName(studentSet));
        System.out.println("studentSet = " + studentSet);
        


    }

    public Set<Student> createSet() {
        Set<Student> students = new HashSet<>();
        students.add(new Student("nil", 3, 60));
        students.add(new Student("ufa", 7, 88));
        return students;
    }

    public void display(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



        //https://github.com/ABHINAV-0601/CollectionsFirstQues/blob/master/src/StudentImpl.java

    }

    public boolean removeByName(Set<Student> students) {
        boolean flag = false;
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student ref = iterator.next();
            char firstChar = ref.getName().charAt(0);
            if (firstChar == 'n') {
                iterator.remove();
                flag = true;

            }
        }
        return flag;
    }
}
