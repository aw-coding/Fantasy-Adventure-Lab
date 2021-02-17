package room;

import player.Player;

public class Enemy {

    private enemyType type;

    public Enemy(enemyType type){
        this.type = type;
    }

    public void attack(Player player){
        player.getHealth() -= this.type.getDamage();
    }

    public enemyType getType(){
        return this.type;
    }

}
