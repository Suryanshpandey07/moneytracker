
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class text {
    File file=new File("data.json");
    String data ="[]";
    public text() throws IOException{
        if(!file.exists()){
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write(data);
            writer.close();
        }
    }


    
}
