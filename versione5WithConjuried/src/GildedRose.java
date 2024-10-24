
class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

   public void updateQuality() {
        for (Item item : items) {
            if(isNotSulfurus(item.name))
            {
                UpdateFactory factory=new UpdateFactory();
                HandleUpdate handleUpdate=factory.getHandleUpdate(item.name);
                handleUpdate.update(item);
            }
        }
    }

    private boolean isNotSulfurus(String name){ return !name.equals("Sulfuras, Hand of Ragnaros"); }


}
