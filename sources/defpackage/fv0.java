package defpackage;

import java.io.Serializable;

/* renamed from: fv0  reason: default package */
public final class fv0 implements Serializable {
    public final String X;
    public final boolean Y;
    public final long Z;
    public final String a;
    public final nv0 b;
    public final int c;
    public final String o;
    public final boolean s0;

    public fv0(cv0 cv0) {
        this.a = cv0.a;
        this.b = cv0.b;
        this.c = cv0.c;
        this.o = cv0.d;
        this.X = cv0.e;
        this.Y = cv0.f;
        this.s0 = cv0.g;
        this.Z = cv0.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fv0)) {
            return false;
        }
        fv0 fv0 = (fv0) obj;
        if (oag.d(this.a, fv0.a) && oag.d(this.X, fv0.X) && this.b == fv0.b && this.Y == fv0.Y && this.c == fv0.c && this.Z == fv0.Z) {
            return oag.d(this.o, fv0.o);
        }
        return false;
    }
}
