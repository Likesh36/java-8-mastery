package com.company.streams;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAvgSummarizing {
    public static void main(String[] args){
        Set<Integer> numSet = new HashSet<>();
        numSet.add(21);
        numSet.add(22);
        numSet.add(23);
        numSet.add(243);
        numSet.add(25);
        numSet.add(261);

        Double avg = numSet.stream().collect(Collectors.averagingInt(x->x));
        System.out.println(avg);

        IntSummaryStatistics summary = numSet.stream().collect(Collectors.summarizingInt(x->x));
        System.out.println(summary);
        System.out.println(summary.getAverage());
        System.out.println(summary.getMax());

        Set<Integer> numSet2 = new HashSet<>();
        numSet2.add(212);
        numSet2.add(225);
        numSet2.add(234);
        numSet2.add(243);
        numSet2.add(252);
        numSet2.add(261);

        IntSummaryStatistics summary2 = numSet2.stream().collect(Collectors.summarizingInt(x->x));
        summary.combine(summary2);//this should combine both the summary
        System.out.println(summary);//output for combined summary



    }
}
