package equalsmethod.shishira;

public class Student {
    int id;
    String name;
    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        boolean res = false;
        if (obj instanceof Student){
            Student s = (Student) obj;
            if (this.id==s.id){
                res = true;
        }
         }
        return res;
    }
}
