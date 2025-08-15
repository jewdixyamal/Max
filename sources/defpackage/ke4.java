package defpackage;

/* renamed from: ke4  reason: default package */
public final class ke4 implements Comparable {
    public final boolean a;
    public final boolean b;

    public ke4(oy5 oy5, int i) {
        this.a = (oy5.o & 1) == 0 ? false : true;
        this.b = bf4.d(i, false);
    }

    public final int compareTo(Object obj) {
        ke4 ke4 = (ke4) obj;
        return aa3.a.d(this.b, ke4.b).d(this.a, ke4.a).f();
    }
}
