package com.javaio;

//Constructors
//FileReader f=new FileReader(File f);
//FileReader f1=new FileReader(String fname);
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
  public static void main(String[] args) {
      FileReader reader = null;
      try {
          reader = new FileReader("Rufthan.txt");
          int character;
          while ((character = reader.read()) != -1) {// if u don't have any data to read it will return -1
              System.out.print((char) character);// type casting the unicode value with char
          }
      } catch (IOException e) {
          e.printStackTrace();
      } 
      finally {
          try {
              if (reader != null) {
                  reader.close();
              }
          } catch (IOException ex) {
              ex.printStackTrace();
          }
      }
  }
}
//Methods
//1.int read();
//2.int read(char[] ch)
//3.close