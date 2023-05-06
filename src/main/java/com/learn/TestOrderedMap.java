package com.learn;

import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.map.LinkedMap;

/**
 * @author ：Kristen
 * @date ：2023/5/6
 * @description : OrderedMap 的示例代码
 *
 * OrderedMap 是映射的新接口，用于保留添加元素的顺序。LinkedMap 和 ListOrderedMap 是两种可用的实现。
 * 此接口支持 Map 的迭代器，并允许在 Map 中向前或向后两个方向进行迭代
 *
 */
public class TestOrderedMap {
    public static void main(String[] args) {
        OrderedMap<String, String> map = new LinkedMap<String, String>();
        map.put("One", "1");
        map.put("Two", "2");
        map.put("Three", "3");

        System.out.println(map.firstKey());
        System.out.println(map.nextKey("One"));
        System.out.println(map.nextKey("Two"));
    }
}
