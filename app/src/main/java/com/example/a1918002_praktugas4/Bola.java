package com.example.a1918002_praktugas4;

public class Bola {
    private String klub,asal,julukan;
    private int foto;
    public Bola(String klub, String asal, String julukan, int foto){
        this.klub = klub;
        this.asal = asal;
        this.julukan = julukan;
        this.foto = foto;
    }

    public String getKlub(){
        return klub;
    }
    public void setKlub(String klub){
        this.klub = klub;
    }
    public String getAsal(){ return asal; }
    public void setAsal(String asal){
        this.asal = asal;
    }
    public String getJulukan(){
        return julukan;
    }
    public void setJulukan(String julukan){
        this.julukan = julukan;
    }

    public int getFoto() { return foto; }
    public void setFoto(int foto) { this.foto = foto; }
}

