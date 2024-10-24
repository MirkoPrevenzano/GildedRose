public class HandleUpdateConjured extends HandleUpdate{
    @Override
    public void update(Item item) {
        decrementSell(item);
        decrementQuality(item);
        decrementQuality(item);
    }
}
