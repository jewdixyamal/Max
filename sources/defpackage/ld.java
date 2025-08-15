package defpackage;

/* renamed from: ld  reason: default package */
public final class ld {
    public static final ld b = new ld();
    public static final int c;
    public static final int d;
    public final ok4 a = new ok4(3);

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        c = availableProcessors + 1;
        d = (availableProcessors * 2) + 1;
    }
}
