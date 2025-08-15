package defpackage;

/* renamed from: zva  reason: default package */
public final class zva {
    public final ewa a;
    public final qv4 b;
    public final yva c;
    public final jc6 d;
    public cwa e;

    public zva(ewa ewa, qv4 qv4, yva yva, jc6 jc6, ov4 ov4, boolean z, boolean z2, boolean z3) {
        ewa ewa2 = ewa;
        qv4 qv42 = qv4;
        jc6 jc62 = jc6;
        this.a = ewa2;
        this.b = qv42;
        qv42.b = this;
        this.c = yva;
        ewa2.a.add(this);
        this.d = jc62;
        cwa cwa = new cwa(false, false, false, z, z2, false, z3);
        this.e = cwa;
        ewa.a(cwa);
        jc62.f(qv4, ov4, true);
        if (z && z2) {
            qv42.a.setDrawStickerEnabled(true);
            jc62.f(qv4, qv4.a(), false);
        }
    }
}
