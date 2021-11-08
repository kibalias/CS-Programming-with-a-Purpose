public class GeneralizedHarmonic{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        int i;
        double answer = 0;

        for(i=0; i<n; i++){
            answer+=(1/Math.pow((i+1), r));
        }
        System.out.println(answer);
    }
}