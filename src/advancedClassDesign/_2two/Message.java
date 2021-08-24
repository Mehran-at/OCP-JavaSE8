package advancedClassDesign._2two;

public abstract class Message {

    public String recipient;
//    public abstract final void sendMessage();
    public abstract void sendMessage();

    public static void main(String[] args) {
        Message m = new TextMessage();
        m.recipient = "1234576";
        m.sendMessage();
    }
    static class TextMessage extends Message {
        public final void sendMessage() {
            System.out.println("Text message to " + recipient);
        }
    }
}
//      A. Text message to null.
//      B. Text message to 1234567890.
//      C. A compiler error on line 1.
//      D. A compiler error on line 3.  ✓
//      E. A compiler error on line 7.
//      F. A compiler error on another line.

/* The code does not compile because a method is not allowed to be abstract and final. If final removed, the answer would
    be B. An abstract class may contain an abstract method. A static nested class may extend other classes.
 */