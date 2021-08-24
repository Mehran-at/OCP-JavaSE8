package advancedClassDesign._1one;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class BabyPandaBathManager {

    public static void await(CyclicBarrier cb) {
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            // Handle exception
        }
    }

    public static void main(String[] args) {
        final CyclicBarrier cb = new CyclicBarrier(3, () -> System.out.println("Clean!")); // u1
        ExecutorService service = Executors.newScheduledThreadPool(2);
        IntStream.iterate(1, i -> 1) // u2
                 .limit(12)
                 .forEach(i -> service.submit( // u3
                         () -> await(cb))); // u4
        service.shutdown();
    }
}
//  https://www.youtube.com/watch?v=gx_YUORX5vk
//  https://www.youtube.com/watch?v=V6LTKKTh_FA

/*
    A.  It outputs Clean! at least once.
    B.  It outputs Clean! four times.
    C.  The code will not compile because of line u1.
    D.  The code will not compile because of line u2.
    E.  The code will not compile because of line u3.
    F.  The code will not compile because of line u4.
    G.  It compiles but throws an exception at runtime.
    H.  It compiles but waits forever at runtime.   ✓
 */
/*
    The key to understand this code is to notice that our thread pool size is only 2, but our CyclicBarrier
    limit is 3. Even though 12 tasks are all successfully submitted to the thread executor service by way of the stream
    forEach() method, the first two tasks will use up both available threads and wait indefinitely. Since a third await()
    is never executed, the barrier is never broken and program hangs, making H correct answer. No output no exceptions
 */