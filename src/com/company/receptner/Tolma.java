package com.company.receptner;

public class Tolma {

    private String brindz;
    private String karag;
    private String lobi;
    private String dzavar;
    private String kaxamb;
    private String plita;
    private String aman;
    private String sox;

    String tolmifarsh  (){
        return this.brindz + this.lobi + this.sox ;
    }

    String patateluproces (){
        return this.kaxamb;
    }

    String tolmaepel (){
        return this.plita + this.aman;
    }

    @Override
    public String toString() {
        return "Tolma{" +
                "brindz='" + brindz + '\'' +
                ", karag='" + karag + '\'' +
                ", lobi='" + lobi + '\'' +
                ", dzavar='" + dzavar + '\'' +
                ", kaxamb='" + kaxamb + '\'' +
                ", plita='" + plita + '\'' +
                ", aman='" + aman + '\'' +
                ", sox='" + sox + '\'' +
                '}';
    }
//_______________________________________________________
         public String getBrindz (){
         return this.brindz;

        }
        public  void setBrindz(String brindz){
        this.brindz = brindz;
        }
//_________________________________________________________

    public  String getKarag() {
        return this.karag;
    }

        public void setKarag(String karag){



            if (karag.equals ("karag")){

                this.karag = "15 kilo";
            }


        }

        public  String getLobi(){
        return  this.lobi ;
        }

        public  void  setLobi(){


    }
}

