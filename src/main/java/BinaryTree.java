package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryTree {

    public float median(Node root){
        float ret;
        ArrayList<Integer> array = getValuesArray(root);
        Collections.sort(array);
        int size = array.size();
        int index = size/2;
        if((size % 2) == 0){
            ret = ((float)array.get(index) + (float)array.get(index - 1))/2;
        }
        else{
            ret = (float)(array.get(index));
        }

        return ret;
    }

    public int sum(Node root){
        int sum = 0;
        ArrayList<Integer> array = getValuesArray(root);
        for (int item:array){
            sum += item;
        }

        return sum;
    }

    public float average(Node root){
        ArrayList<Integer> array = getValuesArray(root);
        int sum = sum(root);
        return (float)sum/array.size();
    }

    private ArrayList<Integer> getValuesArray(Node root){
        ArrayList<Integer> array = new ArrayList<>();
        if(root != null){
            array.add(root.getValue());
            array.addAll(getValuesArray(root.getLeft()));
            array.addAll(getValuesArray(root.getRight()));
        }
        return array;
    }
}
