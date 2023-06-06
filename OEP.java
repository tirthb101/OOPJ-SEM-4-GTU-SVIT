/*
Write a program that reads words from a text file and displays
all the nonduplicate words in descending order. The text file is
passed as a command-line argument.
 */

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeSet;

public class OEP {
    public static void main(String[] args) {
        try {
            File file = new File(args[0]);

            BufferedReader br = new BufferedReader(new FileReader(file));

            TreeSet<String> hashset = new TreeSet<String>();

            String line;
            while ((line = br.readLine()) != null) {
                String[] tmp = line.split("[\\s?,.;!]+");
                for (String string : tmp) {
                    hashset.add(string);
                }
            }

            for (String word : hashset) {
                System.out.println(word);
            }

            br.close();

        } catch (NullPointerException e) {
            System.out.println("Couldn't open file");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println("Couldn't open file");
        }
    }
}