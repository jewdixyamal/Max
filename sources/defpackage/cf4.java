package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.webrtc.MediaStreamTrack;

/* renamed from: cf4  reason: default package */
public final class cf4 extends hz7 implements jgc {
    public static final zma j = zma.a(new v00(19));
    public final Object c;
    public final Context d;
    public final kj6 e;
    public final boolean f;
    public oe4 g;
    public final w36 h;
    public h30 i;

    public cf4(Context context) {
        this(context, new kj6(6));
    }

    public static int c(int i2, int i3) {
        if (i2 == 0 || i2 != i3) {
            return Integer.bitCount(i2 & i3);
        }
        return Integer.MAX_VALUE;
    }

    public static void d(tze tze, j0f j0f, HashMap hashMap) {
        for (int i2 = 0; i2 < tze.a; i2++) {
            c0f c0f = (c0f) j0f.A.get(tze.a(i2));
            if (c0f != null) {
                rze rze = c0f.a;
                c0f c0f2 = (c0f) hashMap.get(Integer.valueOf(rze.c));
                if (c0f2 == null || (c0f2.b.isEmpty() && !c0f.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(rze.c), c0f);
                }
            }
        }
    }

    public static int e(qy5 qy5, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(qy5.d)) {
            return 4;
        }
        String h2 = h(str);
        String h3 = h(qy5.d);
        if (h3 == null || h2 == null) {
            return (!z || h3 != null) ? 0 : 1;
        }
        if (h3.startsWith(h2) || h2.startsWith(h3)) {
            return 3;
        }
        int i2 = oaf.a;
        return h3.split("-", 2)[0].equals(h2.split("-", 2)[0]) ? 2 : 0;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean i(oe4 oe4, int i2, qy5 qy5) {
        if ((i2 & 3584) == 0) {
            return false;
        }
        f0f f0f = oe4.s;
        if (f0f.c && (i2 & 2048) == 0) {
            return false;
        }
        if (!f0f.b) {
            return true;
        }
        return !(qy5.E != 0 || qy5.F != 0) || ((i2 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0);
    }

    public static Pair j(int i2, fz7 fz7, int[][][] iArr, ve4 ve4, Comparator comparator) {
        Object obj;
        boolean z;
        fz7 fz72 = fz7;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < fz72.a) {
            if (i2 == fz72.b[i3]) {
                tze tze = fz72.c[i3];
                int i4 = 0;
                while (i4 < tze.a) {
                    rze a = tze.a(i4);
                    ffc k = ve4.k(i3, a, iArr[i3][i4]);
                    int i5 = a.a;
                    boolean[] zArr = new boolean[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        xe4 xe4 = (xe4) k.get(i6);
                        int a2 = xe4.a();
                        if (!zArr[i6] && a2 != 0) {
                            if (a2 == 1) {
                                obj = zw6.n(xe4);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(xe4);
                                int i7 = i6 + 1;
                                while (i7 < i5) {
                                    xe4 xe42 = (xe4) k.get(i7);
                                    if (xe42.a() != 2 || !xe4.b(xe42)) {
                                        z = true;
                                    } else {
                                        arrayList2.add(xe42);
                                        z = true;
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    boolean z2 = z;
                                    fz7 fz73 = fz7;
                                }
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i6++;
                        fz7 fz74 = fz7;
                    }
                    i4++;
                    fz7 fz75 = fz7;
                }
            }
            ve4 ve42 = ve4;
            i3++;
            fz72 = fz7;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((xe4) list.get(i8)).c;
        }
        xe4 xe43 = (xe4) list.get(0);
        return Pair.create(new l85(xe43.b, iArr2), Integer.valueOf(xe43.a));
    }

    public final void a(h30 h30) {
        boolean z;
        synchronized (this.c) {
            z = !this.i.equals(h30);
            this.i = h30;
        }
        if (z) {
            g();
        }
    }

    public final void b(j0f j0f) {
        if (j0f instanceof oe4) {
            k((oe4) j0f);
        }
        me4 me4 = new me4(f());
        me4.d(j0f);
        k(new oe4(me4));
    }

    public final oe4 f() {
        oe4 oe4;
        synchronized (this.c) {
            oe4 = this.g;
        }
        return oe4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r1 = r3.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            oe4 r1 = r3.g     // Catch:{ all -> 0x001d }
            boolean r1 = r1.s0     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001f
            boolean r1 = r3.f     // Catch:{ all -> 0x001d }
            if (r1 != 0) goto L_0x001f
            int r1 = defpackage.oaf.a     // Catch:{ all -> 0x001d }
            r2 = 32
            if (r1 < r2) goto L_0x001f
            w36 r1 = r3.h     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001f
            boolean r1 = r1.a     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001f
            r1 = 1
            goto L_0x0020
        L_0x001d:
            r3 = move-exception
            goto L_0x0031
        L_0x001f:
            r1 = 0
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0030
            k0f r3 = r3.a
            if (r3 == 0) goto L_0x0030
            g85 r3 = (defpackage.g85) r3
            bie r3 = r3.s0
            r0 = 10
            r3.f(r0)
        L_0x0030:
            return
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf4.g():void");
    }

    public final void k(oe4 oe4) {
        boolean z;
        oe4.getClass();
        synchronized (this.c) {
            z = !this.g.equals(oe4);
            this.g = oe4;
        }
        if (z) {
            if (oe4.s0 && this.d == null) {
                z04.c0("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            k0f k0f = this.a;
            if (k0f != null) {
                ((g85) k0f).s0.f(10);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, w36] */
    public cf4(Context context, kj6 kj6) {
        boolean z = false;
        String str = oe4.z0;
        oe4 oe4 = new oe4(new me4(context));
        this.c = new Object();
        w36 w36 = null;
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = kj6;
        this.g = oe4;
        this.i = h30.g;
        boolean z2 = context != null && oaf.P(context);
        this.f = z2;
        if (!z2 && context != null && oaf.a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (audioManager != null) {
                Spatializer b = audioManager.getSpatializer();
                ? obj = new Object();
                obj.b = b;
                obj.a = b.getImmersiveAudioLevel() != 0 ? true : z;
                w36 = obj;
            }
            this.h = w36;
        }
        if (this.g.s0 && context == null) {
            z04.c0("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
