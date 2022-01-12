package com.company;

import javax.swing.*;
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
                line = reader.readLine();
                index++;
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
        // FIXME naprawić NullPointException while loading project
        try {
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
            boneHearts.setText(loadedParameters[5]);
            brokenHearts.setText(loadedParameters[6]);
            moveSpeed.setText(loadedParameters[7]);
            damage.setText(loadedParameters[8]);
            tears.setText(loadedParameters[9]);
            shotSpeed.setText(loadedParameters[10]);
            range.setText(loadedParameters[11]);
            luck.setText(loadedParameters[12]);
            coins.setText(loadedParameters[13]);
            bombs.setText(loadedParameters[14]);
            key.setText(loadedParameters[15]);
            startingActiveItem.setSelectedItem(loadedParameters[16]);
            startingPassiveItem1.setSelectedItem(loadedParameters[17]);
            startingPassiveItem2.setSelectedItem(loadedParameters[18]);
            startingPassiveItem3.setSelectedItem(loadedParameters[19]);
            startingPocket.setSelectedItem(loadedParameters[20]);
            startingTrinket.setSelectedItem(loadedParameters[21]);
            startingPocket.setSelectedItem(loadedParameters[22]);
            noRedHealth.setSelected(Boolean.parseBoolean(loadedParameters[23]));
            canHavePocketItem.setSelected(Boolean.parseBoolean(loadedParameters[24]));
        }
        catch (NullPointerException nExp){
            nExp.printStackTrace();
        }

    }
    public void exportCharacterFile(){
        //TODO Write body of exportCharacterFile which will export data from app to .xml file
    }
}
