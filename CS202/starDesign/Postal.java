package starDesign;

import java.util.Scanner;

public class Postal
{
    public int num2;    // 10000 digit
    public int num3;    // 1000 digit
    public int num4;    // 100 digit
    public int num5;    // 10 digit
    public int num6;    // 1 digit
    public int checkDig; // check digit
    public static int num;
    public static String temp;
    public static int menu;
    public static int zip;
    public static String bar0;
    public static String bar1;
    public static String bar2;
    public static String bar3;
    public static String bar4;
    public static String bar5;
    public static String bar6;
    public static String bar7;
    public static String bar8;
    public static String bar9;
    public static String str;
    public static int numb;

    public Postal()
    {
        zip = 0;

        bar0 = "||:::"; bar1 = ":::||"; bar2 = "::|:|";
        bar3 = "::||:"; bar4 = ":|::|"; bar5 = ":|:|:";
        bar6 = ":||::"; bar7 = "|:::|"; bar8 = "|::|:";
        bar9 = "|:|::";

    }

    public static int getZIP()
    {
        System.out.println("Enter a ZIP code : ");
        Scanner sc = new Scanner(System.in);
        zip = sc.nextInt();
        while((zip<01001)||(zip>99950))
        {
            System.out.println("**** ERROR ****");
            System.out.println("The ZIP code must be between 01001 and 99950");
            System.out.println("Please,enter the correct zip : ");
            zip = sc.nextInt();
        }
        return zip;
    }
    public static int menu()
    {
        System.out.println("**** Zip & Bar Code Convertor ****");
        System.out.println("Choose one option from following : ");
        System.out.println("1) Create ZIP barcode ");
        System.out.println("2) Find ZIP code from barcode ");
        System.out.println("3) Exit ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void getDigit(int num)
    {
        num2 = num/10000;
        num3 = ((num/1000)-num2*10);
        num4 = (num/100 - (num2*100 + num3*10));
        num5 = (num/10 -(num2*1000 + num3*100 + num4*10));
        num6 = (num - (num2*10000 + num3*1000 + num4*100 + num5*10));

        checkDig = 100- (num2+num3+num4+num5+num6);
        System.out.println(checkDig);

        while(checkDig>10)
        {   checkDig -= 10; }
        System.out.println("**** BARCODE ****");
        System.out.print("|");
        getBar(num2);
        getBar(num3);
        getBar(num4);
        getBar(num5);
        getBar(num6);
        getBar(checkDig);
        System.out.print("|");

    }
    public void getBar(int x)
    {

        switch(x)
        {
            case 0: System.out.print(bar0); break;
            case 1: System.out.print(bar1); break;
            case 2: System.out.print(bar2); break;
            case 3: System.out.print(bar3); break;
            case 4: System.out.print(bar4); break;
            case 5: System.out.print(bar5); break;
            case 6: System.out.print(bar6); break;
            case 7: System.out.print(bar7); break;
            case 8: System.out.print(bar8); break;
            case 9: System.out.print(bar9); break;
        }
    }
    public static String number()
    {
        System.out.println("Enter a barcode with using : or | ");
        Scanner scn = new Scanner(System.in);
        String bar = scn.nextLine();
        return bar;
    }

    public static void getNumber(String temp)
    {
        System.out.println("");
        System.out.println(temp);
        if(temp.equals(bar0))
        {
		numb = 0;
	}
        if(temp.equals(bar1))
        {
		numb = 1;
	}
        if(temp.equals(bar2))
        {
		numb = 2;
	}
        if(temp.equals(bar3))
        {
		numb = 3;
	}
        if(temp.equals(bar4))
        {
		numb = 4;
	}
        if(temp.equals(bar5))
        {
		numb = 5;
	}
        if(temp.equals(bar6))
        {
		numb = 6;
	}
        if(temp.equals(bar7))
        {
		numb = 7;
	}
        if(temp.equals(bar8))
        {
		numb = 8;
	}
        if(temp.equals(bar9))
        {
		numb = 9;
	}
        System.out.print(numb);
    }
    public static void divide(String temp)
    {
        Postal po = new Postal();
        str = temp.substring(1,6);
        po.getNumber(str);
        str = temp.substring(6,11);
        po.getNumber(str);
        str = temp.substring(11,16);
        po.getNumber(str);
        str = temp.substring(16,21);
        po.getNumber(str);
        str = temp.substring(21,26);
        po.getNumber(str);

    }

    public static void main(String[] args)
    {
        Postal pos = new Postal();
        while(menu != 3)
        {
            System.out.println();
            menu = pos.menu();
            switch (menu)
            {
                case 1:
                    num = pos.getZIP();
                    pos.getDigit(num);
                    System.out.println();
                    break;
                case 2:
                    temp = pos.number();
                    System.out.println(temp);
                    pos.divide(temp);
                    break;
                case 3:
                    break;
            }
        }
    }
}