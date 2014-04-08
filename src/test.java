/**
 * Created with IntelliJ IDEA.
 * User: CH
 * Date: 14-4-9
 * Time: 上午12:38
 * To change this template use File | Settings | File Templates.
 */
public class test {
    public static void main(String[] args){
        String name = "王小山";
        int age = 26;
        Person person = new Person.builder(name,age).email("305959772@qq.com").phone("13500001111").hight(180.0).build();
        System.out.println(person);
    }
}
