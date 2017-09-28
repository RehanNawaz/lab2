/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Random;
import java.util.Scanner;
import java.io.Serializable;
import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.util.logging.Level;
/**
 *
 * @author Shadow
 */
public class E_cafe {

    int price,hour,CookTime;
    public E_cafe()
    {
        price=0;
        CookTime=0;
    }
    

    public int CurrentTime()
    {
      Date date = new Date();   // given date
      Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
    calendar.setTime(date);   // assigns calendar to given date 
    hour=calendar.get(Calendar.HOUR_OF_DAY); // gets hour in 24h format
    return hour;
    }
    
    public void menu()
    {
        int order = 0;
        
        System.out.println("We have following dishes available, kindly select your order");
        System.out.println("1. Watermelon Salsa Rs100 \n2. Buffalo Chicken Dip  Rs100\n3. Pepper Poppers     Rs50\n4. Glazed Chicken Wings Rs250\n5. Quick and Fresh Gazpacho. The perfect hot-weather soup  Rs100");
        System.out.println("6.Slow Cooker Zucchini Soup Rs150 \n7.Garlic Chicken  Rs300 \n8.Chicken Marsala Rs300\n9.Maple Salmon Rs 200\n10.Easy Meatloaf Rs500 ");
        System.out.println("11.Chicken Enchiladas Rs 400\n12.Chicken Biryani Rs300 \n13.Potato, Squash & Goat Cheese Gratin Rs200 \n14.Super-Crispy Oven-Baked Asparagus Fries Rs100 \n15.Garlicky Roasted Broccoli Rs200\n 0. press 0 to finish");
        boolean i = true; 
        while(i)
        {
            if (i==true)
            {
                Scanner scan=new Scanner(System.in);
                order=scan.nextInt();
               switch(order) {
             case 1 :
                   price=price+100;
                   CookTime=CookTime+5;
                  break; // optional
   
            case 2 :
                price=price+100;
                CookTime=CookTime+10;
                 break; // optional
   
            case 3 :
                price=price+50;
                CookTime=CookTime+10;
                 break; // optional
   
            case 4 :
                price=price+250;
                CookTime=CookTime+15;
                 break; // optional
   
            case 5 :
                price=price+100;
                CookTime=CookTime+5;
                 break; // optional
   
            case 6 :
                price=price+150;
                CookTime=CookTime+5;
                 break; // optional
   
            case 7 :
                price=price+300;
                CookTime=CookTime+25;
                 break; // optional
   
            case 8 :
                price=price+300;
                CookTime=CookTime+25;
                 break; // optional
   
            case 9 :
                price=price+200;
                CookTime=CookTime+25;
                 break; // optional
   
            case 10 :
                price=price+500;
                CookTime=CookTime+30;
                 break; // optional
   
            case 11 :
                price=price+400;
                CookTime=CookTime+30;
                 break; // optional
   
            case 12 :
                price=price+300;
                CookTime=CookTime+15;
                 break; // optional
   
            case 13 :
                price=price+200;
                CookTime=CookTime+15;
                 break; // optional
   
            case 14 :
                price=price+100;
                CookTime=CookTime+10;
                 break; // optional
   
            case 15 :
                price=price+200;
                CookTime=CookTime+25;
                 break; // optional
                 
             default :
                 System.out.println("How would your like to take this order\n");
                 System.out.println("1. Pickup\n2. Home Delivery");
                 Scanner Deli=new Scanner(System.in);
                int Delivery = Deli.nextInt();
                if(Delivery==1)
                {
                    System.out.println("Cooking Time: "+CookTime+" minutes");
                    System.out.println("Please pay: Rs "+price);
                }
                else{
                    System.out.println("Cooking Time: "+CookTime+" minutes");
                 System.out.println("Please pay at your door: Rs "+price);
                 CookTime+=30;
                System.out.println("You will get your order in"+CookTime + " minutes");
                }              
                i=false;
                break;
            }     
            }                 
      }
    }
       
    public static void main(String[] args) {
      System.out.println("WELCOME TO ECAFE...!\n");
      int time;
        E_cafe O=new E_cafe();
        time=O.CurrentTime();
        if(time>10&&time<22)
        {
            System.out.println("Current time: "+O.CurrentTime());   
            O.menu();   
        }
        else
        {
              System.out.println("Current time: "+O.CurrentTime()+"00hrs");
              System.out.println("Sorry\n The café plans to stay open between 11:00am – 10:00pm, serving fast-food in between.");              
        }
    }
    
}
