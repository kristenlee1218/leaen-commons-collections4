package com.learn;

import org.apache.commons.collections4.CollectionUtils;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2023/5/6
 * @description : CollectionUtils.union 的示例代码
 *
 * CollectionUtils 的 union() 可用于获取两个集合的联合
 *
 */
public class TestCollectionUtils11 {
    public static void main(String[] args) {
        // checking inclusion
        List<String> list1 = Arrays.asList("A", "A", "A", "C", "B", "B");
        List<String> list2 = Arrays.asList("A", "A", "B", "B");

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Union of List 1 and List 2: " + CollectionUtils.union(list1, list2));
    }
}
