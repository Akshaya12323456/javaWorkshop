class Parent{
    public void add(){
        System.out.println("Hello World");
    }
}
class Child extends Parent{
    void display(){
        add();
    }
}
public class Key3{
    public static void main(String args[]){
        Child obj=new Child();
    }
}
    