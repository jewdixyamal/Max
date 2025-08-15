package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: a3d  reason: default package */
public abstract class a3d implements zo4 {
    public final a34 a;
    public final zpa b;
    public final ArrayList c;
    public final mw0 d;
    public final gw0 e;
    public final xw0 f = xw0.c;
    public final Executor g;
    public final long h = oaf.S(20000);
    public final ArrayList i = new ArrayList();
    public volatile boolean j;

    public a3d(tb8 tb8, zpa zpa, mw0 mw0, Executor executor) {
        tb8.b.getClass();
        ib8 ib8 = tb8.b;
        this.a = d(ib8.a);
        this.b = zpa;
        this.c = new ArrayList(ib8.e);
        this.d = mw0;
        this.g = executor;
        gw0 gw0 = mw0.a;
        gw0.getClass();
        this.e = gw0;
    }

    public static a34 d(Uri uri) {
        Map emptyMap = Collections.emptyMap();
        fm9.m(uri, "The uri must be set.");
        return new a34(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 1, (Object) null);
    }

    public static void f(List list, xw0 xw0, long j2) {
        int i2;
        HashMap hashMap;
        String str;
        y2d y2d;
        List list2 = list;
        HashMap hashMap2 = new HashMap();
        int i3 = 0;
        int i4 = 0;
        while (i3 < list.size()) {
            y2d y2d2 = (y2d) list2.get(i3);
            String e2 = xw0.e(y2d2.b);
            Integer num = (Integer) hashMap2.get(e2);
            y2d y2d3 = num == null ? null : (y2d) list2.get(num.intValue());
            if (y2d3 != null) {
                long j3 = y2d3.a;
                if (y2d2.a <= j3 + j2) {
                    a34 a34 = y2d3.b;
                    Uri uri = a34.a;
                    a34 a342 = y2d2.b;
                    if (uri.equals(a342.a)) {
                        long j4 = a34.g;
                        long j5 = -1;
                        if (j4 != -1) {
                            hashMap = hashMap2;
                            i2 = i3;
                            y2d = y2d2;
                            str = e2;
                            if (a34.f + j4 == a342.f && oaf.a(a34.h, a342.h) && a34.i == a342.i && a34.c == a342.c && a34.e.equals(a342.e)) {
                                long j6 = a342.g;
                                if (j6 != -1) {
                                    j5 = j4 + j6;
                                }
                                a34 c2 = a34.c(0, j5);
                                num.getClass();
                                list2.set(num.intValue(), new y2d(j3, c2));
                                i3 = i2 + 1;
                                hashMap2 = hashMap;
                            }
                            hashMap.put(str, Integer.valueOf(i4));
                            list2.set(i4, y2d);
                            i4++;
                            i3 = i2 + 1;
                            hashMap2 = hashMap;
                        }
                    }
                }
            }
            hashMap = hashMap2;
            i2 = i3;
            y2d = y2d2;
            str = e2;
            hashMap.put(str, Integer.valueOf(i4));
            list2.set(i4, y2d);
            i4++;
            i3 = i2 + 1;
            hashMap2 = hashMap;
        }
        oaf.X(list2, i4, list.size());
    }

    public final void a(yo4 yo4) {
        ow0 ow0;
        byte[] bArr;
        ArrayDeque arrayDeque;
        ArrayDeque arrayDeque2 = new ArrayDeque();
        ArrayDeque arrayDeque3 = new ArrayDeque();
        try {
            ow0 c2 = this.d.c();
            ok5 ok5 = (ok5) c(new w2d(this, c2, this.a), false);
            if (!this.c.isEmpty()) {
                ok5 = (ok5) ok5.a(this.c);
            }
            ArrayList e2 = e(c2, ok5, false);
            Collections.sort(e2);
            f(e2, this.f, this.h);
            int size = e2.size();
            int size2 = e2.size() - 1;
            int i2 = 0;
            long j2 = 0;
            long j3 = 0;
            while (size2 >= 0) {
                a34 a34 = ((y2d) e2.get(size2)).b;
                String e3 = this.f.e(a34);
                long j4 = a34.g;
                if (j4 == -1) {
                    long a2 = dt3.a(((spd) this.e).i(e3));
                    if (a2 != -1) {
                        j4 = a2 - a34.f;
                    }
                }
                ArrayDeque arrayDeque4 = arrayDeque3;
                long g2 = ((spd) this.e).g(a34.f, e3, j4);
                j3 += g2;
                if (j4 != -1) {
                    if (j4 == g2) {
                        i2++;
                        e2.remove(size2);
                    }
                    if (j2 != -1) {
                        j2 += j4;
                    }
                } else {
                    j2 = -1;
                }
                size2--;
                arrayDeque3 = arrayDeque4;
            }
            ArrayDeque arrayDeque5 = arrayDeque3;
            x2d x2d = yo4 != null ? new x2d(yo4, j2, size, j3, i2) : null;
            arrayDeque2.addAll(e2);
            while (!this.j && !arrayDeque2.isEmpty()) {
                if (!arrayDeque5.isEmpty()) {
                    z2d z2d = (z2d) arrayDeque5.removeFirst();
                    ow0 = z2d.t0;
                    bArr = z2d.v0;
                } else {
                    ow0 = this.d.c();
                    bArr = new byte[131072];
                }
                z2d z2d2 = new z2d((y2d) arrayDeque2.removeFirst(), ow0, x2d, bArr);
                b(z2d2);
                this.g.execute(z2d2);
                int size3 = this.i.size() - 1;
                while (size3 >= 0) {
                    z2d z2d3 = (z2d) this.i.get(size3);
                    if (arrayDeque2.isEmpty() || z2d3.b.e()) {
                        try {
                            z2d3.get();
                            g(size3);
                            arrayDeque = arrayDeque5;
                            try {
                                arrayDeque.addLast(z2d3);
                            } catch (ExecutionException e4) {
                                e = e4;
                            }
                        } catch (ExecutionException e5) {
                            e = e5;
                            arrayDeque = arrayDeque5;
                            Throwable cause = e.getCause();
                            cause.getClass();
                            if (cause instanceof PriorityTaskManager$PriorityTooLowException) {
                                arrayDeque2.addFirst(z2d3.s0);
                                g(size3);
                                arrayDeque.addLast(z2d3);
                                size3--;
                                arrayDeque5 = arrayDeque;
                            } else if (cause instanceof IOException) {
                                throw ((IOException) cause);
                            } else {
                                throw cause;
                            }
                        }
                    } else {
                        arrayDeque = arrayDeque5;
                    }
                    size3--;
                    arrayDeque5 = arrayDeque;
                }
                ArrayDeque arrayDeque6 = arrayDeque5;
                z2d2.a.b();
                arrayDeque5 = arrayDeque6;
            }
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                ((ppc) this.i.get(i3)).cancel(true);
            }
            for (int size4 = this.i.size() - 1; size4 >= 0; size4--) {
                ((ppc) this.i.get(size4)).a();
                g(size4);
            }
        } catch (Throwable th) {
            for (int i4 = 0; i4 < this.i.size(); i4++) {
                ((ppc) this.i.get(i4)).cancel(true);
            }
            for (int size5 = this.i.size() - 1; size5 >= 0; size5--) {
                ((ppc) this.i.get(size5)).a();
                g(size5);
            }
            throw th;
        }
    }

    public final void b(ppc ppc) {
        synchronized (this.i) {
            try {
                if (!this.j) {
                    this.i.add(ppc);
                } else {
                    throw new InterruptedException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object c(ppc ppc, boolean z) {
        if (z) {
            ppc.run();
            try {
                return ppc.get();
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i2 = oaf.a;
                throw e2;
            }
        } else {
            while (!this.j) {
                b(ppc);
                this.g.execute(ppc);
                try {
                    return ppc.get();
                } catch (ExecutionException e3) {
                    Throwable cause2 = e3.getCause();
                    cause2.getClass();
                    if (!(cause2 instanceof PriorityTaskManager$PriorityTooLowException)) {
                        if (cause2 instanceof IOException) {
                            throw ((IOException) cause2);
                        }
                        int i3 = oaf.a;
                        throw e3;
                    }
                } finally {
                    ppc.a();
                    h(ppc);
                }
            }
            throw new InterruptedException();
        }
    }

    public final void cancel() {
        synchronized (this.i) {
            try {
                this.j = true;
                for (int i2 = 0; i2 < this.i.size(); i2++) {
                    ((ppc) this.i.get(i2)).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ArrayList e(ow0 ow0, ok5 ok5, boolean z);

    public final void g(int i2) {
        synchronized (this.i) {
            this.i.remove(i2);
        }
    }

    public final void h(ppc ppc) {
        synchronized (this.i) {
            this.i.remove(ppc);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x004a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void remove() {
        /*
            r8 = this;
            xw0 r0 = r8.f
            gw0 r1 = r8.e
            a34 r2 = r8.a
            mw0 r3 = r8.d
            int r4 = r3.e
            r5 = 1
            r4 = r4 | r5
            r6 = -4000(0xfffffffffffff060, float:NaN)
            r7 = 0
            ow0 r3 = r3.d(r7, r4, r6)
            w2d r4 = new w2d     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            r4.<init>(r8, r3, r2)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            java.lang.Object r4 = r8.c(r4, r5)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            ok5 r4 = (defpackage.ok5) r4     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            java.util.ArrayList r8 = r8.e(r3, r4, r5)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            r3 = 0
        L_0x0023:
            int r4 = r8.size()     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            if (r3 >= r4) goto L_0x0040
            java.lang.Object r4 = r8.get(r3)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            y2d r4 = (defpackage.y2d) r4     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            a34 r4 = r4.b     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            java.lang.String r4 = r0.e(r4)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            r5 = r1
            spd r5 = (defpackage.spd) r5     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            r5.l(r4)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            int r3 = r3 + 1
            goto L_0x0023
        L_0x003e:
            r8 = move-exception
            goto L_0x0053
        L_0x0040:
            java.lang.String r8 = r0.e(r2)
            spd r1 = (defpackage.spd) r1
            r1.l(r8)
            goto L_0x0052
        L_0x004a:
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003e }
            r8.interrupt()     // Catch:{ all -> 0x003e }
            goto L_0x0040
        L_0x0052:
            return
        L_0x0053:
            java.lang.String r0 = r0.e(r2)
            spd r1 = (defpackage.spd) r1
            r1.l(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a3d.remove():void");
    }
}
