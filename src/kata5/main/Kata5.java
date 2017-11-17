package kata5.main;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata5.view.HistogramDisplay;
import kata5.model.Histogram;
import kata5.model.Mail;
import kata5.view.MailHistogramBuilder;
import kata5.view.MailListReader;

public class Kata5 {
    
    private String filename;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        Kata5 kata4 = new Kata5();
        kata4.execute();  
    }
    
    private void execute()throws Exception{
        input();
        process();
        output();
    }
    
    private void input() throws FileNotFoundException, IOException{
        filename = "C:/Users/Entrar/Desktop/emails.txt";
        mailList=MailListReader.read(filename);
    }
    
    private void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    private void output(){
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute(); 
    }
}
