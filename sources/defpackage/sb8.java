package defpackage;

/* renamed from: sb8  reason: default package */
public interface sb8 extends ol7 {
    boolean h(ol7 ol7) {
        if (!(ol7 instanceof sb8)) {
            return false;
        }
        sb8 sb8 = (sb8) ol7;
        return j() == sb8.j() && i() == sb8.i();
    }

    long i();

    long j();

    String x();
}
