package defpackage;

import android.os.Bundle;
import java.util.List;

/* renamed from: aed  reason: default package */
public final class aed extends ka1 {
    public static final aed f;
    public static final aed g = new aed(new eqe(kha.v), y53.M(new zdd(iha.n, new eqe(kha.t), false), new zdd(iha.o, new eqe(kha.u), false)), (wuc) null, (Bundle) null, 12);
    public static final aed h;
    public static final aed i;
    public static final aed j;
    public static final aed k = new aed(new eqe(kha.s), y53.M(new zdd(iha.k, new eqe(kha.r), true), new zdd(iha.j, new eqe(kha.q), false)), (wuc) null, (Bundle) null, 12);
    public static final aed l = new aed(new eqe(kha.z), y53.M(new zdd(iha.q, new eqe(kha.y), false), new zdd(iha.p, new eqe(kha.x), false)), (wuc) null, (Bundle) null, 12);
    public final jqe b;
    public final List c;
    public final wuc d;
    public final Bundle e;

    static {
        eqe eqe = new eqe(kha.w);
        wuc wuc = wuc.SETTINGS_PRIVACY_SAFE_MODE_ONLINE;
        int i2 = jpc.Q;
        f = new aed(eqe, y53.M(new zdd(iha.l, new eqe(i2), false), new zdd(iha.m, new eqe(jpc.G1), false)), wuc, (Bundle) null, 8);
        eqe eqe2 = new eqe(kha.p);
        wuc wuc2 = wuc.SETTINGS_PRIVACY_SAFE_MODE_CALLS;
        int i3 = jpc.b;
        h = new aed(eqe2, y53.M(new zdd(iha.h, new eqe(i3), false), new zdd(iha.i, new eqe(i2), false)), wuc2, (Bundle) null, 8);
        i = new aed(new eqe(kha.A), y53.M(new zdd(iha.r, new eqe(i3), false), new zdd(iha.s, new eqe(i2), false)), wuc.SETTINGS_PRIVACY_SAFE_MODE_SEARCH_BY_PHONE, (Bundle) null, 8);
        j = new aed(new eqe(kha.o), y53.M(new zdd(iha.f, new eqe(i3), false), new zdd(iha.g, new eqe(i2), false)), wuc.SETTINGS_PRIVACY_SAFE_MODE_INVITE, (Bundle) null, 8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aed(jqe jqe, List list, wuc wuc, Bundle bundle, int i2) {
        super(12);
        wuc = (i2 & 4) != 0 ? null : wuc;
        bundle = (i2 & 8) != 0 ? null : bundle;
        this.b = jqe;
        this.c = list;
        this.d = wuc;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aed)) {
            return false;
        }
        aed aed = (aed) obj;
        return tpa.f(this.b, aed.b) && tpa.f(this.c, aed.c) && this.d == aed.d && tpa.f(this.e, aed.e);
    }

    public final int hashCode() {
        int g2 = k7d.g(this.c, this.b.hashCode() * 31, 31);
        int i2 = 0;
        wuc wuc = this.d;
        int hashCode = (g2 + (wuc == null ? 0 : wuc.hashCode())) * 31;
        Bundle bundle = this.e;
        if (bundle != null) {
            i2 = bundle.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ", statScreen=" + this.d + ", payload=" + this.e + ")";
    }
}
