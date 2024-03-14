import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Interface implements Serializable {
    public static void main(String argvs[])
    {
        University uni2;
        try
        {
            FileInputStream fis = new FileInputStream("SURSE/infos/catalog.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            uni2 = (University) ois.readObject();
            ois.close();
            fis.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        IndexPage i = new IndexPage();
        i.indexPage(uni2);

    }

}


