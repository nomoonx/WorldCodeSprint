import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by noMoon on 2016-01-29.
 */
public class FlatlandSpaceStations {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        List<Integer> stations=new ArrayList<Integer>();
        for(int i=0;i<m;i++) {
            stations.add(in.nextInt());
        }
        if(m==1){
            int max=stations.get(0)>n-1-stations.get(0)?stations.get(0):n-1-stations.get(0);
            System.out.println(max);
        }else{
            Collections.sort(stations);
            int max=stations.get(0);
            for(int i=0;i<m-1;i++) {
                int first = stations.get(i);
                int second= stations.get(i+1);
                int maxDist=(second-first)/2;
                if(maxDist>max){
                    max=maxDist;
                }
            }
            if(n-1-stations.get(m-1)>max){
                max=n-1-stations.get(m-1);
            }
            System.out.println(max);
        }
    }
}
