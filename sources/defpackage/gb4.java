package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: gb4  reason: default package */
public final class gb4 implements do7 {
    public long X;
    public long Y;
    public long Z;
    public final Uri a;
    public final vq7 b = new vq7("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final t24 c;
    public qm6 o;
    public long s0;
    public boolean t0;
    public IOException u0;
    public boolean v0;
    public final /* synthetic */ hb4 w0;

    public gb4(hb4 hb4, Uri uri) {
        this.w0 = hb4;
        this.a = uri;
        this.c = ((q24) ((w4d) hb4.s0).b).a();
    }

    public static boolean a(gb4 gb4, long j) {
        gb4.s0 = SystemClock.elapsedRealtime() + j;
        hb4 hb4 = gb4.w0;
        if (!gb4.a.equals(hb4.X)) {
            return false;
        }
        List list = ((ym6) hb4.y0).e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            gb4 gb42 = (gb4) hb4.b.get(((wm6) list.get(i)).a);
            gb42.getClass();
            if (elapsedRealtime > gb42.s0) {
                Uri uri = gb42.a;
                hb4.X = uri;
                gb42.e(hb4.c(uri));
                return false;
            }
        }
        return true;
    }

    public final b11 C(go7 go7, long j, long j2, IOException iOException, int i) {
        bqa bqa = (bqa) go7;
        long j3 = bqa.a;
        Uri uri = bqa.o.c;
        yn7 yn7 = new yn7(j2);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof HlsPlaylistParser$DeltaUpdateException;
        b11 b11 = vq7.Y;
        hb4 hb4 = this.w0;
        int i2 = bqa.c;
        if (z || z2) {
            int i3 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).o : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.Z = SystemClock.elapsedRealtime();
                c(false);
                int i4 = oaf.a;
                ((jn) hb4.v0).C(yn7, i2, iOException, true);
                return b11;
            }
        }
        wn7 wn7 = new wn7(i, iOException);
        Iterator it = hb4.c.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((gn6) it.next()).c(this.a, wn7, false);
        }
        huc huc = (huc) hb4.u0;
        if (z3) {
            huc.getClass();
            long q = huc.q(wn7);
            b11 = q != -9223372036854775807L ? new b11(q, 0, 5, false) : vq7.Z;
        }
        boolean z4 = !b11.a();
        ((jn) hb4.v0).C(yn7, i2, iOException, z4);
        if (z4) {
            huc.getClass();
        }
        return b11;
    }

    public final Uri b() {
        qm6 qm6 = this.o;
        Uri uri = this.a;
        if (qm6 != null) {
            om6 om6 = qm6.v;
            if (om6.a != -9223372036854775807L || om6.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                qm6 qm62 = this.o;
                if (qm62.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(qm62.k + ((long) qm62.r.size())));
                    qm6 qm63 = this.o;
                    if (qm63.n != -9223372036854775807L) {
                        zw6 zw6 = qm63.s;
                        int size = zw6.size();
                        if (!zw6.isEmpty() && ((hm6) mqd.m(zw6)).x0) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                om6 om62 = this.o.v;
                if (om62.a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", om62.b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z) {
        e(z ? b() : this.a);
    }

    public final void d(Uri uri) {
        hb4 hb4 = this.w0;
        bqa bqa = new bqa(this.c, uri, 4, ((en6) hb4.t0).i((ym6) hb4.y0, this.o));
        int i = bqa.c;
        ((jn) hb4.v0).F(new yn7(bqa.a, bqa.b, this.b.v(bqa, this, ((huc) hb4.u0).p(i))), i, -1, (qy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        this.s0 = 0;
        if (!this.t0) {
            vq7 vq7 = this.b;
            if (!vq7.o() && !vq7.n()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.Z;
                if (elapsedRealtime < j) {
                    this.t0 = true;
                    this.w0.o.postDelayed(new wt1(this, 22, uri), j - elapsedRealtime);
                    return;
                }
                d(uri);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0238  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.qm6 r65, defpackage.yn7 r66) {
        /*
            r64 = this;
            r0 = r64
            r1 = r65
            qm6 r2 = r0.o
            long r3 = android.os.SystemClock.elapsedRealtime()
            r0.X = r3
            hb4 r5 = r0.w0
            r5.getClass()
            if (r2 == 0) goto L_0x00a2
            long r10 = r1.k
            long r12 = r2.k
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x001d
            goto L_0x00a5
        L_0x001d:
            boolean r11 = r2.o
            zw6 r15 = r2.s
            zw6 r14 = r2.r
            boolean r12 = r1.o
            if (r10 >= 0) goto L_0x0028
            goto L_0x004c
        L_0x0028:
            zw6 r10 = r1.r
            int r10 = r10.size()
            int r13 = r14.size()
            int r10 = r10 - r13
            if (r10 == 0) goto L_0x0039
            if (r10 <= 0) goto L_0x004c
            goto L_0x00a5
        L_0x0039:
            zw6 r10 = r1.s
            int r10 = r10.size()
            int r13 = r15.size()
            if (r10 > r13) goto L_0x00a5
            if (r10 != r13) goto L_0x004c
            if (r12 == 0) goto L_0x004c
            if (r11 != 0) goto L_0x004c
            goto L_0x00a5
        L_0x004c:
            if (r12 == 0) goto L_0x00a0
            if (r11 == 0) goto L_0x0051
            goto L_0x00a0
        L_0x0051:
            qm6 r10 = new qm6
            r12 = r10
            r31 = 1
            boolean r11 = r2.p
            r32 = r11
            int r13 = r2.d
            java.lang.String r11 = r2.a
            r34 = r14
            r14 = r11
            java.util.List r11 = r2.b
            r35 = r15
            r15 = r11
            long r8 = r2.e
            r16 = r8
            boolean r8 = r2.g
            r18 = r8
            long r8 = r2.h
            r19 = r8
            boolean r8 = r2.i
            r21 = r8
            int r8 = r2.j
            r22 = r8
            long r8 = r2.k
            r23 = r8
            int r8 = r2.l
            r25 = r8
            long r8 = r2.m
            r26 = r8
            long r8 = r2.n
            r28 = r8
            boolean r8 = r2.c
            r30 = r8
            dr4 r8 = r2.q
            r33 = r8
            om6 r8 = r2.v
            r36 = r8
            cx6 r8 = r2.t
            r37 = r8
            r12.<init>(r13, r14, r15, r16, r18, r19, r21, r22, r23, r25, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37)
        L_0x009d:
            r8 = 0
            goto L_0x017b
        L_0x00a0:
            r10 = r2
            goto L_0x009d
        L_0x00a2:
            r65.getClass()
        L_0x00a5:
            boolean r8 = r1.p
            long r9 = r1.k
            if (r8 == 0) goto L_0x00b0
            long r11 = r1.h
        L_0x00ad:
            r45 = r11
            goto L_0x00ed
        L_0x00b0:
            java.lang.Object r8 = r5.z0
            qm6 r8 = (defpackage.qm6) r8
            if (r8 == 0) goto L_0x00b9
            long r11 = r8.h
            goto L_0x00bb
        L_0x00b9:
            r11 = 0
        L_0x00bb:
            if (r2 != 0) goto L_0x00be
            goto L_0x00ad
        L_0x00be:
            zw6 r8 = r2.r
            int r13 = r8.size()
            long r14 = r2.k
            long r6 = r9 - r14
            int r6 = (int) r6
            int r7 = r8.size()
            if (r6 >= r7) goto L_0x00d6
            java.lang.Object r6 = r8.get(r6)
            lm6 r6 = (defpackage.lm6) r6
            goto L_0x00d7
        L_0x00d6:
            r6 = 0
        L_0x00d7:
            long r7 = r2.h
            if (r6 == 0) goto L_0x00df
            long r11 = r6.X
        L_0x00dd:
            long r11 = r11 + r7
            goto L_0x00ad
        L_0x00df:
            r18 = r11
            long r11 = (long) r13
            long r13 = r9 - r14
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x00eb
            long r11 = r2.u
            goto L_0x00dd
        L_0x00eb:
            r45 = r18
        L_0x00ed:
            boolean r6 = r1.i
            zw6 r7 = r1.r
            if (r6 == 0) goto L_0x00f9
            int r6 = r1.j
        L_0x00f5:
            r48 = r6
            r8 = 0
            goto L_0x0130
        L_0x00f9:
            java.lang.Object r6 = r5.z0
            qm6 r6 = (defpackage.qm6) r6
            if (r6 == 0) goto L_0x0102
            int r6 = r6.j
            goto L_0x0103
        L_0x0102:
            r6 = 0
        L_0x0103:
            if (r2 != 0) goto L_0x0106
            goto L_0x00f5
        L_0x0106:
            long r11 = r2.k
            long r9 = r9 - r11
            int r8 = (int) r9
            zw6 r9 = r2.r
            int r10 = r9.size()
            if (r8 >= r10) goto L_0x0119
            java.lang.Object r8 = r9.get(r8)
            lm6 r8 = (defpackage.lm6) r8
            goto L_0x011a
        L_0x0119:
            r8 = 0
        L_0x011a:
            if (r8 == 0) goto L_0x012e
            int r6 = r2.j
            int r8 = r8.o
            int r6 = r6 + r8
            r8 = 0
            java.lang.Object r9 = r7.get(r8)
            lm6 r9 = (defpackage.lm6) r9
            int r9 = r9.o
            int r6 = r6 - r9
        L_0x012b:
            r48 = r6
            goto L_0x0130
        L_0x012e:
            r8 = 0
            goto L_0x012b
        L_0x0130:
            qm6 r10 = new qm6
            r38 = r10
            boolean r6 = r1.o
            r57 = r6
            boolean r6 = r1.p
            r58 = r6
            int r6 = r1.d
            r39 = r6
            java.lang.String r6 = r1.a
            r40 = r6
            java.util.List r6 = r1.b
            r41 = r6
            long r11 = r1.e
            r42 = r11
            boolean r6 = r1.g
            r44 = r6
            r47 = 1
            long r11 = r1.k
            r49 = r11
            int r6 = r1.l
            r51 = r6
            long r11 = r1.m
            r52 = r11
            long r11 = r1.n
            r54 = r11
            boolean r6 = r1.c
            r56 = r6
            dr4 r6 = r1.q
            r59 = r6
            zw6 r6 = r1.s
            r61 = r6
            om6 r6 = r1.v
            r62 = r6
            cx6 r6 = r1.t
            r63 = r6
            r60 = r7
            r38.<init>(r39, r40, r41, r42, r44, r45, r47, r48, r49, r51, r52, r54, r56, r57, r58, r59, r60, r61, r62, r63)
        L_0x017b:
            r0.o = r10
            java.util.concurrent.CopyOnWriteArrayList r6 = r5.c
            r7 = 1
            android.net.Uri r9 = r0.a
            boolean r11 = r10.o
            if (r10 == r2) goto L_0x01c0
            r12 = 0
            r0.u0 = r12
            r0.Y = r3
            android.net.Uri r1 = r5.X
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x01ac
            java.lang.Object r1 = r5.z0
            qm6 r1 = (defpackage.qm6) r1
            if (r1 != 0) goto L_0x01a1
            r1 = r11 ^ 1
            r5.Y = r1
            long r7 = r10.h
            r5.Z = r7
        L_0x01a1:
            r5.z0 = r10
            java.lang.Object r1 = r5.x0
            in6 r1 = (defpackage.in6) r1
            sm6 r1 = (defpackage.sm6) r1
            r1.v(r10)
        L_0x01ac:
            java.util.Iterator r1 = r6.iterator()
        L_0x01b0:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0213
            java.lang.Object r6 = r1.next()
            gn6 r6 = (defpackage.gn6) r6
            r6.b()
            goto L_0x01b0
        L_0x01c0:
            r12 = 0
            if (r11 != 0) goto L_0x0213
            zw6 r10 = r1.r
            int r10 = r10.size()
            long r10 = (long) r10
            long r13 = r1.k
            long r13 = r13 + r10
            qm6 r1 = r0.o
            long r10 = r1.k
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x01dc
            androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistResetException r1 = new androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistResetException
            r1.<init>()
            r8 = r7
            goto L_0x01f6
        L_0x01dc:
            long r10 = r0.Y
            long r10 = r3 - r10
            double r10 = (double) r10
            long r13 = r1.m
            long r13 = defpackage.oaf.h0(r13)
            double r13 = (double) r13
            r15 = 4615063718147915776(0x400c000000000000, double:3.5)
            double r13 = r13 * r15
            int r1 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x01f5
            androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistStuckException r1 = new androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistStuckException
            r1.<init>()
            goto L_0x01f6
        L_0x01f5:
            r1 = r12
        L_0x01f6:
            if (r1 == 0) goto L_0x0213
            r0.u0 = r1
            wn7 r10 = new wn7
            r10.<init>(r7, r1)
            java.util.Iterator r1 = r6.iterator()
        L_0x0203:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0213
            java.lang.Object r6 = r1.next()
            gn6 r6 = (defpackage.gn6) r6
            r6.c(r9, r10, r8)
            goto L_0x0203
        L_0x0213:
            qm6 r1 = r0.o
            om6 r6 = r1.v
            boolean r6 = r6.e
            if (r6 != 0) goto L_0x0224
            long r6 = r1.m
            if (r1 == r2) goto L_0x0220
            goto L_0x0226
        L_0x0220:
            r1 = 2
            long r6 = r6 / r1
            goto L_0x0226
        L_0x0224:
            r6 = 0
        L_0x0226:
            long r1 = defpackage.oaf.h0(r6)
            long r1 = r1 + r3
            r3 = r66
            long r3 = r3.a
            long r1 = r1 - r3
            r0.Z = r1
            qm6 r1 = r0.o
            boolean r1 = r1.o
            if (r1 != 0) goto L_0x024b
            android.net.Uri r1 = r5.X
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0244
            boolean r1 = r0.v0
            if (r1 == 0) goto L_0x024b
        L_0x0244:
            android.net.Uri r1 = r64.b()
            r0.e(r1)
        L_0x024b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb4.f(qm6, yn7):void");
    }

    public final void m(go7 go7, long j, long j2, boolean z) {
        bqa bqa = (bqa) go7;
        long j3 = bqa.a;
        Uri uri = bqa.o.c;
        yn7 yn7 = new yn7(j2);
        hb4 hb4 = this.w0;
        ((huc) hb4.u0).getClass();
        ((jn) hb4.v0).x(yn7, 4, -1, (qy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void v(go7 go7, long j, long j2) {
        bqa bqa = (bqa) go7;
        an6 an6 = (an6) bqa.Y;
        Uri uri = bqa.o.c;
        yn7 yn7 = new yn7(j2);
        if (an6 instanceof qm6) {
            f((qm6) an6, yn7);
            ((jn) this.w0.v0).z(yn7, 4, -1, (qy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        } else {
            ParserException b2 = ParserException.b((Exception) null, "Loaded playlist has unexpected type.");
            this.u0 = b2;
            ((jn) this.w0.v0).C(yn7, 4, b2, true);
        }
        ((huc) this.w0.u0).getClass();
    }
}
