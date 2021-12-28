package com.company;

public class FactoryIphone {

    private static FactoryIphone iphone;

    private FactoryIphone() {

    }

    public static FactoryIphone getInstancia(){
        if (iphone == null){
            iphone = new FactoryIphone();
        }
        return iphone;
    }

    public static Iphone constriur(String modelo){
        switch (modelo){
            case "Iphone11":
                return new Iphone11();
            case "IphoneX":
                return new IphoneX();
            default:
                System.out.println("Modelo no encontrado");
                return null;
        }
    }

}
