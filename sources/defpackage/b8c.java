package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: b8c  reason: default package */
public final class b8c implements Cloneable {
    public final u2a A0;
    public final mhc B0;
    public final boolean C0;
    public Object X;
    public v45 Y;
    public f8c Z;
    public final g8c a;
    public final dp3 b;
    public final qp6 c;
    public final AtomicBoolean o = new AtomicBoolean();
    public boolean s0;
    public od t0;
    public boolean u0;
    public boolean v0;
    public boolean w0 = true;
    public volatile boolean x0;
    public volatile od y0;
    public volatile f8c z0;

    public b8c(u2a u2a, mhc mhc, boolean z) {
        this.A0 = u2a;
        this.B0 = mhc;
        this.C0 = z;
        this.a = (g8c) u2a.b.b;
        this.b = (dp3) u2a.X.b;
        qp6 qp6 = new qp6(1, this);
        qp6.g((long) u2a.H0, TimeUnit.MILLISECONDS);
        this.c = qp6;
    }

    public static final String a(b8c b8c) {
        StringBuilder sb = new StringBuilder();
        sb.append(b8c.x0 ? "canceled " : "");
        sb.append(b8c.C0 ? "web socket" : "call");
        sb.append(" to ");
        sb.append(b8c.B0.b.g());
        return sb.toString();
    }

    public final void b(f8c f8c) {
        byte[] bArr = naf.a;
        if (this.Z == null) {
            this.Z = f8c;
            f8c.o.add(new a8c(this, this.X));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final IOException c(IOException iOException) {
        IOException iOException2;
        Socket k;
        byte[] bArr = naf.a;
        f8c f8c = this.Z;
        if (f8c != null) {
            synchronized (f8c) {
                k = k();
            }
            if (this.Z == null) {
                if (k != null) {
                    naf.d(k);
                }
                this.b.getClass();
            } else if (k != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (!this.s0 && this.c.j()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            this.b.getClass();
        } else {
            this.b.getClass();
        }
        return iOException2;
    }

    public final Object clone() {
        return new b8c(this.A0, this.B0, this.C0);
    }

    public final void d() {
        Socket socket;
        if (!this.x0) {
            this.x0 = true;
            od odVar = this.y0;
            if (odVar != null) {
                ((u45) odVar.Y).cancel();
            }
            f8c f8c = this.z0;
            if (!(f8c == null || (socket = f8c.b) == null)) {
                naf.d(socket);
            }
            this.b.getClass();
        }
    }

    public final void e(gq1 gq1) {
        z7c z7c;
        if (this.o.compareAndSet(false, true)) {
            q2b q2b = q2b.a;
            this.X = q2b.a.g();
            this.b.getClass();
            a8g a8g = this.A0.a;
            z7c z7c2 = new z7c(this, gq1);
            synchronized (a8g) {
                ((ArrayDeque) a8g.b).add(z7c2);
                if (!this.C0) {
                    String str = this.B0.b.e;
                    Iterator it = ((ArrayDeque) a8g.c).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator it2 = ((ArrayDeque) a8g.b).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z7c = null;
                                    break;
                                }
                                z7c = (z7c) it2.next();
                                if (tpa.f(z7c.c.B0.b.e, str)) {
                                    break;
                                }
                            }
                        } else {
                            z7c = (z7c) it.next();
                            if (tpa.f(z7c.c.B0.b.e, str)) {
                                break;
                            }
                        }
                    }
                    if (z7c != null) {
                        z7c2.a = z7c.a;
                    }
                }
            }
            a8g.q();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final yic f() {
        if (this.o.compareAndSet(false, true)) {
            this.c.i();
            q2b q2b = q2b.a;
            this.X = q2b.a.g();
            this.b.getClass();
            try {
                a8g a8g = this.A0.a;
                synchronized (a8g) {
                    ((ArrayDeque) a8g.o).add(this);
                }
                yic h = h();
                a8g a8g2 = this.A0.a;
                a8g2.i((ArrayDeque) a8g2.o, this);
                return h;
            } catch (Throwable th) {
                a8g a8g3 = this.A0.a;
                a8g3.i((ArrayDeque) a8g3.o, this);
                throw th;
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    public final void g(boolean z) {
        od odVar;
        synchronized (this) {
            if (!this.w0) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (odVar = this.y0) != null) {
            ((u45) odVar.Y).cancel();
            ((b8c) odVar.c).i(odVar, true, true, (IOException) null);
        }
        this.t0 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.yic h() {
        /*
            r12 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            u2a r0 = r12.A0
            java.util.List r0 = r0.c
            defpackage.d63.V(r0, r2)
            ur0 r0 = new ur0
            u2a r1 = r12.A0
            r3 = 2
            r0.<init>(r3, r1)
            r2.add(r0)
            ur0 r0 = new ur0
            u2a r1 = r12.A0
            kj6 r1 = r1.u0
            r3 = 0
            r0.<init>(r3, r1)
            r2.add(r0)
            tw0 r0 = new tw0
            u2a r1 = r12.A0
            r1.getClass()
            r1 = 0
            r0.<init>(r1)
            r2.add(r0)
            tw0 r0 = defpackage.tw0.b
            r2.add(r0)
            boolean r0 = r12.C0
            if (r0 != 0) goto L_0x0042
            u2a r0 = r12.A0
            java.util.List r0 = r0.o
            defpackage.d63.V(r0, r2)
        L_0x0042:
            fl1 r0 = new fl1
            boolean r1 = r12.C0
            r0.<init>(r1)
            r2.add(r0)
            h8c r9 = new h8c
            mhc r10 = r12.B0
            u2a r0 = r12.A0
            int r6 = r0.I0
            int r7 = r0.J0
            int r8 = r0.K0
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r12
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            yic r2 = r9.d(r10)     // Catch:{ IOException -> 0x007b, all -> 0x0079 }
            boolean r3 = r12.x0     // Catch:{ IOException -> 0x007b, all -> 0x0079 }
            if (r3 != 0) goto L_0x006e
            r12.j(r0)
            return r2
        L_0x006e:
            defpackage.naf.c(r2)     // Catch:{ IOException -> 0x007b, all -> 0x0079 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x007b, all -> 0x0079 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x007b, all -> 0x0079 }
            throw r2     // Catch:{ IOException -> 0x007b, all -> 0x0079 }
        L_0x0079:
            r2 = move-exception
            goto L_0x0091
        L_0x007b:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r12.j(r1)     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x0090
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x008b }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r3)     // Catch:{ all -> 0x008b }
            throw r1     // Catch:{ all -> 0x008b }
        L_0x008b:
            r1 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
            goto L_0x0091
        L_0x0090:
            throw r1     // Catch:{ all -> 0x008b }
        L_0x0091:
            if (r1 != 0) goto L_0x0096
            r12.j(r0)
        L_0x0096:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8c.h():yic");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x001e A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0022 A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002c A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x002e A[Catch:{ all -> 0x0014 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.IOException i(defpackage.od r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            od r0 = r2.y0
            boolean r3 = r3.equals(r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x000b
            return r6
        L_0x000b:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x0016
            boolean r1 = r2.u0     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x001c
            goto L_0x0016
        L_0x0014:
            r3 = move-exception
            goto L_0x003d
        L_0x0016:
            if (r5 == 0) goto L_0x003f
            boolean r1 = r2.v0     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x003f
        L_0x001c:
            if (r4 == 0) goto L_0x0020
            r2.u0 = r3     // Catch:{ all -> 0x0014 }
        L_0x0020:
            if (r5 == 0) goto L_0x0024
            r2.v0 = r3     // Catch:{ all -> 0x0014 }
        L_0x0024:
            boolean r4 = r2.u0     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x002e
            boolean r5 = r2.v0     // Catch:{ all -> 0x0014 }
            if (r5 != 0) goto L_0x002e
            r5 = r0
            goto L_0x002f
        L_0x002e:
            r5 = r3
        L_0x002f:
            if (r4 != 0) goto L_0x003a
            boolean r4 = r2.v0     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x003a
            boolean r4 = r2.w0     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x003a
            r3 = r0
        L_0x003a:
            r4 = r3
            r3 = r5
            goto L_0x0040
        L_0x003d:
            monitor-exit(r2)
            throw r3
        L_0x003f:
            r4 = r3
        L_0x0040:
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0055
            r3 = 0
            r2.y0 = r3
            f8c r3 = r2.Z
            if (r3 == 0) goto L_0x0055
            monitor-enter(r3)
            int r5 = r3.l     // Catch:{ all -> 0x0052 }
            int r5 = r5 + r0
            r3.l = r5     // Catch:{ all -> 0x0052 }
            monitor-exit(r3)
            goto L_0x0055
        L_0x0052:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0052 }
            throw r2
        L_0x0055:
            if (r4 == 0) goto L_0x005c
            java.io.IOException r2 = r2.c(r6)
            return r2
        L_0x005c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8c.i(od, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException j(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.w0) {
                this.w0 = false;
                if (!this.u0 && !this.v0) {
                    z = true;
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket k() {
        f8c f8c = this.Z;
        byte[] bArr = naf.a;
        ArrayList arrayList = f8c.o;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (tpa.f((b8c) ((Reference) it.next()).get(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            arrayList.remove(i);
            this.Z = null;
            if (arrayList.isEmpty()) {
                f8c.p = System.nanoTime();
                g8c g8c = this.a;
                g8c.getClass();
                byte[] bArr2 = naf.a;
                boolean z = f8c.i;
                coe coe = (coe) g8c.c;
                if (z || g8c.b == 0) {
                    f8c.i = true;
                    ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) g8c.e;
                    concurrentLinkedQueue.remove(f8c);
                    if (concurrentLinkedQueue.isEmpty()) {
                        coe.a();
                    }
                    return f8c.c;
                }
                coe.c((ip6) g8c.d, 0);
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
