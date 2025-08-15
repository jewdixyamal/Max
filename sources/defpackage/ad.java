package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ad  reason: default package */
public final class ad {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public ad(je7 je7, je7 je72, je7 je73) {
        this.a = je73;
        this.b = je7;
        this.c = je72;
    }

    public final js7 a() {
        return (js7) this.b.getValue();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [e47, java.lang.Object] */
    public final void b(String str, Map map) {
        if (!a().c()) {
            ? obj = new Object();
            obj.a = System.currentTimeMillis();
            obj.c = "PUSH";
            obj.o = str;
            obj.b(mz7.d0(map));
            j(obj.c());
        }
    }

    public final void c(kt7 kt7, q33 q33, ri4 ri4) {
        fs8 fs8;
        if (!a().c() && ((xe6) ((ti4) ri4).g).a()) {
            long currentTimeMillis = System.currentTimeMillis();
            hyc hyc = (hyc) q33;
            long j = hyc.g.getLong("app.last.firebase_push_time", 0);
            if (j == 0) {
                hyc.l("app.last.firebase_push_time", Long.valueOf(currentTimeMillis));
            } else if (currentTimeMillis - j >= 86400000) {
                boolean z = false;
                for (f52 f52 : kt7.o) {
                    if (!(f52.w0 == 0 || (fs8 = f52.t0) == null)) {
                        long j2 = fs8.b;
                        if (j2 > j && j2 < currentTimeMillis - (86400000 / ((long) 2))) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    String str = Build.MANUFACTURER;
                    if (str == null || str.length() == 0) {
                        str = "UNKNOWN";
                    }
                    g("FIREBASE_PUSH_SKIPPED", str);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [qpd, java.util.Map] */
    public final void d(int i, String str) {
        if (!a().c()) {
            Integer valueOf = Integer.valueOf(i);
            ? qpd = new qpd(1);
            qpd.put("value", valueOf);
            if (oag.t("ACTION") || oag.t(str)) {
                throw new IllegalArgumentException("type or event can't be empty");
            } else if (qpd.c <= 10) {
                j(new ms7(System.currentTimeMillis(), 0, 0, "ACTION", str, qpd));
            } else {
                throw new IllegalArgumentException("params can't be greater than limit = 10");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [e47, java.lang.Object] */
    public final void e(long j, String str, String str2) {
        if (!a().c()) {
            ? obj = new Object();
            obj.c = "ACTION";
            obj.o = str;
            obj.a(Long.valueOf(j), "duration");
            if (str2 != null) {
                obj.a(str2, "value");
            }
            j(obj.c());
        }
    }

    public final void f(String str) {
        if (!a().c()) {
            if (oag.t("ACTION") || oag.t(str)) {
                throw new IllegalArgumentException("type or event can't be empty");
            }
            j(new ms7(System.currentTimeMillis(), 0, 0, "ACTION", str, (Map) null));
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [qpd, java.util.Map] */
    public final void g(String str, String str2) {
        if (!a().c()) {
            ? qpd = new qpd(1);
            qpd.put("value", str2);
            if (oag.t("ACTION") || oag.t(str)) {
                throw new IllegalArgumentException("type or event can't be empty");
            } else if (qpd.c <= 10) {
                j(new ms7(System.currentTimeMillis(), 0, 0, "ACTION", str, qpd));
            } else {
                throw new IllegalArgumentException("params can't be greater than limit = 10");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [e47, java.lang.Object] */
    public final void h(String str, HashMap hashMap) {
        if (!a().c()) {
            ? obj = new Object();
            obj.c = "ACTION";
            obj.o = str;
            obj.b(hashMap);
            j(obj.c());
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [qpd, java.util.Map] */
    public final void i(long j, String str) {
        if (!a().c()) {
            Long valueOf = Long.valueOf(j);
            ? qpd = new qpd(1);
            qpd.put("duration", valueOf);
            if (oag.t("ACTION") || oag.t(str)) {
                throw new IllegalArgumentException("type or event can't be empty");
            } else if (qpd.c <= 10) {
                j(new ms7(System.currentTimeMillis(), 0, 0, "ACTION", str, qpd));
            } else {
                throw new IllegalArgumentException("params can't be greater than limit = 10");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [e47, java.lang.Object] */
    public final boolean j(ms7 ms7) {
        if (a().c()) {
            return false;
        }
        long j = ms7.b;
        if (j == 0) {
            ? obj = new Object();
            obj.a = ms7.a;
            obj.b = j;
            obj.c = ms7.c;
            obj.o = ms7.d;
            obj.X = ms7.f;
            obj.b(ms7.e);
            obj.b = ((hyc) ((q33) this.a.getValue())).t();
            ms7 = obj.c();
        }
        js7 a2 = a();
        if (a2.c()) {
            return true;
        }
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, "LogController", "store " + ms7, (Throwable) null);
        }
        ix ixVar = a2.Z;
        if (((AtomicBoolean) ixVar.k).get()) {
            kld kld = (kld) ixVar.j;
            if (((Number) ((yae) kld.i()).getValue()).intValue() != 0) {
                kld.g(ms7);
                return true;
            }
        }
        ((CopyOnWriteArrayList) ixVar.m).add(ms7);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r2 = a().f(true, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(defpackage.ms7 r3, kotlin.coroutines.Continuation r4) {
        /*
            r2 = this;
            js7 r0 = r2.a()
            boolean r0 = r0.c()
            e5f r1 = defpackage.e5f.a
            if (r0 == 0) goto L_0x000d
            return r1
        L_0x000d:
            boolean r3 = r2.j(r3)
            if (r3 == 0) goto L_0x0021
            js7 r2 = r2.a()
            r3 = 1
            java.lang.Object r2 = r2.f(r3, r4)
            tx3 r3 = defpackage.tx3.a
            if (r2 != r3) goto L_0x0021
            return r2
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad.k(ms7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [qpd, java.util.Map] */
    public final void l(long j, String str) {
        if (!a().c() && str.length() != 0) {
            Long valueOf = Long.valueOf(j);
            ? qpd = new qpd(1);
            qpd.put("duration", valueOf);
            if (oag.t("SCREEN") || oag.t(str)) {
                throw new IllegalArgumentException("type or event can't be empty");
            } else if (qpd.c <= 10) {
                j(new ms7(System.currentTimeMillis(), 0, 0, "SCREEN", str, qpd));
            } else {
                throw new IllegalArgumentException("params can't be greater than limit = 10");
            }
        }
    }
}
