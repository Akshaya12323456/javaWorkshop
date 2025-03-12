public class class2{
    public int add(int num1,int num2){
        int num=num1+num2;
        System.out.println(num);
        return num;
    }
    public static void main(String args[]){
        class2 obj=new class2();
        int c=obj.add(20,30);
        int d=obj.add(40,50);
        System.out.println(c);
        System.out.println(d);
    }
}
