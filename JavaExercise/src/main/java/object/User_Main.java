package object;

import java.util.HashSet;

/**
 * @author :qiang
 * @date :2019/10/17 下午11:13
 * @description : 对User类进行测试
 * @other :
 */
public class User_Main {

    static int i = 0;

    public static void method() {
        System.out.println("静态方法");
    }

    public static void main(String[] args) {

        //创建User类的对象
        User user1 = new User("yuqiang", 24);
        User user2 = new User("yuqiang", 24);

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user2));

        //创建set对象进行存储
        HashSet<User> hashSet = new HashSet<>();
        hashSet.add(user1);
        hashSet.add(user2);

        System.out.println("hashSet的元素个数：" + hashSet.size());
        //进行遍历
        for (User item : hashSet) {
            System.out.println(item.toString());
        }

        /**
         * 对象可以调用类的静态方法
         * 但是对象不可以调用静态变量
         */

        User_Main user_main = new User_Main();
        user_main.method();
        //user_main.i;//
    }

    /**
     * 结果：
     * 24
     * 24
     * true
     * hashSet的元素个数：1
     * name:yuqiang  age:24
     */
}
