package missliu.day04.demo01.Demo05;

public class Role {

    //角色ID
    private int roleID;
    //生命值
    private int blood;
    //角色名称
    private String name;
    //武器
    private Weapon wp;
    //护甲
    private Armor am;
    //技能
    private FaShuSkill fss;

    public Role() {
    }

    public Role(int roleID, int blood, String name) {
        this.roleID = roleID;
        this.blood = blood;
        this.name = name;
    }
    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWp() {
        return wp;
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public Armor getAm() {
        return am;
    }

    public void setAm(Armor am) {
        this.am = am;
    }

    public FaShuSkill getFss() {
        return fss;
    }

    public void setFss(FaShuSkill fss) {
        this.fss = fss;
    }

    //攻击方法
    public void attack()
    {
        System.out.println(name+"，使用："+wp.getName()+"，造成："+wp.getHurt()+"点伤害！");
    }

    //穿戴护甲方法
    public void wear()
    {
        System.out.println(name+"，穿戴："+am.getName()+"，增加："+am.getProtect()+"点护甲！");
    }

    public void faShuSkillAttack()
    {
        System.out.println("发动法术攻击");
        fss.FaShuAttack();
        System.out.println("攻击完成");
    }
}
