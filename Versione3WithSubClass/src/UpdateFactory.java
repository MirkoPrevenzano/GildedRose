public class UpdateFactory {
    public HandleUpdate getHandleUpdate(String name)
    {
        if(name.equals("Aged Brie"))
            return new HandleUpdateAgedBrie();
        else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new HandleUpdateBackstage();
        }
        else
        {
            return  new HandleUpdate();
        }
    }
}
