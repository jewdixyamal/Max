package defpackage;

/* renamed from: xm8  reason: default package */
public abstract class xm8 implements ol7 {
    public final boolean h(ol7 ol7) {
        if (!(ol7 instanceof xm8)) {
            return false;
        }
        xm8 xm8 = (xm8) ol7;
        return j() == xm8.j() && i() == xm8.i();
    }

    public abstract long i();

    public abstract long j();
}
