package com.learn;

import org.apache.commons.collections4.CollectionUtils;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2023/5/6
 * @description : CollectionUtils.isNotEmpty 的示例代码
 *
 * CollectionUtils 的 isNotEmpty() 可用于检查列表是否为 null 而不用担心 null 列表。
 * 因此，在检查列表大小之前，不需要将无效检查放在任何地方
 */
public class TestCollectionUtils6 {
    public static void main(String[] args) {
        List<String> list = getList();
        System.out.println("Non-Empty List Check: " + checkNotEmpty1(list));
        System.out.println("Non-Empty List Check: " + checkNotEmpty2(list));
    }

    static List<String> getList() {
        return null;
    }

    static boolean checkNotEmpty1(List<String> list) {
        return !(list == null || list.isEmpty());
    }

    static boolean checkNotEmpty2(List<String> list) {
        return CollectionUtils.isNotEmpty(list);
    }
}
