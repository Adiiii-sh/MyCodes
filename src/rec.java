class Rec{
    int fib(int n){
        if(n==1){
            return 1;
        }else{
            return  n* fib(n-1);

        }
    }

}
public class rec {
    public static void main(String[] args) {
        Rec obj = new Rec();
        System.out.println(obj.fib(3));
    }
}
