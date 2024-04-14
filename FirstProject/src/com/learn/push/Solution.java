package com.learn.push;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static int maxSimultaneousRuntime(int[] apiRuntimes, int numOfApplications) {
        Arrays.sort(apiRuntimes);

        int minRuntime = apiRuntimes[0]; 
        int maxSimultaneousRuntime = Math.min(apiRuntimes.length, numOfApplications) * minRuntime;
        return maxSimultaneousRuntime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int apiSize = scanner.nextInt();

        int[] apiRuntimes = new int[apiSize];
        for (int i = 0; i < apiSize; i++) {
            apiRuntimes[i] = scanner.nextInt();
        }

        int numOfApplications = scanner.nextInt();

        System.out.println(maxSimultaneousRuntime(apiRuntimes, numOfApplications));

        scanner.close();
    }
}

