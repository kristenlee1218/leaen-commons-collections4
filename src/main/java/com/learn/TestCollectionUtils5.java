package com.learn;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2023/5/6
 * @description : CollectionUtils.filterInverse() 的示例代码
 *
 * CollectionUtils 的 filterInverse() 可用于过滤列表以移除满足谓词传递提供的条件的对象
 */
public class TestCollectionUtils5 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println("Original List: " + integerList);
        CollectionUtils.filterInverse(integerList, new Predicate<Integer>() {
            @Override
            public boolean evaluate(Integer input) {
                return input % 2 == 0;
            }
        });
        System.out.println("Filtered List (Odd numbers): " + integerList);
    }
}
