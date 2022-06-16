public class armstrong {

        public static void main(String[] args) {
int num = 153;
int num1 = num;
int r,s= 0;
while (num>0)
{
    r=num%10;
    s=s+r*r*r;
    num = num/10;
}

if(num1==s)
        System.out.println(num + "is an armstrong number");
else
    System.out.println(num + "is not an armstrong number");
}

}
