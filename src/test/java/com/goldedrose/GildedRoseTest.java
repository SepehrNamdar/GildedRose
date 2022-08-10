package com.goldedrose;

import org.junit.jupiter.api.Test;

import static org.approvaltests.combinations.CombinationApprovals.verifyAllCombinations;

class GildedRoseTest {

    @Test
    void should_update_quality() {
        String[] name =
                new String[] {null, "", "foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros"};
        Integer[] sellIn = new Integer[] {null, 0, -1, 10, 11, 12, 13, 14};
        Integer[] quality = new Integer[] {null, 0, 1, 50, 49, 51};

        verifyAllCombinations(this::verifyUpdateQuality, name, sellIn, quality);
    }

    private String verifyUpdateQuality(String name, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(name, sellIn, quality) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        return app.items[0].toString();
    }
}
