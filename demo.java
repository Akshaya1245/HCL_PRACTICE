public class demo {
    public static void main(String[] args) {
        float unit = 250;
        float r;

        if (unit <= 100) {
            System.out.print("0");
        } 
        else if (unit > 100 && unit <= 200) {
            r = (float)(unit * 0.8f);
            System.out.print(r);
        } 
        else if (unit > 200 && unit <= 300) {
            r = (float)(unit * 1.5f);
            System.out.print(r);
        } 
        else {
            r = (float)(unit * 3.0f);
            System.out.print(r);
        }
    }
}