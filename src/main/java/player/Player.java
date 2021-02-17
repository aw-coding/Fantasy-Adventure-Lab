package player;

import item.Item;
import room.Treasure;

import java.util.ArrayList;

public class Player {

    private String name;
    private int health;
    private ArrayList<Item> items;
    private Item currentItem;
    private ArrayList<Treasure> treasureHoard;


    public Player(String name, int health, ArrayList<Item> items, Item currentItem, ArrayList<Treasure> treasureHoard){
        this.name = name;
        this.health = health;
        this.items = new ArrayList<Item>();
        this.currentItem = currentItem;
        this.treasureHoard = new ArrayList<Treasure>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Item getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(Item currentItem) {
        this.currentItem = currentItem;
    }

    public ArrayList<Treasure> getTreasureHoard() {
        return treasureHoard;
    }

    public void setTreasureHoard(ArrayList<Treasure> treasureHoard) {
        this.treasureHoard = treasureHoard;
    }



}
