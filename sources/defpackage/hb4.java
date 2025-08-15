package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: hb4  reason: default package */
public final class hb4 implements co7, do7 {
    public static final av1 A0 = new Object();
    public static final av1 B0 = new Object();
    public Uri X;
    public boolean Y;
    public long Z;
    public final /* synthetic */ int a = 0;
    public final HashMap b;
    public final CopyOnWriteArrayList c;
    public Handler o;
    public final Object s0;
    public final Object t0;
    public final Object u0;
    public Object v0;
    public Object w0;
    public Object x0;
    public Object y0;
    public Object z0;

    public hb4(gaa gaa, buc buc, dn6 dn6) {
        this.s0 = gaa;
        this.t0 = dn6;
        this.u0 = buc;
        this.c = new CopyOnWriteArrayList();
        this.b = new HashMap();
        this.Z = -9223372036854775807L;
    }

    public b11 C(go7 go7, long j, long j2, IOException iOException, int i) {
        long j3;
        IOException iOException2 = iOException;
        bqa bqa = (bqa) go7;
        long j4 = bqa.a;
        Uri uri = bqa.o.c;
        long j5 = j2;
        yn7 yn7 = new yn7(j2);
        ((huc) this.u0).getClass();
        boolean z = true;
        if (!(iOException2 instanceof ParserException) && !(iOException2 instanceof FileNotFoundException) && !(iOException2 instanceof HttpDataSource$CleartextNotPermittedException) && !(iOException2 instanceof Loader$UnexpectedLoaderException)) {
            int i2 = DataSourceException.b;
            Throwable th = iOException2;
            while (true) {
                if (th != null) {
                    if ((th instanceof DataSourceException) && ((DataSourceException) th).a == 2008) {
                        break;
                    }
                    th = th.getCause();
                } else {
                    j3 = (long) Math.min((i - 1) * 1000, 5000);
                    break;
                }
            }
        }
        j3 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            z = false;
        }
        ((jn) this.v0).C(yn7, bqa.c, iOException2, z);
        return z ? vq7.Z : new b11(j3, 0, 5, false);
    }

    public pm6 a(Uri uri, boolean z) {
        HashMap hashMap = this.b;
        pm6 pm6 = ((fb4) hashMap.get(uri)).o;
        if (pm6 != null && z && !uri.equals(this.X)) {
            List list = ((xm6) this.y0).e;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (uri.equals(((vm6) list.get(i)).a)) {
                    pm6 pm62 = (pm6) this.z0;
                    if (pm62 == null || !pm62.o) {
                        this.X = uri;
                        fb4 fb4 = (fb4) hashMap.get(uri);
                        pm6 pm63 = fb4.o;
                        if (pm63 == null || !pm63.o) {
                            fb4.c(c(uri));
                        } else {
                            this.z0 = pm63;
                            ((rm6) ((hn6) this.x0)).q(pm63);
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        return pm6;
    }

    public qm6 b(Uri uri, boolean z) {
        HashMap hashMap = this.b;
        qm6 qm6 = ((gb4) hashMap.get(uri)).o;
        if (qm6 != null && z) {
            if (!uri.equals(this.X)) {
                List list = ((ym6) this.y0).e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (uri.equals(((wm6) list.get(i)).a)) {
                        qm6 qm62 = (qm6) this.z0;
                        if (qm62 == null || !qm62.o) {
                            this.X = uri;
                            gb4 gb4 = (gb4) hashMap.get(uri);
                            qm6 qm63 = gb4.o;
                            if (qm63 == null || !qm63.o) {
                                gb4.e(c(uri));
                            } else {
                                this.z0 = qm63;
                                ((sm6) ((in6) this.x0)).v(qm63);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            gb4 gb42 = (gb4) hashMap.get(uri);
            qm6 qm64 = gb42.o;
            if (!gb42.v0) {
                gb42.v0 = true;
                if (qm64 != null && !qm64.o) {
                    gb42.c(true);
                }
            }
        }
        return qm6;
    }

    public final Uri c(Uri uri) {
        im6 im6;
        jm6 jm6;
        switch (this.a) {
            case 0:
                pm6 pm6 = (pm6) this.z0;
                if (pm6 == null || !pm6.v.e || (im6 = (im6) pm6.t.get(uri)) == null) {
                    return uri;
                }
                Uri.Builder buildUpon = uri.buildUpon();
                buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(im6.b));
                int i = im6.c;
                if (i != -1) {
                    buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
                }
                return buildUpon.build();
            default:
                qm6 qm6 = (qm6) this.z0;
                if (qm6 == null || !qm6.v.e || (jm6 = (jm6) qm6.t.get(uri)) == null) {
                    return uri;
                }
                Uri.Builder buildUpon2 = uri.buildUpon();
                buildUpon2.appendQueryParameter("_HLS_msn", String.valueOf(jm6.b));
                int i2 = jm6.c;
                if (i2 != -1) {
                    buildUpon2.appendQueryParameter("_HLS_part", String.valueOf(i2));
                }
                return buildUpon2.build();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        r8 = r8.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(android.net.Uri r8) {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x003c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.HashMap r7 = r7.b
            java.lang.Object r7 = r7.get(r8)
            gb4 r7 = (defpackage.gb4) r7
            qm6 r8 = r7.o
            r0 = 0
            if (r8 != 0) goto L_0x0013
            goto L_0x003b
        L_0x0013:
            long r1 = android.os.SystemClock.elapsedRealtime()
            qm6 r8 = r7.o
            long r3 = r8.u
            long r3 = defpackage.oaf.h0(r3)
            r5 = 30000(0x7530, double:1.4822E-319)
            long r3 = java.lang.Math.max(r5, r3)
            qm6 r8 = r7.o
            boolean r5 = r8.o
            r6 = 1
            if (r5 != 0) goto L_0x003a
            r5 = 2
            int r8 = r8.d
            if (r8 == r5) goto L_0x003a
            if (r8 == r6) goto L_0x003a
            long r7 = r7.X
            long r7 = r7 + r3
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x003b
        L_0x003a:
            r0 = r6
        L_0x003b:
            return r0
        L_0x003c:
            java.util.HashMap r7 = r7.b
            java.lang.Object r7 = r7.get(r8)
            fb4 r7 = (defpackage.fb4) r7
            pm6 r8 = r7.o
            r0 = 0
            if (r8 != 0) goto L_0x004a
            goto L_0x0072
        L_0x004a:
            long r1 = android.os.SystemClock.elapsedRealtime()
            pm6 r8 = r7.o
            long r3 = r8.u
            long r3 = defpackage.maf.M(r3)
            r5 = 30000(0x7530, double:1.4822E-319)
            long r3 = java.lang.Math.max(r5, r3)
            pm6 r8 = r7.o
            boolean r5 = r8.o
            r6 = 1
            if (r5 != 0) goto L_0x0071
            r5 = 2
            int r8 = r8.d
            if (r8 == r5) goto L_0x0071
            if (r8 == r6) goto L_0x0071
            long r7 = r7.X
            long r7 = r7 + r3
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x0072
        L_0x0071:
            r0 = r6
        L_0x0072:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb4.d(android.net.Uri):boolean");
    }

    public void m(go7 go7, long j, long j2, boolean z) {
        bqa bqa = (bqa) go7;
        long j3 = bqa.a;
        Uri uri = bqa.o.c;
        yn7 yn7 = new yn7(j2);
        ((huc) this.u0).getClass();
        ((jn) this.v0).x(yn7, 4, -1, (qy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public void o(fo7 fo7, long j, long j2, boolean z) {
        aqa aqa = (aqa) fo7;
        long j3 = aqa.a;
        t1e t1e = aqa.o;
        xn7 xn7 = new xn7(j3, aqa.b, t1e.c, t1e.o, j, j2, t1e.b);
        ((buc) this.u0).getClass();
        ((gk8) this.v0).d(xn7, 4, -1, (oy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public void v(go7 go7, long j, long j2) {
        ym6 ym6;
        bqa bqa = (bqa) go7;
        an6 an6 = (an6) bqa.Y;
        boolean z = an6 instanceof qm6;
        if (z) {
            String str = an6.a;
            ym6 ym62 = ym6.l;
            Uri parse = Uri.parse(str);
            ny5 ny5 = new ny5();
            ny5.a = "0";
            ny5.l = ia9.l("application/x-mpegURL");
            ym6 = new ym6("", Collections.emptyList(), Collections.singletonList(new wm6(parse, new qy5(ny5), (String) null, (String) null, (String) null, (String) null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (qy5) null, (List) null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            ym6 = (ym6) an6;
        }
        this.y0 = ym6;
        this.X = ((wm6) ym6.e.get(0)).a;
        this.c.add(new eb4(this));
        List list = ym6.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list.get(i);
            this.b.put(uri, new gb4(this, uri));
        }
        Uri uri2 = bqa.o.c;
        yn7 yn7 = new yn7(j2);
        gb4 gb4 = (gb4) this.b.get(this.X);
        if (z) {
            gb4.f((qm6) an6, yn7);
        } else {
            gb4.c(false);
        }
        ((huc) this.u0).getClass();
        ((jn) this.v0).z(yn7, 4, -1, (qy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public void y(fo7 fo7, long j, long j2) {
        xm6 xm6;
        aqa aqa = (aqa) fo7;
        zm6 zm6 = (zm6) aqa.Y;
        boolean z = zm6 instanceof pm6;
        if (z) {
            String str = zm6.a;
            xm6 xm62 = xm6.n;
            Uri parse = Uri.parse(str);
            my5 my5 = new my5();
            my5.a = "0";
            my5.j = "application/x-mpegURL";
            xm6 = new xm6("", Collections.emptyList(), Collections.singletonList(new vm6(parse, new oy5(my5), (String) null, (String) null, (String) null, (String) null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (oy5) null, (List) null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            xm6 = (xm6) zm6;
        }
        this.y0 = xm6;
        this.X = ((vm6) xm6.e.get(0)).a;
        this.c.add(new db4(this));
        List list = xm6.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list.get(i);
            this.b.put(uri, new fb4(this, uri));
        }
        long j3 = aqa.a;
        z24 z24 = aqa.b;
        t1e t1e = aqa.o;
        xn7 xn7 = new xn7(j3, z24, t1e.c, t1e.o, j, j2, t1e.b);
        fb4 fb4 = (fb4) this.b.get(this.X);
        if (z) {
            fb4.d((pm6) zm6);
        } else {
            fb4.c(fb4.a);
        }
        ((buc) this.u0).getClass();
        ((gk8) this.v0).f(xn7, 4, -1, (oy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.b11 z(defpackage.fo7 r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            r16 = this;
            r0 = r16
            r1 = r22
            r2 = r17
            aqa r2 = (defpackage.aqa) r2
            xn7 r15 = new xn7
            long r4 = r2.a
            t1e r3 = r2.o
            android.net.Uri r7 = r3.c
            java.util.Map r8 = r3.o
            long r13 = r3.b
            z24 r6 = r2.b
            r3 = r15
            r9 = r18
            r11 = r20
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            java.lang.Object r3 = r0.u0
            buc r3 = (defpackage.buc) r3
            r3.getClass()
            boolean r3 = r1 instanceof com.google.android.exoplayer2.ParserException
            r4 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L_0x005f
            boolean r3 = r1 instanceof java.io.FileNotFoundException
            if (r3 != 0) goto L_0x005f
            boolean r3 = r1 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
            if (r3 != 0) goto L_0x005f
            boolean r3 = r1 instanceof com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException
            if (r3 != 0) goto L_0x005f
            int r3 = com.google.android.exoplayer2.upstream.DataSourceException.b
            r3 = r1
        L_0x003e:
            if (r3 == 0) goto L_0x0053
            boolean r7 = r3 instanceof com.google.android.exoplayer2.upstream.DataSourceException
            if (r7 == 0) goto L_0x004e
            r7 = r3
            com.google.android.exoplayer2.upstream.DataSourceException r7 = (com.google.android.exoplayer2.upstream.DataSourceException) r7
            int r7 = r7.a
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L_0x004e
            goto L_0x005f
        L_0x004e:
            java.lang.Throwable r3 = r3.getCause()
            goto L_0x003e
        L_0x0053:
            int r3 = r23 + -1
            int r3 = r3 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r3 = java.lang.Math.min(r3, r7)
            long r7 = (long) r3
            goto L_0x0060
        L_0x005f:
            r7 = r5
        L_0x0060:
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r5 = 0
            if (r3 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r4 = r5
        L_0x0067:
            java.lang.Object r0 = r0.v0
            gk8 r0 = (defpackage.gk8) r0
            int r2 = r2.c
            r0.i(r15, r2, r1, r4)
            if (r4 == 0) goto L_0x0075
            b11 r0 = defpackage.jo7.Y
            goto L_0x0079
        L_0x0075:
            b11 r0 = defpackage.jo7.e(r7, r5)
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb4.z(fo7, long, long, java.io.IOException, int):b11");
    }

    public hb4(w4d w4d, huc huc, en6 en6) {
        this.s0 = w4d;
        this.t0 = en6;
        this.u0 = huc;
        this.c = new CopyOnWriteArrayList();
        this.b = new HashMap();
        this.Z = -9223372036854775807L;
    }
}
