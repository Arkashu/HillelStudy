public class MethodString {
    public static StringBuilder returnString() {
       StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=30; i++) {
            sb.append("(").append(i).append(")");
        }
        System.out.print(sb);
        return sb;
    }
}
