package com.learn;

import org.apache.commons.collections4.CollectionUtils;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2023/5/6
 * @description : CollectionUtils.isEmpty 的示例代码
 *
 * CollectionUtils 的 isEmpty() 可用于检查列表是否为空。因此，在检查列表大小之前，不需要将无效检查放在任何地方
 *
 */
public class TestCollectionUtils7 {
    public static void main(String[] args) {
        List<String> list = getList();
        System.out.println("Empty List Check: " + checkEmpty1(list));
        System.out.println("Empty List Check: " + checkEmpty2(list));
    }

    static List<String> getList() {
        return null;
    }

    static boolean checkEmpty1(List<String> list) {
        return (list == null || list.isEmpty());
    }

    static boolean checkEmpty2(List<String> list) {
        return CollectionUtils.isEmpty(list);
    }
}
