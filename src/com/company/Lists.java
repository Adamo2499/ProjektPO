package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Lists extends Main {
    BufferedReader reader;
    public void prepareList(JComboBox comboBoxElement, String listPath){
        int index=0;
        try {
            reader = new BufferedReader(new FileReader(listPath));
            String line = reader.readLine();
            while (line != null){
                comboBoxElement.addItem(line);
                line = reader.readLine();
            }
            reader.close();
        }
        catch (Exception e){
            //IOException
            if(e instanceof IOException){
                e.printStackTrace();
            }
        }
    }
}
