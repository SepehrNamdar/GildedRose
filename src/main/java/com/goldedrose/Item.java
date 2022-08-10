package com.goldedrose;

import static com.goldedrose.ItemType.*;

public class Item {

    public String name;
    public int sellIn;
    public int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static Item createItem(String name, int sellIn, int quality) {
        switch (name) {
            case AGED_BRIE:
                return new AgedBrie(sellIn, quality);
            case BACKSTAGE_PASSES:
                return new BackstagePasses(sellIn, quality);
            case SULFURAS:
                return new Sulfuras(sellIn, quality);
            default:
                return new Item(name, sellIn, quality);
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void doUpdateQuality() {
        decreaseQuality();
        sellIn--;
        if (sellIn < 0) {
            decreaseQuality();
        }
    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality--;
        }
    }
}
