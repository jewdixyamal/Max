package defpackage;

import android.os.Bundle;

/* renamed from: ghd  reason: default package */
public final class ghd implements b64 {
    public static final ghd a = new Object();
    public static final hhd b = hhd.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        fhd fhd;
        fhd fhd2;
        if (!b.a.contains(e64)) {
            return null;
        }
        hhd.b.getClass();
        if (e64.equals(hhd.c)) {
            fhd2 = fhd.b;
        } else if (e64.equals(hhd.d)) {
            fhd2 = fhd.c;
        } else if (e64.equals(hhd.e)) {
            fhd2 = fhd.o;
        } else if (e64.equals(hhd.f)) {
            String F = i24.F("mode", bundle);
            if (F.equals("setup")) {
                fhd2 = fhd.X;
            } else if (F.equals("confirm")) {
                fhd = new k41(i24.F("hash", bundle), 1);
                return new l64(str, e64, bundle, 0, (j64) null, fhd, 24);
            } else {
                throw new IllegalStateException("illegal mode".toString());
            }
        } else {
            hm9.p(ghd.class.getName(), "invalid route " + e64, new IllegalArgumentException("invalid route " + e64));
            return null;
        }
        fhd = fhd2;
        return new l64(str, e64, bundle, 0, (j64) null, fhd, 24);
    }
}
