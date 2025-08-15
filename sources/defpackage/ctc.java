package defpackage;

/* renamed from: ctc  reason: default package */
public final class ctc {
    public final String a;
    public final long b;
    public final boolean c;
    public final String d;

    public ctc(long j, String str, fs8 fs8, String str2) {
        this.a = fs8.Z;
        ng4 ng4 = fs8.D0;
        this.b = ng4 != null ? ng4.a : System.currentTimeMillis();
        this.c = fs8.X == wx8.o;
        Object i0 = x53.i0(fs8.s0);
        String str3 = null;
        tva tva = i0 instanceof tva ? (tva) i0 : null;
        if (tva != null) {
            String str4 = tva.x0;
            str3 = str4 == null ? tva.o : str4;
        }
        this.d = str3;
    }
}
