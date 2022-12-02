public class dodatkowe {
    public static void main(String[] args) {

        //zadanie 3 dodatkowe
        int n=3;
        for(int i=1; i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}