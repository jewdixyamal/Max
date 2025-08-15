package defpackage;

/* renamed from: le4  reason: default package */
public final class le4 implements Comparable {
    public final boolean a;
    public final boolean b;

    public le4(int i, qy5 qy5) {
        this.a = (qy5.e & 1) == 0 ? false : true;
        this.b = vj0.n(i, false);
    }

    public final int compareTo(Object obj) {
        le4 le4 = (le4) obj;
        return aa3.a.d(this.b, le4.b).d(this.a, le4.a).f();
    }
}
