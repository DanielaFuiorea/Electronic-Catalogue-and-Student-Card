import java.io.Serializable;

public class Contract  implements Serializable {
    private String path;
    private int year;

    //constructor
    public Contract(String path, int year){
        this.path = path;
        this.year = year;
    }

    //returneaza calea
    public String getPath() {
        return path;
    }

    //returneaza anul
    public int getYear() {
        return year;
    }

}
