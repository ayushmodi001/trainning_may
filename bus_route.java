import java.util.Scanner;

public class bus_route {
    public class bus_route{
        static int[] path=new int[]{800,600,750,900,1400,1200,1100,1500};
        static string[] Route=new String[]{"TH","GA","IC","HA","TE","LU","NI","CA"};

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean FLAG=false;
        int src=0;
        int dit
        for (int i = 0; i < Route.length; i++) {
            dist+=path[i];
            if (Route[i].equals(src)) {
                SFLAG=true;
                dlist=0;
                
            }
            if (Route[i]==des) {
                DFLAG=true;
                if(SFLAG==false){
                    fin_dist=dist;
                }
            }
        }
    }
}
