# LRUCache

A simple Java console application demonstrating the use of inheritance, generics, and method overriding to implement an LRU (Least Recently Used) Cache.

## Overview

This project defines a generic `LRUCache<K, V>` class that extends `LinkedHashMap<K, V>` and overrides one method to enforce an LRU eviction policy.

The `LRUCacheDemo` main class creates an instance of the cache, inserts values, accesses them in different orders, and shows how the cache automatically removes the least recently used item when the capacity is exceeded.

## How to Run

- Compile the project in your IDE (e.g., IntelliJ, Eclipse)
- Run the LRUCacheDemo class
- Observe the console output showing how entries are managed based on recent access.

## Sample Output
> Initial cache: {1=One, 2=Two, 3=Three} <br>
> After accessing 1 and adding 4: {3=Three, 1=One, 4=Four} <br>
> After accessing 3 and adding 5: {1=One, 4=Four, 5=Five}

## Concepts Demonstrated
- Inheritance (LinkedHashMap subclassing)

- Method overriding (removeEldestEntry)

- Generics (<K, V>)

- Polymorphism (custom behavior through overridden methods)

- Encapsulation (private capacity field)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

Feel free to expand this project by adding thread-safety, time-based expiration, or other cache eviction strategies!