package com.learn;

import org.apache.commons.collections4.CollectionUtils;
import java.util.LinkedList;
import java.util.List;

/**
* @author ：Kristen
* @date ：2023/5/6
* @description : CollectionUtils.addIgnoreNull 的实例代码
*
* 可用于确保只有非空（null）值被添加到集合中
*
*/
public class TestCollectionUtils1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        CollectionUtils.addIgnoreNull(list, null);
        CollectionUtils.addIgnoreNull(list, "a");
        System.out.println("list: " + list);
        if (list.contains(null)) {
            System.out.println("Null value is present");
        } else {
            System.out.println("Null value is not present");
        }
    }
}