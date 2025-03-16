package alsdJobsheet5;
public class MainQ5333 {
    public static void main(String[] args) {
        
        Q5333 op1 = new Q5333(2, 5);
        Q5333 op2 = new Q5333(3, 3);

        System.out.println("Hasil Pangkat (Operasi 1): " + op1.nilai + "^" + op1.pangkat + " = " + op1.pangkatBF());
        System.out.println("Hasil Pangkat (Operasi 2): " + op2.nilai + "^" + op2.pangkat + " = " + op2.pangkatBF());
    }
}