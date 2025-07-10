public class Ex1 {
    public static void main(String[] args) {
        int n = 5;
        name(1, n);
        num(1, n);
        func(n, n);
    }

    static void name(int i, int n) {
        if(i > n) {
            return;
        }
        System.out.println("Aruman Salik");
        name(i+1, n);
    }

    static void num(int i, int n) {
        if(i > n) {
            return;
        }
        System.out.println(i);
        num(i+1, n);
    }

    static void func(int i, int n){
        if(i<1) return;
        func(i-1,n);
        System.out.println(i);
    }
}
