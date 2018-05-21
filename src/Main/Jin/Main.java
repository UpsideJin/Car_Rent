package Main.Jin;


import admin.Jin.Admin;
import User.Jin.User;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin In = new Admin();
        User rent = new User();
        System.out.println("--------------欢迎使用租车系统-----------------");
        for(int i =3;i>=1;i--){
            System.out.print("请登录的系统(0：管理员   1：用户   3：退出系统):");
            int n = input.nextInt();
            if (n == 0) {
                System.out.println("---------欢迎进入车量信息录入系统----------");
                for(int j=1;j>0;j++) {
                    rent.formtStr();
                    rent.noti();
                    rent.addDB();
                    String str = input.next();
                    if(!str.equals("y")){
                        break;
                    }
                }
            } else if (n == 1) {
                    rent.showDB();
                    rent.selectRent();
                break;
            } else if(n == 3){
                    System.exit(0);
            }
            else {
                    System.out.println("!!!!!信息核对错误，请重新输入"+"你还有"+(i-1)+"次机会!!!!!");
                    //System.out.print("请重新选择登录的系统(0：管理员   1：用户   3：退出系统):");
                    n = input.nextInt();
                }
            }
        }
    }

