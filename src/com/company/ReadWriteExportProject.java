package com.company;

import java.io.*;

public class ReadWriteExportProject {
    BufferedWriter writer = null;
    BufferedReader reader;
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
    public void loadProject(String pathToFile){

    }
    public void exportCharacterFile(){

    }
}
