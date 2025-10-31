package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        if (healthPercentage < 0)      this.healthPercentage = 0;
        else if (healthPercentage > 100) this.healthPercentage = 100;
        else                             this.healthPercentage = healthPercentage;

        this.weapon = weapon;
    }

    public int healthRemaining() {
        return this.healthPercentage;
    }

    public void loseHealth(int damage) {
        if (damage < 0) damage = 0; // koruma (opsiyonel)
        this.healthPercentage -= damage;
        if (this.healthPercentage <= 0) {
            this.healthPercentage = 0;
            System.out.println(this.name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion) {
        if (healthPotion < 0) healthPotion = 0; // koruma (opsiyonel)
        this.healthPercentage += healthPotion;
        if (this.healthPercentage > 100) {
            this.healthPercentage = 100;
        }
    }

    @Override
    public String toString() {
        return "Player{name='" + name + '\'' +
                ", health=" + healthPercentage +
                ", weapon=" + weapon +
                " (dmg=" + weapon.getDamage() +
                ", aspd=" + weapon.getAttackSpeed() + ")}";
    }



}
