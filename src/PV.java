public class PV extends LVM{
    private PHD partner;
    public PV(String name){
        this.name = name;
    }
    public void addPartner(PHD other){
        partner  = other;
        other.setHasPV(true);
    }
    public int getPartnerSize(){
        return partner.getSize();
    }
    public String getPHD(){
        return partner.getName();
    }
}
