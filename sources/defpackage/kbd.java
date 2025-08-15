package defpackage;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: kbd  reason: default package */
public final class kbd {
    public final Context a;
    public final Object b = new Object();
    public final l7b c = new l7b((k56) new ie(7, (Object) this));
    public volatile boolean d;
    public final long e = System.currentTimeMillis();
    public yie f;
    public long g = Long.MIN_VALUE;
    public yie h;
    public long i = Long.MIN_VALUE;
    public List j = nz4.a;
    public volatile fbd k;
    public volatile fbd l;

    public kbd(Context context) {
        this.a = context;
    }

    public static void d(kbd kbd, int i2, boolean z, bjd bjd, int i3) {
        fbd fbd = null;
        if ((i3 & 1) != 0) {
            fbd fbd2 = kbd.k;
            if (fbd2 == null) {
                fbd2 = null;
            }
            i2 = fbd2.f;
        }
        if ((i3 & 2) != 0) {
            fbd fbd3 = kbd.k;
            if (fbd3 == null) {
                fbd3 = null;
            }
            z = fbd3.h;
        }
        if ((i3 & 4) != 0) {
            fbd fbd4 = kbd.k;
            if (fbd4 == null) {
                fbd4 = null;
            }
            bjd = fbd4.g;
        }
        synchronized (kbd.b) {
            kbd.b();
            fbd fbd5 = kbd.k;
            if (fbd5 == null) {
                fbd5 = null;
            }
            kbd.k = fbd.a(fbd5, i2, bjd, z, 31);
            List d0 = x53.d0(1, kbd.j);
            fbd fbd6 = kbd.k;
            if (fbd6 != null) {
                fbd = fbd6;
            }
            ArrayList u0 = x53.u0(d0, fbd);
            kbd.j = u0;
            kbd.c.k(xfg.C(u0).toString(), "session_states");
            kbd.c.m();
        }
    }

    public final void a() {
        synchronized (this.b) {
            b();
            this.i = this.e;
            this.j = Collections.singletonList(x53.p0(this.j));
            this.c.k(Long.valueOf(this.i), "session_state_upload_ts");
            this.c.k(xfg.C(this.j).toString(), "session_states");
            this.c.m();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00c1 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd A[SYNTHETIC, Splitter:B:32:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0100 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010b A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0121 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0122 A[Catch:{ all -> 0x002e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.d
            if (r0 != 0) goto L_0x014c
            java.lang.Object r0 = r15.b
            monitor-enter(r0)
            boolean r1 = r15.d     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x0148
            l7b r1 = r15.c     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "session_start_ts"
            java.lang.Object r1 = r1.b     // Catch:{ all -> 0x002e }
            khe r1 = (defpackage.khe) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x002e }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x002e }
            r2 = -9223372036854775808
            if (r1 == 0) goto L_0x0031
            long r4 = r1.longValue()     // Catch:{ all -> 0x002e }
            goto L_0x0032
        L_0x002e:
            r15 = move-exception
            goto L_0x014a
        L_0x0031:
            r4 = r2
        L_0x0032:
            r15.g = r4     // Catch:{ all -> 0x002e }
            l7b r1 = r15.c     // Catch:{ all -> 0x002e }
            java.lang.String r4 = "session_system_state"
            java.lang.Object r1 = r1.b     // Catch:{ all -> 0x002e }
            khe r1 = (defpackage.khe) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x002e }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x002e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x002e }
            r4 = 0
            if (r1 != 0) goto L_0x0053
        L_0x0051:
            r1 = r4
            goto L_0x0057
        L_0x0053:
            yie r1 = defpackage.j47.C(r1)     // Catch:{ Exception -> 0x0051 }
        L_0x0057:
            r15.h = r1     // Catch:{ all -> 0x002e }
            android.content.Context r1 = r15.a     // Catch:{ all -> 0x002e }
            yie r1 = defpackage.nd7.l(r1)     // Catch:{ all -> 0x002e }
            yie r5 = r15.h     // Catch:{ all -> 0x002e }
            if (r5 == 0) goto L_0x0066
            java.util.Map r5 = r5.m     // Catch:{ all -> 0x002e }
            goto L_0x0067
        L_0x0066:
            r5 = r4
        L_0x0067:
            if (r5 == 0) goto L_0x007a
            java.util.Map r6 = r1.m     // Catch:{ all -> 0x002e }
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch:{ all -> 0x002e }
            r7.<init>(r5)     // Catch:{ all -> 0x002e }
            r7.putAll(r6)     // Catch:{ all -> 0x002e }
            r5 = 12287(0x2fff, float:1.7218E-41)
            r6 = 0
            yie r1 = defpackage.yie.a(r1, r6, r7, r5)     // Catch:{ all -> 0x002e }
        L_0x007a:
            r15.f = r1     // Catch:{ all -> 0x002e }
            l7b r1 = r15.c     // Catch:{ all -> 0x002e }
            java.lang.String r5 = "session_state_upload_ts"
            java.lang.Object r1 = r1.b     // Catch:{ all -> 0x002e }
            khe r1 = (defpackage.khe) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x002e }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x002e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x009c
            long r2 = r1.longValue()     // Catch:{ all -> 0x002e }
        L_0x009c:
            r15.i = r2     // Catch:{ all -> 0x002e }
            l7b r1 = r15.c     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "session_states"
            java.lang.Object r1 = r1.b     // Catch:{ all -> 0x002e }
            khe r1 = (defpackage.khe) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x002e }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x002e }
            nz4 r2 = defpackage.nz4.a     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x00bd
            goto L_0x00c1
        L_0x00bd:
            java.util.ArrayList r2 = defpackage.xfg.l(r1)     // Catch:{ Exception -> 0x00c1 }
        L_0x00c1:
            yie r1 = r15.f     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x00c6
            r1 = r4
        L_0x00c6:
            fbd r3 = new fbd     // Catch:{ all -> 0x002e }
            java.util.Map r5 = r1.m     // Catch:{ all -> 0x002e }
            java.lang.String r6 = "processName"
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x002e }
            r11 = r5
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x002e }
            long r6 = r1.b     // Catch:{ all -> 0x002e }
            java.lang.String r8 = r1.a     // Catch:{ all -> 0x002e }
            java.lang.String r9 = r1.d     // Catch:{ all -> 0x002e }
            java.lang.String r10 = r1.f     // Catch:{ all -> 0x002e }
            boolean r14 = r1.k     // Catch:{ all -> 0x002e }
            r13 = 0
            r12 = 1
            r5 = r3
            r5.<init>(r6, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x002e }
            java.util.ArrayList r1 = defpackage.x53.u0(r2, r3)     // Catch:{ all -> 0x002e }
            r2 = 50
            java.util.List r1 = defpackage.x53.z0(r2, r1)     // Catch:{ all -> 0x002e }
            r15.j = r1     // Catch:{ all -> 0x002e }
            int r1 = r1.size()     // Catch:{ all -> 0x002e }
            java.util.List r2 = r15.j     // Catch:{ all -> 0x002e }
            java.lang.Object r2 = defpackage.x53.p0(r2)     // Catch:{ all -> 0x002e }
            fbd r2 = (defpackage.fbd) r2     // Catch:{ all -> 0x002e }
            r15.k = r2     // Catch:{ all -> 0x002e }
            r2 = 1
            if (r1 <= r2) goto L_0x010b
            java.util.List r3 = r15.j     // Catch:{ all -> 0x002e }
            int r1 = r1 + -2
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x002e }
            fbd r1 = (defpackage.fbd) r1     // Catch:{ all -> 0x002e }
            goto L_0x010c
        L_0x010b:
            r1 = r4
        L_0x010c:
            r15.l = r1     // Catch:{ all -> 0x002e }
            l7b r1 = r15.c     // Catch:{ all -> 0x002e }
            java.lang.String r3 = "session_start_ts"
            long r5 = r15.e     // Catch:{ all -> 0x002e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x002e }
            r1.k(r5, r3)     // Catch:{ all -> 0x002e }
            l7b r1 = r15.c     // Catch:{ all -> 0x002e }
            yie r3 = r15.f     // Catch:{ all -> 0x002e }
            if (r3 != 0) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r4 = r3
        L_0x0123:
            org.json.JSONObject r3 = defpackage.j47.q0(r4)     // Catch:{ all -> 0x002e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x002e }
            java.lang.String r4 = "session_system_state"
            r1.k(r3, r4)     // Catch:{ all -> 0x002e }
            l7b r1 = r15.c     // Catch:{ all -> 0x002e }
            java.util.List r3 = r15.j     // Catch:{ all -> 0x002e }
            org.json.JSONArray r3 = defpackage.xfg.C(r3)     // Catch:{ all -> 0x002e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x002e }
            java.lang.String r4 = "session_states"
            r1.k(r3, r4)     // Catch:{ all -> 0x002e }
            l7b r1 = r15.c     // Catch:{ all -> 0x002e }
            r1.m()     // Catch:{ all -> 0x002e }
            r15.d = r2     // Catch:{ all -> 0x002e }
        L_0x0148:
            monitor-exit(r0)
            goto L_0x014c
        L_0x014a:
            monitor-exit(r0)
            throw r15
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbd.b():void");
    }

    public final yie c() {
        Map map;
        b();
        yie yie = this.f;
        if (yie == null) {
            yie = null;
        }
        yie.getClass();
        String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US).format(new Date());
        Map map2 = yie.m;
        if (map2.isEmpty()) {
            map = Collections.singletonMap("date", format);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            linkedHashMap.put("date", format);
            map = linkedHashMap;
        }
        return yie.a(yie, false, map, 12287);
    }

    public final void e(boolean z) {
        synchronized (this.b) {
            b();
            yie yie = this.f;
            if ((yie == null ? null : yie).k != z) {
                if (yie == null) {
                    yie = null;
                }
                yie a2 = yie.a(yie, z, (Map) null, 15359);
                this.f = a2;
                this.c.k(j47.q0(a2).toString(), "session_system_state");
                d(this, 0, z, (bjd) null, 5);
            }
        }
    }

    public final void f(Map map) {
        boolean z;
        synchronized (this.b) {
            try {
                b();
                yie yie = this.f;
                yie yie2 = null;
                if (yie == null) {
                    yie = null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(yie.m);
                loop0:
                while (true) {
                    z = false;
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getValue();
                        String Y0 = w9e.Y0(32, (String) entry.getKey());
                        String Y02 = str != null ? w9e.Y0(64, str) : null;
                        if (!tpa.f(linkedHashMap.get(Y0), Y02)) {
                            if (Y02 != null) {
                                linkedHashMap.put(Y0, Y02);
                            } else {
                                linkedHashMap.remove(Y0);
                            }
                            z = true;
                        }
                    }
                    break loop0;
                }
                if (z) {
                    yie yie3 = this.f;
                    if (yie3 != null) {
                        yie2 = yie3;
                    }
                    yie a2 = yie.a(yie2, false, linkedHashMap, 12287);
                    this.f = a2;
                    this.c.k(j47.q0(a2).toString(), "session_system_state");
                    this.c.m();
                }
            } finally {
            }
        }
    }

    public final void g(int i2) {
        b();
        fbd fbd = this.l;
        if (fbd != null) {
            synchronized (this.b) {
                b();
                fbd a2 = fbd.a(fbd, i2, (bjd) null, false, 223);
                this.l = a2;
                if (this.j.size() > 1) {
                    ArrayList u0 = x53.u0(x53.u0(x53.d0(2, this.j), a2), x53.p0(this.j));
                    this.j = u0;
                    this.c.k(xfg.C(u0).toString(), "session_states");
                    this.c.m();
                }
            }
        }
    }
}
