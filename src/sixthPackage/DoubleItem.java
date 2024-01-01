package sixthPackage;

public class DoubleItem {
    protected DoubleItem next;
    protected DoubleItem prev;
    protected IHall data;

    public DoubleItem(IHall data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public DoubleItem() {
        this.data = new ScientificLibraryHall("Не определено", 0);
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
