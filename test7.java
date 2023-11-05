public class test7 {
    public static void main(String[] args) {
        Person ming = new Person("Xiao Ming", 12);
        Person hong = new Person("Xiao Hong", 15);
        ming.number = 88;
        System.out.println(hong.number);
        hong.number = 99;
        System.out.println(ming.number);
        System.out.println(Person.count);
    }
}

class Person {
    public String name;
    public int age;

    public static int number;
    public static int count = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        getCount();
    }

    public static void getCount(){
        count += 1;
    }
}