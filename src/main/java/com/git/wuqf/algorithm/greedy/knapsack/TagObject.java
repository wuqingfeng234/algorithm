package com.git.wuqf.algorithm.greedy.knapsack;

/**
 * 物品类
 */
public class TagObject {
    public TagObject(int weight, int price, int status) {
        this.weight = weight;
        this.price = price;
        this.status = status;
    }

    int weight;
    int price;
    int status;
}
