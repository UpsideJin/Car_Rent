package User.Jin;

import admin.Jin.Admin;

public class User extends Admin {
    private String str;
    private int sumLoad = 0;
    private int sumPeolpe = 0;
    private String allLoadName = "";
    private String allPeopleName = "";
    private int totalcost = 0;

    public String formtStr() {
        name = getName();
        cost = getCost();
        type = getType();
        load = getLoad();
        str = formStr();
        return str;
    }

    public void noti() {
        System.out.println("你已经成功添加以下纪录，");
        System.out.println(str);
        System.out.println("是否继续添加（y）,输入其他任何内容退出录入系统");
    }

    public void addDB() {
        db.add(str);
        System.out.println(db);
    }

    public void showDB() {
        for (int i = 0; i < db.size(); i++) {
            System.out.println((i + 1) + " " + db.get(i).toString());
        }
    }

    public void selectRent() {
        System.out.println("请输入想要租车的数量");
        int n = input.nextInt();
        for (int i = 0; i <n; i++) {
            System.out.println("请输入第" + (i+1) + "车的序号");
            int m = input.nextInt();
            System.out.println(db.get(m-1).toString());
            String[] temp = db.get(m-1).toString().split(" ");
            if (temp[3].equals("货车")) {
                sumLoad = sumLoad + Integer.parseInt(temp[4]);
                allLoadName = allLoadName + temp[0] + " ";
                totalcost = totalcost + Integer.parseInt(temp[1]);
            } else if (temp[3].equals("轿车")) {
                sumPeolpe = sumPeolpe + Integer.parseInt(temp[4]);
                allPeopleName = allPeopleName + temp[0] + " ";
                totalcost = totalcost + Integer.parseInt(temp[1]);
            } else {
                sumLoad = sumLoad + Integer.parseInt(temp[4]);
                allLoadName = allLoadName + temp[0] + " ";
                sumPeolpe = sumPeolpe + Integer.parseInt(temp[6]);
                allPeopleName = allPeopleName + temp[0] + " ";
                totalcost = totalcost + Integer.parseInt(temp[1]);
            }
        }
        System.out.println("请输入您要租车的天数");
        n = input.nextInt();
        System.out.println("可以载货的车有：");

        System.out.println(allLoadName + sumLoad);
        System.out.println("可以载人的车有：");
        System.out.println(allPeopleName + sumPeolpe);
        System.out.println("总计租金");
        System.out.println(totalcost * n);
    }

}
