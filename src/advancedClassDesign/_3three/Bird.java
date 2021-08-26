package advancedClassDesign._3three;

import java.io.*;

public class Bird implements Serializable { // line3

    private String name;
    private transient int age; // line5
    private Tail tail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Tail getTail() {
        return tail;
    }

    public void setTail(Tail tail) {
        this.tail = tail;
    }


    public static void main(String[] args) {
        try(InputStream is = new ObjectInputStream( //line16
                new BufferedInputStream(new FileInputStream("src/advancedClassDesign/_3three/resource/birds.dat")) //line17
            )
        ) {
//            Bird bird = is.readObject(); // line18
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//      A. It compiles and runs without issue.
//      B. The code will not compile because of line 3.
//      C. The code will not compile because of line 5.
//      D. The code will not compile because of lines 16-17.    ✓
//      E. The code will not compile because of line 18.    ✓
//      F. It compiles but throws an exception at runtime.

/*
    First off, the readObject() method is not available to the InputStream class, and since the ObjectInputStream has
    been upcast to InputStream, the code will not compile due to line 18, so E is correct.

    Line 18 will also not compile because the return type of readObject() is of type Object and must be cast explicitly
    to Main in order to be assigned to the Main reference.

    Furthermore, constructors and methods on lines 16, 17, and 18 throw checked IOException that must be caught, so D is
    also correct.

    Note that line 18 also throws ClassNotFoundException.

    Lines 3 and 5 compile without issue, so B and C are incorrect.

    It should be noted that even if the compilation problems were resolved, the code would still throw an exception at
    runtime since the Main class includes a Shape reference as a member, and the Shape class does not implement Serializable.
 */
/////////