package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> firstCase = new HashSet<>(firstSet);
        firstCase.retainAll(secondSet);
        firstCase.removeAll(thirdSet);

        HashSet<String> tempSet = new HashSet<>(thirdSet);
        tempSet.removeAll(firstSet);
        tempSet.removeAll(secondSet);
        firstCase.addAll(tempSet);

        return firstCase;
    }
}
