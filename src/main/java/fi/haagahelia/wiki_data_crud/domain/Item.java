package fi.haagahelia.wiki_data_crud.domain;

public class Item {
    private Long item_id;
    private String itemName;
    private int quantity;
    private double rarity;

    public Item() {
    }

    public Item(String itemName, int quantity, double rarity) {
        super();
        this.itemName = itemName;
        this.quantity = quantity;
        this.rarity = rarity;
    }

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getRarity() {
        return rarity;
    }

    public void setRarity(double rarity) {
        this.rarity = rarity;
    }

    @Override
    public String toString() {
        return "Item [item_id=" + item_id + ", itemName=" + itemName + ", quantity=" + quantity + ", rarity=" + rarity
                + "]";
    }
}