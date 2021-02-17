package room;

public enum enemyType {
    SKELETON(100,15),
    VAMPIRE(150, 30);

    private int health;
    private int damage;

    enemyType(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getHealth(){

        return this.health;
    }
}
