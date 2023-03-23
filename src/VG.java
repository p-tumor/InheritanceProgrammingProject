import java.util.ArrayList;
public class VG extends LVM{
    private ArrayList<PV> pvs;
    private ArrayList<LV> lvs;
    private int size;
    private int space;
    public VG(String name){
        this.name = name;
        pvs = new ArrayList<>();
        lvs = new ArrayList<>();
        size = 0;
    }
    public void addPV(PV pv){
        pvs.add(pv);
        size += pv.getPartnerSize();
        space += pv.getPartnerSize();
    }
    public boolean addLV(LV son){
        if (son.getSize() > space ) return false;
        lvs.add(son);
        space -= son.getSize();
        return true;
    }
    public int getSize(){return size;}
    public int getSpace(){return space;}
}
