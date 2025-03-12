public class Flower{
    public int add(int num1,int num2){
        int num=num1*num2;
        return num;
    }
    public int sub(int num1,int num2){
        int num=num1-num2;
        return num;
    }
    public int multiply(int num1,int num2){
        int num=num1*num2;
        return num;
    }
    public int divide(int num1,int num2){
        int num=num1/num2;
        return num;
    }
    public static void main(String args[]){ 
        Flower obj=new Flower();
        int c=obj.add(20,48);
        int d=obj.sub(34,23);
        int e=obj.multiply(34,67);
        int f=obj.divide(54,2);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}

    