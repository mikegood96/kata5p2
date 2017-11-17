
package kata5.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MailListReaderDDBB {
    
    public static ArrayList<String> readDDBB() throws ClassNotFoundException, SQLException{
        ArrayList<String> mailList = new ArrayList<>();
        
        Class.forName("org.sqlite.JDBC");
        String urlConection = "jdbc:sqlite:/Users/Entrar/Desktop/kata5.db";
        Connection connection = DriverManager.getConnection(urlConection);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT mail FROM MAIL2;");
        
        while (rs.next()){
            String mail = rs.getString("mail");
            if(!mail.contains("@")) continue;
            mailList.add(mail);
        }
        return mailList;
    }
    
}
