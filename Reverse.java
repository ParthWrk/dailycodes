public class Reverse {

    int rev(int num){
        int rev=0;
        while(num!=0){
            int rem = num%10;
            num/=10;
            if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE && rem > 7)
                return 0;

            if(rev <Integer.MIN_VALUE /10 || rev == Integer.MIN_VALUE/10 && rem<-8)
                return 0;

            rev = rev*10 + rem;
        }
        return rev;
    }

    public static void main(String args[]){
        Reverse obj = new Reverse();
        int num = 1234;
        System.out.println("Reverse is- " + obj.rev(num));

    }

}
