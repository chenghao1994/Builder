/**
 * Created with IntelliJ IDEA.
 * User: CH
 * Date: 14-4-9
 * Time: 上午12:21
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    /**
     * 姓名、年龄为必备参数
     */
    private final String name;
    private final int age;
    /**
     * 手机号、邮箱、身高为可选参数
     */
    private final String phone;
    private final String email;
    private final double hight;

    /*
    builder类用以初始化参数
     */
    public static class  builder {
        private final String name;
        private final int age;

        private String phone = "";
        private String email = "";
        private double hight = 0;

        public builder(String name,int age){
            this.name = name;
            this.age = age;
        }

        public builder phone(String phone){
            this.phone = phone; return this;
        }

        public builder email(String email){
            this.email = email; return this;
        }

        public builder hight(double hight){
            this.hight = hight; return this;
        }

        /*
        构造结束返回结果
         */
        public Person build(){
            return new Person(this);
        }
    }

    public Person(builder b){
        this.name = b.name;
        this.age = b.age;
        this.phone = b.phone;
        this.email = b.email;
        this.hight = b.hight;
    }


    public String toString(){
        return "Person["+" name:"+this.name+" age:"+this.age+" phone:"+this.phone+" email:"+this.email+" hight:"+this.hight+" ]";
    }

}
