package cd.get.ready.algorithms;
import java.util.*;
import java.io.*;
public class WuTangForeverBuzz {

    public String wuTangClan(int value)
    {
        for(int i = 0; i < value; i++ )
        {
            if(value % 3 == 0)
            return "Wu" + String.valueOf(value);

            if(value % 5 == 0)
            return "Tang" + String.valueOf(value);

            if(value % 3 == 0 && value % 5 == 0)
             return "WuTang Forever" + String.valueOf(value);

            else{return String.valueOf(i+1) + String.valueOf(value);}
        }
        return String.valueOf(value);
    }
}
