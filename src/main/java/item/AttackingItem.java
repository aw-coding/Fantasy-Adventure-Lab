package item;
import room.Enemy;

import item.Item;

public class AttackingItem extends Item {

    private attackingItemType type;


    public AttackingItem(attackingItemType type){
        this.type = type;
    }



//    public void use(Enemy enemy){
//        //int enemyHealth = enemy.getType().getHealth();
//        enemy.getType().getHealth() -= this.type.getDamage();
//    }


    public attackingItemType getType() {
        return type;
    }

    @Override
    public void use(Enemy enemy) {
         enemy.getType().getHealth() -= this.type.getDamage();

    }
}

