import java.util.Scanner;

public class BMI{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your weight(kg) is:");
        float weight = scanner.nextFloat() ;
        System.out.println("Your height(m) is:");
        float height = scanner.nextFloat() ;

        float BMI= weight / (height * height);
        System.out.printf("你的BMI是%.2f \n" , BMI);
        if(BMI < 18.5){
            System.out.println("体重过轻");
        }
        else if(BMI >= 18.5 && BMI <25){
            System.out.println("体重正常");
        }
        else if (BMI >= 25 && BMI < 28){
            System.out.println("过重");
        }
        else if (BMI >=28 && BMI < 32){
            System.out.println("肥胖");
        }
        else{
            System.out.println("非常肥胖");
        }

    }
}
