package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Pavedimai {

    Map<Integer, PavedimuIrasai> pavl=new HashMap<>();


    public void gautiVisusPavedimus(){
        for(Integer id: pavl.keySet()){
            System.out.println("id:"+id+" suma:"+pavl.get(id).suma+" gavejoID:"+pavl.get(id).gavejoID+" siuntejoID:"+pavl.get(id).siuntejoID);

        }
    }



    public void gautiDuomenis() {

        String line = "";
        BufferedReader buferis = null;
        try {
            buferis = new BufferedReader(new FileReader("src/com/company/payment.txt"));
            buferis.readLine();
            while ((line = buferis.readLine()) != null) {
                String[] gauta = line.split(",");
                int id = Integer.parseInt(gauta[0].replaceAll(" ",""));
                int suma = Integer.parseInt(gauta[1].replaceAll(" ",""));
                int gavejoID =Integer.parseInt(gauta[2].replaceAll(" ",""));
                int siuntejoID = Integer.parseInt(gauta[3].replaceAll(" ",""));
                PavedimuIrasai pav = new PavedimuIrasai(id, suma,gavejoID, siuntejoID);
                pavl.put(id,pav);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
