package rolle.base;

/**
 * @author youze
 * on 2018/7/20
 */
public class Demo1 {
    public boolean equals(Demo1 demo1) {
        System.out.println(" use demo equals");
        return true;
    }

    public static void main(String[] args) {
        Object o1 = new Demo1();
        Object o2 = new Demo1();

        Demo1 o3 = new Demo1();
        Demo1 o4 = new Demo1();

        if (o1.equals(o2)) {
            System.out.println(" o1 is equals with o2");
        }
        if (o3.equals(o4)) {
            System.out.println("o3 is equals with o4");
        }
    }

    /**
     *上面程序的运行结果如下。
     * use Demo equals.
     * o3 is equal with o4.
     *
     *
     * 因为 Demo 类中的 public boolean equals(Demo other) 方法并没有重写 Object 类中的 public boolean equals(Object obj) 方法，原因是其违背了参数规则，其中一个是 Demo 类型而另一个是 Object 类型，因此这两个方法是重载关系（发生在编译时）而不是重写关系；故当调用 o1.equals(o2) 时，o2 是 Object 类型参数，实际上调用了 Object 类中的 public boolean equals(Object obj) 方法，因为在编译时 o1 和 o2 都是 Object 类型，而 Object 类的 equals 方法是通过比较内存地址才返回 false；当调用 o3.equals(o4) 时，实际上调用了 Demo 类中的 equals(Demo other) 方法，因为在编译时 o3 和 o4 都是 Demo 类型的，所以才有上面的打印。
     */


}
