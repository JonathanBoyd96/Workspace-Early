//*********************************************************
//
// Jonathan Boyd
// Project Four
// 
// ProjectFour.java
// Another Project
//
//**********************************************************

public class StudentAverage
{
   private String name;
   private double avg;
   public StudentAverage (String newname, double newavg)
   {
       name = newname;
       avg = newavg;
   }

   public String toString()
   {
       return (name + "\t" + avg);
   }
}