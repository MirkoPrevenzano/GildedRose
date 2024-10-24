
class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

   public void updateQuality() {
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
        decrementQuality(item);
        decrementSell(item);

        if (isDie(item))
            decrementQuality(item);
    }
    private void handleBackstage(Item item) {
        decrementSell(item);
        incrementQuality(item);
        if (isLessTenDays(item))
            incrementQuality(item);
        if (isLessSixDays(item))
            incrementQuality(item);
        if(isDie(item))
            item.quality = 0;
    }

    private void handleAgedBrie(Item item) {
        decrementSell(item);
        incrementQuality(item);
        if (isAgedBrie(item))
            incrementQuality(item);

    }

    private boolean isNotMaxQuality(Item item) { return item.quality < 50; }
    private boolean isNotMinQuality(Item item) { return item.quality > 0; }
    private void decrementSell(Item item) { item.sellIn--; }
    private void decrementQuality(Item item) { if (isNotMinQuality(item)) item.quality--; }
    private void incrementQuality(Item item) { if(isNotMaxQuality(item)) item.quality++; }
    private boolean isDie(Item item) { return item.sellIn < 0 && isNotMinQuality(item); }
    private boolean isAgedBrie(Item item) { return isNotMaxQuality(item) && item.sellIn < 0; }
    private boolean isLessTenDays(Item item) { return isNotMaxQuality(item) &&item.sellIn<11; }
    private boolean isLessSixDays(Item item) { return isNotMaxQuality(item) &&item.sellIn<6; }

}
