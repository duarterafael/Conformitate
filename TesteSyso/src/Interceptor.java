import java.io.OutputStream;
import java.io.PrintStream;


public class Interceptor extends PrintStream
{
    public Interceptor(OutputStream out)
    {
        super(out, true);
        
    }
    @Override
    public void print(String s)
    {//do what ever you like
        super.print(s);
//        System.out.println("--------->"+s);
    }
}