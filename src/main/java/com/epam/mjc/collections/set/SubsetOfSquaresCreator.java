package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        return sourceList
                .stream()
                .map(integer -> integer * integer)
                .filter(integer -> integer >= lowerBound && integer <= upperBound)
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
