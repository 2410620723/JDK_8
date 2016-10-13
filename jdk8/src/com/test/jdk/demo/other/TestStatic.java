package com.test.jdk.demo.other;

public class TestStatic {
    Person person = new Person("Test");
    static{
        System.out.println("test static");
    }
    public TestStatic() {
        System.out.println("test constructor");
    }
    public static void main(String[] args) {
        new MyClass();
        //test static
        //myclass static
        //person static
        //person Test
        //test constructor
        //person MyClass
        //myclass constructor
    }
}
class Person{
    static{
        System.out.println("person static");
    }
    public Person(String str) {
        System.out.println("person "+str);
    }
}
class MyClass extends TestStatic {
    Person person = new Person("MyClass");
    static{
        System.out.println("myclass static");
    }
    public MyClass() {
        System.out.println("myclass constructor");
    }
}
//����ִ�й��̡����ȼ���Test�࣬��˻�ִ��Test���е�static�顣����ִ��new MyClass()��
//��MyClass�໹û�б����أ������Ҫ����MyClass�ࡣ�ڼ���MyClass���ʱ�򣬷���MyClass��̳���Test�࣬
//��������Test���Ѿ��������ˣ�����ֻ��Ҫ����MyClass�࣬��ô�ͻ�ִ��MyClass����е�static�顣
//�ڼ�����֮�󣬾�ͨ�������������ɶ��󡣶������ɶ����ʱ�򣬱����ȳ�ʼ������ĳ�Ա��������˻�ִ��Test��
//��Person person = new Person()����Person�໹û�б����ع�����˻��ȼ���Person�ಢִ��Person���е�static�飬
//����ִ�и���Ĺ�����������˸���ĳ�ʼ����Ȼ�������ʼ�������ˣ���˻����ִ��MyClass�е�Person person = new Person()��
//���ִ��MyClass�Ĺ�������