import java.util.HashSet;
import java.util.Iterator;

/**
 * Project name(项目名称)：Lambda表达式遍历Iterator迭代器
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/20
 * Time(创建时间)： 17:09
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        HashSet<String> p = new HashSet<>();
        p.add("第一个字符串");
        p.add("第二个字符串");
        p.add("第三个字符串");
        p.add("第四个字符串");
        p.add("第五个字符串");
        p.add("第六个字符串");
        p.add("第七个字符串");
        p.add("第八个字符串");
        p.add("第九个字符串");
        p.add("第十个字符串");
        System.out.println(p.size());
        Iterator it = p.iterator();
        it.forEachRemaining(s -> System.out.println(s));
    }
}
