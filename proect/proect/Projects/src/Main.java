import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String []args) throws IOException, InterruptedException {
        String doc_name = "MyFirstDoc";
        String doc_permission = "txt";
        Documents documents1 = new Documents();
        documents1.setText_documents("First Change!");
        Date date_create = new Date();
        documents1.save(doc_name, doc_permission, date_create);
        Thread.sleep(1000);
        documents1.setText_documents("Second Change");
        Date date_change = new Date();
        documents1.save(doc_name, doc_permission, date_change);
        /*documents1 = documents1.getSaving_documents().get(date_create);
        Thread.sleep(1000);
        Date back = new Date();
        documents1.save(doc_name, doc_permission,back);*/

    }
}
