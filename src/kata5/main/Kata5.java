package kata5.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import kata5.view.HistogramDisplay;
import kata5.model.Histogram;
import kata5.model.Mail;
import kata5.view.MailHistogramBuilder;
import kata5.view.MailListReaderDDBB;

public class Kata5 {
    ArrayList<String> arrayMail;
    private String filename;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        Kata5 kata5 = new Kata5();
        kata5.execute();  
    }
     public Kata5() throws ClassNotFoundException, SQLException {
        this.arrayMail = MailListReaderDDBB.readDDBB();
      }
    private void execute()throws Exception{
        input();
        process();
        output();
    }
    
    private void input() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{

        filename = "C:/Users/Entrar/Desktop/emails.txt";
        arrayMail=MailListReaderDDBB.readDDBB();
    }
    
    private void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    private void output(){
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute(); 
    }
}
