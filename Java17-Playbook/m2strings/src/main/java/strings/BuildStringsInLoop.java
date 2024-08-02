package strings;

public class BuildStringsInLoop {

    public static void main(String[] args) {

//        for memory optimization use String builder
        var builder = new StringBuilder("abc").reverse();
        System.out.println(builder);

//        in mmutli threaded env use String buffer
        var buffer = new StringBuffer("abc").reverse();    // thread-safe
        System.out.println(buffer);

    }
}
