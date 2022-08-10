package com.goldedrose;

public class Item {

    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

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
        if (quality > 0) {
            quality = quality - 1;
        }
        sellIn = sellIn - 1;
        if (quality > 0) {
            if (sellIn < 0) {
                quality = quality - 1;
            }
        }
    }
}
