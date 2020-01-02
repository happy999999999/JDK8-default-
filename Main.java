public class Main {
    public static void main(String[] args) {
        Father father = new Child();
        father.say();

    }
}

class Father{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void say(){
        System.out.println("this is father say");
    }
}

class Child extends Father{
    @Override
    public String toString() {
        return "Child{}";
    }
}
