package com.learn;

import org.apache.commons.collections4.CollectionUtils;
import java.util.Arrays;
import java.util.List;

/**
* @author ：Kristen
* @date ：2023/5/6
* @description : CollectionUtils.collate 的实例代码
*
* CollectionUtils 的 collate() 可用于合并两个已排序的列表
*/
public class TestCollectionUtils2 {
    public static void main(String[] args) {
        List<String> sortedList1 = Arrays.asList("A", "C", "E");
        List<String> sortedList2 = Arrays.asList("B", "D", "F");
        List<String> mergedList = CollectionUtils.collate(sortedList1, sortedList2);
        System.out.println(mergedList);
    }
}