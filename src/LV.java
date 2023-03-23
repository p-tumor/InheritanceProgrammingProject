public class LV extends LVM{
    private int size;
    private VG owner;
    public LV(String name, int size, VG owner){
        this.name = name;
        this.size = size;
        this.owner = owner;
    }
    public int getSize(){return size;}
    public VG getOwner() {
        return owner;
    }
}
