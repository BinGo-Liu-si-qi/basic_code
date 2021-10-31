package missliu.day04.demo01.Demo05;

public class Demo05Main {
    public static void main(String[] args) {
        Weapon wp=new Weapon("暴风大剑",999999);

        Armor am=new Armor("狂徒铠甲",100000);

        Role r=new Role(1,999999999,"宁缺");

        r.setWp(wp);

        r.setAm(am);

        r.attack();

        r.wear();

        r.setFss(new FaShuSkill() {
            @Override
            public void FaShuAttack() {
                System.out.println("亢龙有悔");
            }
        });

        r.faShuSkillAttack();
    }
}
