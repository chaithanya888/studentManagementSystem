package com.Hospital.Management.System;


public class Frequency {
    int freq[] = new int[] {1, 2, 2, 3, 3, 3};

    public void findFrequency() {
        boolean visited[] = new boolean[freq.length]; 

        for (int i = 0; i < freq.length; i++) {
            if (visited[i]) {
                continue; 
            }

            int count = 1; 
            for (int j = i + 1; j < freq.length; j++) {
                if (freq[i] == freq[j]) {
                    count++;
                    visited[j] = true; 
                }
            }

            System.out.println(freq[i] + " occurs " + count + " times");
        }
    }

    public static void main(String[] args) {
        Frequency f = new Frequency();
        f.findFrequency();
    }
}

