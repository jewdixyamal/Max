package defpackage;

/* renamed from: m4g  reason: default package */
public final class m4g implements Comparable {
    public final int a;
    public final e4g b;

    public m4g(int i, e4g e4g) {
        this.a = i;
        this.b = e4g;
    }

    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((m4g) obj).a);
    }
}
