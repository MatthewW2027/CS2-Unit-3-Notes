public class Main {

   public static void main(String []args) {
      String danny = "cool";
      // But Strings are actually OBJECTS 
      // The original way to create a String: 
      String steph = new String("GOAT"); 
      
      // All objects can be created using this pattern: 
      // ClassName objectName = new ClassName(); 
      BuildABear basicBear = new BuildABear(); 
      // "BuildABear basic bear" is DECLARING a variable of type BuildABear 
      // "New BuildABear()" is CALLING a CONSTRUCTOR to set up the object 
      
      // Look at our new object
      System.out.println(basicBear); 

      // Create a new object with our own values 
      // called the CONSTRUCTOR: ClassName(String, String, int)
      BuildABear teddyBear = new BuildABear("teddy bear", "blue bear", 70); 

      // Printing an OBJECT calls the CLASS' toString() method 
      System.out.println(teddyBear); 

      // Test our methods below, by CALLING them on an object instance 
      // GETTERS are NON-VOID (we need to handle output data) 
      System.out.println(teddyBear.getType()); 
      // or, store the return value in a variable 
      double price = teddyBear.getPrice(); 
      System.out.println(price); 

      // SETTERS are VOID (menas no return value) 
      // Calling void methods: objectName.methodName(); 

      teddyBear.setName("Yellow Bear");
      teddyBear.setFillLevel(60);
      // setters (mutators) changed values. Let's see the effects: 
      System.out.println(teddyBear); 

      // STATIC variables & methods belong to a CLASS 
      // get CALLED using the class name, NOT an object 
      BuildABear.showStore();
      // we've used static methods from the Math class!!!
      double randNum = Math.random();  
      // NOTE: the main method is STATIC becuase there is ONLY ONE COPY of it per program! 
      

   } // end MAIN METHOD 
} // and MAIN CLASS 
