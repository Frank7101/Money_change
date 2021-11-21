package oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 零钱通各个功能
 */

public class SmallChangeSystemoop {

    //属性
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);

    String details = "----------Details----------";
    String note;
    double money;
    double balance = 0;
    Date date;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    //菜单
    public void Menu(){
        //System.out.println("Show Menu");
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
                    this.detail();break;
                case"2":
                    this.income();break;
                case"3":
                    this.expends();break;
                case"4":
                    this.exit();break;
                default:
                    System.out.println("Wrong option!");
                    break;
            }
        }while (loop);
    }

    //明细
    public void detail(){
        System.out.println(details);
    }

    //入账
    public void income(){
        System.out.println("\t2.Income");

        System.out.println("Enter amount:");
        money = scanner.nextDouble();
        balance += money;

        date = new Date();
        details += "\nIncome\t+" + money + "\t"+ simpleDateFormat.format(date) + "\t" + balance;
    }

    //支出
    public void expends(){
        System.out.println("\t3.Expends");

        System.out.println("Enter amount:");
        money = scanner.nextDouble();
        balance -= money;

        System.out.println("Explanations:");
        note = scanner.next();

        date = new Date();
        details += "\n" + note + "\t-" + money + "\t"+ simpleDateFormat.format(date) + "\t" + balance;
    }

    //退出
    public void exit(){
        System.out.println("\t4.Exit");
        String choice;
        while(true){
            System.out.println("Exit? (y/n)");
            choice = scanner.next();
            if ("y".equals(choice)){
                loop = false;
                return;
            }else if ("n".equals(choice)){
                return;
            }else{
                System.out.println("Wrong enter! Try again!");
            }
        }
    }
}