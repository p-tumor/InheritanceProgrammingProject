public class PHD extends LVM {
    private int size;
    private boolean hasPV;
    public PHD(String name,int size){
        this.name = name;
        this.size = size;
        hasPV = false;
    }
    public int getSize(){return size;}
    public String toString(){
        return name + " ["+size+"] ["+uUID+"]";
    }

    public boolean isHasPV() {
        return hasPV;
    }

    public void setHasPV(boolean hasPV) {
        this.hasPV = hasPV;
    }
}
