/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputouputfiles;

import java.io.*;

/**
 *
 * @author VICTUS
 */
public class InputOuputFiles {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String fname = "test/matrix.txt";
        File f = new File(fname);
        if(f.exists())
            System.out.println("The file " + fname + " exist");
        else{
            System.out.println("The file " + fname + " does not exist");
            System.out.println("The file is now created");
            f.createNewFile();
        }
    }
    
}
