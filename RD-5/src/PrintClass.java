public class PrintClass {
    public int toPrintInt = 1080;

    public String print(){
        String updatedValue = String.format("\"---<%d>---\"%n", toPrintInt);
        System.out.println (updatedValue);
        return updatedValue;
    }

}
