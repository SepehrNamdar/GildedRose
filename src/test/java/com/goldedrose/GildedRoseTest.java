package com.goldedrose;

import org.junit.jupiter.api.Test;

import static org.approvaltests.combinations.CombinationApprovals.verifyAllCombinations;

class GildedRoseTest {

    @Test
    void should_update_quality() {
        String[] names =
                new String[] {null, "", "foo", "Backstage passes to a TAFKAL80ETC concert", "Aged Brie", "Sulfuras, Hand of Ragnaros"};
        Integer[] sellIns = new Integer[] {-2, -3, -1, 0, 1, 2, 3, 4, 11, 10, 9, 1000, -1000};
        Integer[] qualities = new Integer[] {-2, -3, -1, 0, 1, 2, 3, 4, 50, 49, 51, 1000, -1000};

        verifyAllCombinations(this::updateQuality, names, sellIns, qualities);
    }

    private String updateQuality(String foo, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(foo, sellIn, quality) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        return app.items[0].toString();
    }
}
