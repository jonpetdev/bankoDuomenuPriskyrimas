package com.company;

public class IrasasPerson {

    int id;
    String personVardas;
    String personPavarde;
    int issiustaSuma;
    int gautaSuma;

    IrasasPerson(int id, String vardas, String pavarde,int issiustaSuma, int gautaSuma){
        this.id=id;
        this.personVardas=vardas;
        this.personPavarde=pavarde;
        this.issiustaSuma=issiustaSuma;
        this.gautaSuma=gautaSuma;
    }


    public String getPersonVardas() {
        return personVardas;
    }

    public void setPersonVardas(String personVardas) {
        this.personVardas = personVardas;
    }

    public String getPersonPavarde() {
        return personPavarde;
    }

    public void setPersonPavarde(String personPavarde) {
        this.personPavarde = personPavarde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIssiustaSuma() {
        return issiustaSuma;
    }

    public void setIssiustaSuma(int issiustaSuma) {
        this.issiustaSuma = issiustaSuma;
    }

    public int getGautaSuma() {
        return gautaSuma;
    }

    public void setGautaSuma(int gautaSuma) {
        this.gautaSuma = gautaSuma;
    }
}
