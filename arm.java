public class armstrong {
    public static void main(String[] args) {
        int num=153;
        int copy=num;
        int temp;
        int count=0;
        int result=num;
        while (num>0) {
            temp=num%10;
            count = count +1;
            num=num/10;
        }
        int sum=0;
        while (copy>0) {
            temp=copy%10;
            sum=(int)(sum+Math.pow(temp,count));
            copy=copy/10;
        }
        if (result==sum) {
            System.out.println("arm");
        }
        else{
            System.out.println("not");
        }
}
}
