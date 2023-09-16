import java.util.Scanner;
public class Child {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scn.nextInt();

        String child = age >=6 && age <=18 ? "U R a child" : "U R not a child";
        System.out.println(child);

    }
}
