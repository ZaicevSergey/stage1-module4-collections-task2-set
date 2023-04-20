package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);

        Set<String> uniqueThirdSetElements = new HashSet<>(thirdSet);
        uniqueThirdSetElements.removeAll(intersection);

        Set<String> result = new HashSet<>(intersection);
        result.removeAll(uniqueThirdSetElements);

        return result;
    }
}
