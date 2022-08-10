package com.goldedrose;

import static com.goldedrose.ItemType.SULFURAS;

public class Sulfuras extends Item {

    public Sulfuras(int sellIn, int quality) {
        super(SULFURAS, sellIn, quality);
    }

    @Override
    public void doUpdateQuality() {
    }
}
