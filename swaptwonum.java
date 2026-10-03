public class swaptwonum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Old Value of A : "+a);
        System.out.println("Old Value of B : "+b);
        int temp = 10;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Update Value of A : "+a);
        System.out.println("Update Value of B : "+b);
    }
}
