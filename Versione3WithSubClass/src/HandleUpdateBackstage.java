public class HandleUpdateBackstage extends HandleUpdate{
    @Override
    public void update(Item item) {
        decrementSell(item);
        incrementQuality(item);
        if (isLessTenDays(item))
            incrementQuality(item);
        if (isLessSixDays(item))
            incrementQuality(item);
        if(isDie(item))
            item.quality = 0;
    }
}
