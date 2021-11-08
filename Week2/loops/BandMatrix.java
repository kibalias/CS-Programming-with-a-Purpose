public class BandMatrix {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int i, j;
        char k;
        for(i = 0; i<n; i++){
            for(j = 0; j<n; j++){
                if(j >= (i-width) && j <= (i+width)){
                   k = '*';
                } else{
                    k = '0';
                }
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
