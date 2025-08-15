package defpackage;

/* renamed from: oec  reason: default package */
public final class oec {
    public static String a(n66 n66) {
        String obj = n66.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
