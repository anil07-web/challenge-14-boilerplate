import java.util.Scanner;
import java.util.Arrays;
class Task14{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String []stn=new String[100];
        int []rl=new int[100];
        float []math=new float[100];
        float []sci=new float[100];
        float []eng=new float[100];
        float []lang=new float[100];
        float []ss=new float[100];
        float []total=new float[100];
        float []avg=new float[100];
        System.out.println("The number of students");
        int n=obj.nextInt();

        for(int i=0;i<n;i++){
        System.out.println("Enter the student name");
        stn[i]=obj.next();
        System.out.println("Enter the his/her Roll NUmber(2 digit)");
        rl[i]=obj.nextInt();
        System.out.println("Enter the his/her Marks in math");
        math[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in Science");
        sci[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in English");
        eng[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in Language");
        lang[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in Social Studies");
        ss[i]=obj.nextFloat(); 
        }
        
        int i=0;
        for(int j=0;j<n;j++){
        total[j]=(math[j]+sci[j]+eng[j]+lang[j]+ss[j]);
        avg[j]=total[j]/5;
        }
        for(int j=0;j<n;j++){
        if(avg[j]>=90)
        {     
        System.out.print("*");
        System.out.print("   ");
        }
        else{
        System.out.print("    ");
        }
        }
        System.out.println();
        for(int j=0;j<n;j++){
        if(avg[j]>=80)
        {     
        System.out.print("*");
        System.out.print("   ");
        }
        else{
        System.out.print("    ");
        }
        }
        System.out.println();
        for(int j=0;j<n;j++){
        if(avg[j]>=70)
        {     
        System.out.print("*");
        System.out.print("   ");
        }
        else{
        System.out.print("    ");
        }
        }
        System.out.println();
        for(int j=0;j<n;j++){
        if(avg[j]>=60)
        {     
        System.out.print("*");
        System.out.print("   ");
        }
        else{
        System.out.print("    ");
        }
        }
        System.out.println();
        for(int j=0;j<n;j++){
        if(avg[j]>=50)
        {     
        System.out.print("*");
        System.out.print("   ");
        }
        else{
        System.out.print("    ");
        }
        } 
        System.out.println();
        for(int j=0;j<n;j++){
        if(avg[j]>=40)
        {     
        System.out.print("*");
        System.out.print("   ");
        }
        else{
        System.out.print("    ");
        }
        }  
        System.out.println();
        for(int j=0;j<n;j++){
        if(avg[j]>=30)
        {     
        System.out.print("*");
        System.out.print("   ");
        }
        else{
        System.out.print("    ");
        }
        }
        System.out.println();
        for(int j=0;j<n;j++){
        if(avg[j]>=20)
        {     
        System.out.print("*");
        System.out.print("   ");
        }
        else{
        System.out.print("    ");
        }
        }
        System.out.println();
        for(int j=0;j<n;j++){
        if(avg[j]>=10)
        {     
        System.out.print("*");
        System.out.print("   ");
        }
        else{
        System.out.print("    ");
        }
        }
        System.out.println();
        for(int j=0;j<n;j++){
        System.out.print(rl[j]+"  ");
        }
     } 
 }
    

