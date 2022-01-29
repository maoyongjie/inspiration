import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * @auther MaoYongjie
 * @date 2021/8/30 9:19
 * @Description:
 */
public class StringFormatTest {
    @Test
    public void formatTest() {
        String userName = "XXX";
        String userProvince = "上海";
        int userAge = 21;
        String userSex = "男";
        String userInfo = String.format("%s_%s_%s_%s", userName, userProvince, userAge, userSex);
        System.out.println(userInfo);
    }



    @Test
    public void test1() {
        Integer i[] = fun1(1, 2, 3, 4, 5, 6);   // 返回泛型数组
        fun2(i);
    }

    public static <T> T[] fun1(T... arg) {  // 接收可变参数
        return arg;            // 返回泛型数组
    }

    public static <T> void fun2(T param[]) {   // 输出
        System.out.print("接收泛型数组：");
        for (T t : param) {
            System.out.print(t + "、");
        }
    }

    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<? extends Number> list = new ArrayList<>();

          //这样调用 add 方法只能存储整形，因为泛型类型的实例为 Integer

        list.getClass().getMethod("add", Object.class).invoke(list, "asd");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }


}
