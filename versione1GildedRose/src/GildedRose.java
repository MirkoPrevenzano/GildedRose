
class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

   public void updateQuality() {
        //usare for int i=0 ecc
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie" -> handleAgedBrie(item);
                case "Backstage passes to a TAFKAL80ETC concert" -> handleBackstage(item);
                case "Sulfuras, Hand of Ragnaros" -> {/*nessuna operazione da svolgere*/}
                default -> hadleOtherItem(item);
            }
        }
    }

    private void hadleOtherItem(Item item) {
        if(item.quality>0)
            item.quality--;
        item.sellIn--;

        if (item.sellIn < 0 )
            if( item.quality > 0)
                item.quality--;
    }
    private void handleBackstage(Item item) {
        item.sellIn--;
        if(item.quality<50)
            item.quality++;

        if (item.sellIn < 11) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }

        if (item.sellIn < 6) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }

    private void handleAgedBrie(Item item) {
        item.sellIn--;
        if (item.quality<50) {
           item.quality++;
            if (item.quality < 50 && item.sellIn < 0) {
                item.quality++;
            }
        }
    }


}
