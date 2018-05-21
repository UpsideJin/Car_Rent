package admin.Jin;

import utils.Jin.Car;

public class Admin extends Car {
    private String str;
    private String str0;
    private int load1;
    private int load2;

    public String getName() {

        System.out.print("请输入车的品牌：");
        name = input.next();
        return name;
    }

    public int getCost() {
        System.out.print("请设置租金（单位：元/天）：");
        cost = input.nextInt();
        return cost;
    }

    public String getType() {
        System.out.print("请设置车的类型（0:货车  1：轿车 2：皮卡）：");
        int n = input.nextInt();
        for (int i = 1; i > 0; i++) {
            if (n == 0) {
                type = "货车";
                break;
            } else if (n == 1) {
                type = "轿车";
                break;
            } else if (n == 2) {
                type = "皮卡";
                break;
            } else {
                System.out.print("设置类型错误，请重新输入");
                System.out.println("请重新设置车的类型（0:货车  1：轿车 2：皮卡）：");
                n = input.nextInt();
            }
        }
        return type;
    }

    public int getLoad() {
        if (type.equals("货车")) {
            System.out.print("请设置载重量（单位：吨）：");
            load = input.nextInt();
            str0 = "吨";
        } else if (type.equals("轿车")) {
            System.out.print("请设置载人量：");
            load = input.nextInt();
            str0 = "人";
        } else {
            System.out.print("请设置载重量（单位：吨）");
            load1 = input.nextInt();
            System.out.print("请设置载人量：");
            load2 = input.nextInt();
        }
        return load;
    }

    public String formStr() {
        if (!type.equals("皮卡")) {
            str = name + " " + cost +" "+ "元/天" + " " + type + " "+load +" "+ str0;
        } else {
            str = name + " " + cost +" "+ "元/天" + " " + type + " " + load1 +" "+ "吨" + " " + load2 +" "+ "人";
        }
        return str;
    }
}


