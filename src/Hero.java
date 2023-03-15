public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String superpower;
    public Hero (int heroHealth,int heroDamage, String superpower){
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.superpower = superpower;
    };
    public Hero (int heroHealth,int heroDamage){
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    };

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getSuperpower() {
        return superpower;
    }
}