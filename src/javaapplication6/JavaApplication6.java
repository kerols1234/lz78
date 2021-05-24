/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author shahy
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File myObj = new File("D:\\3rd year\\first term\\multimedia\\file.txt");
        FileWriter myWriter = new FileWriter("D:\\3rd year\\first term\\multimedia\\write.txt");
      Scanner myReader = new Scanner(myObj);
      String data;
      String letter="";
      while (myReader.hasNextLine()) {
        data = myReader.nextLine();
        System.out.println(data);
       letter+=data;
      }
       
      myReader.close();
      
        String[] dic=new String[1000];
        int index=0;
        char s;
        String t="";
        int m=1;
        boolean cont=false;
        for(int i=0;i<dic.length;i++)
        {
            dic[i]="";
        }
        for(int i=0;i<letter.length();i++)
        {
            
            s=letter.charAt(i);
            t+=s;
            for(int j=0;j<dic.length;j++)
            {
                if(t.equals(dic[j]))
                {
                    index=j;
                    cont=true;
                    break;
                }
            }
            
            if(cont==true && i==(letter.length()-1))
            {
                myWriter.write("<"+index+" , "+"NULL"+" >"+"\n");
                break;
            }
           else if(cont==true)
            {
                cont=false;
                continue;
                
            }
            else
            {
                 dic[m]=t;
                  m++;
                  t="";
            }
            
            myWriter.write("<"+index+" , "+s+" >"+"\n");
            index = 0;
        }
         myWriter.close();
        
    }

        
    
}