package defpackage;

/* renamed from: je4  reason: default package */
public final class je4 extends xe4 implements Comparable {
    public final int X;
    public final int Y = this.o.b();

    public je4(int i, rze rze, int i2, oe4 oe4, int i3) {
        super(i, rze, i2);
        this.X = vj0.n(i3, oe4.t0) ? 1 : 0;
    }

    public final int a() {
        return this.X;
    }

    public final /* bridge */ /* synthetic */ boolean b(xe4 xe4) {
        je4 je4 = (je4) xe4;
        return false;
    }

    public final int compareTo(Object obj) {
        return Integer.compare(this.Y, ((je4) obj).Y);
    }
}
