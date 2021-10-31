package missliu.day04.demo01.Demo05;

public class Weapon {
    //武器名称
    private String name;
    //攻击力
    private int hurt;

    public Weapon() {
    }

    public Weapon(String name, int hurt) {
        this.name = name;
        this.hurt = hurt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}
