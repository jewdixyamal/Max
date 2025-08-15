package defpackage;

import android.util.Pair;
import android.view.Surface;
import java.util.List;

/* renamed from: elf  reason: default package */
public final class elf {
    public final v43 a;
    public final qy5 b;
    public final List c;
    public final f1f d;
    public final x99 e;
    public final String f;
    public final int g;
    public jee h;
    public volatile y84 i;
    public volatile int j;
    public volatile boolean k;

    public elf(v43 v43, qy5 qy5, zw6 zw6, f1f f1f, x99 x99) {
        i63 i63 = qy5.A;
        fm9.f(i63 != null);
        this.a = v43;
        this.b = qy5;
        this.c = zw6;
        this.d = f1f;
        this.e = x99;
        String str = qy5.n;
        str.getClass();
        String str2 = f1f.c;
        String str3 = "video/hevc";
        if (str2 != null) {
            str = str2;
        } else if (ia9.i(str)) {
            str = str3;
        }
        int i2 = f1f.d;
        if (i2 == 0 && i63.g(i63) && h15.g(str, i63).isEmpty()) {
            if (h15.g(str3, i63).isEmpty()) {
                i2 = 2;
            }
            Pair create = Pair.create(str3, Integer.valueOf(i2));
            this.f = (String) create.first;
            this.g = ((Integer) create.second).intValue();
        }
        str3 = str;
        Pair create2 = Pair.create(str3, Integer.valueOf(i2));
        this.f = (String) create2.first;
        this.g = ((Integer) create2.second).intValue();
    }

    public final jee a(int i2, int i3) {
        i63 i63;
        if (this.k) {
            return null;
        }
        jee jee = this.h;
        if (jee != null) {
            return jee;
        }
        if (i2 < i3) {
            this.j = 90;
            int i4 = i3;
            i3 = i2;
            i2 = i4;
        }
        if (this.b.w % 180 == this.j % 180) {
            this.j = this.b.w;
        }
        ny5 ny5 = new ny5();
        ny5.s = i2;
        ny5.t = i3;
        boolean z = false;
        ny5.v = 0;
        ny5.u = this.b.v;
        ny5.m = ia9.l(this.f);
        qy5 qy5 = this.b;
        if (i63.g(qy5.A) && this.g != 0) {
            i63 = i63.h;
        } else if (i63.i.equals(qy5.A)) {
            i63 = i63.h;
        } else {
            i63 = qy5.A;
            i63.getClass();
        }
        ny5.z = i63;
        ny5.i = this.b.j;
        qy5 qy52 = new qy5(ny5);
        v43 v43 = this.a;
        ny5 a2 = qy52.a();
        a2.m = ia9.l(yqc.i(qy52, this.c));
        this.i = v43.d(new qy5(a2));
        qy5 qy53 = this.i.c;
        x99 x99 = this.e;
        f1f f1f = this.d;
        if (this.j != 0) {
            z = true;
        }
        int i5 = this.g;
        ty a3 = f1f.a();
        if (f1f.d != i5) {
            a3.b = i5;
        }
        if (!oaf.a(qy52.n, qy53.n)) {
            a3.c(qy53.n);
        }
        if (z) {
            int i6 = qy52.t;
            int i7 = qy53.t;
            if (i6 != i7) {
                a3.a = i7;
            }
        } else {
            int i8 = qy52.u;
            int i9 = qy53.u;
            if (i8 != i9) {
                a3.a = i9;
            }
        }
        x99.m(a3.a());
        Surface surface = this.i.e;
        fm9.l(surface);
        this.h = new jee(surface, qy53.t, qy53.u, this.j);
        if (this.k) {
            this.i.h();
        }
        return this.h;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 128 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r2 = this;
            y84 r0 = r2.i
            if (r0 == 0) goto L_0x003a
            y84 r2 = r2.i
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.i
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x001b
            r0 = 30
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0014 }
            goto L_0x001b
        L_0x0014:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x001b:
            java.util.LinkedHashMap r0 = defpackage.d54.a
            java.lang.Class<d54> r0 = defpackage.d54.class
            monitor-enter(r0)
            java.lang.Class<d54> r1 = defpackage.d54.class
            monitor-enter(r1)     // Catch:{ all -> 0x0038 }
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
            monitor-exit(r0)
            android.media.MediaCodec r0 = r2.d     // Catch:{ RuntimeException -> 0x002b }
            r0.signalEndOfInputStream()     // Catch:{ RuntimeException -> 0x002b }
            goto L_0x003a
        L_0x002b:
            r0 = move-exception
            java.lang.String r1 = "MediaCodec error"
            defpackage.z04.s(r0, r1)
            androidx.media3.transformer.ExportException r2 = r2.a(r0)
            throw r2
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r2
        L_0x0038:
            r2 = move-exception
            goto L_0x0036
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elf.b():void");
    }
}
