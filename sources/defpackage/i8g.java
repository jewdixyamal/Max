package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;

/* renamed from: i8g  reason: default package */
public final class i8g {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public i8g(ilc ilc) {
        this.a = ilc;
        this.b = new x7g(ilc, 2);
        this.c = new ha4(ilc, 7);
        this.d = new ktf(ilc, 7);
        this.e = new ktf(ilc, 8);
        this.f = new ktf(ilc, 9);
        this.g = new ktf(ilc, 10);
        this.h = new ktf(ilc, 11);
        this.i = new ktf(ilc, 12);
        this.j = new ktf(ilc, 13);
        this.k = new ktf(ilc, 3);
        this.l = new ktf(ilc, 4);
        new ktf(ilc, 5);
        new ktf(ilc, 6);
    }

    public static void d(hm9 hm9) {
        if (hm9 instanceof rnc) {
            ((rnc) hm9).getClass();
        } else if (hm9 instanceof w04) {
            ((w04) hm9).getClass();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: qpd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: us} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: qpd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: us} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: qpd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: us} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: qpd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.us r9) {
        /*
            r8 = this;
            java.util.Set r0 = r9.keySet()
            rs r0 = (defpackage.rs) r0
            us r1 = r0.a
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x000f
            return
        L_0x000f:
            int r2 = r9.c
            r3 = 999(0x3e7, float:1.4E-42)
            r4 = 0
            if (r2 <= r3) goto L_0x0046
            us r0 = new us
            r0.<init>(r3)
            int r1 = r9.c
            r2 = r4
            r5 = r2
        L_0x001f:
            if (r2 >= r1) goto L_0x0040
            java.lang.Object r6 = r9.f(r2)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.i(r2)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r0.put(r6, r7)
            int r2 = r2 + 1
            int r5 = r5 + 1
            if (r5 != r3) goto L_0x001f
            r8.a(r0)
            us r0 = new us
            r0.<init>(r3)
            r5 = r4
            goto L_0x001f
        L_0x0040:
            if (r5 <= 0) goto L_0x0045
            r8.a(r0)
        L_0x0045:
            return
        L_0x0046:
            java.lang.String r2 = "SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN ("
            java.lang.StringBuilder r2 = defpackage.au1.l(r2)
            int r1 = r1.c
            defpackage.a14.c(r2, r1)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            xlc r1 = defpackage.xlc.a(r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
        L_0x0063:
            r3 = r0
            qs r3 = (defpackage.qs) r3
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007e
            java.lang.Object r3 = r3.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0078
            r1.W(r2)
            goto L_0x007b
        L_0x0078:
            r1.f(r2, r3)
        L_0x007b:
            int r2 = r2 + 1
            goto L_0x0063
        L_0x007e:
            java.lang.Object r8 = r8.a
            ilc r8 = (defpackage.ilc) r8
            r0 = 0
            android.database.Cursor r8 = r8.o(r1, r0)
            java.lang.String r1 = "work_spec_id"
            int r1 = defpackage.tfg.m(r8, r1)     // Catch:{ all -> 0x00ba }
            r2 = -1
            if (r1 != r2) goto L_0x0094
            r8.close()
            return
        L_0x0094:
            boolean r2 = r8.moveToNext()     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x00bc
            java.lang.String r2 = r8.getString(r1)     // Catch:{ all -> 0x00ba }
            java.lang.Object r2 = r9.get(r2)     // Catch:{ all -> 0x00ba }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x0094
            boolean r3 = r8.isNull(r4)     // Catch:{ all -> 0x00ba }
            if (r3 == 0) goto L_0x00ae
            r3 = r0
            goto L_0x00b2
        L_0x00ae:
            byte[] r3 = r8.getBlob(r4)     // Catch:{ all -> 0x00ba }
        L_0x00b2:
            d24 r3 = defpackage.d24.a(r3)     // Catch:{ all -> 0x00ba }
            r2.add(r3)     // Catch:{ all -> 0x00ba }
            goto L_0x0094
        L_0x00ba:
            r9 = move-exception
            goto L_0x00c0
        L_0x00bc:
            r8.close()
            return
        L_0x00c0:
            r8.close()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8g.a(us):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: qpd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: us} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: qpd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: us} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: qpd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: us} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: qpd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(defpackage.us r9) {
        /*
            r8 = this;
            java.util.Set r0 = r9.keySet()
            rs r0 = (defpackage.rs) r0
            us r1 = r0.a
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x000f
            return
        L_0x000f:
            int r2 = r9.c
            r3 = 999(0x3e7, float:1.4E-42)
            r4 = 0
            if (r2 <= r3) goto L_0x0046
            us r0 = new us
            r0.<init>(r3)
            int r1 = r9.c
            r2 = r4
            r5 = r2
        L_0x001f:
            if (r2 >= r1) goto L_0x0040
            java.lang.Object r6 = r9.f(r2)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.i(r2)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r0.put(r6, r7)
            int r2 = r2 + 1
            int r5 = r5 + 1
            if (r5 != r3) goto L_0x001f
            r8.b(r0)
            us r0 = new us
            r0.<init>(r3)
            r5 = r4
            goto L_0x001f
        L_0x0040:
            if (r5 <= 0) goto L_0x0045
            r8.b(r0)
        L_0x0045:
            return
        L_0x0046:
            java.lang.String r2 = "SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN ("
            java.lang.StringBuilder r2 = defpackage.au1.l(r2)
            int r1 = r1.c
            defpackage.a14.c(r2, r1)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            xlc r1 = defpackage.xlc.a(r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
        L_0x0063:
            r3 = r0
            qs r3 = (defpackage.qs) r3
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007e
            java.lang.Object r3 = r3.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0078
            r1.W(r2)
            goto L_0x007b
        L_0x0078:
            r1.f(r2, r3)
        L_0x007b:
            int r2 = r2 + 1
            goto L_0x0063
        L_0x007e:
            java.lang.Object r8 = r8.a
            ilc r8 = (defpackage.ilc) r8
            r0 = 0
            android.database.Cursor r8 = r8.o(r1, r0)
            java.lang.String r1 = "work_spec_id"
            int r1 = defpackage.tfg.m(r8, r1)     // Catch:{ all -> 0x00b6 }
            r2 = -1
            if (r1 != r2) goto L_0x0094
            r8.close()
            return
        L_0x0094:
            boolean r2 = r8.moveToNext()     // Catch:{ all -> 0x00b6 }
            if (r2 == 0) goto L_0x00b8
            java.lang.String r2 = r8.getString(r1)     // Catch:{ all -> 0x00b6 }
            java.lang.Object r2 = r9.get(r2)     // Catch:{ all -> 0x00b6 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x00b6 }
            if (r2 == 0) goto L_0x0094
            boolean r3 = r8.isNull(r4)     // Catch:{ all -> 0x00b6 }
            if (r3 == 0) goto L_0x00ae
            r3 = r0
            goto L_0x00b2
        L_0x00ae:
            java.lang.String r3 = r8.getString(r4)     // Catch:{ all -> 0x00b6 }
        L_0x00b2:
            r2.add(r3)     // Catch:{ all -> 0x00b6 }
            goto L_0x0094
        L_0x00b6:
            r9 = move-exception
            goto L_0x00bc
        L_0x00b8:
            r8.close()
            return
        L_0x00bc:
            r8.close()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8g.b(us):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [gjd, java.lang.Object] */
    public gjd c() {
        ? obj = new Object();
        obj.a = (hm9) this.a;
        obj.b = (hm9) this.b;
        obj.c = (hm9) this.c;
        obj.d = (hm9) this.d;
        obj.e = (hx3) this.e;
        obj.f = (hx3) this.f;
        obj.g = (hx3) this.g;
        obj.h = (hx3) this.h;
        obj.i = (vu4) this.i;
        obj.j = (vu4) this.j;
        obj.k = (vu4) this.k;
        obj.l = (vu4) this.l;
        return obj;
    }

    public void e(String str) {
        ilc ilc = (ilc) this.a;
        ilc.b();
        ktf ktf = (ktf) this.d;
        q36 f2 = ktf.f();
        if (str == null) {
            f2.W(1);
        } else {
            f2.f(1, str);
        }
        ilc.c();
        try {
            f2.n();
            ilc.r();
        } finally {
            ilc.l();
            ktf.t(f2);
        }
    }

    public ArrayList f() {
        xlc xlc;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        xlc a2 = xlc.a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        a2.j(1, (long) 200);
        ilc ilc = (ilc) this.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "state");
            int n3 = tfg.n(o, "worker_class_name");
            int n4 = tfg.n(o, "input_merger_class_name");
            int n5 = tfg.n(o, "input");
            int n6 = tfg.n(o, "output");
            int n7 = tfg.n(o, "initial_delay");
            int n8 = tfg.n(o, "interval_duration");
            int n9 = tfg.n(o, "flex_duration");
            int n10 = tfg.n(o, "run_attempt_count");
            int n11 = tfg.n(o, "backoff_policy");
            int n12 = tfg.n(o, "backoff_delay_duration");
            int n13 = tfg.n(o, "last_enqueue_time");
            int n14 = tfg.n(o, "minimum_retention_duration");
            xlc = a2;
            try {
                int n15 = tfg.n(o, "schedule_requested_at");
                int n16 = tfg.n(o, "run_in_foreground");
                int n17 = tfg.n(o, "out_of_quota_policy");
                int n18 = tfg.n(o, "period_count");
                int n19 = tfg.n(o, "generation");
                int n20 = tfg.n(o, "required_network_type");
                int n21 = tfg.n(o, "requires_charging");
                int n22 = tfg.n(o, "requires_device_idle");
                int n23 = tfg.n(o, "requires_battery_not_low");
                int n24 = tfg.n(o, "requires_storage_not_low");
                int n25 = tfg.n(o, "trigger_content_update_delay");
                int n26 = tfg.n(o, "trigger_max_content_delay");
                int n27 = tfg.n(o, "content_uri_triggers");
                int i7 = n14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    String string = o.isNull(n) ? null : o.getString(n);
                    m7g v = nu0.v(o.getInt(n2));
                    String string2 = o.isNull(n3) ? null : o.getString(n3);
                    String string3 = o.isNull(n4) ? null : o.getString(n4);
                    d24 a3 = d24.a(o.isNull(n5) ? null : o.getBlob(n5));
                    d24 a4 = d24.a(o.isNull(n6) ? null : o.getBlob(n6));
                    long j2 = o.getLong(n7);
                    long j3 = o.getLong(n8);
                    long j4 = o.getLong(n9);
                    int i8 = o.getInt(n10);
                    mf0 s = nu0.s(o.getInt(n11));
                    long j5 = o.getLong(n12);
                    long j6 = o.getLong(n13);
                    int i9 = i7;
                    long j7 = o.getLong(i9);
                    int i10 = n;
                    int i11 = n15;
                    long j8 = o.getLong(i11);
                    n15 = i11;
                    int i12 = n16;
                    if (o.getInt(i12) != 0) {
                        n16 = i12;
                        i2 = n17;
                        z = true;
                    } else {
                        n16 = i12;
                        i2 = n17;
                        z = false;
                    }
                    jna u = nu0.u(o.getInt(i2));
                    n17 = i2;
                    int i13 = n18;
                    int i14 = o.getInt(i13);
                    n18 = i13;
                    int i15 = n19;
                    int i16 = o.getInt(i15);
                    n19 = i15;
                    int i17 = n20;
                    int t = nu0.t(o.getInt(i17));
                    n20 = i17;
                    int i18 = n21;
                    if (o.getInt(i18) != 0) {
                        n21 = i18;
                        i3 = n22;
                        z2 = true;
                    } else {
                        n21 = i18;
                        i3 = n22;
                        z2 = false;
                    }
                    if (o.getInt(i3) != 0) {
                        n22 = i3;
                        i4 = n23;
                        z3 = true;
                    } else {
                        n22 = i3;
                        i4 = n23;
                        z3 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        n23 = i4;
                        i5 = n24;
                        z4 = true;
                    } else {
                        n23 = i4;
                        i5 = n24;
                        z4 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        n24 = i5;
                        i6 = n25;
                        z5 = true;
                    } else {
                        n24 = i5;
                        i6 = n25;
                        z5 = false;
                    }
                    long j9 = o.getLong(i6);
                    n25 = i6;
                    int i19 = n26;
                    long j10 = o.getLong(i19);
                    n26 = i19;
                    int i20 = n27;
                    n27 = i20;
                    arrayList.add(new h8g(string, v, string2, string3, a3, a4, j2, j3, j4, new kj3(t, z2, z3, z4, z5, j9, j10, nu0.c(o.isNull(i20) ? null : o.getBlob(i20))), i8, s, j5, j6, j7, j8, z, u, i14, i16));
                    n = i10;
                    i7 = i9;
                }
                o.close();
                xlc.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a2;
            o.close();
            xlc.n();
            throw th;
        }
    }

    public ArrayList g(int i2) {
        xlc xlc;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        xlc a2 = xlc.a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        a2.j(1, (long) i2);
        ilc ilc = (ilc) this.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "state");
            int n3 = tfg.n(o, "worker_class_name");
            int n4 = tfg.n(o, "input_merger_class_name");
            int n5 = tfg.n(o, "input");
            int n6 = tfg.n(o, "output");
            int n7 = tfg.n(o, "initial_delay");
            int n8 = tfg.n(o, "interval_duration");
            int n9 = tfg.n(o, "flex_duration");
            int n10 = tfg.n(o, "run_attempt_count");
            int n11 = tfg.n(o, "backoff_policy");
            int n12 = tfg.n(o, "backoff_delay_duration");
            int n13 = tfg.n(o, "last_enqueue_time");
            int n14 = tfg.n(o, "minimum_retention_duration");
            xlc = a2;
            try {
                int n15 = tfg.n(o, "schedule_requested_at");
                int n16 = tfg.n(o, "run_in_foreground");
                int n17 = tfg.n(o, "out_of_quota_policy");
                int n18 = tfg.n(o, "period_count");
                int n19 = tfg.n(o, "generation");
                int n20 = tfg.n(o, "required_network_type");
                int n21 = tfg.n(o, "requires_charging");
                int n22 = tfg.n(o, "requires_device_idle");
                int n23 = tfg.n(o, "requires_battery_not_low");
                int n24 = tfg.n(o, "requires_storage_not_low");
                int n25 = tfg.n(o, "trigger_content_update_delay");
                int n26 = tfg.n(o, "trigger_max_content_delay");
                int n27 = tfg.n(o, "content_uri_triggers");
                int i8 = n14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    String string = o.isNull(n) ? null : o.getString(n);
                    m7g v = nu0.v(o.getInt(n2));
                    String string2 = o.isNull(n3) ? null : o.getString(n3);
                    String string3 = o.isNull(n4) ? null : o.getString(n4);
                    d24 a3 = d24.a(o.isNull(n5) ? null : o.getBlob(n5));
                    d24 a4 = d24.a(o.isNull(n6) ? null : o.getBlob(n6));
                    long j2 = o.getLong(n7);
                    long j3 = o.getLong(n8);
                    long j4 = o.getLong(n9);
                    int i9 = o.getInt(n10);
                    mf0 s = nu0.s(o.getInt(n11));
                    long j5 = o.getLong(n12);
                    long j6 = o.getLong(n13);
                    int i10 = i8;
                    long j7 = o.getLong(i10);
                    int i11 = n;
                    int i12 = n15;
                    long j8 = o.getLong(i12);
                    n15 = i12;
                    int i13 = n16;
                    if (o.getInt(i13) != 0) {
                        n16 = i13;
                        i3 = n17;
                        z = true;
                    } else {
                        n16 = i13;
                        i3 = n17;
                        z = false;
                    }
                    jna u = nu0.u(o.getInt(i3));
                    n17 = i3;
                    int i14 = n18;
                    int i15 = o.getInt(i14);
                    n18 = i14;
                    int i16 = n19;
                    int i17 = o.getInt(i16);
                    n19 = i16;
                    int i18 = n20;
                    int t = nu0.t(o.getInt(i18));
                    n20 = i18;
                    int i19 = n21;
                    if (o.getInt(i19) != 0) {
                        n21 = i19;
                        i4 = n22;
                        z2 = true;
                    } else {
                        n21 = i19;
                        i4 = n22;
                        z2 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        n22 = i4;
                        i5 = n23;
                        z3 = true;
                    } else {
                        n22 = i4;
                        i5 = n23;
                        z3 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        n23 = i5;
                        i6 = n24;
                        z4 = true;
                    } else {
                        n23 = i5;
                        i6 = n24;
                        z4 = false;
                    }
                    if (o.getInt(i6) != 0) {
                        n24 = i6;
                        i7 = n25;
                        z5 = true;
                    } else {
                        n24 = i6;
                        i7 = n25;
                        z5 = false;
                    }
                    long j9 = o.getLong(i7);
                    n25 = i7;
                    int i20 = n26;
                    long j10 = o.getLong(i20);
                    n26 = i20;
                    int i21 = n27;
                    n27 = i21;
                    arrayList.add(new h8g(string, v, string2, string3, a3, a4, j2, j3, j4, new kj3(t, z2, z3, z4, z5, j9, j10, nu0.c(o.isNull(i21) ? null : o.getBlob(i21))), i9, s, j5, j6, j7, j8, z, u, i15, i17));
                    n = i11;
                    i8 = i10;
                }
                o.close();
                xlc.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a2;
            o.close();
            xlc.n();
            throw th;
        }
    }

    public ArrayList h() {
        xlc xlc;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        xlc a2 = xlc.a(0, "SELECT * FROM workspec WHERE state=1");
        ilc ilc = (ilc) this.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "state");
            int n3 = tfg.n(o, "worker_class_name");
            int n4 = tfg.n(o, "input_merger_class_name");
            int n5 = tfg.n(o, "input");
            int n6 = tfg.n(o, "output");
            int n7 = tfg.n(o, "initial_delay");
            int n8 = tfg.n(o, "interval_duration");
            int n9 = tfg.n(o, "flex_duration");
            int n10 = tfg.n(o, "run_attempt_count");
            int n11 = tfg.n(o, "backoff_policy");
            int n12 = tfg.n(o, "backoff_delay_duration");
            int n13 = tfg.n(o, "last_enqueue_time");
            int n14 = tfg.n(o, "minimum_retention_duration");
            xlc = a2;
            try {
                int n15 = tfg.n(o, "schedule_requested_at");
                int n16 = tfg.n(o, "run_in_foreground");
                int n17 = tfg.n(o, "out_of_quota_policy");
                int n18 = tfg.n(o, "period_count");
                int n19 = tfg.n(o, "generation");
                int n20 = tfg.n(o, "required_network_type");
                int n21 = tfg.n(o, "requires_charging");
                int n22 = tfg.n(o, "requires_device_idle");
                int n23 = tfg.n(o, "requires_battery_not_low");
                int n24 = tfg.n(o, "requires_storage_not_low");
                int n25 = tfg.n(o, "trigger_content_update_delay");
                int n26 = tfg.n(o, "trigger_max_content_delay");
                int n27 = tfg.n(o, "content_uri_triggers");
                int i7 = n14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    String string = o.isNull(n) ? null : o.getString(n);
                    m7g v = nu0.v(o.getInt(n2));
                    String string2 = o.isNull(n3) ? null : o.getString(n3);
                    String string3 = o.isNull(n4) ? null : o.getString(n4);
                    d24 a3 = d24.a(o.isNull(n5) ? null : o.getBlob(n5));
                    d24 a4 = d24.a(o.isNull(n6) ? null : o.getBlob(n6));
                    long j2 = o.getLong(n7);
                    long j3 = o.getLong(n8);
                    long j4 = o.getLong(n9);
                    int i8 = o.getInt(n10);
                    mf0 s = nu0.s(o.getInt(n11));
                    long j5 = o.getLong(n12);
                    long j6 = o.getLong(n13);
                    int i9 = i7;
                    long j7 = o.getLong(i9);
                    int i10 = n;
                    int i11 = n15;
                    long j8 = o.getLong(i11);
                    n15 = i11;
                    int i12 = n16;
                    if (o.getInt(i12) != 0) {
                        n16 = i12;
                        i2 = n17;
                        z = true;
                    } else {
                        n16 = i12;
                        i2 = n17;
                        z = false;
                    }
                    jna u = nu0.u(o.getInt(i2));
                    n17 = i2;
                    int i13 = n18;
                    int i14 = o.getInt(i13);
                    n18 = i13;
                    int i15 = n19;
                    int i16 = o.getInt(i15);
                    n19 = i15;
                    int i17 = n20;
                    int t = nu0.t(o.getInt(i17));
                    n20 = i17;
                    int i18 = n21;
                    if (o.getInt(i18) != 0) {
                        n21 = i18;
                        i3 = n22;
                        z2 = true;
                    } else {
                        n21 = i18;
                        i3 = n22;
                        z2 = false;
                    }
                    if (o.getInt(i3) != 0) {
                        n22 = i3;
                        i4 = n23;
                        z3 = true;
                    } else {
                        n22 = i3;
                        i4 = n23;
                        z3 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        n23 = i4;
                        i5 = n24;
                        z4 = true;
                    } else {
                        n23 = i4;
                        i5 = n24;
                        z4 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        n24 = i5;
                        i6 = n25;
                        z5 = true;
                    } else {
                        n24 = i5;
                        i6 = n25;
                        z5 = false;
                    }
                    long j9 = o.getLong(i6);
                    n25 = i6;
                    int i19 = n26;
                    long j10 = o.getLong(i19);
                    n26 = i19;
                    int i20 = n27;
                    n27 = i20;
                    arrayList.add(new h8g(string, v, string2, string3, a3, a4, j2, j3, j4, new kj3(t, z2, z3, z4, z5, j9, j10, nu0.c(o.isNull(i20) ? null : o.getBlob(i20))), i8, s, j5, j6, j7, j8, z, u, i14, i16));
                    n = i10;
                    i7 = i9;
                }
                o.close();
                xlc.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a2;
            o.close();
            xlc.n();
            throw th;
        }
    }

    public ArrayList i() {
        xlc xlc;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        xlc a2 = xlc.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        ilc ilc = (ilc) this.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "state");
            int n3 = tfg.n(o, "worker_class_name");
            int n4 = tfg.n(o, "input_merger_class_name");
            int n5 = tfg.n(o, "input");
            int n6 = tfg.n(o, "output");
            int n7 = tfg.n(o, "initial_delay");
            int n8 = tfg.n(o, "interval_duration");
            int n9 = tfg.n(o, "flex_duration");
            int n10 = tfg.n(o, "run_attempt_count");
            int n11 = tfg.n(o, "backoff_policy");
            int n12 = tfg.n(o, "backoff_delay_duration");
            int n13 = tfg.n(o, "last_enqueue_time");
            int n14 = tfg.n(o, "minimum_retention_duration");
            xlc = a2;
            try {
                int n15 = tfg.n(o, "schedule_requested_at");
                int n16 = tfg.n(o, "run_in_foreground");
                int n17 = tfg.n(o, "out_of_quota_policy");
                int n18 = tfg.n(o, "period_count");
                int n19 = tfg.n(o, "generation");
                int n20 = tfg.n(o, "required_network_type");
                int n21 = tfg.n(o, "requires_charging");
                int n22 = tfg.n(o, "requires_device_idle");
                int n23 = tfg.n(o, "requires_battery_not_low");
                int n24 = tfg.n(o, "requires_storage_not_low");
                int n25 = tfg.n(o, "trigger_content_update_delay");
                int n26 = tfg.n(o, "trigger_max_content_delay");
                int n27 = tfg.n(o, "content_uri_triggers");
                int i7 = n14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    String string = o.isNull(n) ? null : o.getString(n);
                    m7g v = nu0.v(o.getInt(n2));
                    String string2 = o.isNull(n3) ? null : o.getString(n3);
                    String string3 = o.isNull(n4) ? null : o.getString(n4);
                    d24 a3 = d24.a(o.isNull(n5) ? null : o.getBlob(n5));
                    d24 a4 = d24.a(o.isNull(n6) ? null : o.getBlob(n6));
                    long j2 = o.getLong(n7);
                    long j3 = o.getLong(n8);
                    long j4 = o.getLong(n9);
                    int i8 = o.getInt(n10);
                    mf0 s = nu0.s(o.getInt(n11));
                    long j5 = o.getLong(n12);
                    long j6 = o.getLong(n13);
                    int i9 = i7;
                    long j7 = o.getLong(i9);
                    int i10 = n;
                    int i11 = n15;
                    long j8 = o.getLong(i11);
                    n15 = i11;
                    int i12 = n16;
                    if (o.getInt(i12) != 0) {
                        n16 = i12;
                        i2 = n17;
                        z = true;
                    } else {
                        n16 = i12;
                        i2 = n17;
                        z = false;
                    }
                    jna u = nu0.u(o.getInt(i2));
                    n17 = i2;
                    int i13 = n18;
                    int i14 = o.getInt(i13);
                    n18 = i13;
                    int i15 = n19;
                    int i16 = o.getInt(i15);
                    n19 = i15;
                    int i17 = n20;
                    int t = nu0.t(o.getInt(i17));
                    n20 = i17;
                    int i18 = n21;
                    if (o.getInt(i18) != 0) {
                        n21 = i18;
                        i3 = n22;
                        z2 = true;
                    } else {
                        n21 = i18;
                        i3 = n22;
                        z2 = false;
                    }
                    if (o.getInt(i3) != 0) {
                        n22 = i3;
                        i4 = n23;
                        z3 = true;
                    } else {
                        n22 = i3;
                        i4 = n23;
                        z3 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        n23 = i4;
                        i5 = n24;
                        z4 = true;
                    } else {
                        n23 = i4;
                        i5 = n24;
                        z4 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        n24 = i5;
                        i6 = n25;
                        z5 = true;
                    } else {
                        n24 = i5;
                        i6 = n25;
                        z5 = false;
                    }
                    long j9 = o.getLong(i6);
                    n25 = i6;
                    int i19 = n26;
                    long j10 = o.getLong(i19);
                    n26 = i19;
                    int i20 = n27;
                    n27 = i20;
                    arrayList.add(new h8g(string, v, string2, string3, a3, a4, j2, j3, j4, new kj3(t, z2, z3, z4, z5, j9, j10, nu0.c(o.isNull(i20) ? null : o.getBlob(i20))), i8, s, j5, j6, j7, j8, z, u, i14, i16));
                    n = i10;
                    i7 = i9;
                }
                o.close();
                xlc.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a2;
            o.close();
            xlc.n();
            throw th;
        }
    }

    public m7g j(String str) {
        xlc a2 = xlc.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            a2.W(1);
        } else {
            a2.f(1, str);
        }
        ilc ilc = (ilc) this.a;
        ilc.b();
        m7g m7g = null;
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            if (o.moveToFirst()) {
                Integer valueOf = o.isNull(0) ? null : Integer.valueOf(o.getInt(0));
                if (valueOf != null) {
                    m7g = nu0.v(valueOf.intValue());
                }
            }
            return m7g;
        } finally {
            o.close();
            a2.n();
        }
    }

    public ArrayList k(String str) {
        xlc a2 = xlc.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a2.W(1);
        } else {
            a2.f(1, str);
        }
        ilc ilc = (ilc) this.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(o.isNull(0) ? null : o.getString(0));
            }
            return arrayList;
        } finally {
            o.close();
            a2.n();
        }
    }

    public h8g l(String str) {
        xlc xlc;
        h8g h8g;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        String str2 = str;
        xlc a2 = xlc.a(1, "SELECT * FROM workspec WHERE id=?");
        if (str2 == null) {
            a2.W(1);
        } else {
            a2.f(1, str2);
        }
        ilc ilc = (ilc) this.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "state");
            int n3 = tfg.n(o, "worker_class_name");
            int n4 = tfg.n(o, "input_merger_class_name");
            int n5 = tfg.n(o, "input");
            int n6 = tfg.n(o, "output");
            int n7 = tfg.n(o, "initial_delay");
            int n8 = tfg.n(o, "interval_duration");
            int n9 = tfg.n(o, "flex_duration");
            int n10 = tfg.n(o, "run_attempt_count");
            int n11 = tfg.n(o, "backoff_policy");
            int n12 = tfg.n(o, "backoff_delay_duration");
            int n13 = tfg.n(o, "last_enqueue_time");
            int n14 = tfg.n(o, "minimum_retention_duration");
            xlc = a2;
            try {
                int n15 = tfg.n(o, "schedule_requested_at");
                int n16 = tfg.n(o, "run_in_foreground");
                int n17 = tfg.n(o, "out_of_quota_policy");
                int n18 = tfg.n(o, "period_count");
                int n19 = tfg.n(o, "generation");
                int n20 = tfg.n(o, "required_network_type");
                int n21 = tfg.n(o, "requires_charging");
                int n22 = tfg.n(o, "requires_device_idle");
                int n23 = tfg.n(o, "requires_battery_not_low");
                int n24 = tfg.n(o, "requires_storage_not_low");
                int n25 = tfg.n(o, "trigger_content_update_delay");
                int n26 = tfg.n(o, "trigger_max_content_delay");
                int n27 = tfg.n(o, "content_uri_triggers");
                if (o.moveToFirst()) {
                    String string = o.isNull(n) ? null : o.getString(n);
                    m7g v = nu0.v(o.getInt(n2));
                    String string2 = o.isNull(n3) ? null : o.getString(n3);
                    String string3 = o.isNull(n4) ? null : o.getString(n4);
                    d24 a3 = d24.a(o.isNull(n5) ? null : o.getBlob(n5));
                    d24 a4 = d24.a(o.isNull(n6) ? null : o.getBlob(n6));
                    long j2 = o.getLong(n7);
                    long j3 = o.getLong(n8);
                    long j4 = o.getLong(n9);
                    int i7 = o.getInt(n10);
                    mf0 s = nu0.s(o.getInt(n11));
                    long j5 = o.getLong(n12);
                    long j6 = o.getLong(n13);
                    long j7 = o.getLong(n14);
                    long j8 = o.getLong(n15);
                    if (o.getInt(n16) != 0) {
                        i2 = n17;
                        z = true;
                    } else {
                        z = false;
                        i2 = n17;
                    }
                    jna u = nu0.u(o.getInt(i2));
                    int i8 = o.getInt(n18);
                    int i9 = o.getInt(n19);
                    int t = nu0.t(o.getInt(n20));
                    if (o.getInt(n21) != 0) {
                        i3 = n22;
                        z2 = true;
                    } else {
                        z2 = false;
                        i3 = n22;
                    }
                    if (o.getInt(i3) != 0) {
                        i4 = n23;
                        z3 = true;
                    } else {
                        z3 = false;
                        i4 = n23;
                    }
                    if (o.getInt(i4) != 0) {
                        i5 = n24;
                        z4 = true;
                    } else {
                        z4 = false;
                        i5 = n24;
                    }
                    if (o.getInt(i5) != 0) {
                        i6 = n25;
                        z5 = true;
                    } else {
                        z5 = false;
                        i6 = n25;
                    }
                    h8g = new h8g(string, v, string2, string3, a3, a4, j2, j3, j4, new kj3(t, z2, z3, z4, z5, o.getLong(i6), o.getLong(n26), nu0.c(o.isNull(n27) ? null : o.getBlob(n27))), i7, s, j5, j6, j7, j8, z, u, i8, i9);
                } else {
                    h8g = null;
                }
                o.close();
                xlc.n();
                return h8g;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a2;
            o.close();
            xlc.n();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [f8g, java.lang.Object] */
    public ArrayList m(String str) {
        xlc a2 = xlc.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a2.W(1);
        } else {
            a2.f(1, str);
        }
        ilc ilc = (ilc) this.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                String string = o.isNull(0) ? null : o.getString(0);
                m7g v = nu0.v(o.getInt(1));
                ? obj = new Object();
                obj.a = string;
                obj.b = v;
                arrayList.add(obj);
            }
            return arrayList;
        } finally {
            o.close();
            a2.n();
        }
    }

    public void n(long j2, String str) {
        ilc ilc = (ilc) this.a;
        ilc.b();
        ktf ktf = (ktf) this.k;
        q36 f2 = ktf.f();
        f2.j(1, j2);
        if (str == null) {
            f2.W(2);
        } else {
            f2.f(2, str);
        }
        ilc.c();
        try {
            f2.n();
            ilc.r();
        } finally {
            ilc.l();
            ktf.t(f2);
        }
    }

    public void o(long j2, String str) {
        ilc ilc = (ilc) this.a;
        ilc.b();
        ktf ktf = (ktf) this.h;
        q36 f2 = ktf.f();
        f2.j(1, j2);
        if (str == null) {
            f2.W(2);
        } else {
            f2.f(2, str);
        }
        ilc.c();
        try {
            f2.n();
            ilc.r();
        } finally {
            ilc.l();
            ktf.t(f2);
        }
    }

    public void p(String str, d24 d24) {
        ilc ilc = (ilc) this.a;
        ilc.b();
        ktf ktf = (ktf) this.g;
        q36 f2 = ktf.f();
        byte[] f3 = d24.f(d24);
        if (f3 == null) {
            f2.W(1);
        } else {
            f2.k(1, f3);
        }
        if (str == null) {
            f2.W(2);
        } else {
            f2.f(2, str);
        }
        ilc.c();
        try {
            f2.n();
            ilc.r();
        } finally {
            ilc.l();
            ktf.t(f2);
        }
    }

    public void q(m7g m7g, String str) {
        ilc ilc = (ilc) this.a;
        ilc.b();
        ktf ktf = (ktf) this.e;
        q36 f2 = ktf.f();
        f2.j(1, (long) nu0.O(m7g));
        if (str == null) {
            f2.W(2);
        } else {
            f2.f(2, str);
        }
        ilc.c();
        try {
            f2.n();
            ilc.r();
        } finally {
            ilc.l();
            ktf.t(f2);
        }
    }

    public i8g() {
        this.a = new rnc();
        this.b = new rnc();
        this.c = new rnc();
        this.d = new rnc();
        this.e = new a0(0.0f);
        this.f = new a0(0.0f);
        this.g = new a0(0.0f);
        this.h = new a0(0.0f);
        this.i = new Object();
        this.j = new Object();
        this.k = new Object();
        this.l = new Object();
    }
}
