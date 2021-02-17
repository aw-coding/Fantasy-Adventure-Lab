package item;



public enum attackingItemType {


    SWORD(20),
    AXE(30),
    HARDBALLER(25),
    FIREBALL(30),
    LIGHTNINGSTRIKE(40),
    PLASMAGUN(50),
    POISONSTAB(25),
    ICEPUNCH(30);

    private final int damage;

     attackingItemType(int damage){
        this.damage = damage;
    }


    public int getDamage(){
         return this.damage;
    }
}
