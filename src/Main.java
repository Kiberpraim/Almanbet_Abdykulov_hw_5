public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(1400);
        boss.setBossDamage(100);
        boss.setBossDefends("Magical");

        System.out.println("Boss health: " + boss.getBossHealth() + " damage: " + boss.getBossDamage() + " defend: " + boss.getBossDefends());

        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero health: " + hero.getHeroHealth() + "\t damage: " + hero.getHeroDamage() + "\t\t superpower: " + (hero.getSuperpower() == null ? "No superpower." : hero.getSuperpower()));
        }
    }

    public static Hero[] createHeroes(){
        Hero warrior = new Hero(270, 25, "shield");
        Hero magical = new Hero(260,30);
        Hero kinetic = new Hero(250, 35);

        return new Hero[]{warrior, magical, kinetic};
    }
}