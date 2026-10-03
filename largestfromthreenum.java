public class largestfromthreenum {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 4;
        if(a > b && a > c){
            System.out.println("a is big");
        }
        else if(a > b && a == c){
            System.out.println("a and c are big");
        }
        else if (a == b && b > c){
            System.out.println("a and b are big");
        }
        else if(a < b && b > c){
            System.out.println("b is big");
        }
        else if(a < b && b == c){
            System.out.println("b and c are big");
        }
        else if(a > b && a < c){
            System.out.println("c is big");
        }
        else if(a < b && b < c){
            System.out.println("c is big");
        }
        else{
            System.out.println("a , b , c  are same");
        }
    }
}
