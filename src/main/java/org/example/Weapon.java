package org.example;


    public enum Weapon {
        SWORD(25, 1.2),
        BOW(15, 1.5),
        STAFF(10, 1.0);

        private final int damage;
        private final double attackSpeed;

        Weapon(int damage, double attackSpeed) {
            this.damage = damage;
            this.attackSpeed = attackSpeed;
        }

        public int getDamage() {
            return damage;
        }

        public double getAttackSpeed() {
            return attackSpeed;
        }
    }

