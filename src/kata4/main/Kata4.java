package kata4.main;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata4.view.HistogramDisplay;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author usuario
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    
    private String filename;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        Kata4 kata4 = new Kata4();
        kata4.execute();  
    }
    
    private void execute()throws Exception{
        input();
        process();
        output();
    }
    
    private void input() throws FileNotFoundException, IOException{
        filename = "C:/Users/usuario/Documents/NetBeansProjects/kata3/src/kata4/main/emails.txt";
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
