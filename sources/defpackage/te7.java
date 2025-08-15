package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: te7  reason: default package */
public final class te7 implements qw0 {
    public final LinkedHashMap a;

    public te7(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(mz7.Z(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new se7(((Number) entry.getValue()).longValue()));
        }
        this.a = linkedHashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = defpackage.dae.e0(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ub8 e(java.lang.String r1) {
        /*
            android.net.Uri r1 = android.net.Uri.parse(r1)
            kj6 r0 = defpackage.ub8.a
            r0.getClass()
            java.lang.String r0 = "MediaItemType"
            java.lang.String r1 = r1.getQueryParameter(r0)
            if (r1 == 0) goto L_0x001c
            java.lang.Integer r1 = defpackage.dae.e0(r1)
            if (r1 == 0) goto L_0x001c
            int r1 = r1.intValue()
            goto L_0x001d
        L_0x001c:
            r1 = -1
        L_0x001d:
            ub8 r1 = defpackage.kj6.m(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te7.e(java.lang.String):ub8");
    }

    public final void a(gw0 gw0, ex0 ex0) {
        se7 se7 = (se7) this.a.get(e(ex0.a));
        if (se7 != null) {
            se7.a(gw0, ex0);
        }
    }

    public final void b(gw0 gw0, ex0 ex0) {
        se7 se7 = (se7) this.a.get(e(ex0.a));
        if (se7 != null) {
            se7.b(gw0, ex0);
        }
    }

    public final void c(gw0 gw0, String str, long j, long j2) {
        se7 se7 = (se7) this.a.get(e(str));
        if (se7 != null) {
            se7.c(gw0, str, j, j2);
        }
    }

    public final void d(gw0 gw0, ex0 ex0, vpd vpd) {
        a(gw0, ex0);
        b(gw0, vpd);
    }
}
