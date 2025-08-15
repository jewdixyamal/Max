package defpackage;

import java.util.HashMap;

/* renamed from: sjd  reason: default package */
public final class sjd extends bz {
    public final String X;
    public final String Y;
    public final String Z;
    public final long o;
    public final String s0;
    public final tva t0;
    public final bz u0;

    public sjd(long j, String str, String str2, String str3, String str4, tva tva, bz bzVar, boolean z, boolean z2) {
        super(b10.SHARE, z, z2);
        this.o = j;
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.s0 = str4;
        this.t0 = tva;
        this.u0 = bzVar;
    }

    public final HashMap a() {
        HashMap a = super.a();
        a.put("shareId", Long.valueOf(this.o));
        a.put("url", this.X);
        return a;
    }
}
