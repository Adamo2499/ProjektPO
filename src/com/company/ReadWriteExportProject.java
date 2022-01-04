package com.company;

import java.io.*;

public class ReadWriteExportProject extends GUI {
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
    public void loadProject(String pathToProject){
        //read parameters from file
        String[] loadedParameters = new String[26];
        int index = 0;
        try {
            reader = new BufferedReader(new FileReader(pathToProject));
            String line = reader.readLine();
            while (line != null){
                loadedParameters[index] = line.split(": ")[1];
            }
            reader.close();

        }
        catch (Exception e){
            //IOException
            if(e instanceof IOException){
                e.printStackTrace();
            }
        }
        //send values to aplication
        characterName.setText(loadedParameters[0]);
        if(loadedParameters[1].equalsIgnoreCase("normal")){
            category1.setSelected(true);
        }
        else if(loadedParameters[1].equalsIgnoreCase("tainted")) {
            category2.setSelected(true);
        }
        else {
            category3.setSelected(true);
        }
        redHearts.setText(loadedParameters[2]);
        soulHearts.setText(loadedParameters[3]);
        blackHearts.setText(loadedParameters[4]);
    }
    public void exportCharacterFile(){

    }
}
