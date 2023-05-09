/**
 * blatt1
 */
public class blatt1 {

    public static void main(String[] args) {

        //teste normiere
        double[] s = {1, 2, 3, 4, 5};
        double[] res = normiere(s);
        for (double d : res) {
            System.out.println("normiere: " + d);
        }
        
    }

    public static double[] normiere(double[] s) {
        double[] res = s;
        double sum = 0;

        for (double d : s) {
            sum += d;
        }

        for (int i = 0; i < res.length; i++) {
            res[i] /= sum;
        }        

        return res;
    }
}