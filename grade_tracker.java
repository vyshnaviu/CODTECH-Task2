import java.util.*;
public class studentgradechecker {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Let say there are n subjects
        System.out.print("Enter number of subjects : ");
        
        int number=sc.nextInt();
        System.out.println();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<number;i++)
        {
            System.out.print("Enter grade for subject"+(i+1)+" : ");
            a.add(sc.nextInt());
             System.out.println();
        }
        int total=total_grade(a);
        System.out.println("Total Grade : "+total);
        double average =average_grade(a);
        System.out.println("Average Grade : "+average);
        int high=highest_grade(a); 
        System.out.println("Highest Grade : "+high);
        int low=lowest_grade(a);
        System.out.println("Lowest Grade : "+low);
        System.out.println();
       if(total==-1)
       {
    	   System.out.println("Fail");
       }
       else
       {
    	   if(average>9.5)
           {
               System.out.println("GPA : "+average+"(A+)");
           }
           else if(average==9.5)
           {
               System.out.println("GPA : "+average+"(A)");
           }
            else if(average<9.5&& average>=9)
           {
               System.out.println("GPA : "+average+"(A-)");
           }
            else if(average<8.5 && average>=8)
           {
              System.out.println("GPA : "+average+"(B-)");
           }
            else if(average>8.5 )
           {
               System.out.println("GPA : "+average+"(B+)");
           }
            else if(average==8.5)
           {
               System.out.println("GPA : "+average+"(B+)");
           }
            else if(average>7.5)
           {
              System.out.println("GPA : "+average+"(C+)");
           }
            else if(average==7.5)
           {
              System.out.println("GPA : "+average+"(C)");
           }
            else if(average<7.5 && average>=7)
           {
               System.out.println("GPA : "+average+"(C-)");
           }
           else if(average>6.5)
           {
               System.out.println("GPA : "+average+"(D+)");
           }
            else if(average==6.5)
           {
               System.out.println("GPA : "+average+"(D)");
           }
            else if(average<6.5 && average>=6)
           {
               System.out.println("GPA : "+average+"(D-)");
           }
           else if(average>5.5)
           {
               System.out.println("GPA : "+average+"(E+)");
           }
            else if(average==5.5)
           {
             System.out.println("GPA : "+average+"(E)");
           }
            else if(average<5.5 && average >=5)
           {
               System.out.println("GPA : "+average+"(E-)");
           }
           else if(average<5)
           {
               System.out.println("GPA : "+average+"(Fail)");
           }
       }
        
        }
        public static double average_grade(ArrayList<Integer> a)
        {
            int sum=0;
            for(int i=0;i<a.size();i++)
            {
                sum+=a.get(i);
            }
            return (double)(sum/a.size());
            
        }
        public static int total_grade(ArrayList<Integer> a)
        {
            int sum=0;
            for(int i=0;i<a.size();i++)
            {
                if(a.get(i)<5)
                {
                	return -1;
                }
                else
                {
                	sum+=a.get(i);
                }
            }
            return sum;
        }
        public static int highest_grade(ArrayList<Integer> a)
        {
            Collections.sort(a);
            return a.get(a.size()-1);
        }
        public static int lowest_grade(ArrayList<Integer> a)
        {
            Collections.sort(a);
            return a.get(0);
        }
}
