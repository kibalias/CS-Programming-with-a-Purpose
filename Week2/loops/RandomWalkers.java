public class RandomWalkers {
    public static void main(String[]args){
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int total_steps = 0;
        double rand;
        for(int i=0; i<trials; i++){
            int x = 0;
            int y = 0;
            int steps = 0;
            while((Math.abs(x) + Math.abs(y)) < r){
                steps++;
                rand = Math.random();
                if(rand <= 0.25){
                    x++;
                } else if(rand <= 0.50){
                    x--;
                } else if(rand <= 0.75){
                    y++;
                } else if(rand <= 1.00){
                    y--;
                }
            }
            total_steps+=steps;
        }
        double avg_steps = ((double)total_steps/trials);
        System.out.println("average number of steps = " + avg_steps);
    }
}
