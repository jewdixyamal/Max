package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: kd8  reason: default package */
public final class kd8 implements gd {
    public jn A0;
    public jn B0;
    public qy5 C0;
    public qy5 D0;
    public qy5 E0;
    public boolean F0;
    public int G0;
    public boolean H0;
    public int I0;
    public int J0;
    public int K0;
    public boolean L0;
    public final kue X = new kue();
    public final hue Y = new hue();
    public final HashMap Z = new HashMap();
    public final Context a;
    public final zc4 b;
    public final PlaybackSession c;
    public final long o = SystemClock.elapsedRealtime();
    public final HashMap s0 = new HashMap();
    public String t0;
    public PlaybackMetrics.Builder u0;
    public int v0;
    public int w0 = 0;
    public int x0 = 0;
    public PlaybackException y0;
    public jn z0;

    public kd8(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        zc4 zc4 = new zc4();
        this.b = zc4;
        zc4.d = this;
    }

    public final void A(fd fdVar, p3b p3b, p3b p3b2, int i) {
        if (i == 1) {
            this.F0 = true;
        }
        this.v0 = i;
    }

    public final void J(fd fdVar, n54 n54) {
        this.I0 += n54.h;
        this.J0 += n54.f;
    }

    public final void L(fd fdVar, int i, long j) {
        yj8 yj8 = fdVar.d;
        if (yj8 != null) {
            String c2 = this.b.c(fdVar.b, yj8);
            HashMap hashMap = this.s0;
            Long l = (Long) hashMap.get(c2);
            HashMap hashMap2 = this.Z;
            Long l2 = (Long) hashMap2.get(c2);
            long j2 = 0;
            hashMap.put(c2, Long.valueOf((l == null ? 0 : l.longValue()) + j));
            if (l2 != null) {
                j2 = l2.longValue();
            }
            hashMap2.put(c2, Long.valueOf(j2 + ((long) i)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:270:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0592  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x05d0  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x05d4  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x062a  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0650  */
    /* JADX WARNING: Removed duplicated region for block: B:442:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N(defpackage.q3b r25, defpackage.imc r26) {
        /*
            r24 = this;
            r0 = r24
            r7 = r26
            r8 = 1
            r9 = 3
            java.lang.Object r1 = r7.b
            tm5 r1 = (defpackage.tm5) r1
            android.util.SparseBooleanArray r1 = r1.a
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0013
            return
        L_0x0013:
            r10 = 0
            r1 = r10
        L_0x0015:
            java.lang.Object r2 = r7.b
            tm5 r2 = (defpackage.tm5) r2
            android.util.SparseBooleanArray r2 = r2.a
            int r2 = r2.size()
            r11 = 11
            if (r1 >= r2) goto L_0x00f3
            java.lang.Object r2 = r7.b
            tm5 r2 = (defpackage.tm5) r2
            int r2 = r2.b(r1)
            java.lang.Object r3 = r7.c
            android.util.SparseArray r3 = (android.util.SparseArray) r3
            java.lang.Object r3 = r3.get(r2)
            fd r3 = (defpackage.fd) r3
            r3.getClass()
            if (r2 != 0) goto L_0x0092
            zc4 r4 = r0.b
            monitor-enter(r4)
            kd8 r2 = r4.d     // Catch:{ all -> 0x006d }
            r2.getClass()     // Catch:{ all -> 0x006d }
            mue r2 = r4.e     // Catch:{ all -> 0x006d }
            mue r5 = r3.b     // Catch:{ all -> 0x006d }
            r4.e = r5     // Catch:{ all -> 0x006d }
            java.util.HashMap r5 = r4.c     // Catch:{ all -> 0x006d }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x006d }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x006d }
        L_0x0052:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x006d }
            if (r6 == 0) goto L_0x008b
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x006d }
            yc4 r6 = (defpackage.yc4) r6     // Catch:{ all -> 0x006d }
            mue r11 = r4.e     // Catch:{ all -> 0x006d }
            boolean r11 = r6.b(r2, r11)     // Catch:{ all -> 0x006d }
            if (r11 == 0) goto L_0x006f
            boolean r11 = r6.a(r3)     // Catch:{ all -> 0x006d }
            if (r11 == 0) goto L_0x0052
            goto L_0x006f
        L_0x006d:
            r0 = move-exception
            goto L_0x0090
        L_0x006f:
            r5.remove()     // Catch:{ all -> 0x006d }
            boolean r11 = r6.e     // Catch:{ all -> 0x006d }
            if (r11 == 0) goto L_0x0052
            java.lang.String r11 = r6.a     // Catch:{ all -> 0x006d }
            java.lang.String r12 = r4.f     // Catch:{ all -> 0x006d }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x006d }
            if (r11 == 0) goto L_0x0083
            r4.a(r6)     // Catch:{ all -> 0x006d }
        L_0x0083:
            kd8 r11 = r4.d     // Catch:{ all -> 0x006d }
            java.lang.String r6 = r6.a     // Catch:{ all -> 0x006d }
            r11.d(r3, r6)     // Catch:{ all -> 0x006d }
            goto L_0x0052
        L_0x008b:
            r4.d(r3)     // Catch:{ all -> 0x006d }
            monitor-exit(r4)
            goto L_0x00f0
        L_0x0090:
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            throw r0
        L_0x0092:
            if (r2 != r11) goto L_0x00eb
            zc4 r2 = r0.b
            int r4 = r0.v0
            monitor-enter(r2)
            kd8 r5 = r2.d     // Catch:{ all -> 0x00da }
            r5.getClass()     // Catch:{ all -> 0x00da }
            if (r4 != 0) goto L_0x00a2
            r4 = r8
            goto L_0x00a3
        L_0x00a2:
            r4 = r10
        L_0x00a3:
            java.util.HashMap r5 = r2.c     // Catch:{ all -> 0x00da }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x00da }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00da }
        L_0x00ad:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00da }
            if (r6 == 0) goto L_0x00e4
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00da }
            yc4 r6 = (defpackage.yc4) r6     // Catch:{ all -> 0x00da }
            boolean r11 = r6.a(r3)     // Catch:{ all -> 0x00da }
            if (r11 == 0) goto L_0x00ad
            r5.remove()     // Catch:{ all -> 0x00da }
            boolean r11 = r6.e     // Catch:{ all -> 0x00da }
            if (r11 == 0) goto L_0x00ad
            java.lang.String r11 = r6.a     // Catch:{ all -> 0x00da }
            java.lang.String r12 = r2.f     // Catch:{ all -> 0x00da }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x00da }
            if (r4 == 0) goto L_0x00d4
            if (r11 == 0) goto L_0x00d4
            boolean r12 = r6.f     // Catch:{ all -> 0x00da }
        L_0x00d4:
            if (r11 == 0) goto L_0x00dc
            r2.a(r6)     // Catch:{ all -> 0x00da }
            goto L_0x00dc
        L_0x00da:
            r0 = move-exception
            goto L_0x00e9
        L_0x00dc:
            kd8 r11 = r2.d     // Catch:{ all -> 0x00da }
            java.lang.String r6 = r6.a     // Catch:{ all -> 0x00da }
            r11.d(r3, r6)     // Catch:{ all -> 0x00da }
            goto L_0x00ad
        L_0x00e4:
            r2.d(r3)     // Catch:{ all -> 0x00da }
            monitor-exit(r2)
            goto L_0x00f0
        L_0x00e9:
            monitor-exit(r2)     // Catch:{ all -> 0x00da }
            throw r0
        L_0x00eb:
            zc4 r2 = r0.b
            r2.e(r3)
        L_0x00f0:
            int r1 = r1 + r8
            goto L_0x0015
        L_0x00f3:
            long r12 = android.os.SystemClock.elapsedRealtime()
            boolean r1 = r7.P(r10)
            if (r1 == 0) goto L_0x0115
            java.lang.Object r1 = r7.c
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            java.lang.Object r1 = r1.get(r10)
            fd r1 = (defpackage.fd) r1
            r1.getClass()
            android.media.metrics.PlaybackMetrics$Builder r2 = r0.u0
            if (r2 == 0) goto L_0x0115
            mue r2 = r1.b
            yj8 r1 = r1.d
            r0.c(r2, r1)
        L_0x0115:
            r14 = 2
            boolean r1 = r7.P(r14)
            if (r1 == 0) goto L_0x0186
            android.media.metrics.PlaybackMetrics$Builder r1 = r0.u0
            if (r1 == 0) goto L_0x0186
            p0f r1 = r25.h0()
            zw6 r1 = r1.a
            ls5 r1 = r1.listIterator(r10)
        L_0x012a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x014c
            java.lang.Object r2 = r1.next()
            o0f r2 = (defpackage.o0f) r2
            r3 = r10
        L_0x0137:
            int r4 = r2.a
            if (r3 >= r4) goto L_0x012a
            boolean[] r4 = r2.e
            boolean r4 = r4[r3]
            if (r4 == 0) goto L_0x014a
            qy5 r4 = r2.c(r3)
            dr4 r4 = r4.r
            if (r4 == 0) goto L_0x014a
            goto L_0x014d
        L_0x014a:
            int r3 = r3 + r8
            goto L_0x0137
        L_0x014c:
            r4 = 0
        L_0x014d:
            if (r4 == 0) goto L_0x0186
            android.media.metrics.PlaybackMetrics$Builder r1 = r0.u0
            int r2 = defpackage.oaf.a
            android.media.metrics.PlaybackMetrics$Builder r1 = defpackage.id8.j(r1)
            r2 = r10
        L_0x0158:
            int r3 = r4.o
            if (r2 >= r3) goto L_0x0182
            br4[] r3 = r4.a
            r3 = r3[r2]
            java.util.UUID r3 = r3.b
            java.util.UUID r5 = defpackage.ew0.d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x016c
            r2 = r9
            goto L_0x0183
        L_0x016c:
            java.util.UUID r5 = defpackage.ew0.e
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0176
            r2 = r14
            goto L_0x0183
        L_0x0176:
            java.util.UUID r5 = defpackage.ew0.c
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0180
            r2 = 6
            goto L_0x0183
        L_0x0180:
            int r2 = r2 + r8
            goto L_0x0158
        L_0x0182:
            r2 = r8
        L_0x0183:
            r1.setDrmType(r2)
        L_0x0186:
            r1 = 1011(0x3f3, float:1.417E-42)
            boolean r1 = r7.P(r1)
            if (r1 == 0) goto L_0x0193
            int r1 = r0.K0
            int r1 = r1 + r8
            r0.K0 = r1
        L_0x0193:
            androidx.media3.common.PlaybackException r1 = r0.y0
            r15 = 5
            r5 = 4
            if (r1 != 0) goto L_0x01a5
            r21 = r5
            r1 = r8
            r2 = r14
            r18 = 6
            r19 = 7
            r20 = 9
            goto L_0x0444
        L_0x01a5:
            int r3 = r0.G0
            if (r3 != r5) goto L_0x01ab
            r3 = r8
            goto L_0x01ac
        L_0x01ab:
            r3 = r10
        L_0x01ac:
            int r14 = r1.a
            r4 = 1001(0x3e9, float:1.403E-42)
            if (r14 != r4) goto L_0x01c5
            jt r3 = new jt
            r4 = 20
            r3.<init>(r4, r10, r9)
            r21 = r5
            r5 = 13
            r18 = 6
            r19 = 7
            r20 = 9
            goto L_0x0418
        L_0x01c5:
            boolean r4 = r1 instanceof androidx.media3.exoplayer.ExoPlaybackException
            if (r4 == 0) goto L_0x01d6
            r4 = r1
            androidx.media3.exoplayer.ExoPlaybackException r4 = (androidx.media3.exoplayer.ExoPlaybackException) r4
            int r5 = r4.u0
            if (r5 != r8) goto L_0x01d2
            r5 = r8
            goto L_0x01d3
        L_0x01d2:
            r5 = r10
        L_0x01d3:
            int r4 = r4.y0
            goto L_0x01d8
        L_0x01d6:
            r4 = r10
            r5 = r4
        L_0x01d8:
            java.lang.Throwable r2 = r1.getCause()
            r2.getClass()
            boolean r6 = r2 instanceof java.io.IOException
            r22 = 25
            r23 = 26
            r11 = 27
            r8 = 23
            if (r6 == 0) goto L_0x036c
            boolean r4 = r2 instanceof androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException
            if (r4 == 0) goto L_0x0204
            androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException r2 = (androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException) r2
            jt r3 = new jt
            int r2 = r2.o
            r3.<init>(r15, r2, r9)
        L_0x01f8:
            r5 = 13
            r18 = 6
            r19 = 7
            r20 = 9
        L_0x0200:
            r21 = 4
            goto L_0x0418
        L_0x0204:
            boolean r4 = r2 instanceof androidx.media3.datasource.HttpDataSource$InvalidContentTypeException
            if (r4 != 0) goto L_0x020c
            boolean r4 = r2 instanceof androidx.media3.common.ParserException
            if (r4 == 0) goto L_0x0215
        L_0x020c:
            r2 = 4
            r4 = 9
            r5 = 7
            r6 = 6
            r8 = 8
            goto L_0x0356
        L_0x0215:
            boolean r3 = r2 instanceof androidx.media3.datasource.HttpDataSource$HttpDataSourceException
            if (r3 != 0) goto L_0x021d
            boolean r4 = r2 instanceof androidx.media3.datasource.UdpDataSource$UdpDataSourceException
            if (r4 == 0) goto L_0x0221
        L_0x021d:
            r4 = 9
            goto L_0x02f4
        L_0x0221:
            r3 = 1002(0x3ea, float:1.404E-42)
            r4 = 21
            if (r14 != r3) goto L_0x022d
            jt r3 = new jt
            r3.<init>(r4, r10, r9)
            goto L_0x01f8
        L_0x022d:
            boolean r3 = r2 instanceof androidx.media3.exoplayer.drm.DrmSession$DrmSessionException
            if (r3 == 0) goto L_0x02aa
            java.lang.Throwable r2 = r2.getCause()
            r2.getClass()
            int r3 = defpackage.oaf.a
            if (r3 < r4) goto L_0x0263
            boolean r4 = r2 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r4 == 0) goto L_0x0263
            android.media.MediaDrm$MediaDrmStateException r2 = (android.media.MediaDrm.MediaDrmStateException) r2
            java.lang.String r2 = r2.getDiagnosticInfo()
            int r2 = defpackage.oaf.y(r2)
            int r3 = defpackage.oaf.x(r2)
            switch(r3) {
                case 6002: goto L_0x025b;
                case 6003: goto L_0x0258;
                case 6004: goto L_0x0255;
                case 6005: goto L_0x0252;
                default: goto L_0x0251;
            }
        L_0x0251:
            goto L_0x025d
        L_0x0252:
            r11 = r23
            goto L_0x025d
        L_0x0255:
            r11 = r22
            goto L_0x025d
        L_0x0258:
            r11 = 28
            goto L_0x025d
        L_0x025b:
            r11 = 24
        L_0x025d:
            jt r3 = new jt
            r3.<init>(r11, r2, r9)
            goto L_0x01f8
        L_0x0263:
            if (r3 < r8) goto L_0x026f
            boolean r3 = r2 instanceof android.media.MediaDrmResetException
            if (r3 == 0) goto L_0x026f
            jt r3 = new jt
            r3.<init>(r11, r10, r9)
            goto L_0x01f8
        L_0x026f:
            boolean r3 = r2 instanceof android.media.NotProvisionedException
            if (r3 == 0) goto L_0x027c
            jt r3 = new jt
            r6 = 24
            r3.<init>(r6, r10, r9)
            goto L_0x01f8
        L_0x027c:
            boolean r3 = r2 instanceof android.media.DeniedByServerException
            if (r3 == 0) goto L_0x0289
            jt r3 = new jt
            r2 = 29
            r3.<init>(r2, r10, r9)
            goto L_0x01f8
        L_0x0289:
            boolean r3 = r2 instanceof androidx.media3.exoplayer.drm.UnsupportedDrmException
            if (r3 == 0) goto L_0x0294
            jt r3 = new jt
            r3.<init>(r8, r10, r9)
            goto L_0x01f8
        L_0x0294:
            boolean r2 = r2 instanceof androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException
            if (r2 == 0) goto L_0x02a1
            jt r3 = new jt
            r14 = 28
            r3.<init>(r14, r10, r9)
            goto L_0x01f8
        L_0x02a1:
            jt r3 = new jt
            r2 = 30
            r3.<init>(r2, r10, r9)
            goto L_0x01f8
        L_0x02aa:
            boolean r3 = r2 instanceof androidx.media3.datasource.FileDataSource$FileDataSourceException
            if (r3 == 0) goto L_0x02e3
            java.lang.Throwable r3 = r2.getCause()
            boolean r3 = r3 instanceof java.io.FileNotFoundException
            if (r3 == 0) goto L_0x02e3
            java.lang.Throwable r2 = r2.getCause()
            r2.getClass()
            java.lang.Throwable r2 = r2.getCause()
            int r3 = defpackage.oaf.a
            if (r3 < r4) goto L_0x02da
            boolean r3 = r2 instanceof android.system.ErrnoException
            if (r3 == 0) goto L_0x02da
            android.system.ErrnoException r2 = (android.system.ErrnoException) r2
            int r2 = r2.errno
            int r3 = android.system.OsConstants.EACCES
            if (r2 != r3) goto L_0x02da
            jt r3 = new jt
            r2 = 32
            r3.<init>(r2, r10, r9)
            goto L_0x01f8
        L_0x02da:
            jt r3 = new jt
            r2 = 31
            r3.<init>(r2, r10, r9)
            goto L_0x01f8
        L_0x02e3:
            jt r3 = new jt
            r4 = 9
            r3.<init>(r4, r10, r9)
        L_0x02ea:
            r20 = r4
            r5 = 13
            r18 = 6
        L_0x02f0:
            r19 = 7
            goto L_0x0200
        L_0x02f4:
            android.content.Context r5 = r0.a
            ho9 r5 = defpackage.ho9.h(r5)
            int r5 = r5.i()
            r6 = 1
            if (r5 != r6) goto L_0x0307
            jt r3 = new jt
            r3.<init>(r9, r10, r9)
            goto L_0x02ea
        L_0x0307:
            java.lang.Throwable r5 = r2.getCause()
            boolean r6 = r5 instanceof java.net.UnknownHostException
            if (r6 == 0) goto L_0x031c
            jt r3 = new jt
            r6 = 6
            r3.<init>(r6, r10, r9)
            r20 = r4
            r18 = r6
            r5 = 13
            goto L_0x02f0
        L_0x031c:
            r6 = 6
            boolean r5 = r5 instanceof java.net.SocketTimeoutException
            if (r5 == 0) goto L_0x0331
            jt r3 = new jt
            r5 = 7
            r3.<init>(r5, r10, r9)
            r20 = r4
            r19 = r5
            r18 = r6
            r5 = 13
            goto L_0x0200
        L_0x0331:
            r5 = 7
            if (r3 == 0) goto L_0x034d
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r2 = (androidx.media3.datasource.HttpDataSource$HttpDataSourceException) r2
            int r2 = r2.c
            r3 = 1
            if (r2 != r3) goto L_0x034d
            jt r3 = new jt
            r2 = 4
            r3.<init>(r2, r10, r9)
        L_0x0341:
            r21 = r2
            r20 = r4
            r19 = r5
            r18 = r6
        L_0x0349:
            r5 = 13
            goto L_0x0418
        L_0x034d:
            r2 = 4
            jt r3 = new jt
            r8 = 8
            r3.<init>(r8, r10, r9)
            goto L_0x0341
        L_0x0356:
            jt r11 = new jt
            if (r3 == 0) goto L_0x035d
            r3 = 10
            goto L_0x035f
        L_0x035d:
            r3 = 11
        L_0x035f:
            r11.<init>(r3, r10, r9)
            r21 = r2
            r20 = r4
            r19 = r5
            r18 = r6
            r3 = r11
            goto L_0x0349
        L_0x036c:
            r3 = 8
            r6 = 24
            r14 = 28
            r18 = 6
            r19 = 7
            r20 = 9
            r21 = 4
            if (r5 == 0) goto L_0x0389
            if (r4 == 0) goto L_0x0381
            r3 = 1
            if (r4 != r3) goto L_0x0389
        L_0x0381:
            jt r3 = new jt
            r2 = 35
            r3.<init>(r2, r10, r9)
            goto L_0x0349
        L_0x0389:
            if (r5 == 0) goto L_0x0395
            if (r4 != r9) goto L_0x0395
            jt r3 = new jt
            r2 = 15
            r3.<init>(r2, r10, r9)
            goto L_0x0349
        L_0x0395:
            if (r5 == 0) goto L_0x03a0
            r3 = 2
            if (r4 != r3) goto L_0x03a0
            jt r3 = new jt
            r3.<init>(r8, r10, r9)
            goto L_0x0349
        L_0x03a0:
            boolean r3 = r2 instanceof androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException
            if (r3 == 0) goto L_0x03b5
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = (androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException) r2
            java.lang.String r2 = r2.o
            int r2 = defpackage.oaf.y(r2)
            jt r3 = new jt
            r5 = 13
            r3.<init>(r5, r2, r9)
            goto L_0x0418
        L_0x03b5:
            r5 = 13
            boolean r3 = r2 instanceof androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException
            r4 = 14
            if (r3 == 0) goto L_0x03c7
            androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException r2 = (androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException) r2
            jt r3 = new jt
            int r2 = r2.a
            r3.<init>(r4, r2, r9)
            goto L_0x0418
        L_0x03c7:
            boolean r3 = r2 instanceof java.lang.OutOfMemoryError
            if (r3 == 0) goto L_0x03d1
            jt r3 = new jt
            r3.<init>(r4, r10, r9)
            goto L_0x0418
        L_0x03d1:
            boolean r3 = r2 instanceof androidx.media3.exoplayer.audio.AudioSink$InitializationException
            if (r3 == 0) goto L_0x03e1
            androidx.media3.exoplayer.audio.AudioSink$InitializationException r2 = (androidx.media3.exoplayer.audio.AudioSink$InitializationException) r2
            jt r3 = new jt
            r4 = 17
            int r2 = r2.a
            r3.<init>(r4, r2, r9)
            goto L_0x0418
        L_0x03e1:
            boolean r3 = r2 instanceof androidx.media3.exoplayer.audio.AudioSink$WriteException
            if (r3 == 0) goto L_0x03f1
            androidx.media3.exoplayer.audio.AudioSink$WriteException r2 = (androidx.media3.exoplayer.audio.AudioSink$WriteException) r2
            jt r3 = new jt
            r4 = 18
            int r2 = r2.a
            r3.<init>(r4, r2, r9)
            goto L_0x0418
        L_0x03f1:
            boolean r3 = r2 instanceof android.media.MediaCodec.CryptoException
            if (r3 == 0) goto L_0x0411
            android.media.MediaCodec$CryptoException r2 = (android.media.MediaCodec.CryptoException) r2
            int r2 = r2.getErrorCode()
            int r3 = defpackage.oaf.x(r2)
            switch(r3) {
                case 6002: goto L_0x040a;
                case 6003: goto L_0x040b;
                case 6004: goto L_0x0407;
                case 6005: goto L_0x0404;
                default: goto L_0x0402;
            }
        L_0x0402:
            r14 = r11
            goto L_0x040b
        L_0x0404:
            r14 = r23
            goto L_0x040b
        L_0x0407:
            r14 = r22
            goto L_0x040b
        L_0x040a:
            r14 = r6
        L_0x040b:
            jt r3 = new jt
            r3.<init>(r14, r2, r9)
            goto L_0x0418
        L_0x0411:
            jt r3 = new jt
            r2 = 22
            r3.<init>(r2, r10, r9)
        L_0x0418:
            android.media.metrics.PlaybackSession r2 = r0.c
            android.media.metrics.PlaybackErrorEvent$Builder r4 = defpackage.jd8.f()
            long r5 = r0.o
            long r5 = r12 - r5
            android.media.metrics.PlaybackErrorEvent$Builder r4 = r4.setTimeSinceCreatedMillis(r5)
            int r5 = r3.b
            android.media.metrics.PlaybackErrorEvent$Builder r4 = r4.setErrorCode(r5)
            int r3 = r3.c
            android.media.metrics.PlaybackErrorEvent$Builder r3 = r4.setSubErrorCode(r3)
            android.media.metrics.PlaybackErrorEvent$Builder r1 = r3.setException(r1)
            android.media.metrics.PlaybackErrorEvent r1 = r1.build()
            r2.reportPlaybackErrorEvent(r1)
            r1 = 1
            r0.L0 = r1
            r2 = 0
            r0.y0 = r2
            r2 = 2
        L_0x0444:
            boolean r3 = r7.P(r2)
            if (r3 == 0) goto L_0x0461
            p0f r3 = r25.h0()
            boolean r4 = r3.b(r2)
            boolean r8 = r3.b(r1)
            boolean r11 = r3.b(r9)
            if (r4 != 0) goto L_0x046b
            if (r8 != 0) goto L_0x046b
            if (r11 == 0) goto L_0x0461
            goto L_0x046b
        L_0x0461:
            r9 = r21
            r15 = 10
            r16 = 13
            r17 = 8
            goto L_0x04d5
        L_0x046b:
            if (r4 != 0) goto L_0x0494
            qy5 r1 = r0.C0
            r14 = 0
            boolean r1 = defpackage.oaf.a(r1, r14)
            if (r1 == 0) goto L_0x0479
            r9 = r21
            goto L_0x0497
        L_0x0479:
            qy5 r1 = r0.C0
            if (r1 != 0) goto L_0x047f
            r6 = 1
            goto L_0x0480
        L_0x047f:
            r6 = r10
        L_0x0480:
            r0.C0 = r14
            r2 = 1
            r1 = r24
            r5 = 10
            r17 = 8
            r3 = r12
            r15 = r5
            r9 = r21
            r16 = 13
            r5 = r14
            r1.e(r2, r3, r5, r6)
            goto L_0x049d
        L_0x0494:
            r9 = r21
            r14 = 0
        L_0x0497:
            r15 = 10
            r16 = 13
            r17 = 8
        L_0x049d:
            if (r8 != 0) goto L_0x04b9
            qy5 r1 = r0.D0
            boolean r1 = defpackage.oaf.a(r1, r14)
            if (r1 == 0) goto L_0x04a8
            goto L_0x04b9
        L_0x04a8:
            qy5 r1 = r0.D0
            if (r1 != 0) goto L_0x04ae
            r6 = 1
            goto L_0x04af
        L_0x04ae:
            r6 = r10
        L_0x04af:
            r0.D0 = r14
            r2 = 0
            r1 = r24
            r3 = r12
            r5 = r14
            r1.e(r2, r3, r5, r6)
        L_0x04b9:
            if (r11 != 0) goto L_0x04d5
            qy5 r1 = r0.E0
            boolean r1 = defpackage.oaf.a(r1, r14)
            if (r1 == 0) goto L_0x04c4
            goto L_0x04d5
        L_0x04c4:
            qy5 r1 = r0.E0
            if (r1 != 0) goto L_0x04ca
            r6 = 1
            goto L_0x04cb
        L_0x04ca:
            r6 = r10
        L_0x04cb:
            r0.E0 = r14
            r2 = 2
            r1 = r24
            r3 = r12
            r5 = r14
            r1.e(r2, r3, r5, r6)
        L_0x04d5:
            jn r1 = r0.z0
            boolean r1 = r0.a(r1)
            if (r1 == 0) goto L_0x050a
            jn r1 = r0.z0
            java.lang.Object r2 = r1.c
            r5 = r2
            qy5 r5 = (defpackage.qy5) r5
            int r2 = r5.u
            r3 = -1
            if (r2 == r3) goto L_0x050a
            int r1 = r1.b
            qy5 r2 = r0.C0
            boolean r2 = defpackage.oaf.a(r2, r5)
            if (r2 == 0) goto L_0x04f5
        L_0x04f3:
            r1 = 0
            goto L_0x0508
        L_0x04f5:
            qy5 r2 = r0.C0
            if (r2 != 0) goto L_0x04fd
            if (r1 != 0) goto L_0x04fd
            r6 = 1
            goto L_0x04fe
        L_0x04fd:
            r6 = r1
        L_0x04fe:
            r0.C0 = r5
            r2 = 1
            r1 = r24
            r3 = r12
            r1.e(r2, r3, r5, r6)
            goto L_0x04f3
        L_0x0508:
            r0.z0 = r1
        L_0x050a:
            jn r1 = r0.A0
            boolean r1 = r0.a(r1)
            if (r1 == 0) goto L_0x053a
            jn r1 = r0.A0
            java.lang.Object r2 = r1.c
            r5 = r2
            qy5 r5 = (defpackage.qy5) r5
            int r1 = r1.b
            qy5 r2 = r0.D0
            boolean r2 = defpackage.oaf.a(r2, r5)
            if (r2 == 0) goto L_0x0525
        L_0x0523:
            r1 = 0
            goto L_0x0538
        L_0x0525:
            qy5 r2 = r0.D0
            if (r2 != 0) goto L_0x052d
            if (r1 != 0) goto L_0x052d
            r6 = 1
            goto L_0x052e
        L_0x052d:
            r6 = r1
        L_0x052e:
            r0.D0 = r5
            r2 = 0
            r1 = r24
            r3 = r12
            r1.e(r2, r3, r5, r6)
            goto L_0x0523
        L_0x0538:
            r0.A0 = r1
        L_0x053a:
            jn r1 = r0.B0
            boolean r1 = r0.a(r1)
            if (r1 == 0) goto L_0x056a
            jn r1 = r0.B0
            java.lang.Object r2 = r1.c
            r5 = r2
            qy5 r5 = (defpackage.qy5) r5
            int r1 = r1.b
            qy5 r2 = r0.E0
            boolean r2 = defpackage.oaf.a(r2, r5)
            if (r2 == 0) goto L_0x0555
        L_0x0553:
            r1 = 0
            goto L_0x0568
        L_0x0555:
            qy5 r2 = r0.E0
            if (r2 != 0) goto L_0x055d
            if (r1 != 0) goto L_0x055d
            r6 = 1
            goto L_0x055e
        L_0x055d:
            r6 = r1
        L_0x055e:
            r0.E0 = r5
            r2 = 2
            r1 = r24
            r3 = r12
            r1.e(r2, r3, r5, r6)
            goto L_0x0553
        L_0x0568:
            r0.B0 = r1
        L_0x056a:
            android.content.Context r1 = r0.a
            ho9 r1 = defpackage.ho9.h(r1)
            int r1 = r1.i()
            switch(r1) {
                case 0: goto L_0x058d;
                case 1: goto L_0x058a;
                case 2: goto L_0x0588;
                case 3: goto L_0x0586;
                case 4: goto L_0x0584;
                case 5: goto L_0x0581;
                case 6: goto L_0x0577;
                case 7: goto L_0x057f;
                case 8: goto L_0x0577;
                case 9: goto L_0x057c;
                case 10: goto L_0x0579;
                default: goto L_0x0577;
            }
        L_0x0577:
            r6 = 1
            goto L_0x058e
        L_0x0579:
            r6 = r19
            goto L_0x058e
        L_0x057c:
            r6 = r17
            goto L_0x058e
        L_0x057f:
            r6 = 3
            goto L_0x058e
        L_0x0581:
            r6 = r18
            goto L_0x058e
        L_0x0584:
            r6 = 5
            goto L_0x058e
        L_0x0586:
            r6 = r9
            goto L_0x058e
        L_0x0588:
            r6 = 2
            goto L_0x058e
        L_0x058a:
            r6 = r20
            goto L_0x058e
        L_0x058d:
            r6 = r10
        L_0x058e:
            int r1 = r0.x0
            if (r6 == r1) goto L_0x05ad
            r0.x0 = r6
            android.media.metrics.PlaybackSession r1 = r0.c
            android.media.metrics.NetworkEvent$Builder r2 = defpackage.jd8.e()
            android.media.metrics.NetworkEvent$Builder r2 = r2.setNetworkType(r6)
            long r3 = r0.o
            long r3 = r12 - r3
            android.media.metrics.NetworkEvent$Builder r2 = r2.setTimeSinceCreatedMillis(r3)
            android.media.metrics.NetworkEvent r2 = r2.build()
            r1.reportNetworkEvent(r2)
        L_0x05ad:
            int r1 = r25.getPlaybackState()
            r2 = 2
            if (r1 == r2) goto L_0x05b6
            r0.F0 = r10
        L_0x05b6:
            androidx.media3.common.PlaybackException r1 = r25.X()
            if (r1 != 0) goto L_0x05bf
            r0.H0 = r10
            goto L_0x05c8
        L_0x05bf:
            boolean r1 = r7.P(r15)
            if (r1 == 0) goto L_0x05c8
            r1 = 1
            r0.H0 = r1
        L_0x05c8:
            int r1 = r25.getPlaybackState()
            boolean r2 = r0.F0
            if (r2 == 0) goto L_0x05d4
            r2 = 1
            r11 = 5
            goto L_0x0626
        L_0x05d4:
            boolean r2 = r0.H0
            if (r2 == 0) goto L_0x05dc
            r11 = r16
        L_0x05da:
            r2 = 1
            goto L_0x0626
        L_0x05dc:
            if (r1 != r9) goto L_0x05e2
            r2 = 1
            r11 = 11
            goto L_0x0626
        L_0x05e2:
            r11 = 12
            r2 = 2
            if (r1 != r2) goto L_0x0606
            int r1 = r0.w0
            if (r1 == 0) goto L_0x0604
            if (r1 == r2) goto L_0x0604
            if (r1 != r11) goto L_0x05f0
            goto L_0x0604
        L_0x05f0:
            boolean r1 = r25.u()
            if (r1 != 0) goto L_0x05f9
            r11 = r19
            goto L_0x05da
        L_0x05f9:
            int r1 = r25.v0()
            if (r1 == 0) goto L_0x0601
            r11 = r15
            goto L_0x05da
        L_0x0601:
            r11 = r18
            goto L_0x05da
        L_0x0604:
            r11 = r2
            goto L_0x05da
        L_0x0606:
            r2 = 3
            if (r1 != r2) goto L_0x061c
            boolean r1 = r25.u()
            if (r1 != 0) goto L_0x0611
        L_0x060f:
            r11 = r9
            goto L_0x05da
        L_0x0611:
            int r1 = r25.v0()
            if (r1 == 0) goto L_0x061a
            r9 = r20
            goto L_0x060f
        L_0x061a:
            r9 = r2
            goto L_0x060f
        L_0x061c:
            r2 = 1
            if (r1 != r2) goto L_0x0624
            int r1 = r0.w0
            if (r1 == 0) goto L_0x0624
            goto L_0x0626
        L_0x0624:
            int r11 = r0.w0
        L_0x0626:
            int r1 = r0.w0
            if (r1 == r11) goto L_0x0648
            r0.w0 = r11
            r0.L0 = r2
            android.media.metrics.PlaybackSession r1 = r0.c
            android.media.metrics.PlaybackStateEvent$Builder r2 = defpackage.jd8.h()
            int r3 = r0.w0
            android.media.metrics.PlaybackStateEvent$Builder r2 = r2.setState(r3)
            long r3 = r0.o
            long r12 = r12 - r3
            android.media.metrics.PlaybackStateEvent$Builder r2 = r2.setTimeSinceCreatedMillis(r12)
            android.media.metrics.PlaybackStateEvent r2 = r2.build()
            r1.reportPlaybackStateEvent(r2)
        L_0x0648:
            r1 = 1028(0x404, float:1.44E-42)
            boolean r2 = r7.P(r1)
            if (r2 == 0) goto L_0x06a0
            zc4 r2 = r0.b
            java.lang.Object r0 = r7.c
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r0 = r0.get(r1)
            fd r0 = (defpackage.fd) r0
            r0.getClass()
            monitor-enter(r2)
            java.lang.String r1 = r2.f     // Catch:{ all -> 0x0673 }
            if (r1 == 0) goto L_0x0675
            java.util.HashMap r3 = r2.c     // Catch:{ all -> 0x0673 }
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x0673 }
            yc4 r1 = (defpackage.yc4) r1     // Catch:{ all -> 0x0673 }
            r1.getClass()     // Catch:{ all -> 0x0673 }
            r2.a(r1)     // Catch:{ all -> 0x0673 }
            goto L_0x0675
        L_0x0673:
            r0 = move-exception
            goto L_0x069e
        L_0x0675:
            java.util.HashMap r1 = r2.c     // Catch:{ all -> 0x0673 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0673 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0673 }
        L_0x067f:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0673 }
            if (r3 == 0) goto L_0x069c
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0673 }
            yc4 r3 = (defpackage.yc4) r3     // Catch:{ all -> 0x0673 }
            r1.remove()     // Catch:{ all -> 0x0673 }
            boolean r4 = r3.e     // Catch:{ all -> 0x0673 }
            if (r4 == 0) goto L_0x067f
            kd8 r4 = r2.d     // Catch:{ all -> 0x0673 }
            if (r4 == 0) goto L_0x067f
            java.lang.String r3 = r3.a     // Catch:{ all -> 0x0673 }
            r4.d(r0, r3)     // Catch:{ all -> 0x0673 }
            goto L_0x067f
        L_0x069c:
            monitor-exit(r2)
            goto L_0x06a0
        L_0x069e:
            monitor-exit(r2)     // Catch:{ all -> 0x0673 }
            throw r0
        L_0x06a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd8.N(q3b, imc):void");
    }

    public final void R(fd fdVar, pc8 pc8, IOException iOException, boolean z) {
        this.G0 = pc8.a;
    }

    public final void T(fd fdVar, jlf jlf) {
        jn jnVar = this.z0;
        if (jnVar != null) {
            qy5 qy5 = (qy5) jnVar.c;
            if (qy5.u == -1) {
                ny5 a2 = qy5.a();
                a2.s = jlf.a;
                a2.t = jlf.b;
                this.z0 = new jn(jnVar.b, 15, a2.a(), (String) jnVar.o);
            }
        }
    }

    public final void W(fd fdVar, pc8 pc8) {
        yj8 yj8 = fdVar.d;
        if (yj8 != null) {
            qy5 qy5 = (qy5) pc8.g;
            qy5.getClass();
            yj8.getClass();
            jn jnVar = new jn(pc8.c, 15, qy5, this.b.c(fdVar.b, yj8));
            int i = pc8.b;
            if (i != 0) {
                if (i == 1) {
                    this.A0 = jnVar;
                    return;
                } else if (i != 2) {
                    if (i == 3) {
                        this.B0 = jnVar;
                        return;
                    }
                    return;
                }
            }
            this.z0 = jnVar;
        }
    }

    public final boolean a(jn jnVar) {
        String str;
        if (jnVar != null) {
            String str2 = (String) jnVar.o;
            zc4 zc4 = this.b;
            synchronized (zc4) {
                str = zc4.f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.u0;
        if (builder != null && this.L0) {
            builder.setAudioUnderrunCount(this.K0);
            this.u0.setVideoFramesDropped(this.I0);
            this.u0.setVideoFramesPlayed(this.J0);
            Long l = (Long) this.Z.get(this.t0);
            this.u0.setNetworkTransferDurationMillis(l == null ? 0 : l.longValue());
            Long l2 = (Long) this.s0.get(this.t0);
            this.u0.setNetworkBytesRead(l2 == null ? 0 : l2.longValue());
            this.u0.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.c.reportPlaybackMetrics(this.u0.build());
        }
        this.u0 = null;
        this.t0 = null;
        this.K0 = 0;
        this.I0 = 0;
        this.J0 = 0;
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.L0 = false;
    }

    public final void c(mue mue, yj8 yj8) {
        int b2;
        PlaybackMetrics.Builder builder = this.u0;
        if (yj8 != null && (b2 = mue.b(yj8.a)) != -1) {
            hue hue = this.Y;
            int i = 0;
            mue.g(b2, hue, false);
            int i2 = hue.c;
            kue kue = this.X;
            mue.o(i2, kue);
            ib8 ib8 = kue.c.b;
            int i3 = 2;
            if (ib8 != null) {
                int J = oaf.J(ib8.a, ib8.b);
                i = J != 0 ? J != 1 ? J != 2 ? 1 : 4 : 5 : 3;
            }
            builder.setStreamType(i);
            if (kue.m != -9223372036854775807L && !kue.k && !kue.i && !kue.a()) {
                builder.setMediaDurationMillis(oaf.h0(kue.m));
            }
            if (!kue.a()) {
                i3 = 1;
            }
            builder.setPlaybackType(i3);
            this.L0 = true;
        }
    }

    public final void d(fd fdVar, String str) {
        yj8 yj8 = fdVar.d;
        if ((yj8 == null || !yj8.b()) && str.equals(this.t0)) {
            b();
        }
        this.Z.remove(str);
        this.s0.remove(str);
    }

    public final void e(int i, long j, qy5 qy5, int i2) {
        int i3;
        TrackChangeEvent.Builder p = jd8.i(i).setTimeSinceCreatedMillis(j - this.o);
        if (qy5 != null) {
            p.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            p.setTrackChangeReason(i3);
            String str = qy5.m;
            if (str != null) {
                p.setContainerMimeType(str);
            }
            String str2 = qy5.n;
            if (str2 != null) {
                p.setSampleMimeType(str2);
            }
            String str3 = qy5.j;
            if (str3 != null) {
                p.setCodecName(str3);
            }
            int i4 = qy5.i;
            if (i4 != -1) {
                p.setBitrate(i4);
            }
            int i5 = qy5.t;
            if (i5 != -1) {
                p.setWidth(i5);
            }
            int i6 = qy5.u;
            if (i6 != -1) {
                p.setHeight(i6);
            }
            int i7 = qy5.B;
            if (i7 != -1) {
                p.setChannelCount(i7);
            }
            int i8 = qy5.C;
            if (i8 != -1) {
                p.setAudioSampleRate(i8);
            }
            String str4 = qy5.d;
            if (str4 != null) {
                int i9 = oaf.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                p.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    p.setLanguageRegion((String) obj);
                }
            }
            float f = qy5.v;
            if (f != -1.0f) {
                p.setVideoFrameRate(f);
            }
        } else {
            p.setTrackState(0);
        }
        this.L0 = true;
        this.c.reportTrackChangeEvent(p.build());
    }

    public final void m0(fd fdVar, PlaybackException playbackException) {
        this.y0 = playbackException;
    }
}
