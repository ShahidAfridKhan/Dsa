package NewSet.dsa.java8.practiceproblems;
import java.util.*;
import java.util.stream.*;

/**
 * Theory Concepts: Java 8 Stream API
 * ===================================
 *
 * 1. STREAM CREATION
 *    - list.stream(): Creates a sequential stream from a Collection
 *    - Stream.of(), Arrays.stream(), IntStream.range(): Other ways to create streams
 *
 * 2. INTERMEDIATE OPERATIONS (lazy, return new stream)
 *    - sorted(): Natural ordering (requires Comparable), returns new sorted stream
 *    - sorted(Comparator): Custom ordering using Comparator
 *    - filter(Predicate): Keeps elements matching condition, drops others
 *    - map(Function): Transforms each element (one-to-one mapping)
 *    - limit(long): Truncates stream to first n elements (short-circuiting)
 *    - skip(long): Skips first n elements
 *    - distinct(): Removes duplicates (uses equals/hashCode)
 *
 * 3. TERMINAL OPERATIONS (eager, produce result/side-effect)
 *    - forEach(Consumer): Performs action for each element (order not guaranteed for parallel)
 *    - forEachOrdered: Guarantees encounter order
 *    - collect(Collector): Mutable reduction (toList, toSet, joining, groupingBy, etc.)
 *    - reduce: Immutable reduction (sum, min, max, custom)
 *    - count(): Returns element count
 *    - anyMatch/allMatch/noneMatch: Short-circuiting predicate checks
 *    - findFirst/findAny: Returns Optional
 *
 * 4. METHOD REFERENCES (::)
 *    - Class::staticMethod  ->  System.out::println
 *    - Class::instanceMethod  ->  String::toUpperCase
 *    - object::instanceMethod  ->  System.out::println
 *    - Class::new  ->  Constructor reference
 *
 * 5. COMPARATOR FACTORIES (Java 8+)
 *    - Comparator.reverseOrder(): Reverse of natural ordering
 *    - Comparator.naturalOrder(): Natural ordering
 *    - Comparator.comparing(keyExtractor): Sort by key
 *    - thenComparing(): Chain comparators
 *
 * 6. LAZY EVALUATION & PIPELINING
 *    - Intermediate ops don't execute until terminal op invoked
 *    - Operations fuse into single pass (loop fusion)
 *    - Short-circuiting ops (limit, findFirst) can stop early
 *
 * 7. PARALLEL STREAMS
 *    - list.parallelStream() or stream().parallel()
 *    - ForkJoinPool common pool used
 *    - Stateless, non-interfering ops required for correctness
 */

public class Scrap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60);

        // Basic sorting - natural order (ascending)
        // sorted() uses natural ordering (Integer implements Comparable)
        list.stream()
                .sorted()
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        // Reverse order using Comparator factory
        // Comparator.reverseOrder() returns Comparator<T> reversing natural order
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        // Note: These two streams are created but NOT consumed (no terminal op)
        // Intermediate ops are lazy - they won't execute without terminal op
        list.stream()
                .sorted();
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(i -> System.out.println(i + " "));

        // Improved version demonstrating stream pipeline:
        // 1. filter: Keep only n > 25  (30, 40, 50, 60)
        // 2. map: Transform n -> n * 2  (60, 80, 100, 120)
        // 3. sorted: Reverse order  (120, 100, 80, 60)
        // 4. limit: Take first 3  (120, 100, 80)
        // 5. forEach: Print each with method reference
        list.stream()
                .filter(n -> n > 25)
                .map(n -> n * 2)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
    }
}
