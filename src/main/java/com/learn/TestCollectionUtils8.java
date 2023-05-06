package com.learn;

import org.apache.commons.collections4.CollectionUtils;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2023/5/6
 * @description : CollectionUtils.isSubCollection 的示例代码
 *
 * CollectionUtils 的 isSubCollection() 可用于检查集合是否包含给定集合
 */
public class TestCollectionUtils8 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "A", "A", "C", "B", "B");
        List<String> list2 = Arrays.asList("A", "A", "B", "B");
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Is List 2 contained in List 1: " + CollectionUtils.isSubCollection(list2, list1));
    }
}
