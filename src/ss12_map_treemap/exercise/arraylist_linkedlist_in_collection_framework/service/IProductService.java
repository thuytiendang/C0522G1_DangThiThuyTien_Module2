package ss12_map_treemap.exercise.arraylist_linkedlist_in_collection_framework.service;

public interface IProductService {
    void add();

    void setById(int id);

    void deleteById(int id);

    void show();

    void findByName(String name);

    void increasingArrange();

    void decreasingArrange();

    boolean findId(int id);

    boolean findName(String name);

}
