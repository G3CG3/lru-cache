package gr.ggeorgiadis.lrucache;

public class LRUCacheDemo {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");
        System.out.println("Initial cache: " + cache);

        cache.get(1); // Access key 1
        cache.put(4, "Four"); // Evict least recently used (key 2)
        System.out.println("After accessing 1 and adding 4: " + cache);

        cache.get(3); // Access key 3
        cache.put(5, "Five"); // Evict key 1
        System.out.println("After accessing 3 and adding 5: " + cache);
    }
}
