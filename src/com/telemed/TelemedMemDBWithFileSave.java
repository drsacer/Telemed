package com.telemed;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

public class TelemedMemDBWithFileSave extends TelemedMemDB {

    public TelemedMemDBWithFileSave() {
        userList.clear();
        loadFromFile();
    }

    public void saveToFile() {
        FileOutputStream os = null;
        try {
            os = new FileOutputStream("serialized.xml");
            XMLEncoder encoder = new XMLEncoder(os);
            encoder.writeObject(userList);
            encoder.writeObject(recordList);
            encoder.close();

            System.out.println("All data is saved.");
        } catch (FileNotFoundException e) {
            System.out.println("Not possible to save data due to: " + e.getMessage());
        }

    }

    public void loadFromFile()  {
        FileInputStream is = null;
        try {
            is = new FileInputStream("serialized.xml");
            XMLDecoder decoder = new XMLDecoder(is);
            userList = (List<User>) decoder.readObject();
            recordList = (List<Record>) decoder.readObject();
            decoder.close();

            System.out.println("Data is loaded!");
        } catch (FileNotFoundException e) {
            System.out.println("Saved filed doesn't exists yet");
        }

    }
}
