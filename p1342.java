import java.util.*;

class p1342
 {
    public int numberOfSteps(int num) {
        int steps=0;
        while(num!=0){
        if(num%2==0){
           num= num/2;
        }
        else{
        num=num-1;
        }
        steps++;

        }
        return steps;
    }
    public static void main(String[] args) {
        // p1342 obj=new p1342();
        Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       p1342 obj=new p1342();
      int cont= obj.numberOfSteps( num);
      System.out.println(cont);

    }
    
}