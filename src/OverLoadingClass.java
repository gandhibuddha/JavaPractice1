public class OverLoadingClass {
    public static void takeNotes(int a, double b){

    }
    public static double takeNotes(double a, int b){
    return a;
    }
    public static int takeNotes(int a,int b,int c){
    return b;
    }
    public static void main(String[] args) {
        // overloading eg is u use takenotes() but using laptop or phone or book is ur wish
        // Overloaded methods are methods with the same name but different method parameter lists.
        System.out.println(takeNotes(2.5,3));
    }
}

class OverLoadingClass1 {
    public static void main(String[] args) {
        OverLoadingClass oc = new OverLoadingClass();
        System.out.println(oc.takeNotes(2,3,3));
    }
}
