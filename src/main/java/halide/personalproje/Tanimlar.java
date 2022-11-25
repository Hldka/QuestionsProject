package halide.personalproje;

import java.util.HashMap;

public class Tanimlar {
    private boolean flag=true;
    private  String id;
    private  String name;
    private String adres;
    private String telno;


    public Tanimlar() {
    }

    public Tanimlar(String name, String adres, String telno) {
        this.name = name;
        this.adres = adres;
        this.telno = telno;
    }

    private HashMap<String,Tanimlar> liste=new HashMap<>();

    public HashMap<String, Tanimlar> getListe() {
        return liste;
    }

    public void setListe(HashMap<String, Tanimlar> liste) {
        this.liste = liste;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}
