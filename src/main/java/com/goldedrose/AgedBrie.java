package com.goldedrose;

import static com.goldedrose.ItemType.AGED_BRIE;

public class AgedBrie extends Item {

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    public void doUpdateQuality() {
        increaseQuality();
        sellIn--;
        if (sellIn < 0) {
            increaseQuality();
        }
    }

    private void increaseQuality() {
        if (quality < 50) {
            quality++;
        }
    }
}
