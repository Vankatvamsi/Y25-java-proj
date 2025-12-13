package com.skills;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// Abstract class
abstract class Statistics {
    protected int[] data;
    public Statistics(int[] data) {
        this.data = data;
    }
    // Abstract methods
    public abstract double mean();
    public abstract double median();
    public abstract int mode();
}
// Concrete subclass
class BasicStatistics extends Statistics {

    public BasicStatistics(int[] data) {
        super(data);
    }
    @Override
    public double mean() {
        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum / data.length;
    }
    @Override
    public double median() {
        Arrays.sort(data);
        int n = data.length;
        if (n % 2 == 0) {
            return (data[n/2 - 1] + data[n/2]) / 2.0;
        } else {
            return data[n/2];
        }
    }
    @Override
    public int mode() {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : data) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int mode = data[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }
}
// Demo class
public class S8StatisticsDemo {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 4, 9, 2, 4};
        BasicStatistics stats = new BasicStatistics(numbers);
        System.out.println("Mean: " + stats.mean());
        System.out.println("Median: " + stats.median());
        System.out.println("Mode: " + stats.mode());
    }
}