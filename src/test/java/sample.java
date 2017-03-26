import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * Created by souptalla on 24/09/2016.
 */
public class sample {
    public static void main(String[] args) {

//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://google.com");

//        List al = new ArrayList<String>();
        HashMap<String,String> al = new HashMap<String, String>();
        al.put("name","soup");
        al.put("name","arnaud");

//        al.add("arnaud");
//        al.add("arnaud1");
//        al.add("arnaud2");
//        al.add("arnaud3");
//        al.add("arnaud4");

        printName(al);

    }

    public static void printName(HashMap<String,String> name){

        for (int i = 0; i <name.size() ; i++) {
            System.out.println(name.size());
            System.out.println(name);
        }

    }
}
