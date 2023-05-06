package com.learn;

import org.apache.commons.collections4.CollectionUtils;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2023/5/6
 * @description : CollectionUtils.subtract 的示例代码
 *
 * CollectionUtils 的 subtract() 可用于通过从其他集合中减去一个集合的对象来获取新集合
 *
 */
public class TestCollectionUtils10 {
    public static void main(String[] args) {
        // checking inclusion
        List<String> list1 = Arrays.asList("A", "A", "A", "C", "B", "B");
        List<String> list2 = Arrays.asList("A", "A", "B", "B");

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("List 1 - List 2: " + CollectionUtils.subtract(list1, list2));
    }
}
