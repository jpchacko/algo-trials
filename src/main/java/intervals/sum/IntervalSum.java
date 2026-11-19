package intervals.sum;

import java.util.*;

public class IntervalSum {
    public long[] getDistances(int[] arr) {
        Map<Integer, List<Integer>> dists = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            dists.computeIfAbsent(arr[i], k-> new ArrayList()).add(i);
        }

        long[] distsArray = new long[arr.length];

        for(List<Integer> vals:dists.values()){
            int m = vals.size();
            long[] prefix = new long[vals.size()+1];
            for(int k=0;k<m;k++){
                prefix[k+1] = prefix[k] + vals.get(k);
            }

            for(int k=0;k<m;k++){
                long curr = vals.get(k);
                long leftSum = curr * k - prefix[k];
                long rightIndicesSum = prefix[m] - prefix[k+1];
                int rightCount = m-k-1;
                long rightSum = rightIndicesSum - curr * rightCount;
                distsArray[(int)curr] = leftSum+rightSum;
            }
        }
        return distsArray;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,3,2,1,5};
//        System.out.println(new IntervalSum().getDistances(arr));
//        for(Long n:new IntervalSum().getDistances(arr)){
//            System.out.println(n);
//        }
        Arrays.stream(new IntervalSum().getDistances(arr)).forEach(System.out::println);
    }
}


