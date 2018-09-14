package com.company.receptner;

public class Tort {


    // region Instance Fields / Local popoxakanner
    private String dzu;
    private String alyur ;
    private String dzet;
    private String shaqaravaz ;
    private String duxovka;
    private String mom;
    private String alur;
    private String electrakanutyun;

    // endregion


    // region Local Methods / Local metodner
    String patrastelHumtort() {

        return this.dzet + this.dzu + this.alur;

    }


    String epel() {

        return this.duxovka + this.electrakanutyun;
    }


    String krem() {

        return this.dzu + this.alyur + this.shaqaravaz;


    }

    @Override
    public String toString() {
        return "Tort{" +
                "dzu='" + dzu + '\'' +
                ", alyur='" + alyur + '\'' +
                ", dzet='" + dzet + '\'' +
                ", shaqaravaz='" + shaqaravaz + '\'' +
                ", duxovka='" + duxovka + '\'' +
                ", mom='" + mom + '\'' +
                ", alur='" + alur + '\'' +
                ", electrakanutyun='" + electrakanutyun + '\'' +
                '}';
    }

    // endregion

    // region GETTER / SETTER
    public String getDzu(){
        return this.dzu;
    }

    public void setDzu(String dzu){
        if (!dzu.equals("pchacac dzu")) {
            this.dzu = dzu;
        }
    }
//__________________________________

    public  String getAlyur(){
        return  this.alur;
    }
    public void setAlyur(String alur){
        if (!alur.equals("sev guyn")){
            this.alur = alur;
        }
    else this.alur = "kakachka";
    }

    //____________________________

    public  String getDzet() {
        return this.dzet;
}

    public void setDzet(String dzet){
    if (dzet.equals("pakas"))
        this.dzet = "2 litr";

    }
//____________________________________________

    public  String getShaqaravaz(){
        return this.shaqaravaz;
    }
public void setShaqaravaz(String shaqaravaz){
        this.shaqaravaz = shaqaravaz;
}
//____________________________________________

    public String getDuxovka(){
        return this.duxovka;
    }

public  void setDuxovka(String duxovka){
        if (duxovka.equals("tortlar"))

        this.duxovka = duxovka;
}
//______________________________________________




    // endregion



}
