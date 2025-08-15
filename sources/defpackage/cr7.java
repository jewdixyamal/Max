package defpackage;

import java.util.HashMap;
import java.util.List;

/* renamed from: cr7  reason: default package */
public final class cr7 extends bz {
    public final long X;
    public final long Y;
    public final long Z;
    public final er7 o;
    public final List s0;
    public final String t0;
    public final float u0;
    public final boolean v0;

    public cr7(er7 er7, long j, long j2, long j3, List list, String str, float f, boolean z, boolean z2, boolean z3) {
        super(b10.LOCATION, z2, z3);
        this.o = er7;
        this.X = j;
        this.Y = j2;
        this.Z = j3;
        this.s0 = list;
        this.t0 = str;
        this.v0 = z;
        this.u0 = f;
    }

    public final HashMap a() {
        HashMap a = super.a();
        er7 er7 = this.o;
        a.put("latitude", Double.valueOf(er7.a));
        a.put("longitude", Double.valueOf(er7.b));
        long j = this.X;
        if (j > 0) {
            a.put("livePeriod", Long.valueOf(j));
        }
        float f = this.u0;
        if (f > 0.0f) {
            a.put("zoom", Float.valueOf(f));
        }
        double d = er7.c;
        if (d != 0.0d) {
            a.put("alt", Double.valueOf(d));
        }
        float f2 = er7.o;
        if (f2 != 0.0f) {
            a.put("epu", Float.valueOf(f2));
        }
        float f3 = er7.X;
        if (f3 != 0.0f) {
            a.put("hdn", Float.valueOf(f3));
        }
        float f4 = er7.Y;
        if (f4 != 0.0f) {
            a.put("spd", Float.valueOf(f4));
        }
        return a;
    }
}
