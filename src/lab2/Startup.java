package lab2;

import lab1.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author J-Tron
 */
public class Startup {

    public static void main(String[] args) throws IOException {

        File contactList = new File(File.separatorChar + "Users" + File.separatorChar + "J-Tron" + File.separatorChar
                + "Desktop" + File.separatorChar + "Fall 2013" + File.separatorChar + "Advanced Java"
                + File.separatorChar + "IOLab1.txt");

        Set<String> contacts = new HashSet<String>();
        
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
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the record you would like to retrieve");
        int requestedRecordNumber = input.nextInt();
        
        try{
        List<String> searchContactList = new ArrayList<String>(contacts);
        System.out.println(searchContactList.get(requestedRecordNumber - 1));
        }
        catch(IndexOutOfBoundsException aobe){
            System.out.println("There are only " + contacts.size() + " records");
        }
         System.out.println( "End of program" );
        
        PrintWriter addContact = new PrintWriter(new BufferedWriter(new FileWriter(contactList, append)));
        
//        addContact.append("First Name: Nick Last Name: Tooley Address: 7895 N54th St. City: Milwaukee State: WI"
//                + "Zip:53224 E-mail: nickTool@gmail.com Phone: 4147751414");
//        addContact.close();
//                 
        
    }
    
    
    
}
