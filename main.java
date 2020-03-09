import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
         String m; 
            int c=0;
        Scanner s = new Scanner(System.in);
        m= s.next();
          for(int i=1;i<m.length();i++){
        if(m.charAt(i-1)==m.charAt(i)){
            c++;
         if(c>=6)
                 break;
        }
        else
            c=0;
          }
        if(c>=6)
            System.out.println("YES");
        else
            System.out.println("NO");
        }
}   
