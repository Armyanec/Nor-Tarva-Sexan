package com.company;

import com.company.receptner.Tolma;
import com.company.receptner.Tort;

public class Main {

    public static void main(String[] args) {



        Tolma tolma = new Tolma();
        System.out.println(tolma);

        Tort tort = new Tort();
        System.out.println(tort);


//        tort.dzu = "aveli mec dzu";

        System.out.println(tort);
        System.out.println(tort.getDzu());

        tort.setDzu("pchacac dzu");

        System.out.println(tort.getDzu());

        tort.setDzu("chpchacac dzu");

        System.out.println(tort.getDzu());
//_____________________________________________

        tort.setAlyur("sev guyn");
        System.out.println(tort.getAlyur());
//____________________________________________
        tort.setDzet("pakas");
        System.out.println(tort.getDzet());


   //_________________________________-_________

        tort.setShaqaravaz("2 gtal");
        System.out.println(tort.getShaqaravaz());
//_____________________________________________
        tort.setDuxovka("tortlar");
        System.out.println(tort.getDuxovka());

    tolma.setBrindz("1 kilo");
        System.out.println(tolma.getBrindz());


    //__________________________________________

        tolma.setKarag("karag");
        System.out.println(tolma.getKarag());

    }
}
