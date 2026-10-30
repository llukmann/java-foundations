package org.example.basics.boxing;

public class Boxing {
    public void boxingUnboxing(Integer val) {
        //unboxing
        System.out.println(val + 1);

        //boxing
        int temp = 2;
        val = temp;
        System.out.println(val.getClass());

        //increment
        Integer val2 = val;
        System.out.println(val2);

        val++;
        System.out.println(val2);
    }
}
