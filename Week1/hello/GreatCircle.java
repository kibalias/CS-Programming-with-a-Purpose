public class GreatCircle {
    public static void main (String[] args) {
        Double x1 = Double.parseDouble(args[0]);
        Double y1 = Double.parseDouble(args[1]);
        Double x2 = Double.parseDouble(args[2]);
        Double y2 = Double.parseDouble(args[3]);

        Double xToRad = Math.toRadians(x2 - x1);
        Double yToRad = Math.toRadians(y2 - y1);

        Double x1toRad = Math.toRadians(x1);
        Double x2toRad = Math.toRadians(x2);

        Double a = (Math.sin(xToRad/2) * Math.sin(xToRad/2)) + (Math.cos(x1toRad)* Math.cos(x2toRad)) * (Math.sin(yToRad/2) * Math.sin(yToRad/2));
        Double aSqrt = Math.sqrt(a);
        Double distance = (2 * 6371.0) * Math.asin(aSqrt);

        System.out.println(distance + " kilometers");
    }
}