package Generics;

import java.util.Arrays;
import java.util.List;

public class Wildcard<T extends Number> {


        private Object[] data;
        private static int DEFAULT_SIZE=20;
        private int size=0;
        public Wildcard(){
            this.data=new Object[DEFAULT_SIZE];

        }


        //wildcard here we can pass only numbers
    public void getList(List<Number> list){
            // anything
    }
    //he we can add any sub classes under number such as float int etc.,
//    public void getList(List<? extends Number> list){
//        // anything
//    }

        public void add(int num){
            if (isFull()) {
                resize();
            }
            data[size++]=num;
        }

        private void resize() {
            Object[] temp=new Object[data.length*2];
            for (int i = 0; i < data.length; i++) {
                //here we wont cast bcoz in the obj we are adding data
                temp[i]=data[i];
            }
            data=temp;
        }

        private boolean isFull() {
            return size==data.length;
        }
        public T remove(){
            //but here we cast becoz it is the smaller or more restrictive type we are trying to add big so we cats
            T removed=(T)(data[--size]);
            return removed;
        }
        public T get(int index){
            return (T)(data[index]);
        }
        public int size(){
            return size;
        }
        public void set(int index,T value){
            data[index]=value;
        }
        public String toString(){

            return "CustomArrayList{" +
                    "data" + Arrays.toString(data) +
                    ",size:"+size+'}';

        }
        public static void main(String[] args) {

            Wildcard<Integer> list=new Wildcard<Integer>();
            for (int i = 0; i < 20; i++) {
                list.add(i*2);
            }
            System.out.println(list);
        }
    }


