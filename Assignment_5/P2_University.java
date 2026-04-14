/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_5;

class com_sic implements uni
{
    int seat;
    public void totalseat(int t)
    {
        seat=t;
    }
    public void admission()
    {
            System.out.println("\nComputer depa");
            System.out.println("total seat :"+seat);
    }
}

class bussiness implements uni
{
    int seat;
    public void totalseat(int t)
    {
        seat=t;
    }
    public void admission()
    {
            System.out.println("\nMBA depa");
            System.out.println("total seat :"+seat);
    }
}

class External implements uni
{
    int seat;
    public void totalseat(int t)
    {
        seat=t;
    }
    public void admission()
    {
            System.out.println("\n External depa");
            System.out.println("total seat :"+seat);
    }
}
public class P2_University {
    
    public static void main(String args[])
    {
        com_sic c1 = new com_sic();
        c1.totalseat(37);
        c1.admission();
        
         bussiness b1 = new bussiness();
        b1.totalseat(80);
        b1.admission();
        
        External e1 = new External();
        e1.totalseat(150);
        e1.admission();
        
        
    }    
    
}
