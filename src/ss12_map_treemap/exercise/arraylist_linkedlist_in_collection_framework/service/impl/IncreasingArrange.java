package ss12_map_treemap.exercise.arraylist_linkedlist_in_collection_framework.service.impl;

import ss12_map_treemap.exercise.arraylist_linkedlist_in_collection_framework.model.Product;

import java.util.Comparator;

public class IncreasingArrange implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice()-o2.getPrice());
    }
}
