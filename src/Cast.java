import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Scanner;

public class Cast {
    public static  void main (String[] args) {
        //double a = 5.52;
        //int i = ;
        //i = (int) a;
       // final float PI = 3.1416f;
       // final double Latitude,Lontitude;
       // Latitude = 100.1254;
       // Lontitude = 99.1564;
       // System.out.printf("\\Value\t \"PI\"="+ PI +"\n");
       // System.out.printf("Latitude");
        //System.out.printf("Lontitude");


        //Scanner scan = new Scanner( System.in);
        //System.out.println("Enter Name");
        //String s = scan.next();
        //System.out.println(s);

        // value (0-1)

        //int dice1 = (int)(Math.random() *6)+1;
       // int dice2 = (int)(Math.random()*6)+1;
        //int dice3 = (int)(Math.random()*6)+1;
        //int rollcount;
       // rollcount = dice1+dice2+dice3;
        //System.out.println("ลูกที่1 : "+dice1);
        //System.out.println("ลูกที่2 : "+dice2);
        //System.out.println("ลูกที่3 : "+dice3);
        //if (rollcount>12){
        //    System.out.println(rollcount+"High");
        //}else if (rollcount == 11){
        //    System.out.println(rollcount+"Hi-ro");
        //}else {
        //    System.out.println(rollcount+"Low");
        //}
        // s = "15";
        //int d = Integer.parseInt(s);
        //System.out.println("Covert string to int ="+d*2);
        //s = Integer.toString(d);
        //System.out.println("convert int to String ="+s);
        //System.out.println("covert int to base 16 ="+Integer.toHexString(10));
        //System.out.println("covert int to base 8 ="+ Integer.toOctalString(10));
        //System.out.println("covert int to base 2 ="+Integer.toBinaryString(10));

      //  String login = "admin";
      //  boolean b = login.equals("admin");
        // System.out.println(b);
      //  b= !(1>2) || (3<4);
      //  System.out.println(b);


        //String s1 ="จริง";
       // String s2 ="ไม่จริง";
       // String s3;
        //s3= (1>5 )?   s1:s2;
        //System.out.println(s3);

        //boolean x=(1>0)? true:false;
        //String s = (2==0)?"Even":"odd";
        //System.out.println(s);

        Scanner scan=new Scanner(System.in);
        int withdraw;
        System.out.println("จำนวนเงินที่ถอน:");
        withdraw= scan.nextInt();
        int b1000 = (int)(withdraw/1000);
        int remain = withdraw%1000;

        int b500 = (int)(remain/500);
         remain = remain%500;
         int b100= (int)(remain/100);
        System.out.println("ธนบัตรที่ได้รับ");
        System.out.println("b1000:"+ b1000);
        System.out.println("b500:"+b500);
        System.out.println("b100:"+b100);



    }
}
