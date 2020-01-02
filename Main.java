public class Main {
    public static void main(String[] args) {
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.a();
        myInterface.b();
    }
}


interface MyInterface{
    //default关键字实现接口有非抽象方法
    public default void a(){
        System.out.println("this is default method a");
    }
    default void b(){
        System.out.println("this is default method b");
    }
}

class MyInterfaceImpl implements MyInterface{
    public void b(){
        System.out.println("this is new method b");
    }
}
