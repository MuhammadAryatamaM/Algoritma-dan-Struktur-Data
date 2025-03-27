package alsdJobsheet4;

public class Q5333 {
    int nilai;
    int pangkat;

    Q5333 (int a, int n) {
        nilai = a;
        pangkat = n;
    }

    public int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil = hasil * nilai;
        }
        return hasil;
    }
}