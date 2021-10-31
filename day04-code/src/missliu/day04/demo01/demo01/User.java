package missliu.day04.demo01.demo01;
//用户基类
public class User {
    //用户名
    private String name;
    //余额
    private int money;

    //无参构造方法
    public User() {
    }

    //全参构造方法
    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //输入用户有多少钱
    public void show()
    {
        System.out.println("我叫："+name+",我余额有："+money+"元！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
