//Created By 21CE114 Harsh Rana.

package Practical8;

import java.io.*;
import java.util.Scanner;

public class Prac_8 {
    public static void main(String[] args) throws Exception{
        String path = args[5];
        FileReader file = new FileReader(path);
        Scanner sc = new Scanner(file);
        String line = null;
        int countLine = 0, countWord = 0, countCharacter = 0;
        while(sc.hasNextLine()){
            line = sc.nextLine();
            countLine++;
            String s[] = line.split(" ");
            for (String string : s) {
                countWord++;
                countCharacter+=string.length();
            }
        }
        System.out.println("Number of lines in file: " + countLine + "\nNumber of words in file: " + countWord + "\nNumber of characters in file: " + countCharacter);
    }
}