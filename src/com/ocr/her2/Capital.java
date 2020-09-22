package com.ocr.her2;

public class Capital extends Ville {

private String monument;
public Capital(){
    super();
    monument = "rien";
    }

    public Capital(String nv, String np, int nh , String monument){
    super(nv, np, nh);
    this.monument = monument;
    }

    public String desVille(){
    String str = super.decriToi()+"\t " +this.monument+ " Est un monument" ;
    return str;
    }

    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument;
    }
}
