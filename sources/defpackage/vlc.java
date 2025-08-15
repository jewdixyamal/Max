package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: vlc  reason: default package */
public final class vlc {
    public final jlc a;
    public final vxc b;
    public final je7 c;
    public final je7 d;
    public final khe e = new khe(new lwa(16, this));

    public vlc(jlc jlc, vxc vxc, v07 v07, je7 je7) {
        this.a = jlc;
        this.b = vxc;
        this.c = v07;
        this.d = je7;
    }

    public static bu8 m(ru8 ru8) {
        bu8 bu8 = new bu8();
        bu8.a = ru8.a;
        bu8.b = ru8.b;
        bu8.c = ru8.c;
        bu8.d = ru8.d;
        bu8.e = ru8.e;
        bu8.f = ru8.f;
        bu8.g = ru8.g;
        bu8.h = ru8.x;
        bu8.i = ru8.h;
        bu8.j = ru8.i;
        bu8.k = ru8.j;
        bu8.l = ru8.k;
        bu8.m = ru8.l;
        bu8.n = ru8.m;
        bu8.o = ru8.n;
        bu8.p = ru8.p;
        bu8.q = ru8.s;
        bu8.s = ru8.t;
        bu8.t = ru8.u;
        bu8.y = ru8.w;
        bu8.x = ru8.v;
        bu8.u = ru8.o;
        bu8.v = ru8.z;
        bu8.w = ru8.A;
        bu8.I = ru8.J;
        bu8.A = ru8.y;
        bu8.B = ru8.B;
        bu8.C = ru8.C;
        bu8.D = ru8.D;
        bu8.E = ru8.E;
        bu8.F = ru8.F;
        bu8.G = ru8.G;
        return bu8;
    }

    public final int a(long j, long j2, mg4 mg4) {
        int i;
        int ordinal = mg4.ordinal();
        if (ordinal == 0) {
            t19 d2 = d();
            ilc ilc = d2.a;
            ilc.b();
            p19 p19 = d2.r;
            q36 f = p19.f();
            f.j(1, j);
            f.j(2, j2);
            try {
                ilc.c();
                i = f.n();
                ilc.r();
                ilc.l();
                p19.t(f);
            } catch (Throwable th) {
                p19.t(f);
                throw th;
            }
        } else if (ordinal == 1) {
            t19 d3 = d();
            ilc ilc2 = d3.a;
            ilc2.b();
            p19 p192 = d3.s;
            q36 f2 = p192.f();
            f2.j(1, j);
            f2.j(2, j2);
            try {
                ilc2.c();
                i = f2.n();
                ilc2.r();
                ilc2.l();
                p192.t(f2);
            } catch (Throwable th2) {
                p192.t(f2);
                throw th2;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return i;
    }

    public final cu8 b(ru8 ru8) {
        Boolean bool;
        l20 k;
        q10 q10;
        bu8 m = m(ru8);
        long j = ru8.q;
        ng4 ng4 = null;
        if (j > 0) {
            ru8 c2 = d().c(j);
            m.r = c2 != null ? b(c2) : null;
        }
        k8g k8g = ru8.m;
        long j2 = (k8g == null || (k = k8g.k(g20.b)) == null || (q10 = k.c) == null) ? 0 : q10.m;
        if (j2 > 0) {
            ru8 c3 = d().c(j2);
            m.z = c3 != null ? b(c3) : null;
        }
        Long l = ru8.H;
        if (!(l == null || (bool = ru8.I) == null)) {
            ng4 = new ng4(l.longValue(), bool.booleanValue());
        }
        m.H = ng4;
        return m.a();
    }

    public final kke c() {
        return (kke) this.c.getValue();
    }

    public final t19 d() {
        return (t19) this.e.getValue();
    }

    public final long e(long j, long j2, fs8 fs8) {
        return ((Number) ((OneMeRoomDatabase) this.a.m()).p(new mlc(this, j, fs8, j2))).longValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0225  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long f(long r90, long r92, defpackage.fs8 r94, boolean r95) {
        /*
            r89 = this;
            r0 = r89
            r14 = r90
            r11 = r94
            t19 r1 = r89.d()
            long r2 = r11.a
            java.lang.Long r1 = r1.i(r14, r2)
            r8 = 1
            r12 = 0
            if (r1 == 0) goto L_0x0016
            r9 = r8
            goto L_0x0017
        L_0x0016:
            r9 = r12
        L_0x0017:
            long r1 = r11.Y
            r16 = 0
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            r10 = 0
            if (r3 == 0) goto L_0x0066
            long r3 = r11.o
            int r3 = (r92 > r3 ? 1 : (r92 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0066
            t19 r3 = r89.d()
            r3.getClass()
            java.lang.String r4 = "SELECT id FROM messages WHERE chat_id = ? AND cid = ?"
            r5 = 2
            xlc r4 = defpackage.xlc.a(r5, r4)
            r4.j(r8, r14)
            r4.j(r5, r1)
            ilc r1 = r3.a
            r1.b()
            android.database.Cursor r1 = r1.o(r4, r10)
            boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x004f
            boolean r2 = r1.isNull(r12)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0051
        L_0x004f:
            r2 = r10
            goto L_0x005c
        L_0x0051:
            long r2 = r1.getLong(r12)     // Catch:{ all -> 0x005a }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x005a }
            goto L_0x005c
        L_0x005a:
            r0 = move-exception
            goto L_0x0068
        L_0x005c:
            r1.close()
            r4.n()
            if (r2 == 0) goto L_0x0066
            r13 = r8
            goto L_0x006f
        L_0x0066:
            r13 = r12
            goto L_0x006f
        L_0x0068:
            r1.close()
            r4.n()
            throw r0
        L_0x006f:
            aw8 r7 = r11.t0
            if (r7 == 0) goto L_0x0087
            fs8 r6 = r7.c
            r18 = 1
            r1 = r89
            r2 = r90
            r4 = r92
            r10 = r7
            r7 = r18
            long r1 = r1.f(r2, r4, r6, r7)
            r20 = r1
            goto L_0x008a
        L_0x0087:
            r10 = r7
            r20 = r16
        L_0x008a:
            wz r1 = r11.s0
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x00a4
            java.lang.Object r2 = r1.get(r12)
            boolean r2 = r2 instanceof defpackage.ju3
            if (r2 == 0) goto L_0x00a4
            java.lang.Object r1 = r1.get(r12)
            ju3 r1 = (defpackage.ju3) r1
            fs8 r1 = r1.A0
            r7 = r1
            goto L_0x00a5
        L_0x00a4:
            r7 = 0
        L_0x00a5:
            if (r7 == 0) goto L_0x00be
            r18 = 1
            r1 = r89
            r2 = r90
            r4 = r92
            r6 = r7
            r12 = r7
            r7 = r18
            long r1 = r1.f(r2, r4, r6, r7)
            long r3 = r12.a
            r25 = r1
            r27 = r3
            goto L_0x00c2
        L_0x00be:
            r25 = r16
            r27 = r25
        L_0x00c2:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            if (r9 != 0) goto L_0x01d0
            if (r13 != 0) goto L_0x01d0
            iu8 r37 = defpackage.iu8.SENT
            v5 r1 = new v5
            r2 = 5
            r1.<init>(r2, r12)
            if (r10 == 0) goto L_0x00f0
            int r2 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f0
            r2 = 3
            int r3 = r10.a
            if (r3 != r2) goto L_0x00f0
            fs8 r1 = r10.c
            wz r2 = r1.s0
            vxc r3 = r0.b
            r4 = 0
            r6 = 0
            r8 = 0
            k8g r1 = defpackage.iz7.h(r2, r3, r4, r6, r8)
        L_0x00ed:
            r38 = r1
            goto L_0x00ff
        L_0x00f0:
            wz r2 = r11.s0
            vxc r3 = r0.b
            r23 = r2
            r24 = r3
            r29 = r1
            k8g r1 = defpackage.iz7.h(r23, r24, r25, r27, r29)
            goto L_0x00ed
        L_0x00ff:
            wx8 r1 = r11.X
            vx8 r10 = defpackage.iz7.q(r1)
            r8 = 0
            r1 = r89
            r2 = r90
            r4 = r94
            r5 = r20
            r7 = r95
            yw8 r13 = r1.i(r2, r4, r5, r7, r8, r10)
            int r40 = defpackage.iz7.c(r38)
            ux8 r1 = r11.v0
            if (r1 == 0) goto L_0x0122
            int r2 = r1.a
            r41 = r2
            goto L_0x0124
        L_0x0122:
            r41 = 0
        L_0x0124:
            if (r1 == 0) goto L_0x012b
            int r1 = r1.b
            r52 = r1
            goto L_0x012d
        L_0x012b:
            r52 = 0
        L_0x012d:
            ru8 r10 = new ru8
            r1 = r10
            java.lang.Long r2 = r13.x
            r50 = r2
            java.lang.Boolean r2 = r13.y
            r51 = r2
            long r2 = r13.a
            long r4 = r13.b
            long r6 = r13.c
            long r8 = r13.e
            r92 = r10
            long r10 = r13.f
            r0 = r92
            long r14 = r13.g
            r53 = r12
            r0 = r13
            r12 = r14
            java.lang.String r14 = r0.h
            vx8 r15 = r0.q
            r16 = r15
            r17 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            int r15 = r0.k
            r24 = r15
            r93 = r1
            r94 = r2
            long r1 = r0.l
            r25 = r1
            boolean r1 = r0.m
            r27 = r1
            long r1 = r0.n
            r28 = r1
            java.lang.String r1 = r0.o
            r30 = r1
            java.lang.String r1 = r0.p
            r31 = r1
            r32 = 0
            r34 = 0
            int r1 = r0.r
            r36 = r1
            int r1 = r0.s
            r39 = r1
            long r1 = r0.t
            r42 = r1
            int r1 = r0.u
            r44 = r1
            int r1 = r0.v
            r45 = r1
            long r1 = r0.w
            r46 = r1
            java.util.List r1 = r0.i
            r48 = r1
            ix8 r0 = r0.j
            r49 = r0
            r15 = r37
            r21 = r38
            r22 = r40
            r37 = r90
            r40 = r41
            r41 = r52
            r1 = r93
            r2 = r94
            r1.<init>(r2, r4, r6, r8, r10, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r27, r28, r30, r31, r32, r34, r36, r37, r39, r40, r41, r42, r44, r45, r46, r48, r49, r50, r51)
            t19 r0 = r89.d()
            r1 = r92
            long r0 = r0.f(r1)
            java.util.Iterator r2 = r53.iterator()
        L_0x01bb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01cf
            java.lang.Object r3 = r2.next()
            lna r3 = (defpackage.lna) r3
            r10 = r89
            r14 = r90
            r10.g(r3, r14)
            goto L_0x01bb
        L_0x01cf:
            return r0
        L_0x01d0:
            r10 = r0
            if (r9 == 0) goto L_0x01e1
            r1 = r89
            r2 = r90
            r4 = r20
            r6 = r94
            r7 = r95
            r1.p(r2, r4, r6, r7)
            goto L_0x01f1
        L_0x01e1:
            if (r13 == 0) goto L_0x01f1
            oz7 r0 = defpackage.iu8.b
            r6 = 0
            r1 = r89
            r2 = r94
            r3 = r90
            r5 = r95
            r1.o(r2, r3, r5, r6)
        L_0x01f1:
            t19 r0 = r89.d()
            long r1 = r11.a
            ru8 r0 = r0.b(r14, r1)
            if (r0 == 0) goto L_0x0202
            cu8 r0 = r10.b(r0)
            goto L_0x0203
        L_0x0202:
            r0 = 0
        L_0x0203:
            if (r0 == 0) goto L_0x0225
            ic2 r1 = new ic2
            r1.<init>(r10, r14, r8)
            wz r2 = r11.s0
            vxc r3 = r10.b
            r23 = r2
            r24 = r3
            r29 = r1
            k8g r1 = defpackage.iz7.h(r23, r24, r25, r27, r29)
            xt8 r2 = new xt8
            r3 = r95
            r2.<init>((defpackage.cu8) r0, (defpackage.k8g) r1, (boolean) r3)
            long r0 = r0.b
            r10.n(r0, r2)
            return r0
        L_0x0225:
            t19 r0 = r89.d()
            r0.getClass()
            java.lang.String r3 = "SELECT * FROM messages WHERE server_id = ?"
            xlc r3 = defpackage.xlc.a(r8, r3)
            r3.j(r8, r1)
            ilc r1 = r0.a
            r1.b()
            r2 = 0
            android.database.Cursor r1 = r1.o(r3, r2)
            java.lang.String r4 = "id"
            int r4 = defpackage.tfg.n(r1, r4)     // Catch:{ all -> 0x04f7 }
            java.lang.String r5 = "server_id"
            int r5 = defpackage.tfg.n(r1, r5)     // Catch:{ all -> 0x04f7 }
            java.lang.String r6 = "time"
            int r6 = defpackage.tfg.n(r1, r6)     // Catch:{ all -> 0x04f7 }
            java.lang.String r7 = "update_time"
            int r7 = defpackage.tfg.n(r1, r7)     // Catch:{ all -> 0x04f7 }
            java.lang.String r9 = "sender"
            int r9 = defpackage.tfg.n(r1, r9)     // Catch:{ all -> 0x04f7 }
            java.lang.String r10 = "cid"
            int r10 = defpackage.tfg.n(r1, r10)     // Catch:{ all -> 0x04f7 }
            java.lang.String r11 = "text"
            int r11 = defpackage.tfg.n(r1, r11)     // Catch:{ all -> 0x04f7 }
            java.lang.String r12 = "delivery_status"
            int r12 = defpackage.tfg.n(r1, r12)     // Catch:{ all -> 0x04f7 }
            java.lang.String r13 = "status"
            int r13 = defpackage.tfg.n(r1, r13)     // Catch:{ all -> 0x04f7 }
            java.lang.String r14 = "time_local"
            int r14 = defpackage.tfg.n(r1, r14)     // Catch:{ all -> 0x04f7 }
            java.lang.String r15 = "error"
            int r15 = defpackage.tfg.n(r1, r15)     // Catch:{ all -> 0x04f7 }
            java.lang.String r2 = "localized_error"
            int r2 = defpackage.tfg.n(r1, r2)     // Catch:{ all -> 0x04f7 }
            java.lang.String r8 = "attaches"
            int r8 = defpackage.tfg.n(r1, r8)     // Catch:{ all -> 0x04f7 }
            r89 = r3
            java.lang.String r3 = "media_type"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r90 = r3
            java.lang.String r3 = "detect_share"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r91 = r3
            java.lang.String r3 = "msg_link_type"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r92 = r3
            java.lang.String r3 = "msg_link_id"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r93 = r3
            java.lang.String r3 = "inserted_from_msg_link"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r94 = r3
            java.lang.String r3 = "msg_link_chat_id"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r95 = r3
            java.lang.String r3 = "msg_link_chat_name"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r20 = r3
            java.lang.String r3 = "msg_link_chat_link"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r21 = r3
            java.lang.String r3 = "msg_link_out_chat_id"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r23 = r3
            java.lang.String r3 = "msg_link_out_msg_id"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r24 = r3
            java.lang.String r3 = "type"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r25 = r3
            java.lang.String r3 = "chat_id"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r26 = r3
            java.lang.String r3 = "ttl"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r27 = r3
            java.lang.String r3 = "channel_views"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r28 = r3
            java.lang.String r3 = "channel_forwards"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r29 = r3
            java.lang.String r3 = "view_time"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r30 = r3
            java.lang.String r3 = "zoom"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r31 = r3
            java.lang.String r3 = "options"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r32 = r3
            java.lang.String r3 = "live_until"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r33 = r3
            java.lang.String r3 = "elements"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r34 = r3
            java.lang.String r3 = "reactions"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r35 = r3
            java.lang.String r3 = "delayed_attrs_time_to_fire"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            r36 = r3
            java.lang.String r3 = "delayed_attrs_notify_sender"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x04e7 }
            boolean r37 = r1.moveToFirst()     // Catch:{ all -> 0x04e7 }
            if (r37 == 0) goto L_0x04e9
            long r39 = r1.getLong(r4)     // Catch:{ all -> 0x04e7 }
            long r41 = r1.getLong(r5)     // Catch:{ all -> 0x04e7 }
            long r43 = r1.getLong(r6)     // Catch:{ all -> 0x04e7 }
            long r45 = r1.getLong(r7)     // Catch:{ all -> 0x04e7 }
            long r47 = r1.getLong(r9)     // Catch:{ all -> 0x04e7 }
            long r49 = r1.getLong(r10)     // Catch:{ all -> 0x04e7 }
            boolean r4 = r1.isNull(r11)     // Catch:{ all -> 0x04e7 }
            if (r4 == 0) goto L_0x036c
            r51 = 0
            goto L_0x0372
        L_0x036c:
            java.lang.String r4 = r1.getString(r11)     // Catch:{ all -> 0x04e7 }
            r51 = r4
        L_0x0372:
            int r4 = r1.getInt(r12)     // Catch:{ all -> 0x04e7 }
            v89 r5 = r0.a()     // Catch:{ all -> 0x04e7 }
            r5.getClass()     // Catch:{ all -> 0x04e7 }
            oz7 r5 = defpackage.iu8.b     // Catch:{ all -> 0x04e7 }
            r5.getClass()     // Catch:{ all -> 0x04e7 }
            iu8 r52 = defpackage.oz7.n(r4)     // Catch:{ all -> 0x04e7 }
            int r4 = r1.getInt(r13)     // Catch:{ all -> 0x04e7 }
            v89 r5 = r0.a()     // Catch:{ all -> 0x04e7 }
            r5.getClass()     // Catch:{ all -> 0x04e7 }
            vx8 r53 = defpackage.v89.b(r4)     // Catch:{ all -> 0x04e7 }
            long r54 = r1.getLong(r14)     // Catch:{ all -> 0x04e7 }
            boolean r4 = r1.isNull(r15)     // Catch:{ all -> 0x04e7 }
            if (r4 == 0) goto L_0x03a2
            r56 = 0
            goto L_0x03a8
        L_0x03a2:
            java.lang.String r4 = r1.getString(r15)     // Catch:{ all -> 0x04e7 }
            r56 = r4
        L_0x03a8:
            boolean r4 = r1.isNull(r2)     // Catch:{ all -> 0x04e7 }
            if (r4 == 0) goto L_0x03b1
            r57 = 0
            goto L_0x03b7
        L_0x03b1:
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x04e7 }
            r57 = r2
        L_0x03b7:
            boolean r2 = r1.isNull(r8)     // Catch:{ all -> 0x04e7 }
            if (r2 == 0) goto L_0x03bf
            r2 = 0
            goto L_0x03c3
        L_0x03bf:
            byte[] r2 = r1.getBlob(r8)     // Catch:{ all -> 0x04e7 }
        L_0x03c3:
            v89 r4 = r0.a()     // Catch:{ all -> 0x04e7 }
            r4.getClass()     // Catch:{ all -> 0x04e7 }
            k8g r58 = defpackage.iz7.b(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r90
            int r59 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r91
            int r2 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            if (r2 == 0) goto L_0x03e1
            r2 = r92
            r60 = 1
            goto L_0x03e5
        L_0x03e1:
            r2 = r92
            r60 = 0
        L_0x03e5:
            int r61 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r93
            long r62 = r1.getLong(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r94
            int r2 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            if (r2 == 0) goto L_0x03fc
            r2 = r95
            r64 = 1
            goto L_0x0400
        L_0x03fc:
            r2 = r95
            r64 = 0
        L_0x0400:
            long r65 = r1.getLong(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r20
            boolean r4 = r1.isNull(r2)     // Catch:{ all -> 0x04e7 }
            if (r4 == 0) goto L_0x0411
            r2 = r21
            r67 = 0
            goto L_0x0419
        L_0x0411:
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x04e7 }
            r67 = r2
            r2 = r21
        L_0x0419:
            boolean r4 = r1.isNull(r2)     // Catch:{ all -> 0x04e7 }
            if (r4 == 0) goto L_0x0424
            r2 = r23
            r68 = 0
            goto L_0x042c
        L_0x0424:
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x04e7 }
            r68 = r2
            r2 = r23
        L_0x042c:
            long r69 = r1.getLong(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r24
            long r71 = r1.getLong(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r25
            int r2 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            v89 r4 = r0.a()     // Catch:{ all -> 0x04e7 }
            r4.getClass()     // Catch:{ all -> 0x04e7 }
            int r73 = defpackage.ey8.a(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r26
            long r74 = r1.getLong(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r27
            int r76 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r28
            int r77 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r29
            int r78 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r30
            long r79 = r1.getLong(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r31
            int r81 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r32
            int r82 = r1.getInt(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r33
            long r83 = r1.getLong(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r34
            boolean r4 = r1.isNull(r2)     // Catch:{ all -> 0x04e7 }
            if (r4 == 0) goto L_0x0481
            r2 = 0
            goto L_0x0485
        L_0x0481:
            byte[] r2 = r1.getBlob(r2)     // Catch:{ all -> 0x04e7 }
        L_0x0485:
            v89 r4 = r0.a()     // Catch:{ all -> 0x04e7 }
            r4.getClass()     // Catch:{ all -> 0x04e7 }
            java.util.List r85 = defpackage.v89.a(r2)     // Catch:{ all -> 0x04e7 }
            r2 = r35
            boolean r4 = r1.isNull(r2)     // Catch:{ all -> 0x04e7 }
            if (r4 == 0) goto L_0x049a
            r2 = 0
            goto L_0x049e
        L_0x049a:
            byte[] r2 = r1.getBlob(r2)     // Catch:{ all -> 0x04e7 }
        L_0x049e:
            v89 r0 = r0.a()     // Catch:{ all -> 0x04e7 }
            ix8 r86 = r0.c(r2)     // Catch:{ all -> 0x04e7 }
            r0 = r36
            boolean r2 = r1.isNull(r0)     // Catch:{ all -> 0x04e7 }
            if (r2 == 0) goto L_0x04b1
            r87 = 0
            goto L_0x04bb
        L_0x04b1:
            long r4 = r1.getLong(r0)     // Catch:{ all -> 0x04e7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x04e7 }
            r87 = r0
        L_0x04bb:
            boolean r0 = r1.isNull(r3)     // Catch:{ all -> 0x04e7 }
            if (r0 == 0) goto L_0x04c3
            r0 = 0
            goto L_0x04cb
        L_0x04c3:
            int r0 = r1.getInt(r3)     // Catch:{ all -> 0x04e7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x04e7 }
        L_0x04cb:
            if (r0 != 0) goto L_0x04d0
            r88 = 0
            goto L_0x04df
        L_0x04d0:
            int r0 = r0.intValue()     // Catch:{ all -> 0x04e7 }
            if (r0 == 0) goto L_0x04d8
            r8 = 1
            goto L_0x04d9
        L_0x04d8:
            r8 = 0
        L_0x04d9:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x04e7 }
            r88 = r10
        L_0x04df:
            ru8 r10 = new ru8     // Catch:{ all -> 0x04e7 }
            r38 = r10
            r38.<init>(r39, r41, r43, r45, r47, r49, r51, r52, r53, r54, r56, r57, r58, r59, r60, r61, r62, r64, r65, r67, r68, r69, r71, r73, r74, r76, r77, r78, r79, r81, r82, r83, r85, r86, r87, r88)     // Catch:{ all -> 0x04e7 }
            goto L_0x04ea
        L_0x04e7:
            r0 = move-exception
            goto L_0x04fa
        L_0x04e9:
            r10 = 0
        L_0x04ea:
            r1.close()
            r89.n()
            if (r10 == 0) goto L_0x04f6
            long r0 = r10.a
            r16 = r0
        L_0x04f6:
            return r16
        L_0x04f7:
            r0 = move-exception
            r89 = r3
        L_0x04fa:
            r1.close()
            r89.n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlc.f(long, long, fs8, boolean):long");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, m20] */
    public final void g(lna lna, long j) {
        lna lna2 = lna;
        long j2 = lna2.a;
        k8g c2 = new Object().c();
        xxc xxc = mg4.o;
        nz4 nz4 = nz4.a;
        int c3 = iz7.c(c2);
        ru8 ru8 = new ru8(0, 0, 0, 0, 0, j2, lna2.b, iu8.SENDING, vx8.ACTIVE, 0, (String) null, (String) null, c2, c3, lna2.e, 0, 0, false, 0, (String) null, (String) null, 0, 0, 1, j, lna2.f, 0, 0, 0, 0, 0, 0, nz4, (ix8) null, (Long) null, (Boolean) null);
        d().f(ru8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ba, code lost:
        r11 = r11.I;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(defpackage.ru8 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.plc
            if (r0 == 0) goto L_0x0013
            r0 = r12
            plc r0 = (defpackage.plc) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.u0 = r1
            goto L_0x0018
        L_0x0013:
            plc r0 = new plc
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r6) goto L_0x0041
            if (r2 != r5) goto L_0x0039
            bu8 r10 = r0.Z
            bu8 r11 = r0.Y
            java.lang.Object r1 = r0.X
            bu8 r1 = (defpackage.bu8) r1
            java.lang.Object r0 = r0.o
            ru8 r0 = (defpackage.ru8) r0
            defpackage.od2.a0(r12)
            goto L_0x00af
        L_0x0039:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0041:
            bu8 r10 = r0.Z
            bu8 r11 = r0.Y
            java.lang.Object r2 = r0.X
            ru8 r2 = (defpackage.ru8) r2
            java.lang.Object r6 = r0.o
            vlc r6 = (defpackage.vlc) r6
            defpackage.od2.a0(r12)
            r9 = r12
            r12 = r11
            r11 = r2
            r2 = r9
            goto L_0x0075
        L_0x0055:
            defpackage.od2.a0(r12)
            bu8 r12 = m(r11)
            long r7 = r11.q
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x007d
            r0.o = r10
            r0.X = r11
            r0.Y = r12
            r0.Z = r12
            r0.u0 = r6
            java.lang.Object r2 = r10.k(r7, r0)
            if (r2 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r6 = r10
            r10 = r12
        L_0x0075:
            cu8 r2 = (defpackage.cu8) r2
            r10.r = r2
            r2 = r12
            r12 = r10
            r10 = r6
            goto L_0x007e
        L_0x007d:
            r2 = r12
        L_0x007e:
            r10.getClass()
            k8g r6 = r11.m
            if (r6 == 0) goto L_0x0094
            g20 r7 = defpackage.g20.b
            l20 r6 = r6.k(r7)
            if (r6 == 0) goto L_0x0094
            q10 r6 = r6.c
            if (r6 == 0) goto L_0x0094
            long r6 = r6.m
            goto L_0x0095
        L_0x0094:
            r6 = r3
        L_0x0095:
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b6
            r0.o = r11
            r0.X = r2
            r0.Y = r12
            r0.Z = r12
            r0.u0 = r5
            java.lang.Object r10 = r10.k(r6, r0)
            if (r10 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            r0 = r11
            r11 = r12
            r1 = r2
            r12 = r10
            r10 = r11
        L_0x00af:
            cu8 r12 = (defpackage.cu8) r12
            r10.z = r12
            r12 = r11
            r11 = r0
            r2 = r1
        L_0x00b6:
            java.lang.Long r10 = r11.H
            if (r10 == 0) goto L_0x00cc
            java.lang.Boolean r11 = r11.I
            if (r11 == 0) goto L_0x00cc
            ng4 r0 = new ng4
            long r3 = r10.longValue()
            boolean r10 = r11.booleanValue()
            r0.<init>(r3, r10)
            goto L_0x00cd
        L_0x00cc:
            r0 = 0
        L_0x00cd:
            r12.H = r0
            cu8 r10 = r2.a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlc.h(ru8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.yw8 i(long r44, defpackage.fs8 r46, long r47, boolean r49, long r50, defpackage.vx8 r52) {
        /*
            r43 = this;
            r0 = r46
            aw8 r1 = r0.t0
            r2 = 3
            r3 = 0
            r5 = 0
            if (r1 == 0) goto L_0x0021
            int r6 = (r47 > r3 ? 1 : (r47 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x0021
            int r6 = r1.a
            if (r6 != r2) goto L_0x0021
            fs8 r6 = r1.c
            java.lang.String r7 = r6.Z
            java.util.List r6 = r6.C0
            java.util.ArrayList r6 = defpackage.iz7.u(r6)
            r22 = r6
            r21 = r7
            goto L_0x0039
        L_0x0021:
            java.lang.String r6 = r0.Z
            if (r6 == 0) goto L_0x002e
            java.lang.CharSequence r6 = defpackage.w9e.b1(r6)
            java.lang.String r6 = r6.toString()
            goto L_0x002f
        L_0x002e:
            r6 = r5
        L_0x002f:
            java.util.List r7 = r0.C0
            java.util.ArrayList r7 = defpackage.iz7.u(r7)
            r21 = r6
            r22 = r7
        L_0x0039:
            r6 = 2
            r7 = 1
            fy8 r8 = r0.u0
            if (r8 != 0) goto L_0x0042
        L_0x003f:
            r33 = r6
            goto L_0x0058
        L_0x0042:
            int r8 = r8.ordinal()
            if (r8 == r7) goto L_0x003f
            if (r8 == r6) goto L_0x0053
            r9 = 4
            if (r8 == r2) goto L_0x0056
            if (r8 == r9) goto L_0x0052
            r33 = r7
            goto L_0x0058
        L_0x0052:
            r2 = 5
        L_0x0053:
            r33 = r2
            goto L_0x0058
        L_0x0056:
            r33 = r9
        L_0x0058:
            if (r52 != 0) goto L_0x0063
            wx8 r2 = r0.X
            vx8 r2 = defpackage.iz7.q(r2)
            r32 = r2
            goto L_0x0065
        L_0x0063:
            r32 = r52
        L_0x0065:
            fx8 r8 = r0.E0
            if (r8 == 0) goto L_0x00ba
            r9 = r43
            je7 r9 = r9.d
            java.lang.Object r9 = r9.getValue()
            jx8 r9 = (defpackage.jx8) r9
            java.util.List r10 = r8.a
            int r11 = r10.size()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            if (r11 <= 0) goto L_0x00b6
            r13 = 0
        L_0x0081:
            if (r13 >= r11) goto L_0x00a4
            java.lang.Object r14 = r10.get(r13)
            cx8 r14 = (defpackage.cx8) r14
            bx8 r14 = r14.a
            hx8 r15 = new hx8
            c6c r14 = r9.d(r14)
            java.lang.Object r16 = r10.get(r13)
            r2 = r16
            cx8 r2 = (defpackage.cx8) r2
            int r2 = r2.b
            r15.<init>(r14, r2)
            r12.add(r15)
            int r13 = r13 + 1
            goto L_0x0081
        L_0x00a4:
            ix8 r2 = new ix8
            bx8 r10 = r8.c
            if (r10 != 0) goto L_0x00ac
            r9 = r5
            goto L_0x00b0
        L_0x00ac:
            c6c r9 = r9.d(r10)
        L_0x00b0:
            int r8 = r8.b
            r2.<init>(r12, r8, r9)
            goto L_0x00b7
        L_0x00b6:
            r2 = r5
        L_0x00b7:
            r23 = r2
            goto L_0x00bc
        L_0x00ba:
            r23 = r5
        L_0x00bc:
            if (r1 == 0) goto L_0x00c1
            int r2 = r1.a
            goto L_0x00c2
        L_0x00c1:
            r2 = 0
        L_0x00c2:
            if (r2 != 0) goto L_0x00c7
        L_0x00c4:
            r24 = 0
            goto L_0x00d5
        L_0x00c7:
            int r2 = defpackage.au1.s(r2)
            if (r2 == r7) goto L_0x00d3
            if (r2 == r6) goto L_0x00d0
            goto L_0x00c4
        L_0x00d0:
            r24 = r6
            goto L_0x00d5
        L_0x00d3:
            r24 = r7
        L_0x00d5:
            if (r1 == 0) goto L_0x00d9
            long r3 = r1.b
        L_0x00d9:
            r28 = r3
            if (r1 == 0) goto L_0x00e2
            java.lang.String r2 = r1.o
            r30 = r2
            goto L_0x00e4
        L_0x00e2:
            r30 = r5
        L_0x00e4:
            if (r1 == 0) goto L_0x00eb
            java.lang.String r1 = r1.X
            r31 = r1
            goto L_0x00ed
        L_0x00eb:
            r31 = r5
        L_0x00ed:
            ng4 r1 = r0.D0
            if (r1 == 0) goto L_0x00fa
            long r2 = r1.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r41 = r2
            goto L_0x00fc
        L_0x00fa:
            r41 = r5
        L_0x00fc:
            if (r1 == 0) goto L_0x0104
            boolean r1 = r1.b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
        L_0x0104:
            r42 = r5
            yw8 r1 = new yw8
            r6 = r1
            int r2 = r0.z0
            r38 = r2
            long r2 = r0.A0
            r39 = r2
            long r9 = r0.a
            long r11 = r0.b
            long r2 = r0.c
            r15 = r2
            long r2 = r0.o
            r17 = r2
            long r2 = r0.Y
            r19 = r2
            int r2 = r0.w0
            r34 = r2
            long r2 = r0.x0
            r35 = r2
            int r0 = r0.y0
            r37 = r0
            r7 = r50
            r13 = r44
            r25 = r47
            r27 = r49
            r6.<init>(r7, r9, r11, r13, r15, r17, r19, r21, r22, r23, r24, r25, r27, r28, r30, r31, r32, r33, r34, r35, r37, r38, r39, r41, r42)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlc.i(long, fs8, long, boolean, long, vx8):yw8");
    }

    public final Object j(long j, long j2, Continuation continuation) {
        return j47.t0(((w9a) c()).b(), new slc(this, j, j2, (Continuation) null), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ulc
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ulc r0 = (defpackage.ulc) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            ulc r0 = new ulc
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0038
            if (r2 == r3) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            defpackage.od2.a0(r8)
            goto L_0x0073
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            vlc r5 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x0063
        L_0x0038:
            defpackage.od2.a0(r8)
            t19 r8 = r5.d()
            r0.o = r5
            r0.Z = r3
            r8.getClass()
            java.lang.String r2 = "SELECT * FROM messages WHERE id = ?"
            xlc r2 = defpackage.xlc.a(r3, r2)
            r2.j(r3, r6)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            r19 r7 = new r19
            r3 = 0
            r7.<init>(r8, r2, r3)
            ilc r8 = r8.a
            java.lang.Object r8 = defpackage.ote.i(r8, r6, r7, r0)
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            ru8 r8 = (defpackage.ru8) r8
            r6 = 0
            if (r8 == 0) goto L_0x0076
            r0.o = r6
            r0.Z = r4
            java.lang.Object r8 = r5.h(r8, r0)
            if (r8 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r6 = r8
            cu8 r6 = (defpackage.cu8) r6
        L_0x0076:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlc.k(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ArrayList l(long j, long j2, Set set, Integer num, boolean z) {
        ArrayList<ru8> arrayList;
        xlc xlc;
        String str;
        int i;
        boolean z2;
        int i2;
        String str2;
        int i3;
        String str3;
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        Long l;
        int i7;
        Boolean bool;
        String str4;
        String str5;
        xlc xlc2;
        String str6;
        int i8;
        boolean z3;
        int i9;
        String str7;
        int i10;
        String str8;
        int i11;
        int i12;
        int i13;
        byte[] bArr2;
        Long l2;
        int i14;
        Boolean bool2;
        String str9;
        String str10;
        long j3 = j2;
        List singletonList = Collections.singletonList(Long.valueOf(j));
        t19 d2 = d();
        List<Long> D0 = x53.D0(singletonList);
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        ilc ilc = d2.a;
        String str11 = "delayed_attrs_notify_sender";
        String str12 = "delayed_attrs_time_to_fire";
        String str13 = "reactions";
        String str14 = "elements";
        String str15 = "live_until";
        String str16 = "options";
        String str17 = "zoom";
        String str18 = "view_time";
        String str19 = "channel_forwards";
        String str20 = "channel_views";
        String str21 = "ttl";
        String str22 = "chat_id";
        String str23 = "type";
        String str24 = "msg_link_out_msg_id";
        String str25 = "msg_link_out_chat_id";
        String str26 = "msg_link_chat_link";
        String str27 = "msg_link_chat_name";
        String str28 = "msg_link_chat_id";
        String str29 = "inserted_from_msg_link";
        String str30 = "msg_link_id";
        String str31 = "msg_link_type";
        String str32 = "detect_share";
        String str33 = "media_type";
        String str34 = "update_time";
        String str35 = "attaches";
        String str36 = "time";
        String str37 = "localized_error";
        String str38 = "error";
        String str39 = "time_local";
        String str40 = "status";
        String str41 = "delivery_status";
        if (z) {
            String str42 = "text";
            StringBuilder l3 = au1.l("SELECT * FROM messages WHERE chat_id in (");
            String str43 = "cid";
            int size = D0.size();
            a14.c(l3, size);
            l3.append(") AND media_type in (");
            int size2 = set.size();
            a14.c(l3, size2);
            String str44 = "sender";
            l3.append(") AND time <= ");
            l3.append("?");
            l3.append(" AND inserted_from_msg_link = 0 AND status <> ");
            l3.append("?");
            l3.append(" ORDER BY time DESC LIMIT ");
            l3.append("?");
            int i15 = size + 3 + size2;
            xlc a2 = xlc.a(i15, l3.toString());
            int i16 = 1;
            for (Long l4 : D0) {
                if (l4 == null) {
                    a2.W(i16);
                    str10 = str34;
                    str9 = str36;
                } else {
                    str10 = str34;
                    str9 = str36;
                    a2.j(i16, l4.longValue());
                }
                i16++;
                str34 = str10;
                str36 = str9;
            }
            String str45 = str34;
            String str46 = str36;
            int i17 = size + 1;
            Iterator it = set.iterator();
            int i18 = i17;
            while (it.hasNext()) {
                Integer num2 = (Integer) it.next();
                if (num2 == null) {
                    a2.W(i18);
                } else {
                    a2.j(i18, (long) num2.intValue());
                }
                i18++;
            }
            a2.j(i17 + size2, j3);
            d2.a().getClass();
            a2.j(size + 2 + size2, (long) 10);
            a2.j(i15, (long) intValue);
            ilc.b();
            Cursor o = ilc.o(a2, (CancellationSignal) null);
            try {
                int n = tfg.n(o, "id");
                int n2 = tfg.n(o, "server_id");
                int n3 = tfg.n(o, str46);
                int n4 = tfg.n(o, str45);
                int n5 = tfg.n(o, str44);
                int n6 = tfg.n(o, str43);
                int n7 = tfg.n(o, str42);
                int n8 = tfg.n(o, str41);
                int n9 = tfg.n(o, str40);
                int n10 = tfg.n(o, str39);
                int n11 = tfg.n(o, str38);
                int n12 = tfg.n(o, str37);
                int n13 = tfg.n(o, str35);
                xlc2 = a2;
                try {
                    int n14 = tfg.n(o, str33);
                    int n15 = tfg.n(o, str32);
                    int n16 = tfg.n(o, str31);
                    int n17 = tfg.n(o, str30);
                    int n18 = tfg.n(o, str29);
                    int n19 = tfg.n(o, str28);
                    int n20 = tfg.n(o, str27);
                    int n21 = tfg.n(o, str26);
                    int n22 = tfg.n(o, str25);
                    int n23 = tfg.n(o, str24);
                    int n24 = tfg.n(o, str23);
                    int n25 = tfg.n(o, str22);
                    int n26 = tfg.n(o, str21);
                    int n27 = tfg.n(o, str20);
                    int n28 = tfg.n(o, str19);
                    int n29 = tfg.n(o, str18);
                    int n30 = tfg.n(o, str17);
                    int n31 = tfg.n(o, str16);
                    int n32 = tfg.n(o, str15);
                    int n33 = tfg.n(o, str14);
                    int n34 = tfg.n(o, str13);
                    int n35 = tfg.n(o, str12);
                    int n36 = tfg.n(o, str11);
                    int i19 = n13;
                    arrayList = new ArrayList<>(o.getCount());
                    while (o.moveToNext()) {
                        long j4 = o.getLong(n);
                        long j5 = o.getLong(n2);
                        long j6 = o.getLong(n3);
                        long j7 = o.getLong(n4);
                        long j8 = o.getLong(n5);
                        long j9 = o.getLong(n6);
                        String string = o.isNull(n7) ? null : o.getString(n7);
                        int i20 = o.getInt(n8);
                        d2.a().getClass();
                        iu8.b.getClass();
                        iu8 n37 = oz7.n(i20);
                        int i21 = o.getInt(n9);
                        d2.a().getClass();
                        vx8 b2 = v89.b(i21);
                        long j10 = o.getLong(n10);
                        String string2 = o.isNull(n11) ? null : o.getString(n11);
                        if (o.isNull(n12)) {
                            i8 = i19;
                            str6 = null;
                        } else {
                            str6 = o.getString(n12);
                            i8 = i19;
                        }
                        byte[] blob = o.isNull(i8) ? null : o.getBlob(i8);
                        d2.a().getClass();
                        k8g b3 = iz7.b(blob);
                        int i22 = n;
                        int i23 = n14;
                        int i24 = o.getInt(i23);
                        n14 = i23;
                        int i25 = n15;
                        n15 = i25;
                        boolean z4 = o.getInt(i25) != 0;
                        int i26 = n16;
                        int i27 = o.getInt(i26);
                        n16 = i26;
                        int i28 = n17;
                        long j11 = o.getLong(i28);
                        n17 = i28;
                        int i29 = n18;
                        if (o.getInt(i29) != 0) {
                            n18 = i29;
                            i9 = n19;
                            z3 = true;
                        } else {
                            n18 = i29;
                            i9 = n19;
                            z3 = false;
                        }
                        long j12 = o.getLong(i9);
                        n19 = i9;
                        int i30 = n20;
                        if (o.isNull(i30)) {
                            n20 = i30;
                            i10 = n21;
                            str7 = null;
                        } else {
                            str7 = o.getString(i30);
                            n20 = i30;
                            i10 = n21;
                        }
                        if (o.isNull(i10)) {
                            n21 = i10;
                            i11 = n22;
                            str8 = null;
                        } else {
                            str8 = o.getString(i10);
                            n21 = i10;
                            i11 = n22;
                        }
                        long j13 = o.getLong(i11);
                        n22 = i11;
                        int i31 = n23;
                        long j14 = o.getLong(i31);
                        n23 = i31;
                        int i32 = n24;
                        int i33 = o.getInt(i32);
                        d2.a().getClass();
                        int a3 = ey8.a(i33);
                        n24 = i32;
                        int i34 = n25;
                        long j15 = o.getLong(i34);
                        n25 = i34;
                        int i35 = n26;
                        int i36 = o.getInt(i35);
                        n26 = i35;
                        int i37 = n27;
                        int i38 = o.getInt(i37);
                        n27 = i37;
                        int i39 = n28;
                        int i40 = o.getInt(i39);
                        n28 = i39;
                        int i41 = n29;
                        long j16 = o.getLong(i41);
                        n29 = i41;
                        int i42 = n30;
                        int i43 = o.getInt(i42);
                        n30 = i42;
                        int i44 = n31;
                        int i45 = o.getInt(i44);
                        n31 = i44;
                        int i46 = n32;
                        long j17 = o.getLong(i46);
                        n32 = i46;
                        int i47 = n33;
                        byte[] blob2 = o.isNull(i47) ? null : o.getBlob(i47);
                        d2.a().getClass();
                        List a4 = v89.a(blob2);
                        n33 = i47;
                        int i48 = n34;
                        if (o.isNull(i48)) {
                            i12 = i48;
                            i13 = n2;
                            bArr2 = null;
                        } else {
                            i12 = i48;
                            bArr2 = o.getBlob(i48);
                            i13 = n2;
                        }
                        ix8 c2 = d2.a().c(bArr2);
                        int i49 = n35;
                        if (o.isNull(i49)) {
                            i14 = n36;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(o.getLong(i49));
                            i14 = n36;
                        }
                        Integer valueOf = o.isNull(i14) ? null : Integer.valueOf(o.getInt(i14));
                        if (valueOf == null) {
                            n35 = i49;
                            bool2 = null;
                        } else {
                            bool2 = Boolean.valueOf(valueOf.intValue() != 0);
                            n35 = i49;
                        }
                        arrayList.add(new ru8(j4, j5, j6, j7, j8, j9, string, n37, b2, j10, string2, str6, b3, i24, z4, i27, j11, z3, j12, str7, str8, j13, j14, a3, j15, i36, i38, i40, j16, i43, i45, j17, a4, c2, l2, bool2));
                        n36 = i14;
                        n2 = i13;
                        n = i22;
                        n34 = i12;
                        i19 = i8;
                    }
                    o.close();
                    xlc2.n();
                } catch (Throwable th) {
                    th = th;
                    o.close();
                    xlc2.n();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                xlc2 = a2;
                o.close();
                xlc2.n();
                throw th;
            }
        } else {
            String str47 = "text";
            String str48 = str36;
            String str49 = str34;
            StringBuilder l5 = au1.l("SELECT * FROM messages WHERE chat_id in (");
            String str50 = "cid";
            int size3 = D0.size();
            a14.c(l5, size3);
            l5.append(") AND media_type in (");
            int size4 = set.size();
            a14.c(l5, size4);
            String str51 = "sender";
            l5.append(") AND time >= ");
            l5.append("?");
            l5.append(" AND inserted_from_msg_link = 0 AND status <> ");
            l5.append("?");
            l5.append(" ORDER BY time ASC LIMIT ");
            l5.append("?");
            int i50 = size3 + 3 + size4;
            xlc a5 = xlc.a(i50, l5.toString());
            int i51 = 1;
            for (Long l6 : D0) {
                if (l6 == null) {
                    a5.W(i51);
                    str4 = str48;
                    str5 = str49;
                } else {
                    str4 = str48;
                    str5 = str49;
                    a5.j(i51, l6.longValue());
                }
                i51++;
                str49 = str5;
                str48 = str4;
            }
            String str52 = str48;
            String str53 = str49;
            int i52 = size3 + 1;
            Iterator it2 = set.iterator();
            int i53 = i52;
            while (it2.hasNext()) {
                Integer num3 = (Integer) it2.next();
                if (num3 == null) {
                    a5.W(i53);
                } else {
                    a5.j(i53, (long) num3.intValue());
                }
                i53++;
            }
            a5.j(i52 + size4, j3);
            d2.a().getClass();
            a5.j(size3 + 2 + size4, (long) 10);
            a5.j(i50, (long) intValue);
            ilc.b();
            Cursor o2 = ilc.o(a5, (CancellationSignal) null);
            try {
                int n38 = tfg.n(o2, "id");
                int n39 = tfg.n(o2, "server_id");
                int n40 = tfg.n(o2, str52);
                int n41 = tfg.n(o2, str53);
                int n42 = tfg.n(o2, str51);
                int n43 = tfg.n(o2, str50);
                int n44 = tfg.n(o2, str47);
                int n45 = tfg.n(o2, str41);
                int n46 = tfg.n(o2, str40);
                int n47 = tfg.n(o2, str39);
                int n48 = tfg.n(o2, str38);
                int n49 = tfg.n(o2, str37);
                int n50 = tfg.n(o2, str35);
                xlc = a5;
                try {
                    int n51 = tfg.n(o2, str33);
                    int n52 = tfg.n(o2, str32);
                    int n53 = tfg.n(o2, str31);
                    int n54 = tfg.n(o2, str30);
                    int n55 = tfg.n(o2, str29);
                    int n56 = tfg.n(o2, str28);
                    int n57 = tfg.n(o2, str27);
                    int n58 = tfg.n(o2, str26);
                    int n59 = tfg.n(o2, str25);
                    int n60 = tfg.n(o2, str24);
                    int n61 = tfg.n(o2, str23);
                    int n62 = tfg.n(o2, str22);
                    int n63 = tfg.n(o2, str21);
                    int n64 = tfg.n(o2, str20);
                    int n65 = tfg.n(o2, str19);
                    int n66 = tfg.n(o2, str18);
                    int n67 = tfg.n(o2, str17);
                    int n68 = tfg.n(o2, str16);
                    int n69 = tfg.n(o2, str15);
                    int n70 = tfg.n(o2, str14);
                    int n71 = tfg.n(o2, str13);
                    int n72 = tfg.n(o2, str12);
                    int n73 = tfg.n(o2, str11);
                    int i54 = n50;
                    arrayList = new ArrayList<>(o2.getCount());
                    while (o2.moveToNext()) {
                        long j18 = o2.getLong(n38);
                        long j19 = o2.getLong(n39);
                        long j20 = o2.getLong(n40);
                        long j21 = o2.getLong(n41);
                        long j22 = o2.getLong(n42);
                        long j23 = o2.getLong(n43);
                        String string3 = o2.isNull(n44) ? null : o2.getString(n44);
                        int i55 = o2.getInt(n45);
                        d2.a().getClass();
                        iu8.b.getClass();
                        iu8 n74 = oz7.n(i55);
                        int i56 = o2.getInt(n46);
                        d2.a().getClass();
                        vx8 b4 = v89.b(i56);
                        long j24 = o2.getLong(n47);
                        String string4 = o2.isNull(n48) ? null : o2.getString(n48);
                        if (o2.isNull(n49)) {
                            i = i54;
                            str = null;
                        } else {
                            str = o2.getString(n49);
                            i = i54;
                        }
                        byte[] blob3 = o2.isNull(i) ? null : o2.getBlob(i);
                        d2.a().getClass();
                        k8g b5 = iz7.b(blob3);
                        i54 = i;
                        int i57 = n51;
                        int i58 = o2.getInt(i57);
                        n51 = i57;
                        int i59 = n52;
                        n52 = i59;
                        boolean z5 = o2.getInt(i59) != 0;
                        int i60 = n53;
                        int i61 = o2.getInt(i60);
                        n53 = i60;
                        int i62 = n54;
                        long j25 = o2.getLong(i62);
                        n54 = i62;
                        int i63 = n55;
                        if (o2.getInt(i63) != 0) {
                            n55 = i63;
                            i2 = n56;
                            z2 = true;
                        } else {
                            n55 = i63;
                            i2 = n56;
                            z2 = false;
                        }
                        long j26 = o2.getLong(i2);
                        n56 = i2;
                        int i64 = n57;
                        if (o2.isNull(i64)) {
                            n57 = i64;
                            i3 = n58;
                            str2 = null;
                        } else {
                            str2 = o2.getString(i64);
                            n57 = i64;
                            i3 = n58;
                        }
                        if (o2.isNull(i3)) {
                            n58 = i3;
                            i4 = n59;
                            str3 = null;
                        } else {
                            str3 = o2.getString(i3);
                            n58 = i3;
                            i4 = n59;
                        }
                        long j27 = o2.getLong(i4);
                        n59 = i4;
                        int i65 = n60;
                        long j28 = o2.getLong(i65);
                        n60 = i65;
                        int i66 = n61;
                        int i67 = o2.getInt(i66);
                        d2.a().getClass();
                        int a6 = ey8.a(i67);
                        n61 = i66;
                        int i68 = n62;
                        long j29 = o2.getLong(i68);
                        n62 = i68;
                        int i69 = n63;
                        int i70 = o2.getInt(i69);
                        n63 = i69;
                        int i71 = n64;
                        int i72 = o2.getInt(i71);
                        n64 = i71;
                        int i73 = n65;
                        int i74 = o2.getInt(i73);
                        n65 = i73;
                        int i75 = n66;
                        long j30 = o2.getLong(i75);
                        n66 = i75;
                        int i76 = n67;
                        int i77 = o2.getInt(i76);
                        n67 = i76;
                        int i78 = n68;
                        int i79 = o2.getInt(i78);
                        n68 = i78;
                        int i80 = n69;
                        long j31 = o2.getLong(i80);
                        n69 = i80;
                        int i81 = n70;
                        byte[] blob4 = o2.isNull(i81) ? null : o2.getBlob(i81);
                        d2.a().getClass();
                        List a7 = v89.a(blob4);
                        n70 = i81;
                        int i82 = n71;
                        if (o2.isNull(i82)) {
                            i5 = i82;
                            i6 = n38;
                            bArr = null;
                        } else {
                            i5 = i82;
                            bArr = o2.getBlob(i82);
                            i6 = n38;
                        }
                        ix8 c3 = d2.a().c(bArr);
                        int i83 = n72;
                        if (o2.isNull(i83)) {
                            i7 = n73;
                            l = null;
                        } else {
                            l = Long.valueOf(o2.getLong(i83));
                            i7 = n73;
                        }
                        Integer valueOf2 = o2.isNull(i7) ? null : Integer.valueOf(o2.getInt(i7));
                        if (valueOf2 == null) {
                            n72 = i83;
                            bool = null;
                        } else {
                            bool = Boolean.valueOf(valueOf2.intValue() != 0);
                            n72 = i83;
                        }
                        arrayList.add(new ru8(j18, j19, j20, j21, j22, j23, string3, n74, b4, j24, string4, str, b5, i58, z5, i61, j25, z2, j26, str2, str3, j27, j28, a6, j29, i70, i72, i74, j30, i77, i79, j31, a7, c3, l, bool));
                        n73 = i7;
                        n38 = i6;
                        n71 = i5;
                    }
                    o2.close();
                    xlc.n();
                } catch (Throwable th3) {
                    th = th3;
                    o2.close();
                    xlc.n();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                xlc = a5;
                o2.close();
                xlc.n();
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        for (ru8 b6 : arrayList) {
            arrayList2.add(b(b6));
        }
        return arrayList2;
    }

    public final void n(long j, qj3 qj3) {
        try {
            ((Number) ((OneMeRoomDatabase) this.a.m()).p(new d76(this, j, qj3))).intValue();
        } catch (Throwable th) {
            hm9.p("RoomMessagesDatabase", "Can't update attach", th);
        }
    }

    public final int o(fs8 fs8, long j, boolean z, vx8 vx8) {
        int i;
        iu8 iu8 = iu8.SENT;
        yw8 i2 = i(j, fs8, 0, z, 0, vx8);
        t19 d2 = d();
        long j2 = fs8.Y;
        ilc ilc = d2.a;
        ilc.c();
        try {
            ru8 h = d2.h(j, j2);
            if (h == null) {
                i = 0;
            } else {
                yw8 g = t19.g(d2, h, i2, j, (Long) null, Long.valueOf(j2), 8);
                d2.n(h.a, iu8);
                i = d2.l(g);
            }
            ilc.r();
            return i;
        } finally {
            ilc.l();
        }
    }

    public final int p(long j, long j2, fs8 fs8, boolean z) {
        int i;
        yw8 i2 = i(j, fs8, j2, z, 0, (vx8) null);
        t19 d2 = d();
        long j3 = fs8.a;
        ilc ilc = d2.a;
        ilc.c();
        try {
            ru8 b2 = d2.b(j, j3);
            if (b2 == null) {
                i = 0;
            } else {
                i = d2.l(t19.g(d2, b2, i2, j, Long.valueOf(j3), (Long) null, 16));
            }
            ilc.r();
            return i;
        } finally {
            ilc.l();
        }
    }

    public final void q(long j, Long l, Boolean bool) {
        t19 d2 = d();
        ilc ilc = d2.a;
        ilc.b();
        p19 p19 = d2.o;
        q36 f = p19.f();
        if (l == null) {
            f.W(1);
        } else {
            f.j(1, l.longValue());
        }
        Integer valueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
        if (valueOf == null) {
            f.W(2);
        } else {
            f.j(2, (long) valueOf.intValue());
        }
        f.j(3, j);
        try {
            ilc.c();
            f.n();
            ilc.r();
            ilc.l();
            p19.t(f);
        } catch (Throwable th) {
            p19.t(f);
            throw th;
        }
    }
}
