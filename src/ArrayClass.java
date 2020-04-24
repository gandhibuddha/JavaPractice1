public class ArrayClass {
    public static void main(String[] args) {
        // An array is an object that stores a collection of values // Arrays can store two types of data:
        //A collection of primitive data types and A collection of objects
        // Creating an array involves three steps, as follows:
        // Declaring the array, Allocating the array and  Initializing the array elements
        int arrayName[] = new int[]{'a','b','c','1','2'};
        String objArray[] = new String[]{"Shreya","Paul"};
        System.out.println(arrayName);
        System.out.println(objArray);
        //Arrays are objects and refer to a collection of primitive data types or other objects.(same data type)
        int [] multiarray []; // 2 dimensional or multi dimensional array
        // no elements of an array are created when it’s declared, it’s invalid to define the size of an array with its declaration.
        //int [3] declarearray[2];  this line fails as no elements are created but we have given the size
        // An array type can be any of the following:
        // Primitive data type ,Interface ,Abstract class ,Concrete class
        // Arrays can be of any data type other than null.
        int arr[] []= new int[3][];
        System.out.println("this is "+arr);
        int intArray[]; // it is declaration
        intArray = new int[2]; // allocation
        for(int i=0;i<intArray.length;i++){
            intArray[i] = 4+i;      // initializing the loop
        }
        System.out.println(intArray[1]);
        int multidimArray[][];
        multidimArray = new int[2][2];
        for (int i=0;i<multidimArray.length;i++){
            for (int j=0;j<multidimArray.length;j++){
            multidimArray[i][j] = j+i;
                System.out.println(multidimArray[1][0]);
            }
        }
        String all3[] = new String[]{"apple","call","ball","doll"}; // creates an array of string and initializes
        all3[2] = null; // sets the value of array index 2 to null
        for (String val:all3) {
            System.out.println(val);
        }
        String ar[] = {"app","bpp"};
        int aw[] = {1,2};               // these 3 lines are single line declarations,allocations and initializations
        int multarra[][] = {{1,2},{3,4,5},{}}; // the length is 3
        System.out.println(multarra.length);
       // int intArray2[] = new int[2]{0, 1};  this line fails as When you combine an array declaration, allocation, and initialization in a single step, you can’t specify the size of the array.
        // The size of the array is calculated by the number of values that are assigned to the array.
        int intArray2[] = new int[]{0, 1};  // this is acceptable
        //  a multidimensional array can be asymmetrical. An array can define a different number of columns for each of its rows.
        String multiStrArr[][] = new String[][]{
                {"A", "B"},
                null,
                {"Jan", "Feb", "Mar"}};
        System.out.println(multiStrArr[2][2]);
        multiStrArr[2][2] = null;
        System.out.println(multiStrArr[2][2]);
        System.out.println(multiStrArr[1]);
    }
}

// If the type of an array is an abstract class, its elements are either null or objects of concrete classes that extend the relevant abstract class:
abstract class vehicle{
}
 class bus extends vehicle{ }
class car extends vehicle{ }
class execute{
    vehicle abstractArray[] = {new car(),new bus(),null}; // it means the array type can be abstract type, interface type
}
// String — Retrieve length using the method length()
// Array— Determine element count using the variable length
