//Autoboxing and unboxing occurs inside expressions.
public class AutoBox3 {
    public static void main(String[] args) {
        Integer iob,iob2;
        int i;
        iob=100;
        System.out.println("Original value of iob: "+iob);
        //The following automatically unboxes iob;
        //performs the increment, and then reboxes
        //the result back into iob
        ++iob;
        System.out.println("After ++iob: "+iob);
        //here, iob is unboxed, the expression is evaluate and the result is reboxed and assigned to iob2
        iob2=iob+(iob/3);
        System.out.println("iob2 after expression: "+iob2);
        //the same expression is evaluated but the result is not reboxed
        i=iob+(iob/3);
        System.out.println("i after expression: "+i);
    }
}
