public class Genre{
    // Function to check quadrant 
    static void checkGenre(char c) { 
        switch (c){
            case 'a':
                System.out.print("Action movie fan\n");
                break;
            case 'A':
                System.out.print("Action movie fan\n");
                break;
            case 'c':
                System.out.print("Comedy movie fan\n");
                break;
            case 'C':
                System.out.print("Comedy movie fan\n");
                break;
            case 'd':
                System.out.print("Drama movie fan\n");
                break;
            case 'D':
                System.out.print("Drama movie fan\n");
                break;
            default:
                System.out.print("Invalid choice");
                break;
        }
    } 
        
    // Driver Code 
    public static void main(String[] args) 
    {
        // Function Calling :
        // CASE 1 : A
        System.out.print("A : ");
        checkGenre('A');
        // CASE 2 : a
        System.out.print("a : ");
        checkGenre('a'); 
        // CASE 3 : D
        System.out.print("D : ");
        checkGenre('D'); 
        // CASE 4 : d
        System.out.print("d : ");
        checkGenre('d'); 
        // CASE 4 : C
        System.out.print("C : ");
        checkGenre('c'); 
        // CASE 5 : c
        System.out.print("c : ");
        checkGenre('c');
        // CASE 6 : Wrong input
        System.out.print("h : ");
        checkGenre('h'); 
    } 
}
