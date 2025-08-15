package defpackage;

import androidx.media3.common.PlaybackException;
import java.util.Iterator;

/* renamed from: gh9  reason: default package */
public final class gh9 implements n3b {
    public final /* synthetic */ uh9 a;

    public gh9(uh9 uh9) {
        this.a = uh9;
    }

    public final void G(int i, tb8 tb8) {
        tb8 R0;
        long l = this.a.l();
        ub8 m = this.a.m();
        uh9 uh9 = this.a;
        uh9.B = tb8;
        a98 a98 = uh9.m;
        uh9.x = a98 != null ? a98.b() : false;
        uh9 uh92 = this.a;
        a98 a982 = uh92.m;
        uh92.D = (a982 == null || (R0 = a982.R0()) == null) ? null : R0.d;
        uh9 uh93 = this.a;
        a98 a983 = uh93.m;
        int i2 = -1;
        uh93.C = uh9.d(uh93, a983 != null ? a983.h() : -1);
        uh9 uh94 = this.a;
        a98 a984 = uh94.m;
        if (a984 != null) {
            i2 = a984.i();
        }
        uh9.d(uh94, i2);
        a98 a985 = this.a.m;
        if (a985 != null) {
            a985.n1();
        }
        uh9 uh95 = this.a;
        hm9.m("uh9", "notifyListeners", new Object[0]);
        synchronized (uh95.o) {
            Iterator it = uh95.o.iterator();
            while (it.hasNext()) {
                ((fh9) it.next()).c(l, m, uh95.l(), uh95.m());
            }
        }
    }

    public final void Y(q3b q3b, l3b l3b) {
        float e = q3b.e();
        uh9 uh9 = this.a;
        a98 a98 = uh9.m;
        if (a98 != null) {
            a98.g(e);
        }
        uh9.E = q3b.c();
        q3b.n();
        tm5 tm5 = l3b.a;
        if (tm5.a.get(9)) {
            q3b.E0();
        }
        if (tm5.a.get(8)) {
            q3b.getRepeatMode();
        }
    }

    public final void b0(gd8 gd8) {
        uh9 uh9 = this.a;
        uh9.D = gd8;
        int i = uh9.K;
        hm9.m("uh9", "notifyListeners", new Object[0]);
        synchronized (uh9.o) {
            Iterator it = uh9.o.iterator();
            while (it.hasNext()) {
                fh9 fh9 = (fh9) it.next();
            }
        }
    }

    public final void h(int i) {
        tb8 R0;
        int i2 = uh9.K;
        hm9.m("uh9", "onPlaybackStateChanged " + i, new Object[0]);
        uh9 uh9 = this.a;
        uh9.v = i;
        a98 a98 = uh9.m;
        uh9.y = a98 != null && a98.getPlaybackState() == 2;
        uh9 uh92 = this.a;
        a98 a982 = uh92.m;
        uh92.x = a982 != null ? a982.b() : false;
        uh9 uh93 = this.a;
        a98 a983 = uh93.m;
        uh93.A = a983 != null && a983.getPlaybackState() == 4;
        uh9 uh94 = this.a;
        a98 a984 = uh94.m;
        uh94.B = a984 != null ? a984.R0() : null;
        uh9 uh95 = this.a;
        a98 a985 = uh95.m;
        uh95.D = (a985 == null || (R0 = a985.R0()) == null) ? null : R0.d;
        if (i == 1) {
            this.a.G.m((Object) null, Float.valueOf(0.0f));
            uh9 uh96 = this.a;
            uh96.w = false;
            uh96.f();
            uh9 uh97 = this.a;
            hm9.m("uh9", "notifyListeners", new Object[0]);
            synchronized (uh97.o) {
                Iterator it = uh97.o.iterator();
                while (it.hasNext()) {
                    ((fh9) it.next()).e(uh97.l(), uh97.m(), uh97.o());
                }
            }
        } else if (i == 2) {
            uh9 uh98 = this.a;
            hm9.m("uh9", "notifyListeners", new Object[0]);
            synchronized (uh98.o) {
                Iterator it2 = uh98.o.iterator();
                while (it2.hasNext()) {
                    ((fh9) it2.next()).d(uh98.l(), uh98.m());
                }
            }
        } else if (i == 4) {
            this.a.f();
            uh9 uh99 = this.a;
            hm9.m("uh9", "notifyListeners", new Object[0]);
            synchronized (uh99.o) {
                Iterator it3 = uh99.o.iterator();
                while (it3.hasNext()) {
                    uh99.G.m((Object) null, Float.valueOf(1.0f));
                    ((fh9) it3.next()).f(uh99.l(), uh99.m());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0019, code lost:
        r1 = r0.m;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(boolean r6) {
        /*
            r5 = this;
            int r0 = defpackage.uh9.K
            java.lang.String r0 = "uh9"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onIsPlayingChanged "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
            uh9 r0 = r5.a
            if (r6 != 0) goto L_0x0026
            a98 r1 = r0.m
            if (r1 == 0) goto L_0x0026
            int r1 = r1.getPlaybackState()
            r2 = 3
            if (r1 != r2) goto L_0x0026
            r1 = 1
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            r0.w = r1
            uh9 r0 = r5.a
            a98 r0 = r0.m
            if (r0 == 0) goto L_0x0032
            r0.n1()
        L_0x0032:
            uh9 r0 = r5.a
            r0.x = r6
            if (r6 == 0) goto L_0x006b
            r0.u()
            uh9 r5 = r5.a
            java.lang.String r6 = "uh9"
            java.lang.String r0 = "notifyListeners"
            defpackage.hm9.m(r6, r0, new java.lang.Object[0])
            java.util.concurrent.CopyOnWriteArraySet r6 = r5.o
            monitor-enter(r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.o     // Catch:{ all -> 0x0065 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0065 }
        L_0x004d:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0067
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0065 }
            fh9 r1 = (defpackage.fh9) r1     // Catch:{ all -> 0x0065 }
            long r2 = r5.l()     // Catch:{ all -> 0x0065 }
            ub8 r4 = r5.m()     // Catch:{ all -> 0x0065 }
            r1.h(r2, r4)     // Catch:{ all -> 0x0065 }
            goto L_0x004d
        L_0x0065:
            r5 = move-exception
            goto L_0x0069
        L_0x0067:
            monitor-exit(r6)
            goto L_0x00a2
        L_0x0069:
            monitor-exit(r6)
            throw r5
        L_0x006b:
            boolean r6 = r0.w
            if (r6 == 0) goto L_0x00a2
            r0.f()
            uh9 r5 = r5.a
            java.lang.String r6 = "uh9"
            java.lang.String r0 = "notifyListeners"
            defpackage.hm9.m(r6, r0, new java.lang.Object[0])
            java.util.concurrent.CopyOnWriteArraySet r6 = r5.o
            monitor-enter(r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.o     // Catch:{ all -> 0x009c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x009c }
        L_0x0084:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x009e
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x009c }
            fh9 r1 = (defpackage.fh9) r1     // Catch:{ all -> 0x009c }
            long r2 = r5.l()     // Catch:{ all -> 0x009c }
            ub8 r4 = r5.m()     // Catch:{ all -> 0x009c }
            r1.i(r2, r4)     // Catch:{ all -> 0x009c }
            goto L_0x0084
        L_0x009c:
            r5 = move-exception
            goto L_0x00a0
        L_0x009e:
            monitor-exit(r6)
            goto L_0x00a2
        L_0x00a0:
            monitor-exit(r6)
            throw r5
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh9.n(boolean):void");
    }

    public final void onRepeatModeChanged(int i) {
        uh9 uh9 = this.a;
        int i2 = uh9.K;
        hm9.m("uh9", "notifyListeners", new Object[0]);
        synchronized (uh9.o) {
            Iterator it = uh9.o.iterator();
            while (it.hasNext()) {
                ((fh9) it.next()).getClass();
            }
        }
    }

    public final void p0(c3b c3b) {
        float f = c3b.a;
        uh9 uh9 = this.a;
        if (!(f == uh9.F)) {
            uh9.F = f;
            int i = uh9.K;
            hm9.m("uh9", "notifyListeners", new Object[0]);
            synchronized (uh9.o) {
                Iterator it = uh9.o.iterator();
                while (it.hasNext()) {
                    ((fh9) it.next()).j();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r5 = defpackage.dae.f0((r5 = r5.a));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(defpackage.p3b r4, defpackage.p3b r5, int r6) {
        /*
            r3 = this;
            r0 = 1
            if (r6 != r0) goto L_0x00a9
            int r6 = r4.b
            int r5 = r5.b
            if (r6 == r5) goto L_0x00a9
            tb8 r5 = r4.c
            if (r5 == 0) goto L_0x001c
            java.lang.String r5 = r5.a
            if (r5 == 0) goto L_0x001c
            java.lang.Long r5 = defpackage.dae.f0(r5)
            if (r5 == 0) goto L_0x001c
            long r5 = r5.longValue()
            goto L_0x001e
        L_0x001c:
            r5 = -1
        L_0x001e:
            kj6 r0 = defpackage.ub8.a
            tb8 r1 = r4.c
            if (r1 == 0) goto L_0x0031
            gd8 r1 = r1.d
            if (r1 == 0) goto L_0x0031
            java.lang.Integer r1 = r1.H
            if (r1 == 0) goto L_0x0031
            int r1 = r1.intValue()
            goto L_0x0032
        L_0x0031:
            r1 = -1
        L_0x0032:
            r0.getClass()
            ub8 r0 = defpackage.kj6.m(r1)
            uh9 r1 = r3.a
            a98 r1 = r1.m
            if (r1 == 0) goto L_0x0071
            int r2 = r4.b
            int r1 = r1.i()
            if (r2 != r1) goto L_0x0071
            uh9 r3 = r3.a
            int r4 = defpackage.uh9.K
            java.lang.String r4 = "uh9"
            java.lang.String r1 = "notifyListeners"
            defpackage.hm9.m(r4, r1, new java.lang.Object[0])
            java.util.concurrent.CopyOnWriteArraySet r4 = r3.o
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArraySet r3 = r3.o     // Catch:{ all -> 0x006b }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x006b }
        L_0x005b:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x006d
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x006b }
            fh9 r1 = (defpackage.fh9) r1     // Catch:{ all -> 0x006b }
            r1.k(r5, r0)     // Catch:{ all -> 0x006b }
            goto L_0x005b
        L_0x006b:
            r3 = move-exception
            goto L_0x006f
        L_0x006d:
            monitor-exit(r4)
            goto L_0x00a9
        L_0x006f:
            monitor-exit(r4)
            throw r3
        L_0x0071:
            uh9 r1 = r3.a
            a98 r1 = r1.m
            if (r1 == 0) goto L_0x00a9
            int r4 = r4.b
            int r1 = r1.h()
            if (r4 != r1) goto L_0x00a9
            uh9 r3 = r3.a
            int r4 = defpackage.uh9.K
            java.lang.String r4 = "uh9"
            java.lang.String r1 = "notifyListeners"
            defpackage.hm9.m(r4, r1, new java.lang.Object[0])
            java.util.concurrent.CopyOnWriteArraySet r4 = r3.o
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArraySet r3 = r3.o     // Catch:{ all -> 0x00a3 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x0093:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x00a5
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x00a3 }
            fh9 r1 = (defpackage.fh9) r1     // Catch:{ all -> 0x00a3 }
            r1.g(r5, r0)     // Catch:{ all -> 0x00a3 }
            goto L_0x0093
        L_0x00a3:
            r3 = move-exception
            goto L_0x00a7
        L_0x00a5:
            monitor-exit(r4)
            goto L_0x00a9
        L_0x00a7:
            monitor-exit(r4)
            throw r3
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh9.q(p3b, p3b, int):void");
    }

    public final void x0(PlaybackException playbackException) {
        uh9 uh9 = this.a;
        int i = uh9.K;
        hm9.m("uh9", "notifyListeners", new Object[0]);
        synchronized (uh9.o) {
            Iterator it = uh9.o.iterator();
            while (it.hasNext()) {
                ((fh9) it.next()).b(uh9.l(), uh9.m());
            }
        }
    }
}
