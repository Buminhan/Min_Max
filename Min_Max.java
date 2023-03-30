import java.util.Scanner;
public class Min_Max {
    public static void main(String[] args) {
        int n;
        float x, min = 0, max = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        n = inp.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+". sayıyı giriniz:");
            x = inp.nextFloat();
            if(i==1){
                min = max = x;
            }
            else{
                if(x<min){
                    min = x;
                }
                if(x>max){
                    max = x;
                }
            }
        }
        System.out.println("En küçük sayı:"+min);
        System.out.println("En büyük sayı:"+max);
    }
}
