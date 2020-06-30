package fakedatingsim;

public class LocateBot{

    public LocateBot(){

    }

    public void end(Double x, Double y){
        System.out.println("        The coordinate is: (" + x + ", " + y + ")");

        //your tindermate is at bangsar from fsktm
        //to determine each place, range +-1000 m  by default

        System.out.print("          Your TinderMate is at: ");

        if(x>=-1000.0+0.0 && x<=1000.0+0.0 && y>=-1000.0+0.0 && y<=1000.0+0.0){
            System.out.println("FSKTM");
        }

        else if(x>=-1000.0+12300.0 && x<=1000.0+12300.0 && y>=-1000.0+2200.0 && y<=1000.0+2200.0){
            System.out.println("Ampang Jaya");
        }

        else if(x>=-1000.0-300.0 && x<=1000.0-300.0 && y>=-1000.0-8600.0 && y<=1000.0-8600.0){
            System.out.println("Bandar Kinrara");
        }

        else if(x>=-1000.0-5200.0 && x<=1000.0-5200.0 && y>=-1000.0-6550.0 && y<=1000.0-6550.0){
            System.out.println("Bandar Sunway");
        }

        else if(x>=-1000.0+7900.0 && x<=1000.0+7900.0 && y>=-1000.0-4000.0 && y<=1000.0-4000.0){
            System.out.println("Bandar Tun Razak");
        }

        else if(x>=-1000.0+2200.0 && x<=1000.0+2200.0 && y>=-1000.0+100.0 && y<=1000.0+100.0){
            System.out.println("Bangsar");
        }

        else if(x>=-1000.0+4000.0 && x<=1000.0+4000.0 && y>=-1000.0+0.0 && y<=1000.0+0.0){
            System.out.println("Brickfields");
        }

        else if(x>=-1000.0+6800.0 && x<=1000.0+6800.0 && y>=-1000.0+1900.0 && y<=1000.0+1900.0){
            System.out.println("Bukit Bintang");
        }

        else if(x>=-1000.0+400.0 && x<=1000.0+400.0 && y>=-1000.0+2300.0 && y<=1000.0+2300.0){
            System.out.println("Bukit Damansara");
        }

        else if(x>=-1000.0+8300.0 && x<=1000.0+8300.0 && y>=-1000.0-2400.0 && y<=1000.0-2400.0){
            System.out.println("Cheras");
        }

        else if(x>=-1000.0-2900.0 && x<=1000.0-2900.0 && y>=-1000.0+900.0 && y<=1000.0+900.0){
            System.out.println("Damansara Utama");
        }

        else if(x>=-1000.0+4800.0 && x<=1000.0+4800.0 && y>=-1000.0+2200.0 && y<=1000.0+2200.0){
            System.out.println("Dataran Merdeka");
        }

        else if(x>=-1000.0+1600.0 && x<=1000.0+1600.0 && y>=-1000.0-1600.0 && y<=1000.0-1600.0){
            System.out.println("Kerinchi");
        }

        else if(x>=-1000.0+1450.0 && x<=1000.0+1450.0 && y>=-1000.0-1500.0 && y<=1000.0-1500.0){
            System.out.println("KL Gateway Mall");
        }

        else if(x>=-1000.0+6800.0 && x<=1000.0+6800.0 && y>=-1000.0+3100.0 && y<=1000.0+3100.0){
            System.out.println("KLCC");
        }

        else if(x>=-1000.0-7000.0 && x<=1000.0-7000.0 && y>=-1000.0+3700.0 && y<=1000.0+3700.0){
            System.out.println("Kota Damansara");
        }

        else if(x>=-1000.0+3050.0 && x<=1000.0+3050.0 && y>=-1000.0-1200.0 && y<=1000.0-1200.0){
            System.out.println("Midvalley");
        }

        else if(x>=-1000.0+1300.0 && x<=1000.0+1300.0 && y>=-1000.0-1900.0 && y<=1000.0-1900.0){
            System.out.println("Pantai Dalam");
        }

        else if(x>=-1000.0+7000.0 && x<=1000.0+7000.0 && y>=-1000.0+2200.0 && y<=1000.0+2200.0){
            System.out.println("Pavilion");
        }

        else if(x>=-1000.0-6200.0 && x<=1000.0-6200.0 && y>=-1000.0+0.0 && y<=1000.0+0.0){
            System.out.println("Petaling Jaya");
        }

        else if(x>=-1000.0+4600.0 && x<=1000.0+4600.0 && y>=-1000.0-22400.0 && y<=1000.0-22400.0){
            System.out.println("Putrajaya");
        }

        else if(x>=-1000.0+3900.0 && x<=1000.0+3900.0 && y>=-1000.0-6600.0 && y<=1000.0-6600.0){
            System.out.println("Sri Petaling");
        }

        else if(x>=-1000.0-12000.0 && x<=1000.0-12000.0 && y>=-1000.0+900.0 && y<=1000.0+900.0){
            System.out.println("Subang");
        }

        else if(x>=-1000.0-7400.0 && x<=1000.0-7400.0 && y>=-1000.0-7800.0 && y<=1000.0-7800.0){
            System.out.println("Subang Jaya");
        }

        else if(x>=-1000.0+7450.0 && x<=1000.0+7450.0 && y>=-1000.0+7850.0 && y<=1000.0+7850.0){
            System.out.println("Sungai Besi");
        }

        else if(x>=-1000.0-5000.0 && x<=1000.0-5000.0 && y>=-1000.0-6100.0 && y<=1000.0-6100.0){
            System.out.println("Sunway Lagoon");
        }

        else if(x>=-1000.0+1000.0 && x<=1000.0+1000.0 && y>=-1000.0-1200.0 && y<=1000.0-1200.0){
            System.out.println("Kolej Kediaman Pertama");
        }

        else if(x>=-1000.0+800.0 && x<=1000.0+800.0 && y>=-1000.0-1200.0 && y<=1000.0-1200.0){
            System.out.println("Kolej kediaman Kedua");
        }

        else if(x>=-1000.0+30.0 && x<=1000.0+30.0 && y>=-1000.0-500.0 && y<=1000.0-500.0){
            System.out.println("Kolej Kediaman Ketiga");
        }

        else if(x>=-1000.0-100.0 && x<=1000.0-100.0 && y>=-1000.0+750.0 && y<=1000.0+750.0){
            System.out.println("Kolej Kediaman Keempat");
        }

        else if(x>=-1000.0+2700.0 && x<=1000.0+2700.0 && y>=-1000.0-400.0 && y<=1000.0-400.0){
            System.out.println("Kolej Kediaman Kelima");
        }

        else if(x>=-1000.0+1600.0 && x<=1000.0+1600.0 && y>=-1000.0-2800.0 && y<=1000.0-2800.0){
            System.out.println("Kolej Kediaman Keenam");
        }

        else if(x>=-1000.0+30.0 && x<=1000.0+30.0 && y>=-1000.0-230.0 && y<=1000.0-230.0){
            System.out.println("Kolej Kediaman Ketujuh");
        }

        else if(x>=-1000.0-300.0 && x<=1000.0-300.0 && y>=-1000.0+450.0 && y<=1000.0+450.0){
            System.out.println("Kolej Kediaman Kelapan");
        }

        else if(x>=-1000.0-1200.0 && x<=1000.0-1200.0 && y>=-1000.0-1800.0 && y<=1000.0-1800.0){
            System.out.println("Kolej Kediaman Kesembilan");
        }

        else if(x>=-1000.0+100.0 && x<=1000.0+100.0 && y>=-1000.0+450.0 && y<=1000.0+450.0){
            System.out.println("Kolej Kediaman Kesepuluh");
        }

        else if(x>=-1000.0+2900.0 && x<=1000.0+2900.0 && y>=-1000.0+300.0 && y<=1000.0+300.0){
            System.out.println("Kolej Kediaman Kesebelas");
        }

        else if(x>=-1000.0+3000.0 && x<=1000.0+3000.0 && y>=-1000.0-800.0 && y<=1000.0-800.0){
            System.out.println("Kolej Kediaman Kedua Belas");
        }

        else if(x>=-1000.0+2600.0 && x<=1000.0+2600.0 && y>=-1000.0-1600.0 && y<=1000.0-1600.0){
            System.out.println("Tasik Varsiti");
        }

        else if(x>=-1000.0+1400.0 && x<=1000.0+1400.0 && y>=-1000.0-1700.0 && y<=1000.0-1700.0){
            System.out.println("UM Main Library");
        }

        else if(x>=-1000.0+1900.0 && x<=1000.0+1900.0 && y>=-1000.0-1400.0 && y<=1000.0-1400.0){
            System.out.println("Dewan Tunku Canselor");
        }

        else if(x>=-1000.0+1900.0 && x<=1000.0+1900.0 && y>=-1000.0-2700.0 && y<=1000.0-2700.0){
            System.out.println("Dewan Peperiksaan");
        }

        else if(x>=-1000.0+1200.0 && x<=1000.0+1200.0 && y>=-1000.0-1500.0 && y<=1000.0-1500.0){
            System.out.println("UM Central");
        }

        else if(x>=-1000.0+1000.0 && x<=1000.0+1000.0 && y>=-1000.0-1400.0 && y<=1000.0-1400.0){
            System.out.println("Klinik Kesihatan Pelajar");
        }

        else if(x>=-1000.0+1000.0 && x<=1000.0+1000.0 && y>=-1000.0-3200.0 && y<=1000.0-3200.0){
            System.out.println("PPUM");
        }

        else{
            System.out.println("Haven't been located. Location will be updated from time to time.");
        }
    }
}
