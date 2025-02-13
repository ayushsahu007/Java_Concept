package equalsmethod;

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
        //1.check the type
        if (obj instanceof Student){
            
        }
        return false;
    }
}
