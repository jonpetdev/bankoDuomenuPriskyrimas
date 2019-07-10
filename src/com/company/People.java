package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class People {

    Map<Integer, IrasasPerson> pl= new HashMap<>();


    public void gautiVisaIrasa(){

        for(Integer id: pl.keySet()){
            System.out.println("id:"+id+" vardas:" +pl.get(id).getPersonVardas()+" pavarde:"+pl.get(id).getPersonPavarde()+" issiusta suma:"+pl.get(id).issiustaSuma+" gauta suma:"+pl.get(id).gautaSuma);

        }
        System.out.println(pl.size());

    }


    public void gautiDuomenis() {

        String line = "";
        BufferedReader buferis = null;
        try {
            buferis = new BufferedReader(new FileReader("src/com/company/people.txt"));
            buferis.readLine();
            while ((line = buferis.readLine()) != null ) {
                        String[] gauta = line.split(",");
                        int id = Integer.parseInt(gauta[0]);
                        String vardas = gauta[1];
                        String pavarde = gauta[2];
                        int issiustaSuma = 0;
                        int gautaSuma =0;

                        IrasasPerson pI = new IrasasPerson(id,vardas, pavarde, issiustaSuma, gautaSuma);
                        pl.put(id,pI);
                    }
            } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
