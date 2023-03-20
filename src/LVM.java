import java.util.UUID;

public class LVM {
    protected String name;
    protected String genUUID(){
        UUID u = UUID.randomUUID();
        return u.toString();
    }
    protected String getName(){
        return name;
    }
    protected String getUUID(){
        return UUID;
    }
}
