package CreationalDPs;

import javax.imageio.stream.FileImageOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonDesignPattern implements Serializable {

    public String name ="venkat";
   static SingletonDesignPattern s = null;

    private SingletonDesignPattern(){

    }

   synchronized public static SingletonDesignPattern getSingletonObjct(){
        if(s==null)
             s=new SingletonDesignPattern();
        return s;
    }

    //Overriding the readResolve method
    Object readResolve(){
        return s;
    }


}
