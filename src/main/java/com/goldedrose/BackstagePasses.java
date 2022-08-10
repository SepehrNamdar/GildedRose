package com.goldedrose;

import static com.goldedrose.ItemType.BACKSTAGE_PASSES;

public class BackstagePasses extends Item {

    public BackstagePasses(int sellIn, int quality) {
        super(BACKSTAGE_PASSES, sellIn, quality);
    }

    @Override
    public void doUpdateQuality() {
        if (quality < 50) {
            quality++;

            if (sellIn < 11) {
                increaseQuality();
            }

            if (sellIn < 6) {
                increaseQuality();
            }
        }
        sellIn--;
        if (sellIn < 0) {
            quality = 0;
        }
    }

    private void increaseQuality() {
        if (quality < 50) {
            quality++;
        }
    }
}
