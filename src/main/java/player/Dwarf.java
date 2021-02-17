package player;

import item.AttackingItem;
import item.Item;
import item.attackingItemType;
import room.Treasure;

import java.util.ArrayList;

public class Dwarf extends Player{

    public Dwarf(String name, int health, ArrayList<Item> items, Item currentItem, ArrayList<Treasure> treasureHoard){
        super(name, items, currentItem, treasureHoard);
        this.health = 100;
        this.items = new ArrayList<Item>();
        AttackingItem sword = new AttackingItem(attackingItemType.SWORD);
        AttackingItem axe = new AttackingItem(attackingItemType.AXE);
        this.items.add(sword);
        this.items.add(axe);
    }

}
