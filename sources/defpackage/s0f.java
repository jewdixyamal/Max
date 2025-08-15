package defpackage;

/* renamed from: s0f  reason: default package */
public final class s0f implements Comparable {
    public final Runnable a;
    public final long b;
    public final int c;
    public volatile boolean o;

    public s0f(Runnable runnable, Long l, int i) {
        this.a = runnable;
        this.b = l.longValue();
        this.c = i;
    }

    public final int compareTo(Object obj) {
        s0f s0f = (s0f) obj;
        int compare = Long.compare(this.b, s0f.b);
        return compare == 0 ? Integer.compare(this.c, s0f.c) : compare;
    }
}
