
public class StringAssignment2 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("This is StringBuffer");

        stringBuffer.append("- This is a sample program");
        System.out.println("After adding: " + stringBuffer);

        stringBuffer.insert(20, "Object ");
        System.out.println("After inserting 'Object' at 21st position: " + stringBuffer);

        stringBuffer.reverse();
        System.out.println("Reversed string: " + stringBuffer);

        int startIndex = stringBuffer.indexOf("B");
        int endIndex = startIndex + "Buffer".length();
        stringBuffer.replace(startIndex, endIndex, "Builder");
        System.out.println("After replacing 'Buffer' with 'Builder': " + stringBuffer);
    }
}
