public  class HandleUpdate  {

    public  void update(Item item)
    {
        decrementQuality(item);
        decrementSell(item);

        if (isDie(item))
            decrementQuality(item);
    };
    protected boolean isNotMaxQuality(Item item) { return item.quality < 50; }
    protected boolean isNotMinQuality(Item item) { return item.quality > 0; }
    protected void decrementSell(Item item) { item.sellIn--; }
    protected void decrementQuality(Item item) { if (isNotMinQuality(item)) item.quality--; }
    protected void incrementQuality(Item item) { if(isNotMaxQuality(item)) item.quality++; }
    protected boolean isDie(Item item) { return item.sellIn < 0 && isNotMinQuality(item); }

}
