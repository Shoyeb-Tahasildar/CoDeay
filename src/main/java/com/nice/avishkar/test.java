package com.nice.avishkar;
import java.io.FileInputStream;
import java.util.Scanner;
class test{
    public static void main(String []args) throws Exception{
        Scanner reader = new Scanner(new FileInputStream("C:\\Users\\SHOYEB\\Downloads\\coday-challenge\\src\\main\\resources\\candidateFile.csv"));
        while (reader!=null){
            System.out.println(reader);
        }
        reader.close();
    }
}