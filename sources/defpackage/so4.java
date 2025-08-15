package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* renamed from: so4  reason: default package */
public final class so4 {
    public static final zhc n = new zhc(1);
    public final Context a;
    public final d9g b;
    public final po4 c;
    public final q64 d;
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();
    public int f;
    public int g;
    public boolean h;
    public boolean i = true;
    public int j;
    public boolean k;
    public List l = Collections.emptyList();
    public gb0 m;

    public so4(Context context, e34 e34, gw0 gw0, q24 q24, ExecutorService executorService) {
        q94 q94 = new q94(e34);
        mw0 mw0 = new mw0();
        mw0.a = gw0;
        mw0.d = q24;
        r94 r94 = new r94(mw0, executorService);
        this.a = context.getApplicationContext();
        this.b = q94;
        Handler p = oaf.p(new hl4(1, this));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        po4 po4 = new po4(handlerThread, q94, r94, p, this.i);
        this.c = po4;
        q64 q64 = new q64(7, (Object) this);
        this.d = q64;
        gb0 gb0 = new gb0(context, q64, n);
        this.m = gb0;
        int d2 = gb0.d();
        this.j = d2;
        this.f = 1;
        po4.obtainMessage(1, d2, 0).sendToTarget();
    }

    public final void a() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((qo4) it.next()).d(this, this.k);
        }
    }

    public final void b(gb0 gb0, int i2) {
        Object obj = gb0.d;
        if (this.j != i2) {
            this.j = i2;
            this.f++;
            this.c.obtainMessage(3, i2, 0).sendToTarget();
        }
        boolean d2 = d();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((qo4) it.next()).b();
        }
        if (d2) {
            a();
        }
    }

    public final void c(boolean z) {
        if (this.i != z) {
            this.i = z;
            this.f++;
            this.c.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
            boolean d2 = d();
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((qo4) it.next()).getClass();
            }
            if (d2) {
                a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r4 = this;
            boolean r0 = r4.i
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0024
            int r0 = r4.j
            if (r0 == 0) goto L_0x0024
            r0 = r2
        L_0x000b:
            java.util.List r3 = r4.l
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x0024
            java.util.List r3 = r4.l
            java.lang.Object r3 = r3.get(r0)
            dn4 r3 = (defpackage.dn4) r3
            int r3 = r3.b
            if (r3 != 0) goto L_0x0021
            r0 = r1
            goto L_0x0025
        L_0x0021:
            int r0 = r0 + 1
            goto L_0x000b
        L_0x0024:
            r0 = r2
        L_0x0025:
            boolean r3 = r4.k
            if (r3 == r0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = r2
        L_0x002b:
            r4.k = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so4.d():boolean");
    }
}
