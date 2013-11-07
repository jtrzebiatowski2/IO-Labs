package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author J-Tron
 */
public class Startup {

    public static void main(String[] args) throws IOException {

        File contactList = new File(File.separatorChar + "Users" + File.separatorChar + "J-Tron" + File.separatorChar
                + "Desktop" + File.separatorChar + "Fall 2013" + File.separatorChar + "Advanced Java"
                + File.separatorChar + "IOLab1.txt");

        List<String> contacts = new ArrayList<String>();
        
        boolean append = true;

        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(contactList));
            String line = in.readLine();
            contacts.add(line);
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
                contacts.add(line);
            }

        } catch (IOException ioe) {
            System.out.println("Cannot retrieve the file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }

        System.out.println(contacts.get(1));
        
        
        PrintWriter addContact = new PrintWriter(new BufferedWriter(new FileWriter(contactList, append)));
        
//        addContact.append("First Name: Nick Last Name: Tooley Address: 7895 N54th St. City: Milwaukee State: WI"
//                + "Zip:53224 E-mail: nickTool@gmail.com Phone: 4147751414");
//        addContact.close();
//                 
        
    }
    
    
    
}
