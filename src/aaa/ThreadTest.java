package aaa;

/**
 * projectName: Javasenior
 *
 * @author: 冯敬祥
 * time: 2020/11/19 19:17
 * description:多线程
 * 创建Thread的子类
 * 重写run方法
 * 创建Thread类的子类的对象
 * 通过此对象调用start()
 * 将此线程执行操作声明在run
 */
class MyThread extends Thread
{
    @Override
    public void run() {
        for(int i=0;i<100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        t1.start();
        System.out.println("hello");
    }
}
