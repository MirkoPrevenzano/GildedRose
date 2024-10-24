
class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

   public void updateQuality() {
        for (Item item : items) {
            if(!item.name.equals("Sulfuras, Hand of Ragnaros"))
            {
                UpdateFactory factory=new UpdateFactory();
                HandleUpdate handleUpdate=factory.getHandleUpdate(item.name);
                handleUpdate.update(item);
            }
        }
    }


}
