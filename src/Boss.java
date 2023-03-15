public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String bossDefends;
    public Boss(){

    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getBossDefends() {
        return bossDefends;
    }

    public void setBossDefends(String bossDefends) {
        this.bossDefends = bossDefends;
    }
}