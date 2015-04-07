

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


class Main {
    


public static void main(String[]args){



        //      all tekst lest til 
   String content = null;
   File file = new File("testlabyrint_fra_oppgaveteksten.txt"); //for ex foo.txt
   try {
       FileReader reader = new FileReader(file);
       char[] chars = new char[(int) file.length()];
       reader.read(chars);
       content = new String(chars);
       reader.close();
   } catch (IOException e) {
       e.printStackTrace();
   }
   System.out.println(content);
}



// manipulere strings https://docs.oracle.com/javase/tutorial/java/data/manipstrings.html


}


