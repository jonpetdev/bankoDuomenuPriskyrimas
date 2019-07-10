package com.company;

public class PavedimuIrasai {

    int id;
    int suma;
    int gavejoID;
    int siuntejoID;

    PavedimuIrasai(int id, int suma, int gavejoID, int siuntejoID){
        this.id=id;
        this.suma=suma;
        this.gavejoID=gavejoID;
        this.siuntejoID=siuntejoID;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getGavejoID() {
        return gavejoID;
    }

    public void setGavejoID(int gavejoID) {
        this.gavejoID = gavejoID;
    }

    public int getSiuntejoID() {
        return siuntejoID;
    }

    public void setSiuntejoID(int siuntejoID) {
        this.siuntejoID = siuntejoID;
    }
}
