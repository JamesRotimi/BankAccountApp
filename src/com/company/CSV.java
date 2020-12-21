package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {


    public List<String[]> read(String file) {
        List<String[]> data = new LinkedList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String dataRow;
            while ((dataRow = br.readLine()) != null) {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File  not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Could not read file");
            e.printStackTrace();
        }
        return data;
    }
}
