package com.java.com.java.learn.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: tianxiang.luo
 * Date: 2018-09-11 上午10:10
 */
public class Lamabda {

    public static void main(String[] args) {

    }

    public void sort(){
        List<Apple> apples = new ArrayList<>();
        apples.sort(Comparator.comparing(Apple::getWeight));
        System.out.println(apples);
    }


    static class Apple{
        private int weight;
        private String name;

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
