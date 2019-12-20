import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * Code related to toJson(Object SRC, Type typeOfSrc, Appendable writer)
 *
 * @author wangjie
 * @github iwangjie 345127857@qq.com
 */
public class Main {

    public static void main(String[] args) {

        // create a gson instance
        Gson gson = new Gson();
        // gets the interface type type object
        Type typeClass = Page.class;
        // create the implementation class object
        PageImpl<String> page = new PageImpl<String>();
        // attribute assignment(属性赋值)
        page.setName("Wangjie");
        page.setAge(10);
        page.setSex(1);
        // instance assignments are converted to interfaces
        Page<String> src = page;
        //   // convertJson Through the default {} is ok
        String toJsonForDefault = gson.toJson(src);
        System.out.println("toJsonForDefault:" + toJsonForDefault);


        // convertJson Page Interface Through the output stream response {} is erroneousResult
        gson.toJson(src, typeClass, System.out);
        // convertJson PageImpl Through the output stream response {}  is erroneousResult
        gson.toJson(page, typeClass, System.out);

    }
}
