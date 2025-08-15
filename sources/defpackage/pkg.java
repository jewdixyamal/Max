package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pkg  reason: default package */
public final class pkg implements u43 {
    public static pkg X;
    public Object a;
    public int b;
    public Object c;
    public Object o;

    public static ExportException c(qy5 qy5, String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
        String qy52 = qy5.toString();
        String str2 = qy5.n;
        str2.getClass();
        return ExportException.c(illegalArgumentException, 3003, new qh3(qy52, (String) null, ia9.k(str2), true));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, pkg] */
    public static synchronized pkg f(Context context) {
        pkg pkg;
        synchronized (pkg.class) {
            try {
                if (X == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new cm9("MessengerIpcClient", 0)));
                    ? obj = new Object();
                    obj.o = new vjg(obj);
                    obj.b = 1;
                    obj.c = unconfigurableScheduledExecutorService;
                    obj.a = context.getApplicationContext();
                    X = obj;
                }
                pkg = X;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return pkg;
    }

    public String a(int i, long j, long j2, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            String[] strArr = (String[]) this.a;
            int i3 = this.b;
            if (i2 < i3) {
                sb.append(strArr[i2]);
                int i4 = ((int[]) this.c)[i2];
                if (i4 == 1) {
                    sb.append(str);
                } else {
                    String[] strArr2 = (String[]) this.o;
                    if (i4 == 2) {
                        sb.append(String.format(Locale.US, strArr2[i2], new Object[]{Long.valueOf(j)}));
                    } else if (i4 == 3) {
                        sb.append(String.format(Locale.US, strArr2[i2], new Object[]{Integer.valueOf(i)}));
                    } else if (i4 == 4) {
                        sb.append(String.format(Locale.US, strArr2[i2], new Object[]{Long.valueOf(j2)}));
                    }
                }
                i2++;
            } else {
                sb.append(strArr[i3]);
                return sb.toString();
            }
        }
    }

    public y84 b(MediaFormat mediaFormat, qy5 qy5, Surface surface, boolean z) {
        qy5 qy52 = qy5;
        ls5 ls5 = zw6.b;
        ffc ffc = ffc.X;
        qy52.n.getClass();
        try {
            ArrayList h = p88.h(qy52, p88.g((xw0) this.o, qy52, false, false));
            if (!h.isEmpty()) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < h.size(); i++) {
                        y78 y78 = (y78) h.get(i);
                        if (!y78.g) {
                            arrayList.add(y78);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        h = arrayList;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Context context = (Context) this.a;
                for (y78 y782 : h.subList(0, 1)) {
                    mediaFormat.setString("mime", y782.c);
                    try {
                        y84 y84 = new y84(context, qy5, mediaFormat, y782.a, true, surface);
                        y84.b();
                        ((av1) this.c).getClass();
                        return y84;
                    } catch (ExportException e) {
                        arrayList2.add(e);
                    }
                }
                throw ((ExportException) arrayList2.get(0));
            }
            throw c(qy52, "No decoders for format");
        } catch (MediaCodecUtil$DecoderQueryException e2) {
            z04.v("Error querying decoders", e2);
            throw c(qy52, "Querying codecs failed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r4.equals("SM-X900") == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (defpackage.oaf.d.startsWith("SM-F936") != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.y84 d(defpackage.qy5 r8, android.view.Surface r9, boolean r10) {
        /*
            r7 = this;
            i63 r0 = r8.A
            boolean r0 = defpackage.i63.g(r0)
            r1 = 29
            r2 = 31
            if (r0 == 0) goto L_0x0075
            if (r10 == 0) goto L_0x0069
            int r0 = defpackage.oaf.a
            if (r0 < r2) goto L_0x0062
            i63 r3 = r8.A
            r3.getClass()
            java.lang.String r4 = defpackage.oaf.c
            java.lang.String r5 = "Google"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x002b
            java.lang.String r4 = android.os.Build.ID
            java.lang.String r5 = "TP1A"
            boolean r4 = r4.startsWith(r5)
            if (r4 != 0) goto L_0x0062
        L_0x002b:
            int r3 = r3.c
            r4 = 7
            java.lang.String r5 = "SM-F936"
            if (r3 != r4) goto L_0x0052
            java.lang.String r4 = defpackage.oaf.d
            boolean r6 = r4.startsWith(r5)
            if (r6 != 0) goto L_0x0062
            java.lang.String r6 = "SM-F916"
            boolean r6 = r4.startsWith(r6)
            if (r6 != 0) goto L_0x0062
            java.lang.String r6 = "SM-F721"
            boolean r6 = r4.startsWith(r6)
            if (r6 != 0) goto L_0x0062
            java.lang.String r6 = "SM-X900"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0062
        L_0x0052:
            r4 = 34
            if (r0 >= r4) goto L_0x0069
            r0 = 6
            if (r3 != r0) goto L_0x0069
            java.lang.String r0 = defpackage.oaf.d
            boolean r0 = r0.startsWith(r5)
            if (r0 != 0) goto L_0x0062
            goto L_0x0069
        L_0x0062:
            java.lang.String r7 = "Tone-mapping HDR is not supported on this device."
            androidx.media3.transformer.ExportException r7 = c(r8, r7)
            throw r7
        L_0x0069:
            int r0 = defpackage.oaf.a
            if (r0 < r1) goto L_0x006e
            goto L_0x0075
        L_0x006e:
            java.lang.String r7 = "Decoding HDR is not supported on this device."
            androidx.media3.transformer.ExportException r7 = c(r8, r7)
            throw r7
        L_0x0075:
            int r0 = defpackage.oaf.a
            if (r0 >= r2) goto L_0x00ab
            int r3 = r8.t
            r4 = 7680(0x1e00, float:1.0762E-41)
            if (r3 < r4) goto L_0x00ab
            int r3 = r8.u
            r4 = 4320(0x10e0, float:6.054E-42)
            if (r3 < r4) goto L_0x00ab
            java.lang.String r3 = r8.n
            if (r3 == 0) goto L_0x00ab
            java.lang.String r4 = "video/hevc"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ab
            java.lang.String r3 = defpackage.oaf.d
            java.lang.String r4 = "SM-F711U1"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x00a4
            java.lang.String r4 = "SM-F926U1"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00a4
            goto L_0x00ab
        L_0x00a4:
            java.lang.String r7 = "Decoding 8k is not supported on this device."
            androidx.media3.transformer.ExportException r7 = c(r8, r7)
            throw r7
        L_0x00ab:
            r3 = 30
            if (r0 >= r3) goto L_0x00c7
            java.lang.String r3 = defpackage.oaf.b
            java.lang.String r4 = "joyeuse"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00c7
            ny5 r8 = r8.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.u = r3
            qy5 r3 = new qy5
            r3.<init>(r8)
            r8 = r3
        L_0x00c7:
            android.media.MediaFormat r3 = defpackage.j47.u(r8)
            r4 = 0
            if (r0 < r1) goto L_0x00df
            java.lang.Object r5 = r7.a
            android.content.Context r5 = (android.content.Context) r5
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            int r5 = r5.targetSdkVersion
            if (r5 < r1) goto L_0x00df
            java.lang.String r1 = "allow-frame-drop"
            r3.setInteger(r1, r4)
        L_0x00df:
            if (r0 < r2) goto L_0x00e9
            if (r10 == 0) goto L_0x00e9
            java.lang.String r10 = "color-transfer-request"
            r1 = 3
            r3.setInteger(r10, r1)
        L_0x00e9:
            android.util.Pair r10 = defpackage.p88.d(r8)
            if (r10 == 0) goto L_0x0109
            java.lang.Object r1 = r10.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r2 = "profile"
            defpackage.j47.X(r3, r2, r1)
            java.lang.Object r10 = r10.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.String r1 = "level"
            defpackage.j47.X(r3, r1, r10)
        L_0x0109:
            r10 = 35
            if (r0 < r10) goto L_0x0119
            int r10 = r7.b
            int r10 = -r10
            int r10 = java.lang.Math.max(r4, r10)
            java.lang.String r0 = "importance"
            r3.setInteger(r0, r10)
        L_0x0119:
            int r10 = r8.t
            int r0 = r8.u
            int r10 = r10 * r0
            r0 = 2073600(0x1fa400, float:2.905732E-39)
            if (r10 < r0) goto L_0x0136
            java.lang.String r10 = defpackage.oaf.d
            java.lang.String r0 = "vivo 1906"
            boolean r0 = defpackage.lz7.j(r10, r0)
            if (r0 != 0) goto L_0x0135
            java.lang.String r0 = "redmi 8"
            boolean r10 = defpackage.lz7.j(r10, r0)
            if (r10 == 0) goto L_0x0136
        L_0x0135:
            r4 = 1
        L_0x0136:
            y84 r7 = r7.b(r3, r8, r9, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pkg.d(qy5, android.view.Surface, boolean):y84");
    }

    public iqd e(Resources resources, hle hle) {
        te0 te0 = (te0) this.o;
        if (te0 != null) {
            return iqd.g(te0);
        }
        Drawable drawable = (Drawable) this.c;
        if (drawable != null) {
            te0 te02 = new te0(drawable);
            this.o = te02;
            return iqd.g(te02);
        } else if (((Uri) this.a) == null) {
            te0 te03 = new te0(new ColorDrawable(this.b));
            this.o = te03;
            return iqd.g(te03);
        } else {
            uqd h = new q1a(2, new l5(12, this)).h(new yt8(15, (Object) resources));
            hle.getClass();
            jle jle = (jle) hle;
            return new rqd(h.m(jle.a()).i(jle.b()), new yt8(16, (Object) this), 2);
        }
    }

    public y84 g(qy5 qy5) {
        return b(j47.u(qy5), qy5, (Surface) null, false);
    }

    public synchronized ukg h(ckg ckg) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(ckg.toString());
            }
            if (!((vjg) this.o).d(ckg)) {
                vjg vjg = new vjg(this);
                this.o = vjg;
                vjg.d(ckg);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return ckg.b.a;
    }
}
