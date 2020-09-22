package com.ocr.genericité;

public class VoitureSansPermis extends Voiture {

    private String mat;

    public VoitureSansPermis() {
        super();
        this.mat = mat ;
    }
    public VoitureSansPermis(Voiture voiture, String mat){
        super();
        this.mat = mat ;
    }

    @Override
    public String toString() {
        return "VoitureSansPermis{" +super.toString()+
                "mat='" + mat + '\'' +
                '}';
    }
}
