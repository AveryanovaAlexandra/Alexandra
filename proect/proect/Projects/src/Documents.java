import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
public class Documents {
    private String name ;
    private String permission;
    private File file;
    private Map<Date, Documents> saving_documents = new HashMap<>();
    private String text_documents;
    public Documents(){}
    public void setText_documents(String text_documents) {
        this.text_documents = text_documents;
    }
    public String getName() {
        return name;
    }
    public String getPermission() {
        return permission;
    }
    public Map<Date, Documents> getSaving_documents() {
        return saving_documents;
    }
    public String getText_documents() {
        return text_documents;
    }
    public void save(String name, String permission , Date date) throws IOException {
        file = new File(String.format("%s.%s",name ,permission));
        file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write(this.text_documents+'\n');
            fw.write("modify : " + date.toString());
            fw.close();
        this.name = name ;
        this.permission  = permission;
        Documents new_replies = new Documents();
        new_replies.setText_documents(this.text_documents);
        saving_documents.put(date , new_replies);
    }
}
