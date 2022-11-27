import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("task_1");
        String str="буря мглою небо кроет вихри снежные крутя";
        String[] subStr;
        String delimeter = " ";
        subStr = str.split(delimeter);
        for(int i = 0; i < subStr.length; i++)
        {
            System.out.println(subStr[i]+'\t');
        }
        TreeMap<Integer,String> tm = new TreeMap<>();
        for(int i = 0; i < subStr.length; i++)
        {
            int leng=subStr[i].length();
           String a=tm.get(leng);
            if(a==null) {
                a = "";
            }
            tm.put(leng,subStr[i]+'\t'+a);
        }
        for (Map.Entry<Integer,String> entry : tm.entrySet()) {
            System.out.println("ключ: " + entry.getKey() + ". значение: " + entry.getValue());
        }
    }
}