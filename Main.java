public class Main {

    public static void main(String[] args) {
        // Input variables
        float x1 = 5;
        float x2 = 4;
        float x3 = -3;
        float y1 = 2;
        float y2 = 9;
        float y3 = 2;
        float z1 = -5;
        float z2 = 2;
        float z3 = 6;
        // Calculate the distance between 1 and 2
        double result1 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)+Math.pow((z2-z1),2));

        // Calculate the distance between 2 and 3
        double result2 = Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2)+Math.pow((z2-z3),2));

        //Calculate the distance between 1 and 3
        double result3 = Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2)+Math.pow((z1-z3),2));

        // Calculate the Max
        double max = Math.max(result1, Math.max(result2,result3));
        System.out.println("The maximum distance of these three points is\t" +max);

        //Calculate the Min
        double min= Math.min(result1, Math.max(result2, result3));
        System.out.println("The minimum distance of these three points is\t" +min);





    }
}
