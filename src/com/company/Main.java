package com.company;


import java.util.*;
import static java.util.Comparator.comparing;

public class Main {

    public static void main(String[] args) {

        People people =new People();
        people.gautiDuomenis();
        people.gautiVisaIrasa();
        Pavedimai pavedimai = new Pavedimai();
        pavedimai.gautiDuomenis();




        for(Integer id: people.pl.keySet()){
            for(Integer id2: pavedimai.pavl.keySet()){
                if(pavedimai.pavl.get(id2).getSiuntejoID()==id){
                    people.pl.get(id).setIssiustaSuma(people.pl.get(id).getIssiustaSuma()+pavedimai.pavl.get(id2).getSuma());
                }
                if(pavedimai.pavl.get(id2).getGavejoID()==id){
                    people.pl.get(id).setGautaSuma(people.pl.get(id).getGautaSuma()+pavedimai.pavl.get(id2).getSuma());

                }
            }

        }
        people.gautiVisaIrasa();


        ArrayList<IrasasPerson> pee = new ArrayList<>(people.pl.values());


        System.out.println("\nSurusiuota pagal issiusta suma");
        Collections.sort(pee, comparing(IrasasPerson::getIssiustaSuma));

        for (int i = 0; i < pee.size(); i++) {
            System.out.println(pee.get(i).getId() + " Person:" + pee.get(i).getPersonVardas() + " " + pee.get(i).getPersonPavarde() + " issiusta suma:" + pee.get(i).getIssiustaSuma());
        }

        System.out.println("\nSurusiuota pagal gauta suma");
        Collections.sort(pee, comparing(IrasasPerson::getGautaSuma));

        for(int i = 0; i<pee.size();i++){
            System.out.println(pee.get(i).getId() + " Person:" + pee.get(i).getPersonVardas() + " " + pee.get(i).getPersonPavarde() + " gauta suma:" + pee.get(i).getGautaSuma());

        }


    }



}
