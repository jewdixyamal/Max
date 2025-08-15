package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: fqd  reason: default package */
public abstract class fqd implements cbe, l54 {
    public final o54[] X = new hbe[2];
    public final jbe[] Y;
    public int Z = 2;
    public final hka a;
    public final Object b = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque o = new ArrayDeque();
    public int s0;
    public o54 t0;
    public SubtitleDecoderException u0;
    public boolean v0;
    public boolean w0;

    public fqd() {
        boolean z;
        jbe[] jbeArr = new jbe[2];
        int i = 0;
        while (true) {
            z = true;
            if (i >= this.Z) {
                break;
            }
            this.X[i] = new o54(1);
            i++;
        }
        this.Y = jbeArr;
        this.s0 = 2;
        for (int i2 = 0; i2 < this.s0; i2++) {
            this.Y[i2] = new y02(this, 2);
        }
        hka hka = new hka(1, (Object) this);
        this.a = hka;
        hka.start();
        int i3 = this.Z;
        o54[] o54Arr = this.X;
        np8.f(i3 != o54Arr.length ? false : z);
        for (o54 x : o54Arr) {
            x.x(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
    }

    public abstract abe a(int i, byte[] bArr, boolean z);

    public final void b(long j) {
    }

    public final jbe c() {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.u0;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                } else if (this.o.isEmpty()) {
                    return null;
                } else {
                    jbe jbe = (jbe) this.o.removeFirst();
                    return jbe;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final SubtitleDecoderException d(o54 o54, jbe jbe, boolean z) {
        hbe hbe = (hbe) o54;
        try {
            ByteBuffer byteBuffer = hbe.o;
            byteBuffer.getClass();
            jbe.w(hbe.Y, a(byteBuffer.limit(), byteBuffer.array(), z), hbe.u0);
            jbe.b &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.Exception] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    public final boolean e() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r8.w0     // Catch:{ all -> 0x0020 }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0023
            java.util.ArrayDeque r1 = r8.c     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x0017
            int r1 = r8.s0     // Catch:{ all -> 0x0020 }
            if (r1 <= 0) goto L_0x0017
            r1 = r3
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            if (r1 != 0) goto L_0x0023
            java.lang.Object r1 = r8.b     // Catch:{ all -> 0x0020 }
            r1.wait()     // Catch:{ all -> 0x0020 }
            goto L_0x0003
        L_0x0020:
            r8 = move-exception
            goto L_0x00a6
        L_0x0023:
            boolean r1 = r8.w0     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0029
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x0029:
            java.util.ArrayDeque r1 = r8.c     // Catch:{ all -> 0x0020 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0020 }
            o54 r1 = (defpackage.o54) r1     // Catch:{ all -> 0x0020 }
            jbe[] r4 = r8.Y     // Catch:{ all -> 0x0020 }
            int r5 = r8.s0     // Catch:{ all -> 0x0020 }
            int r5 = r5 - r3
            r8.s0 = r5     // Catch:{ all -> 0x0020 }
            r4 = r4[r5]     // Catch:{ all -> 0x0020 }
            boolean r5 = r8.v0     // Catch:{ all -> 0x0020 }
            r8.v0 = r2     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            r0 = 4
            boolean r6 = r1.f(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L_0x004c
            r4.a(r0)
            goto L_0x0079
        L_0x004c:
            boolean r0 = r1.f(r7)
            if (r0 == 0) goto L_0x0055
            r4.a(r7)
        L_0x0055:
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = r8.d(r1, r4, r5)     // Catch:{ RuntimeException -> 0x0064, OutOfMemoryError -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L_0x0062:
            r0 = r5
            goto L_0x006d
        L_0x0064:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L_0x0062
        L_0x006d:
            if (r0 == 0) goto L_0x0079
            java.lang.Object r5 = r8.b
            monitor-enter(r5)
            r8.u0 = r0     // Catch:{ all -> 0x0076 }
            monitor-exit(r5)     // Catch:{ all -> 0x0076 }
            return r2
        L_0x0076:
            r8 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0076 }
            throw r8
        L_0x0079:
            java.lang.Object r2 = r8.b
            monitor-enter(r2)
            boolean r0 = r8.v0     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0086
            r4.v()     // Catch:{ all -> 0x0084 }
            goto L_0x0095
        L_0x0084:
            r8 = move-exception
            goto L_0x00a4
        L_0x0086:
            boolean r0 = r4.f(r7)     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0090
            r4.v()     // Catch:{ all -> 0x0084 }
            goto L_0x0095
        L_0x0090:
            java.util.ArrayDeque r0 = r8.o     // Catch:{ all -> 0x0084 }
            r0.addLast(r4)     // Catch:{ all -> 0x0084 }
        L_0x0095:
            r1.v()     // Catch:{ all -> 0x0084 }
            int r0 = r8.Z     // Catch:{ all -> 0x0084 }
            int r4 = r0 + 1
            r8.Z = r4     // Catch:{ all -> 0x0084 }
            o54[] r8 = r8.X     // Catch:{ all -> 0x0084 }
            r8[r0] = r1     // Catch:{ all -> 0x0084 }
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            return r3
        L_0x00a4:
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            throw r8
        L_0x00a6:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqd.e():boolean");
    }

    public final Object f() {
        o54 o54;
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.u0;
                if (subtitleDecoderException == null) {
                    np8.f(this.t0 == null);
                    int i = this.Z;
                    if (i == 0) {
                        o54 = null;
                    } else {
                        o54[] o54Arr = this.X;
                        int i2 = i - 1;
                        this.Z = i2;
                        o54 = o54Arr[i2];
                    }
                    this.t0 = o54;
                } else {
                    throw subtitleDecoderException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54;
    }

    public final void flush() {
        synchronized (this.b) {
            try {
                this.v0 = true;
                o54 o54 = this.t0;
                if (o54 != null) {
                    o54.v();
                    int i = this.Z;
                    this.Z = i + 1;
                    this.X[i] = o54;
                    this.t0 = null;
                }
                while (!this.c.isEmpty()) {
                    o54 o542 = (o54) this.c.removeFirst();
                    o542.v();
                    int i2 = this.Z;
                    this.Z = i2 + 1;
                    this.X[i2] = o542;
                }
                while (!this.o.isEmpty()) {
                    ((jbe) this.o.removeFirst()).v();
                }
            } finally {
            }
        }
    }

    public final void l(hbe hbe) {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.u0;
                if (subtitleDecoderException == null) {
                    np8.d(hbe == this.t0);
                    this.c.addLast(hbe);
                    if (!this.c.isEmpty() && this.s0 > 0) {
                        this.b.notify();
                    }
                    this.t0 = null;
                } else {
                    throw subtitleDecoderException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void release() {
        synchronized (this.b) {
            this.w0 = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
