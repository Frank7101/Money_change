import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSystem {
    public static void main(String[] args) {

        boolean loop = true;
        Scanner scanner = new Scanner(System.in);

        String details = "----------Details----------";
        String note;
        double money;
        double balance = 0;
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        do {
            System.out.println("==========Menu==========");
            System.out.println("\t1.Details");
            System.out.println("\t2.Income");
            System.out.println("\t3.Expends");
            System.out.println("\t4.Exit");
            System.out.println("Choose a option(1-4):");
            System.out.println("========================");

            String key;
            key = scanner.next();
            switch (key){
                case"1":
                    System.out.println(details);
                    break;
                case"2":
                    System.out.println("\t2.Income");

                    System.out.println("Enter amount:");
                    money = scanner.nextDouble();
                    balance += money;

                    date = new Date();
                    details += "\nIncome\t+" + money + "\t"+ simpleDateFormat.format(date) + "\t" + balance;
                    break;
                case"3":
                    System.out.println("\t3.Expends");

                    System.out.println("Enter amount:");
                    money = scanner.nextDouble();
                    balance -= money;

                    System.out.println("Explanations:");
                    note = scanner.next();

                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t"+ simpleDateFormat.format(date) + "\t" + balance;
                    break;
                case"4":
                    System.out.println("\t4.Exit");
                    String choice;
                    while(true){
                        System.out.println("Exit? (y/n)");
                        choice = scanner.next();
                        if ("y".equals(choice)){
                            loop = false;
                            break;
                        }else if ("n".equals(choice)){
                            break;
                        }else{
                            System.out.println("Wrong enter! Try again!");
                        }
                    }
                    break;
                default:
                    System.out.println("Wrong option!");
                    break;
            }
        }while (loop);
    }
}
