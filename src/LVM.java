import java.util.UUID;

public class LVM {
    protected String name;
    protected final String uuid = UUID.randomUUID().toString();
    protected String getName(){
        return name;
    }
    protected String getUUID(){
        return uuid;
    }
}
