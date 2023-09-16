import javax.swing.JOptionPane;
import java.util.Scanner;

public class socrepromotion{

    public static void main(String[] args){

        /*
        swing
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "U R "+ age + " years old");
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLZ write down your score last time:");
        int fm_sco = scanner.nextInt();
        System.out.println("PLZ write down your score this time:");
        int now_sco = scanner.nextInt();

        float percentage = (float) (now_sco - fm_sco)/ fm_sco * 100;
        System.out.printf("Your score has promote for %.2f%%.", percentage);

    }
}