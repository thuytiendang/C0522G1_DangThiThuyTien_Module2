package ss12_map_treemap.exercise.arraylist_linkedlist_in_collection_framework.service.impl;

import ss12_map_treemap.exercise.arraylist_linkedlist_in_collection_framework.model.Product;

import java.util.Comparator;

public class DecreasingArrange implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice()-o1.getPrice());
    }
}
