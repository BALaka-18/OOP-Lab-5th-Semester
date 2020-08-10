public class Quadrant{
    // Function to check quadrant 
    static void checkQuadrant(int x, int y) { 
        if ((x > 0 && y > 0) || (x == 0 && y > 0) || (x > 0 && y == 0) || (x == 0 && y == 0))
            System.out.println("Quadrant 1"); 
      
        else if ((x < 0 && y > 0) || (x == 0 && y > 0) || (x < 0 && y == 0))
            System.out.println("Quadrant 2"); 
      
        else if ((x < 0 && y < 0) || (x == 0 && y < 0) || (x < 0 && y == 0))
            System.out.println("Quadrant 3"); 
      
        else if ((x > 0 && y < 0) || (x == 0 && y < 0) || (x > 0 && y == 0))
            System.out.println("Quadrant 4");
    } 
        
    // Driver Code 
    public static void main(String[] args) 
    {
        // Function Calling(Hard coded inputs) :
        // CASE 1 : (1,1)
        System.out.print("(1,1) : ");
        checkQuadrant(1, 1);
        // CASE 2 : (-1,1)
        System.out.print("(-1,1) : ");
        checkQuadrant(-1, 1); 
        // CASE 3 : (-1,-1)
        System.out.print("(-1,-1) : ");
        checkQuadrant(-1, -1); 
        // CASE 4 : (1,-1)
        System.out.print("(1,-1) : ");
        checkQuadrant(1, -1); 
        // CASE 5 : (0,0)
        System.out.print("Origin(0,0) : ");
        checkQuadrant(0, 0); 
    } 
}
