package missliu.day04.demo01.Demo05;

public class Armor {
    //护甲名称
    private String name;
    //防御力
    private int protect;

    public Armor() {
    }

    public Armor(String name, int protect) {
        this.name = name;
        this.protect = protect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }
}
