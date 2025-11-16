import java.util.Scanner;
public class FrequencyNestedLoop {
    public static String[][] freqNested(String s){
        char[] arr=s.toCharArray();
        int n=arr.length;
        int[] freq=new int[n];
        for(int i=0;i<n;i++) freq[i]=1;
        for(int i=0;i<n;i++){
            if(arr[i]=='0') continue;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){ freq[i]++; arr[j]='0'; }
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++) if(arr[i]!='0') cnt++;
        String[][] out=new String[cnt][2];
        int k=0;
        for(int i=0;i<n;i++) if(arr[i]!='0'){ out[k][0]=Character.toString(arr[i]); out[k][1]=Integer.toString(freq[i]); k++; }
        return out;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[][] res=freqNested(s);
        for(int i=0;i<res.length;i++) System.out.println(res[i][0]+":"+res[i][1]);
    }
}
