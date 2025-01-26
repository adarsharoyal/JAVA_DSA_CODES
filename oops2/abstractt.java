// abstract method should be in abstract class 
// for abstract class no need of abstract method its not compulsory
// can't create object for abstarct class 
// all abstract methods must be difined in the derived class
//non abstract class is called concrete class 

abstract class car{
          public abstract  void drive ();{ 
            System.out.println("am ");   // this line deafultly print while after obj created
          }
          public void music(){
            System.out.println("play music ");
          }
}
class maruthi extends car{
    public void drive (){                  // drive method defined succefully
        System.out.println("driving ");
    }
}
public class abstractt {
   public static void main (String args[]) {
         maruthi obj = new maruthi();         //obj created for derived class
         obj.drive();
         obj.music();
        
   }
}
