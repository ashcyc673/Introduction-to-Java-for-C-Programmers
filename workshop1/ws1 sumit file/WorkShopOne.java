//==============================================
// Name:           Chiao-Ya Chang
// Student Number: 130402191
// Email:          cchang76@myseneca.ca
// Section:        JAC444 NDD
// Date:           01/20/2020
//==============================================
// Workshop:     1
//==============================================


import org.w3c.dom.ls.LSOutput;

public class WorkShopOne {

    public static int power(int base, int exp)
    {
        int result = 1;
        for(int i = 0; i < exp; i++)
        {
            result *= base;
        }
        return result;
    }

    public static void format(int number)
    {
        if(number < 10)
        {
            System.out.print("   ");
        }
        else if(number < 100)
        {
            System.out.print("  ");
        }else
        {
            System.out.print(" ");
        }
    }

    public static void main(String[] args)
    {
        int column = 1;
        int space = 29;

        for(int i = 1; i <= 8; i++)
        {
            int k = 0;
            for(int j = 1; j <= space; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= column; j++)
            {
                if(j <= i)
                {
                    k += 1;
                }else
                {
                    k -= 1;
                }
                int result = power(2, k - 1);
                if(j != 1)
                {
                    format(result);
                }
                System.out.print(result);
            }
            System.out.println();
            column += 2;
            space -= 4;
        }
    }
}


