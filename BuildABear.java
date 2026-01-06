/**
 * BuildABear.java defines the BuildABear CLASS 
 * which is a template for BuildABear OBJECTS 
 */
public class BuildABear {
    // 3. SECTIONS IN AN OBJECT-CLASS! 
    //1. INSTANCE VARIABLES (data/attributes/fields) 
    private String type; // just declare, don't assign 
    private String name; 
    private int fillLevel; 
    private double price; 
    private boolean hasSpeaker; 
    private String recording; 
    // ENCAPSULATION: keep variables PRIVATE they can't be directly acessed outside of this CLASS 

    // 2. CONSTRUCTORS (initialize values) 
    // DEFAULT CONSTRUCTOR does not take any arguments (no-arg) 
    // what gets called when user says "= new BuildABear()" 
    public BuildABear() {
        this.type = "bear"; // WE PICK the initial values 
        this.name = "danny"; 
        this.fillLevel = 75; 
        this.price = 150.00; 
        this.hasSpeaker = false; 
        this.recording = ""; 
    }
    // PARAMETERIZED CONSTRUCTOR allows user to provide args 
    // user PASSES initial values to the constructor call 
    public BuildABear(String t, String n, int fl) {
        this.type = t; // USER picked the value for type 
        this.name = n; 
        this.fillLevel = fl; 
        this.price = 150.00; 
        this.HasSpeaker = false; 
        this.recording = ""; 
    }

    // 3. METHODS (behaviors/actions) 

    // ACCESSORS ("getters") return the value of an instance var. 
    public String getType() {
        return type; 
    }
    public String getName() {
        return name; 
    }
    public int getFillLevel() {
        return fillLevel; 
    }
    public double getPrice() {
        return price; 
    }

}