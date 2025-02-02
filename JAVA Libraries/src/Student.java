public class Car {
@Override
 public String toString(){
    return "Car@123";
}
      @Override
       public int hashCode(){
    return 123;
        }

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c);
        System.out.println(c.hashCode());
    }
}
