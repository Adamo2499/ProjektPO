package com.company;

import javax.swing.*;
import java.io.*;

public class Lists extends GUI {
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
    public void setRandomIndex(JComboBox comboBoxElement){
        int randomID = rng.nextInt(1, comboBoxElement.getItemCount());
        comboBoxElement.setSelectedIndex(randomID);
    }
}
