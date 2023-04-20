package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x : sourceList) {
            if (x % 2 == 0) {
                hashSet.add(x);
                int y = x / 2;
                while (y % 2 == 0) {
                    hashSet.add(y);
                    y = y / 2;
                }
                hashSet.add(y);
            } else {
                hashSet.add(x);
                hashSet.add(2 * x);
            }
        }
        return hashSet;
    }
}

