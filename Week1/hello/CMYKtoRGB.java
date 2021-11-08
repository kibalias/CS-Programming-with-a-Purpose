public class CMYKtoRGB {
    public static void main(String[]args) {
        Double c = Double.parseDouble(args[0]);
        Double m = Double.parseDouble(args[1]);
        Double y = Double.parseDouble(args[2]);
        Double k = Double.parseDouble(args[3]);

        double white = 1 - k;
        double red = 255 * white * (1-c);
        double green = 255 * white * (1-m);
        double blue = 255 * white * (1-y);

        System.out.println("red   = " + Math.round(red));
        System.out.println("green = " + Math.round(green));
        System.out.println("blue  = " + Math.round(blue));
    }
}