package defpackage;

/* renamed from: n4g  reason: default package */
public final class n4g implements Comparable {
    public final int a;
    public final f4g b;

    public n4g(int i, f4g f4g) {
        this.a = i;
        this.b = f4g;
    }

    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((n4g) obj).a);
    }
}
