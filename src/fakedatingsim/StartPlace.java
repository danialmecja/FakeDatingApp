package fakedatingsim;


import fakedatingsim.SearchMate;

public class StartPlace {

    private String place;
    private Double maxi;

    public StartPlace(String place, Double maxi){

        this.place = place;
        this.maxi = maxi;
    }

    public String getPLace(){
        return place;
    }

    public void startSearch(){

        //originally at UM (0,0)
        //if user wanna prompt it by himself, can juga

        Double h = 0.0;
        Double k = 0.0;

        if(place.equalsIgnoreCase("FSKTM")){
            h = 0.0;
            k = 0.0;
        }

        else if(place.equalsIgnoreCase("Ampang Jaya")){
            h = 12300.0;
            k = 2200.0;
        }

        else if(place.equalsIgnoreCase("Bandar Kinrara")){
            h = -300.0;
            k = -8600.0;
        }

        else if(place.equalsIgnoreCase("Bandar Sunway")){
            h = -5200.0;
            k = -6550.0;
        }

        else if(place.equalsIgnoreCase("Bandar Tun Razak")){
            h = 7900.0;
            k = -4000.0;
        }

        else if(place.equalsIgnoreCase("Bangsar")){
            h = 2200.0;
            k = 100.0;
        }

        else if(place.equalsIgnoreCase("Brickfields")){
            h = 4000.0;
            k = 0.0;
        }

        else if(place.equalsIgnoreCase("Bukit Bintang")){
            h = 6800.0;
            k = 1900.0;
        }

        else if(place.equalsIgnoreCase("Bukit Damansara")){
            h = 400.0;
            k = 2300.0;
        }

        else if(place.equalsIgnoreCase("Cheras")){
            h = 8300.0;
            k = -2400.0;
        }

        else if(place.equalsIgnoreCase("Damansara Utama")){
            h = -2900.0;
            k = 900.0;
        }

        else if(place.equalsIgnoreCase("Dataran Merdeka")){
            h = 4800.0;
            k = 2200.0;
        }

        else if(place.equalsIgnoreCase("Kerinchi")){
            h = 1600.0;
            k = -1600.0;
        }

        else if(place.equalsIgnoreCase("KL Gateway Mall")){
            h = 1450.0;
            k = -1500.0;
        }

        else if(place.equalsIgnoreCase("KLCC")){
            h = 6800.0;
            k = 3100.0;
        }

        else if(place.equalsIgnoreCase("Kota Damansara")){
            h = -7000.0;
            k = 3700.0;
        }

        else if(place.equalsIgnoreCase("Midvalley")){
            h = 3050.0;
            k = -1200.0;
        }

        else if(place.equalsIgnoreCase("Pantai Dalam")){
            h = 1300.0;
            k = -1900.0;
        }

        else if(place.equalsIgnoreCase("Pavilion")){
            h = 7000.0;
            k = 2200.0;
        }

        else if(place.equalsIgnoreCase("Petaling Jaya")){
            h = -6200.0;
            k = 0.0;
        }

        else if(place.equalsIgnoreCase("Putrajaya")){
            h = 4600.0;
            k = -22400.0;
        }

        else if(place.equalsIgnoreCase("Sri Petaling")){
            h = 3900.0;
            k = -6600.0;
        }

        else if(place.equalsIgnoreCase("Subang")){
            h = -12000.0;
            k = 900.0;
        }

        else if(place.equalsIgnoreCase("Subang Jaya")){
            h = -7400.0;
            k = -7800.0;
        }

        else if(place.equalsIgnoreCase("Sungai Besi")){
            h = 7450.0;
            k = 7850.0;
        }

        else if(place.equalsIgnoreCase("Sunway Lagoon")){
            h = -5000.0;
            k = -6100.0;
        }

        else if(place.equalsIgnoreCase("Kolej Kediaman Pertama")){
            h = 1000.0;
            k = -1200.0;
        }

        else if(place.equalsIgnoreCase("Kolej kediaman Kedua")){
            h = 800.0;
            k = -1200.0;
        }

        else if(place.equalsIgnoreCase("Kolej Kediaman Ketiga")){
            h = 30.0;
            k = -500.0;
        }

        else if(place.equalsIgnoreCase("Kolej Kediaman Keempat")){
            h = -100.0;
            k = 750.0;
        }

        else if(place.equalsIgnoreCase("Kolej Kediaman Kelima")){
            h = 2700.0;
            k = -400.0;
        }

        else if(place.equalsIgnoreCase("Kolej Kediaman Keenam")){
            h = 1600.0;
            k = -2800.0;
        }

        else if(place.equalsIgnoreCase("Kolej Kediaman Ketujuh")){
            h = 30.0;
            k = -230.0;
        }

        else if(place.equalsIgnoreCase("Kolej Kediaman Kelapan")){
            h = -300.0;
            k = 450.0;
        }

        else if(place.equalsIgnoreCase("Kolej Kediaman Kesembilan")){
            h = -1200.0;
            k = -1800.0;
        }

        else if(place.equalsIgnoreCase("Kolej Kediaman Kesepuluh")){
            h = 100.0;
            k = 450.0;
        }

        else if(place.equalsIgnoreCase("Kolej Kediaman Kesebelas")){
            h = 2900.0;
            k = 300.0;
        }

        else if(place.equalsIgnoreCase("Kolej Kediaman Kedua Belas")){
            h = 3000.0;
            k = -800.0;
        }

        else if(place.equalsIgnoreCase("Tasik Varsiti")){
            h = 2600.0;
            k = -1600.0;
        }

        else if(place.equalsIgnoreCase("UM Main Library")){
            h = 1400.0;
            k = -1700.0;
        }

        else if(place.equalsIgnoreCase("Dewan Tunku Canselor")){
            h = 1900.0;
            k = -1400.0;
        }

        else if(place.equalsIgnoreCase("Dewan Peperiksaan")){
            h = 1900.0;
            k = -2700.0;
        }

        else if(place.equalsIgnoreCase("UM Central")){
            h = 1200.0;
            k = -1500.0;
        }

        else if(place.equalsIgnoreCase("Klinik Kesihatan Pelajar")){
            h = 1000.0;
            k = -1400.0;
        }

        else if(place.equalsIgnoreCase("PPUM")){
            h = 1000.0;
            k = -3200.0;
        }


        System.out.println("You are at: " + place);

        SearchMate findBot = new SearchMate(h, k, maxi);    //ni utk dia determine the point where dia nak start

        findBot.loopRandomizeBot();
        findBot.increaseRad();

    }

}
