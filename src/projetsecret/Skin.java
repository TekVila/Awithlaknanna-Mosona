/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projetsecret;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Clément
 */
public class Skin {

    ArrayList<Picture> Handler;

    public Skin()
    {
        Handler = null;
    }

    public Skin( String fileName) throws IOException
    {
        Handler = new  ArrayList<Picture>();

        BufferedReader buff = null;
        String line;
        boolean eof = false;
        try {
            buff = new BufferedReader(new FileReader(fileName));
            while (eof != true) {
                line = buff.readLine();
                if (line != null) {
                    Picture tmp = new Picture(line);
                    if (tmp != null)
                        Handler.add(tmp);
                }
                else {
                    eof = true;
                }
           }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Can't find file !!");
        }
        catch (IOException ex) {
            System.out.println("Reading Error !!");
        }
        finally {
            try {
                buff.close();
            }
            catch (IOException ex1) {
                System.out.println("Closing Error !!");
            }
        }
    }

}
