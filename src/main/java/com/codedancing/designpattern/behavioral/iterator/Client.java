package com.codedancing.designpattern.behavioral.iterator;

public class Client {

    public static void main(String[] args) {
        Aggregate<String> degree = new ConcreteAggregate<>();
        degree.add("小学");
        degree.add("初中");
        degree.add("高中");
        degree.add("本科");
        degree.add("硕士");
        degree.add("博士");

        // 遍历
        Iterator iterator = degree.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
