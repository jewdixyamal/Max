package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: dt2  reason: default package */
public final class dt2 {
    public final ilc a;
    public final ct2 b;
    public uz2 c;
    public final th d;
    public final th e;
    public final th f;
    public final th g;
    public final th h;

    public dt2(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ct2(this, oneMeRoomDatabase, 0);
        this.d = new th(oneMeRoomDatabase, 4);
        this.e = new th(oneMeRoomDatabase, 5);
        this.f = new th(oneMeRoomDatabase, 6);
        this.g = new th(oneMeRoomDatabase, 7);
        this.h = new th(oneMeRoomDatabase, 8);
    }

    public static void b(dt2 dt2) {
        ilc ilc = dt2.a;
        ilc.b();
        th thVar = dt2.e;
        q36 f2 = thVar.f();
        try {
            ilc.c();
            f2.n();
            ilc.r();
            ilc.l();
            thVar.t(f2);
            ilc.b();
            th thVar2 = dt2.h;
            q36 f3 = thVar2.f();
            try {
                ilc.c();
                f3.n();
                ilc.r();
                ilc.l();
                thVar2.t(f3);
            } catch (Throwable th) {
                thVar2.t(f3);
                throw th;
            }
        } catch (Throwable th2) {
            thVar.t(f2);
            throw th2;
        }
    }

    public static void c(dt2 dt2, long j) {
        ilc ilc = dt2.a;
        ilc.b();
        th thVar = dt2.d;
        q36 f2 = thVar.f();
        f2.j(1, j);
        try {
            ilc.c();
            f2.n();
            ilc.r();
            ilc.l();
            thVar.t(f2);
            ilc.b();
            th thVar2 = dt2.g;
            q36 f3 = thVar2.f();
            f3.j(1, j);
            try {
                ilc.c();
                f3.n();
                ilc.r();
                ilc.l();
                thVar2.t(f3);
            } catch (Throwable th) {
                thVar2.t(f3);
                throw th;
            }
        } catch (Throwable th2) {
            thVar.t(f2);
            throw th2;
        }
    }

    public final synchronized uz2 a() {
        try {
            if (this.c == null) {
                this.c = (uz2) this.a.l.get(uz2.class);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.c;
    }

    /* JADX INFO: finally extract failed */
    public final long d(la2 la2, ConcurrentHashMap concurrentHashMap) {
        e56 a2;
        ilc ilc = this.a;
        ilc.b();
        ilc.c();
        try {
            long D = this.b.D(la2);
            ilc.r();
            ilc.l();
            Object obj = concurrentHashMap.get(Long.valueOf(D));
            boolean z = false;
            k92 k92 = la2.c;
            if (!(obj == null ? false : obj.equals(k92.g))) {
                concurrentHashMap.remove(Long.valueOf(D));
                String str = k92.g;
                if (str != null) {
                    if (str.length() == 0) {
                        z = true;
                    }
                    String str2 = null;
                    if (z) {
                        str = null;
                    }
                    if (!(str == null || (a2 = g56.a(str)) == null)) {
                        e56 e56 = a2.c;
                        String str3 = e56 != null ? e56.a : null;
                        if (e56 != null) {
                            str2 = e56.b;
                        }
                        ilc.b();
                        th thVar = this.f;
                        q36 f2 = thVar.f();
                        f2.j(1, D);
                        String str4 = a2.a;
                        if (str4 == null) {
                            f2.W(2);
                        } else {
                            f2.f(2, str4);
                        }
                        String str5 = a2.b;
                        if (str5 == null) {
                            f2.W(3);
                        } else {
                            f2.f(3, str5);
                        }
                        if (str3 == null) {
                            f2.W(4);
                        } else {
                            f2.f(4, str3);
                        }
                        if (str2 == null) {
                            f2.W(5);
                        } else {
                            f2.f(5, str2);
                        }
                        f2.j(6, la2.e);
                        try {
                            ilc.c();
                            f2.m();
                            ilc.r();
                            ilc.l();
                            thVar.t(f2);
                            String str6 = k92.g;
                            if (str6 != null) {
                                concurrentHashMap.put(Long.valueOf(D), str6);
                            }
                            hm9.m(dt2.class.getName(), "update_fts_title_chat for #" + D, new Object[0]);
                        } catch (Throwable th) {
                            thVar.t(f2);
                            throw th;
                        }
                    }
                }
            }
            return D;
        } catch (Throwable th2) {
            ilc.l();
            throw th2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: la2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r11v1, types: [la2] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.la2 e(long r24) {
        /*
            r23 = this;
            java.lang.String r0 = "SELECT * FROM chats WHERE id = ?"
            r1 = 1
            xlc r2 = defpackage.xlc.a(r1, r0)
            r3 = r24
            r2.j(r1, r3)
            r0 = r23
            ilc r1 = r0.a
            r1.b()
            r3 = 0
            android.database.Cursor r1 = r1.o(r2, r3)
            java.lang.String r4 = "id"
            int r4 = defpackage.tfg.n(r1, r4)     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = "server_id"
            int r5 = defpackage.tfg.n(r1, r5)     // Catch:{ all -> 0x0070 }
            java.lang.String r6 = "data"
            int r6 = defpackage.tfg.n(r1, r6)     // Catch:{ all -> 0x0070 }
            java.lang.String r7 = "favourite_index"
            int r7 = defpackage.tfg.n(r1, r7)     // Catch:{ all -> 0x0070 }
            java.lang.String r8 = "sort_time"
            int r8 = defpackage.tfg.n(r1, r8)     // Catch:{ all -> 0x0070 }
            java.lang.String r9 = "cid"
            int r9 = defpackage.tfg.n(r1, r9)     // Catch:{ all -> 0x0070 }
            boolean r10 = r1.moveToFirst()     // Catch:{ all -> 0x0070 }
            if (r10 == 0) goto L_0x0072
            long r12 = r1.getLong(r4)     // Catch:{ all -> 0x0070 }
            long r14 = r1.getLong(r5)     // Catch:{ all -> 0x0070 }
            boolean r4 = r1.isNull(r6)     // Catch:{ all -> 0x0070 }
            if (r4 == 0) goto L_0x0051
            goto L_0x0055
        L_0x0051:
            byte[] r3 = r1.getBlob(r6)     // Catch:{ all -> 0x0070 }
        L_0x0055:
            uz2 r0 = r23.a()     // Catch:{ all -> 0x0070 }
            k92 r16 = r0.a(r3)     // Catch:{ all -> 0x0070 }
            long r17 = r1.getLong(r7)     // Catch:{ all -> 0x0070 }
            long r19 = r1.getLong(r8)     // Catch:{ all -> 0x0070 }
            long r21 = r1.getLong(r9)     // Catch:{ all -> 0x0070 }
            la2 r3 = new la2     // Catch:{ all -> 0x0070 }
            r11 = r3
            r11.<init>(r12, r14, r16, r17, r19, r21)     // Catch:{ all -> 0x0070 }
            goto L_0x0072
        L_0x0070:
            r0 = move-exception
            goto L_0x0079
        L_0x0072:
            r1.close()
            r2.n()
            return r3
        L_0x0079:
            r1.close()
            r2.n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt2.e(long):la2");
    }

    public final long f(long j) {
        xlc a2 = xlc.a(1, "SELECT id FROM chats WHERE server_id = ?");
        a2.j(1, j);
        ilc ilc = this.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            return o.moveToFirst() ? o.getLong(0) : 0;
        } finally {
            o.close();
            a2.n();
        }
    }
}
