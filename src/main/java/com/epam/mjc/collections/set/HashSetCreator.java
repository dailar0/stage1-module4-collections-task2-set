package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultSet = new HashSet<>();

        for (Integer integer : sourceList) {
            if (integer % 2 == 0) {
                resultSet.add(integer);
                int i = integer;
                do {
                    i = i / 2;
                    resultSet.add(i);
                } while (i % 2 == 0);
            } else {
                resultSet.add(integer);
                resultSet.add(2 * integer);
            }
        }

        return resultSet;
    }

}

