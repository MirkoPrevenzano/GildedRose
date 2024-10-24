public class HandleUpdateAgedBrie extends HandleUpdate{
    @Override
    public void update(Item item) {
        decrementSell(item);
        incrementQuality(item);
        if (isAgedBrie(item))
            incrementQuality(item);
    }
    private boolean isAgedBrie(Item item) { return isNotMaxQuality(item) && item.sellIn < 0; }

}
