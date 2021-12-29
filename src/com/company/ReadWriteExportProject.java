package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteExportProject {
    BufferedWriter writer = null;
    public void saveProject(String textToSave){
        try {
            File characterProject = new File(System.getProperty("user.home") + "/Desktop/characterProject" +
                    ".txt");
            if(!characterProject.exists()){
                characterProject.createNewFile();
            }
            FileWriter fw = new FileWriter(characterProject);
            writer = new BufferedWriter(fw);
            writer.write(textToSave);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally
        {
            try{
                if(writer!=null)
                    writer.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }
    }
}
