import java.util.*;

/**
 * Created by noMoon on 2016-01-29.
 */
public class MarsExploration {

    static String sosString="SOS";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        if(S.length()<1||S.length()>99){
            System.out.println(0);
            return;
        }
        int count=0;
        int n=S.length()/3;
        for(int i=0;i<n;i++){
            count+=comapreSOS(S.substring(0,3));
            S=S.substring(3);
        }
        System.out.println(count);

    }

    public static int comapreSOS(String msg){
        int count=0;
        for(int i=0;i<3;i++){
            if(msg.charAt(i)!=sosString.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
