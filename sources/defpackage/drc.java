package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import java.io.EOFException;

/* renamed from: drc  reason: default package */
public class drc implements xze {
    public oy5 A;
    public oy5 B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final xqc a;
    public final mx1 b = new Object();
    public final jn c = new jn(new p4c(17));
    public final sr4 d;
    public final kr4 e;
    public brc f;
    public oy5 g;
    public er4 h;
    public int i = 1000;
    public int[] j = new int[1000];
    public long[] k = new long[1000];
    public int[] l = new int[1000];
    public int[] m = new int[1000];
    public long[] n = new long[1000];
    public vze[] o = new vze[1000];
    public int p;
    public int q;
    public int r;
    public int s;
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean w;
    public boolean x = true;
    public boolean y = true;
    public boolean z;

    /* JADX WARNING: type inference failed for: r1v1, types: [mx1, java.lang.Object] */
    public drc(n64 n64, sr4 sr4, kr4 kr4) {
        this.d = sr4;
        this.e = kr4;
        this.a = new xqc(n64);
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized boolean A(long r10, boolean r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            monitor-enter(r9)     // Catch:{ all -> 0x0045 }
            r0 = 0
            r9.s = r0     // Catch:{ all -> 0x0049 }
            xqc r1 = r9.a     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = r1.f     // Catch:{ all -> 0x0049 }
            qy r2 = (defpackage.qy) r2     // Catch:{ all -> 0x0049 }
            r1.g = r2     // Catch:{ all -> 0x0049 }
            monitor-exit(r9)     // Catch:{ all -> 0x0045 }
            int r6 = r9.p(r0)     // Catch:{ all -> 0x0045 }
            boolean r1 = r9.s()     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0047
            long[] r1 = r9.n     // Catch:{ all -> 0x0045 }
            r1 = r1[r6]     // Catch:{ all -> 0x0045 }
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0047
            long r1 = r9.v     // Catch:{ all -> 0x0045 }
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0029
            if (r12 != 0) goto L_0x0029
            goto L_0x0047
        L_0x0029:
            int r12 = r9.p     // Catch:{ all -> 0x0045 }
            int r1 = r9.s     // Catch:{ all -> 0x0045 }
            int r7 = r12 - r1
            r8 = 1
            r3 = r9
            r4 = r10
            int r12 = r3.l(r4, r6, r7, r8)     // Catch:{ all -> 0x0045 }
            r1 = -1
            if (r12 != r1) goto L_0x003b
            monitor-exit(r9)
            return r0
        L_0x003b:
            r9.t = r10     // Catch:{ all -> 0x0045 }
            int r10 = r9.s     // Catch:{ all -> 0x0045 }
            int r10 = r10 + r12
            r9.s = r10     // Catch:{ all -> 0x0045 }
            monitor-exit(r9)
            r9 = 1
            return r9
        L_0x0045:
            r10 = move-exception
            goto L_0x004c
        L_0x0047:
            monitor-exit(r9)
            return r0
        L_0x0049:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0049 }
            throw r10     // Catch:{ all -> 0x0045 }
        L_0x004c:
            monitor-exit(r9)     // Catch:{ all -> 0x0045 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drc.A(long, boolean):boolean");
    }

    public final synchronized void B(int i2) {
        boolean z2;
        if (i2 >= 0) {
            try {
                if (this.s + i2 <= this.p) {
                    z2 = true;
                    np8.d(z2);
                    this.s += i2;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        z2 = false;
        np8.d(z2);
        this.s += i2;
    }

    public final int a(l24 l24, int i2, boolean z2) {
        xqc xqc = this.a;
        int d2 = xqc.d(i2);
        qy qyVar = (qy) xqc.h;
        vc vcVar = (vc) qyVar.o;
        int read = l24.read(vcVar.a, ((int) (xqc.c - qyVar.b)) + vcVar.b, d2);
        if (read != -1) {
            long j2 = xqc.c + ((long) read);
            xqc.c = j2;
            qy qyVar2 = (qy) xqc.h;
            if (j2 != qyVar2.c) {
                return read;
            }
            xqc.h = (qy) qyVar2.X;
            return read;
        } else if (z2) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void b(long r17, int r19, int r20, int r21, defpackage.vze r22) {
        /*
            r16 = this;
            r1 = r16
            r0 = r20
            boolean r2 = r1.z
            if (r2 == 0) goto L_0x0010
            oy5 r2 = r1.A
            defpackage.np8.g(r2)
            r1.d(r2)
        L_0x0010:
            r2 = r19 & 1
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0018
            r5 = r4
            goto L_0x0019
        L_0x0018:
            r5 = r3
        L_0x0019:
            boolean r6 = r1.x
            if (r6 == 0) goto L_0x0022
            if (r5 != 0) goto L_0x0020
            return
        L_0x0020:
            r1.x = r3
        L_0x0022:
            long r6 = r1.F
            long r6 = r17 + r6
            boolean r8 = r1.D
            if (r8 == 0) goto L_0x004d
            long r8 = r1.t
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0031
            return
        L_0x0031:
            if (r2 != 0) goto L_0x004d
            boolean r2 = r1.E
            if (r2 != 0) goto L_0x004a
            oy5 r2 = r1.B
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r2 = r2.length()
            int r2 = r2 + 50
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            r1.E = r4
        L_0x004a:
            r2 = r19 | 1
            goto L_0x004f
        L_0x004d:
            r2 = r19
        L_0x004f:
            boolean r8 = r1.G
            r9 = -1
            if (r8 == 0) goto L_0x00af
            if (r5 == 0) goto L_0x00ae
            monitor-enter(r16)
            int r5 = r1.p     // Catch:{ all -> 0x0066 }
            if (r5 != 0) goto L_0x0068
            long r10 = r1.u     // Catch:{ all -> 0x0066 }
            int r5 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0063
            r5 = r4
            goto L_0x0064
        L_0x0063:
            r5 = r3
        L_0x0064:
            monitor-exit(r16)
            goto L_0x00a3
        L_0x0066:
            r0 = move-exception
            goto L_0x00ac
        L_0x0068:
            monitor-enter(r16)     // Catch:{ all -> 0x0066 }
            long r10 = r1.u     // Catch:{ all -> 0x00a9 }
            int r5 = r1.s     // Catch:{ all -> 0x00a9 }
            long r12 = r1.n(r5)     // Catch:{ all -> 0x00a9 }
            long r10 = java.lang.Math.max(r10, r12)     // Catch:{ all -> 0x00a9 }
            monitor-exit(r16)     // Catch:{ all -> 0x0066 }
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x007d
            monitor-exit(r16)
            r5 = r3
            goto L_0x00a3
        L_0x007d:
            int r5 = r1.p     // Catch:{ all -> 0x0066 }
            int r8 = r5 + -1
            int r8 = r1.p(r8)     // Catch:{ all -> 0x0066 }
        L_0x0085:
            int r10 = r1.s     // Catch:{ all -> 0x0066 }
            if (r5 <= r10) goto L_0x009b
            long[] r10 = r1.n     // Catch:{ all -> 0x0066 }
            r10 = r10[r8]     // Catch:{ all -> 0x0066 }
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x009b
            int r5 = r5 + -1
            int r8 = r8 + -1
            if (r8 != r9) goto L_0x0085
            int r8 = r1.i     // Catch:{ all -> 0x0066 }
            int r8 = r8 - r4
            goto L_0x0085
        L_0x009b:
            int r8 = r1.q     // Catch:{ all -> 0x0066 }
            int r8 = r8 + r5
            r1.j(r8)     // Catch:{ all -> 0x0066 }
            monitor-exit(r16)
            r5 = r4
        L_0x00a3:
            if (r5 != 0) goto L_0x00a6
            goto L_0x00ae
        L_0x00a6:
            r1.G = r3
            goto L_0x00af
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x00ac:
            monitor-exit(r16)     // Catch:{ all -> 0x0066 }
            throw r0
        L_0x00ae:
            return
        L_0x00af:
            xqc r5 = r1.a
            long r10 = r5.c
            long r12 = (long) r0
            long r10 = r10 - r12
            r5 = r21
            long r12 = (long) r5
            long r10 = r10 - r12
            monitor-enter(r16)
            int r5 = r1.p     // Catch:{ all -> 0x00d8 }
            if (r5 <= 0) goto L_0x00db
            int r5 = r5 - r4
            int r5 = r1.p(r5)     // Catch:{ all -> 0x00d8 }
            long[] r8 = r1.k     // Catch:{ all -> 0x00d8 }
            r12 = r8[r5]     // Catch:{ all -> 0x00d8 }
            int[] r8 = r1.l     // Catch:{ all -> 0x00d8 }
            r5 = r8[r5]     // Catch:{ all -> 0x00d8 }
            long r14 = (long) r5     // Catch:{ all -> 0x00d8 }
            long r12 = r12 + r14
            int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x00d3
            r5 = r4
            goto L_0x00d4
        L_0x00d3:
            r5 = r3
        L_0x00d4:
            defpackage.np8.d(r5)     // Catch:{ all -> 0x00d8 }
            goto L_0x00db
        L_0x00d8:
            r0 = move-exception
            goto L_0x020f
        L_0x00db:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r5 & r2
            if (r5 == 0) goto L_0x00e2
            r5 = r4
            goto L_0x00e3
        L_0x00e2:
            r5 = r3
        L_0x00e3:
            r1.w = r5     // Catch:{ all -> 0x00d8 }
            long r12 = r1.v     // Catch:{ all -> 0x00d8 }
            long r12 = java.lang.Math.max(r12, r6)     // Catch:{ all -> 0x00d8 }
            r1.v = r12     // Catch:{ all -> 0x00d8 }
            int r5 = r1.p     // Catch:{ all -> 0x00d8 }
            int r5 = r1.p(r5)     // Catch:{ all -> 0x00d8 }
            long[] r8 = r1.n     // Catch:{ all -> 0x00d8 }
            r8[r5] = r6     // Catch:{ all -> 0x00d8 }
            long[] r6 = r1.k     // Catch:{ all -> 0x00d8 }
            r6[r5] = r10     // Catch:{ all -> 0x00d8 }
            int[] r6 = r1.l     // Catch:{ all -> 0x00d8 }
            r6[r5] = r0     // Catch:{ all -> 0x00d8 }
            int[] r0 = r1.m     // Catch:{ all -> 0x00d8 }
            r0[r5] = r2     // Catch:{ all -> 0x00d8 }
            vze[] r0 = r1.o     // Catch:{ all -> 0x00d8 }
            r0[r5] = r22     // Catch:{ all -> 0x00d8 }
            int[] r0 = r1.j     // Catch:{ all -> 0x00d8 }
            int r2 = r1.C     // Catch:{ all -> 0x00d8 }
            r0[r5] = r2     // Catch:{ all -> 0x00d8 }
            jn r0 = r1.c     // Catch:{ all -> 0x00d8 }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x00d8 }
            android.util.SparseArray r0 = (android.util.SparseArray) r0     // Catch:{ all -> 0x00d8 }
            int r0 = r0.size()     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x011b
            r0 = r4
            goto L_0x011c
        L_0x011b:
            r0 = r3
        L_0x011c:
            if (r0 != 0) goto L_0x0139
            jn r0 = r1.c     // Catch:{ all -> 0x00d8 }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x00d8 }
            android.util.SparseArray r0 = (android.util.SparseArray) r0     // Catch:{ all -> 0x00d8 }
            int r2 = r0.size()     // Catch:{ all -> 0x00d8 }
            int r2 = r2 - r4
            java.lang.Object r0 = r0.valueAt(r2)     // Catch:{ all -> 0x00d8 }
            zqc r0 = (defpackage.zqc) r0     // Catch:{ all -> 0x00d8 }
            oy5 r0 = r0.a     // Catch:{ all -> 0x00d8 }
            oy5 r2 = r1.B     // Catch:{ all -> 0x00d8 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x019b
        L_0x0139:
            sr4 r0 = r1.d     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x0146
            kr4 r2 = r1.e     // Catch:{ all -> 0x00d8 }
            oy5 r5 = r1.B     // Catch:{ all -> 0x00d8 }
            qr4 r0 = r0.d(r2, r5)     // Catch:{ all -> 0x00d8 }
            goto L_0x0148
        L_0x0146:
            ta4 r0 = defpackage.qr4.p     // Catch:{ all -> 0x00d8 }
        L_0x0148:
            jn r2 = r1.c     // Catch:{ all -> 0x00d8 }
            int r5 = r1.q     // Catch:{ all -> 0x00d8 }
            int r6 = r1.p     // Catch:{ all -> 0x00d8 }
            int r5 = r5 + r6
            zqc r6 = new zqc     // Catch:{ all -> 0x00d8 }
            oy5 r7 = r1.B     // Catch:{ all -> 0x00d8 }
            r7.getClass()     // Catch:{ all -> 0x00d8 }
            r6.<init>(r7, r0)     // Catch:{ all -> 0x00d8 }
            int r0 = r2.b     // Catch:{ all -> 0x00d8 }
            java.lang.Object r7 = r2.c     // Catch:{ all -> 0x00d8 }
            android.util.SparseArray r7 = (android.util.SparseArray) r7     // Catch:{ all -> 0x00d8 }
            if (r0 != r9) goto L_0x016f
            int r0 = r7.size()     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x0169
            r0 = r4
            goto L_0x016a
        L_0x0169:
            r0 = r3
        L_0x016a:
            defpackage.np8.f(r0)     // Catch:{ all -> 0x00d8 }
            r2.b = r3     // Catch:{ all -> 0x00d8 }
        L_0x016f:
            int r0 = r7.size()     // Catch:{ all -> 0x00d8 }
            if (r0 <= 0) goto L_0x0198
            int r0 = r7.size()     // Catch:{ all -> 0x00d8 }
            int r0 = r0 - r4
            int r0 = r7.keyAt(r0)     // Catch:{ all -> 0x00d8 }
            if (r5 < r0) goto L_0x0182
            r8 = r4
            goto L_0x0183
        L_0x0182:
            r8 = r3
        L_0x0183:
            defpackage.np8.d(r8)     // Catch:{ all -> 0x00d8 }
            if (r0 != r5) goto L_0x0198
            int r0 = r7.size()     // Catch:{ all -> 0x00d8 }
            int r0 = r0 - r4
            java.lang.Object r0 = r7.valueAt(r0)     // Catch:{ all -> 0x00d8 }
            java.lang.Object r2 = r2.o     // Catch:{ all -> 0x00d8 }
            p4c r2 = (defpackage.p4c) r2     // Catch:{ all -> 0x00d8 }
            r2.accept(r0)     // Catch:{ all -> 0x00d8 }
        L_0x0198:
            r7.append(r5, r6)     // Catch:{ all -> 0x00d8 }
        L_0x019b:
            int r0 = r1.p     // Catch:{ all -> 0x00d8 }
            int r0 = r0 + r4
            r1.p = r0     // Catch:{ all -> 0x00d8 }
            int r2 = r1.i     // Catch:{ all -> 0x00d8 }
            if (r0 != r2) goto L_0x020d
            int r0 = r2 + 1000
            int[] r4 = new int[r0]     // Catch:{ all -> 0x00d8 }
            long[] r5 = new long[r0]     // Catch:{ all -> 0x00d8 }
            long[] r6 = new long[r0]     // Catch:{ all -> 0x00d8 }
            int[] r7 = new int[r0]     // Catch:{ all -> 0x00d8 }
            int[] r8 = new int[r0]     // Catch:{ all -> 0x00d8 }
            vze[] r9 = new defpackage.vze[r0]     // Catch:{ all -> 0x00d8 }
            int r10 = r1.r     // Catch:{ all -> 0x00d8 }
            int r2 = r2 - r10
            long[] r11 = r1.k     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r11, r10, r5, r3, r2)     // Catch:{ all -> 0x00d8 }
            long[] r10 = r1.n     // Catch:{ all -> 0x00d8 }
            int r11 = r1.r     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r10, r11, r6, r3, r2)     // Catch:{ all -> 0x00d8 }
            int[] r10 = r1.m     // Catch:{ all -> 0x00d8 }
            int r11 = r1.r     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r10, r11, r7, r3, r2)     // Catch:{ all -> 0x00d8 }
            int[] r10 = r1.l     // Catch:{ all -> 0x00d8 }
            int r11 = r1.r     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r10, r11, r8, r3, r2)     // Catch:{ all -> 0x00d8 }
            vze[] r10 = r1.o     // Catch:{ all -> 0x00d8 }
            int r11 = r1.r     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r10, r11, r9, r3, r2)     // Catch:{ all -> 0x00d8 }
            int[] r10 = r1.j     // Catch:{ all -> 0x00d8 }
            int r11 = r1.r     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r10, r11, r4, r3, r2)     // Catch:{ all -> 0x00d8 }
            int r10 = r1.r     // Catch:{ all -> 0x00d8 }
            long[] r11 = r1.k     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r11, r3, r5, r2, r10)     // Catch:{ all -> 0x00d8 }
            long[] r11 = r1.n     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r11, r3, r6, r2, r10)     // Catch:{ all -> 0x00d8 }
            int[] r11 = r1.m     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r11, r3, r7, r2, r10)     // Catch:{ all -> 0x00d8 }
            int[] r11 = r1.l     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r11, r3, r8, r2, r10)     // Catch:{ all -> 0x00d8 }
            vze[] r11 = r1.o     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r11, r3, r9, r2, r10)     // Catch:{ all -> 0x00d8 }
            int[] r11 = r1.j     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r11, r3, r4, r2, r10)     // Catch:{ all -> 0x00d8 }
            r1.k = r5     // Catch:{ all -> 0x00d8 }
            r1.n = r6     // Catch:{ all -> 0x00d8 }
            r1.m = r7     // Catch:{ all -> 0x00d8 }
            r1.l = r8     // Catch:{ all -> 0x00d8 }
            r1.o = r9     // Catch:{ all -> 0x00d8 }
            r1.j = r4     // Catch:{ all -> 0x00d8 }
            r1.r = r3     // Catch:{ all -> 0x00d8 }
            r1.i = r0     // Catch:{ all -> 0x00d8 }
        L_0x020d:
            monitor-exit(r16)
            return
        L_0x020f:
            monitor-exit(r16)     // Catch:{ all -> 0x00d8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drc.b(long, int, int, int, vze):void");
    }

    public final void c(int i2, yaf yaf) {
        while (true) {
            xqc xqc = this.a;
            if (i2 > 0) {
                int d2 = xqc.d(i2);
                qy qyVar = (qy) xqc.h;
                vc vcVar = (vc) qyVar.o;
                yaf.g(((int) (xqc.c - qyVar.b)) + vcVar.b, vcVar.a, d2);
                i2 -= d2;
                long j2 = xqc.c + ((long) d2);
                xqc.c = j2;
                qy qyVar2 = (qy) xqc.h;
                if (j2 == qyVar2.c) {
                    xqc.h = (qy) qyVar2.X;
                }
            } else {
                xqc.getClass();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010f, code lost:
        if (r6 != 16) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0111, code lost:
        r6 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.oy5 r6) {
        /*
            r5 = this;
            r0 = 1
            oy5 r1 = r5.m(r6)
            r2 = 0
            r5.z = r2
            r5.A = r6
            monitor-enter(r5)
            r5.y = r2     // Catch:{ all -> 0x0059 }
            oy5 r6 = r5.B     // Catch:{ all -> 0x0059 }
            boolean r6 = defpackage.maf.a(r1, r6)     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0019
            monitor-exit(r5)
            r0 = r2
            goto L_0x0117
        L_0x0019:
            jn r6 = r5.c     // Catch:{ all -> 0x0059 }
            java.lang.Object r6 = r6.c     // Catch:{ all -> 0x0059 }
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch:{ all -> 0x0059 }
            int r6 = r6.size()     // Catch:{ all -> 0x0059 }
            if (r6 != 0) goto L_0x0027
            r6 = r0
            goto L_0x0028
        L_0x0027:
            r6 = r2
        L_0x0028:
            if (r6 != 0) goto L_0x005c
            jn r6 = r5.c     // Catch:{ all -> 0x0059 }
            java.lang.Object r6 = r6.c     // Catch:{ all -> 0x0059 }
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch:{ all -> 0x0059 }
            int r3 = r6.size()     // Catch:{ all -> 0x0059 }
            int r3 = r3 - r0
            java.lang.Object r6 = r6.valueAt(r3)     // Catch:{ all -> 0x0059 }
            zqc r6 = (defpackage.zqc) r6     // Catch:{ all -> 0x0059 }
            oy5 r6 = r6.a     // Catch:{ all -> 0x0059 }
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x005c
            jn r6 = r5.c     // Catch:{ all -> 0x0059 }
            java.lang.Object r6 = r6.c     // Catch:{ all -> 0x0059 }
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch:{ all -> 0x0059 }
            int r1 = r6.size()     // Catch:{ all -> 0x0059 }
            int r1 = r1 - r0
            java.lang.Object r6 = r6.valueAt(r1)     // Catch:{ all -> 0x0059 }
            zqc r6 = (defpackage.zqc) r6     // Catch:{ all -> 0x0059 }
            oy5 r6 = r6.a     // Catch:{ all -> 0x0059 }
            r5.B = r6     // Catch:{ all -> 0x0059 }
            goto L_0x005e
        L_0x0059:
            r6 = move-exception
            goto L_0x0121
        L_0x005c:
            r5.B = r1     // Catch:{ all -> 0x0059 }
        L_0x005e:
            oy5 r6 = r5.B     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = r6.w0     // Catch:{ all -> 0x0059 }
            java.lang.String r6 = r6.t0     // Catch:{ all -> 0x0059 }
            java.util.ArrayList r3 = defpackage.ha9.a     // Catch:{ all -> 0x0059 }
            if (r1 != 0) goto L_0x006b
        L_0x0068:
            r6 = r2
            goto L_0x0112
        L_0x006b:
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -2123537834: goto L_0x00ec;
                case -432837260: goto L_0x00e1;
                case -432837259: goto L_0x00d6;
                case -53558318: goto L_0x00cb;
                case 187078296: goto L_0x00c0;
                case 187094639: goto L_0x00b5;
                case 1504578661: goto L_0x00aa;
                case 1504619009: goto L_0x009f;
                case 1504831518: goto L_0x0091;
                case 1903231877: goto L_0x0083;
                case 1903589369: goto L_0x0075;
                default: goto L_0x0073;
            }
        L_0x0073:
            goto L_0x00f6
        L_0x0075:
            java.lang.String r4 = "audio/g711-mlaw"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x007f
            goto L_0x00f6
        L_0x007f:
            r3 = 10
            goto L_0x00f6
        L_0x0083:
            java.lang.String r4 = "audio/g711-alaw"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x008d
            goto L_0x00f6
        L_0x008d:
            r3 = 9
            goto L_0x00f6
        L_0x0091:
            java.lang.String r4 = "audio/mpeg"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x009b
            goto L_0x00f6
        L_0x009b:
            r3 = 8
            goto L_0x00f6
        L_0x009f:
            java.lang.String r4 = "audio/flac"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00a8
            goto L_0x00f6
        L_0x00a8:
            r3 = 7
            goto L_0x00f6
        L_0x00aa:
            java.lang.String r4 = "audio/eac3"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00b3
            goto L_0x00f6
        L_0x00b3:
            r3 = 6
            goto L_0x00f6
        L_0x00b5:
            java.lang.String r4 = "audio/raw"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00be
            goto L_0x00f6
        L_0x00be:
            r3 = 5
            goto L_0x00f6
        L_0x00c0:
            java.lang.String r4 = "audio/ac3"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00c9
            goto L_0x00f6
        L_0x00c9:
            r3 = 4
            goto L_0x00f6
        L_0x00cb:
            java.lang.String r4 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00d4
            goto L_0x00f6
        L_0x00d4:
            r3 = 3
            goto L_0x00f6
        L_0x00d6:
            java.lang.String r4 = "audio/mpeg-L2"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00df
            goto L_0x00f6
        L_0x00df:
            r3 = 2
            goto L_0x00f6
        L_0x00e1:
            java.lang.String r4 = "audio/mpeg-L1"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00ea
            goto L_0x00f6
        L_0x00ea:
            r3 = r0
            goto L_0x00f6
        L_0x00ec:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r3 = r2
        L_0x00f6:
            switch(r3) {
                case 0: goto L_0x0111;
                case 1: goto L_0x0111;
                case 2: goto L_0x0111;
                case 3: goto L_0x00fb;
                case 4: goto L_0x0111;
                case 5: goto L_0x0111;
                case 6: goto L_0x0111;
                case 7: goto L_0x0111;
                case 8: goto L_0x0111;
                case 9: goto L_0x0111;
                case 10: goto L_0x0111;
                default: goto L_0x00f9;
            }
        L_0x00f9:
            goto L_0x0068
        L_0x00fb:
            if (r6 != 0) goto L_0x00ff
            goto L_0x0068
        L_0x00ff:
            jt r6 = defpackage.ha9.e(r6)     // Catch:{ all -> 0x0059 }
            if (r6 != 0) goto L_0x0107
            goto L_0x0068
        L_0x0107:
            int r6 = r6.b()     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0068
            r1 = 16
            if (r6 == r1) goto L_0x0068
        L_0x0111:
            r6 = r0
        L_0x0112:
            r5.D = r6     // Catch:{ all -> 0x0059 }
            r5.E = r2     // Catch:{ all -> 0x0059 }
            monitor-exit(r5)
        L_0x0117:
            brc r5 = r5.f
            if (r5 == 0) goto L_0x0120
            if (r0 == 0) goto L_0x0120
            r5.c()
        L_0x0120:
            return
        L_0x0121:
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drc.d(oy5):void");
    }

    public final long g(int i2) {
        this.u = Math.max(this.u, n(i2));
        this.p -= i2;
        int i3 = this.q + i2;
        this.q = i3;
        int i4 = this.r + i2;
        this.r = i4;
        int i5 = this.i;
        if (i4 >= i5) {
            this.r = i4 - i5;
        }
        int i6 = this.s - i2;
        this.s = i6;
        int i7 = 0;
        if (i6 < 0) {
            this.s = 0;
        }
        while (true) {
            jn jnVar = this.c;
            SparseArray sparseArray = (SparseArray) jnVar.c;
            if (i7 >= sparseArray.size() - 1) {
                break;
            }
            int i8 = i7 + 1;
            if (i3 < sparseArray.keyAt(i8)) {
                break;
            }
            ((p4c) jnVar.o).accept(sparseArray.valueAt(i7));
            sparseArray.removeAt(i7);
            int i9 = jnVar.b;
            if (i9 > 0) {
                jnVar.b = i9 - 1;
            }
            i7 = i8;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i10 = this.r;
        if (i10 == 0) {
            i10 = this.i;
        }
        int i11 = i10 - 1;
        return this.k[i11] + ((long) this.l[i11]);
    }

    public final void h(long j2, boolean z2, boolean z3) {
        long j3;
        int i2;
        xqc xqc = this.a;
        synchronized (this) {
            try {
                int i3 = this.p;
                j3 = -1;
                if (i3 != 0) {
                    long[] jArr = this.n;
                    int i4 = this.r;
                    if (j2 >= jArr[i4]) {
                        if (z3 && (i2 = this.s) != i3) {
                            i3 = i2 + 1;
                        }
                        int l2 = l(j2, i4, i3, z2);
                        if (l2 != -1) {
                            j3 = g(l2);
                        }
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        xqc.c(j3);
    }

    public final void i() {
        long g2;
        xqc xqc = this.a;
        synchronized (this) {
            int i2 = this.p;
            g2 = i2 == 0 ? -1 : g(i2);
        }
        xqc.c(g2);
    }

    public final long j(int i2) {
        int i3 = this.q;
        int i4 = this.p;
        int i5 = (i3 + i4) - i2;
        boolean z2 = false;
        np8.d(i5 >= 0 && i5 <= i4 - this.s);
        int i6 = this.p - i5;
        this.p = i6;
        this.v = Math.max(this.u, n(i6));
        if (i5 == 0 && this.w) {
            z2 = true;
        }
        this.w = z2;
        jn jnVar = this.c;
        SparseArray sparseArray = (SparseArray) jnVar.c;
        int size = sparseArray.size() - 1;
        while (size >= 0 && i2 < sparseArray.keyAt(size)) {
            ((p4c) jnVar.o).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
            size--;
        }
        jnVar.b = sparseArray.size() > 0 ? Math.min(jnVar.b, sparseArray.size() - 1) : -1;
        int i7 = this.p;
        if (i7 == 0) {
            return 0;
        }
        int p2 = p(i7 - 1);
        return this.k[p2] + ((long) this.l[p2]);
    }

    public final void k(int i2) {
        long j2 = j(i2);
        xqc xqc = this.a;
        np8.d(j2 <= xqc.c);
        xqc.c = j2;
        int i3 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        int i4 = xqc.b;
        if (i3 != 0) {
            qy qyVar = (qy) xqc.f;
            if (j2 != qyVar.b) {
                while (xqc.c > qyVar.c) {
                    qyVar = (qy) qyVar.X;
                }
                qy qyVar2 = (qy) qyVar.X;
                qyVar2.getClass();
                xqc.a(qyVar2);
                qy qyVar3 = new qy(i4, 4, qyVar.c);
                qyVar.X = qyVar3;
                if (xqc.c == qyVar.c) {
                    qyVar = qyVar3;
                }
                xqc.h = qyVar;
                if (((qy) xqc.g) == qyVar2) {
                    xqc.g = qyVar3;
                    return;
                }
                return;
            }
        }
        xqc.a((qy) xqc.f);
        qy qyVar4 = new qy(i4, 4, xqc.c);
        xqc.f = qyVar4;
        xqc.g = qyVar4;
        xqc.h = qyVar4;
    }

    public final int l(long j2, int i2, int i3, boolean z2) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long j3 = this.n[i2];
            if (j3 > j2) {
                return i4;
            }
            if (!z2 || (this.m[i2] & 1) != 0) {
                if (j3 == j2) {
                    return i5;
                }
                i4 = i5;
            }
            i2++;
            if (i2 == this.i) {
                i2 = 0;
            }
        }
        return i4;
    }

    public oy5 m(oy5 oy5) {
        if (this.F == 0 || oy5.A0 == Long.MAX_VALUE) {
            return oy5;
        }
        my5 a2 = oy5.a();
        a2.o = oy5.A0 + this.F;
        return a2.a();
    }

    public final long n(int i2) {
        long j2 = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int p2 = p(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = Math.max(j2, this.n[p2]);
            if ((this.m[p2] & 1) != 0) {
                break;
            }
            p2--;
            if (p2 == -1) {
                p2 = this.i - 1;
            }
        }
        return j2;
    }

    public final int o() {
        return this.q + this.s;
    }

    public final int p(int i2) {
        int i3 = this.r + i2;
        int i4 = this.i;
        return i3 < i4 ? i3 : i3 - i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int q(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.s     // Catch:{ all -> 0x0026 }
            int r4 = r8.p(r0)     // Catch:{ all -> 0x0026 }
            boolean r0 = r8.s()     // Catch:{ all -> 0x0026 }
            r7 = 0
            if (r0 == 0) goto L_0x003c
            long[] r0 = r8.n     // Catch:{ all -> 0x0026 }
            r0 = r0[r4]     // Catch:{ all -> 0x0026 }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003c
        L_0x0017:
            long r0 = r8.v     // Catch:{ all -> 0x0026 }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            if (r11 == 0) goto L_0x0028
            int r9 = r8.p     // Catch:{ all -> 0x0026 }
            int r10 = r8.s     // Catch:{ all -> 0x0026 }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0026:
            r9 = move-exception
            goto L_0x003e
        L_0x0028:
            int r11 = r8.p     // Catch:{ all -> 0x0026 }
            int r0 = r8.s     // Catch:{ all -> 0x0026 }
            int r5 = r11 - r0
            r6 = 1
            r1 = r8
            r2 = r9
            int r9 = r1.l(r2, r4, r5, r6)     // Catch:{ all -> 0x0026 }
            r10 = -1
            if (r9 != r10) goto L_0x003a
            monitor-exit(r8)
            return r7
        L_0x003a:
            monitor-exit(r8)
            return r9
        L_0x003c:
            monitor-exit(r8)
            return r7
        L_0x003e:
            monitor-exit(r8)     // Catch:{ all -> 0x0026 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drc.q(long, boolean):int");
    }

    public final synchronized oy5 r() {
        return this.y ? null : this.B;
    }

    public final boolean s() {
        return this.s != this.p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean t(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.s()     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r0 != 0) goto L_0x001c
            if (r3 != 0) goto L_0x001a
            boolean r3 = r2.w     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x001a
            oy5 r3 = r2.B     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0019
            oy5 r0 = r2.g     // Catch:{ all -> 0x0017 }
            if (r3 == r0) goto L_0x0019
            goto L_0x001a
        L_0x0017:
            r3 = move-exception
            goto L_0x003c
        L_0x0019:
            r1 = 0
        L_0x001a:
            monitor-exit(r2)
            return r1
        L_0x001c:
            jn r3 = r2.c     // Catch:{ all -> 0x0017 }
            int r0 = r2.o()     // Catch:{ all -> 0x0017 }
            java.lang.Object r3 = r3.s(r0)     // Catch:{ all -> 0x0017 }
            zqc r3 = (defpackage.zqc) r3     // Catch:{ all -> 0x0017 }
            oy5 r3 = r3.a     // Catch:{ all -> 0x0017 }
            oy5 r0 = r2.g     // Catch:{ all -> 0x0017 }
            if (r3 == r0) goto L_0x0030
            monitor-exit(r2)
            return r1
        L_0x0030:
            int r3 = r2.s     // Catch:{ all -> 0x0017 }
            int r3 = r2.p(r3)     // Catch:{ all -> 0x0017 }
            boolean r3 = r2.u(r3)     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return r3
        L_0x003c:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drc.t(boolean):boolean");
    }

    public final boolean u(int i2) {
        er4 er4 = this.h;
        return er4 == null || er4.getState() == 4 || ((this.m[i2] & 1073741824) == 0 && this.h.b());
    }

    public final void v() {
        er4 er4 = this.h;
        if (er4 != null && er4.getState() == 1) {
            DrmSession$DrmSessionException d2 = this.h.d();
            d2.getClass();
            throw d2;
        }
    }

    public final void w(oy5 oy5, imc imc) {
        oy5 oy52;
        oy5 oy53 = this.g;
        boolean z2 = oy53 == null;
        cr4 cr4 = z2 ? null : oy53.z0;
        this.g = oy5;
        cr4 cr42 = oy5.z0;
        sr4 sr4 = this.d;
        if (sr4 != null) {
            int b2 = sr4.b(oy5);
            my5 a2 = oy5.a();
            a2.D = b2;
            oy52 = a2.a();
        } else {
            oy52 = oy5;
        }
        imc.c = oy52;
        imc.b = this.h;
        if (sr4 != null) {
            if (z2 || !maf.a(cr4, cr42)) {
                er4 er4 = this.h;
                kr4 kr4 = this.e;
                er4 a3 = sr4.a(kr4, oy5);
                this.h = a3;
                imc.b = a3;
                if (er4 != null) {
                    er4.f(kr4);
                }
            }
        }
    }

    public final synchronized int x() {
        try {
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return s() ? this.j[p(this.s)] : this.C;
    }

    public final int y(imc imc, o54 o54, int i2, boolean z2) {
        int i3;
        boolean z3 = false;
        boolean z4 = (i2 & 2) != 0;
        mx1 mx1 = this.b;
        synchronized (this) {
            try {
                o54.X = false;
                i3 = -3;
                if (!s()) {
                    if (!z2) {
                        if (!this.w) {
                            oy5 oy5 = this.B;
                            if (oy5 != null) {
                                if (!z4) {
                                    if (oy5 != this.g) {
                                    }
                                }
                                w(oy5, imc);
                            }
                        }
                    }
                    o54.b = 4;
                    i3 = -4;
                } else {
                    oy5 oy52 = ((zqc) this.c.s(o())).a;
                    if (!z4) {
                        if (oy52 == this.g) {
                            int p2 = p(this.s);
                            if (!u(p2)) {
                                o54.X = true;
                            } else {
                                o54.b = this.m[p2];
                                long j2 = this.n[p2];
                                o54.Y = j2;
                                if (j2 < this.t) {
                                    o54.a(Integer.MIN_VALUE);
                                }
                                mx1.a = this.l[p2];
                                mx1.b = this.k[p2];
                                mx1.c = this.o[p2];
                                i3 = -4;
                            }
                        }
                    }
                    w(oy52, imc);
                }
                i3 = -5;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (i3 == -4 && !o54.f(4)) {
            if ((i2 & 1) != 0) {
                z3 = true;
            }
            if ((i2 & 4) == 0) {
                if (z3) {
                    xqc xqc = this.a;
                    xqc.i((qy) xqc.g, o54, this.b, (yaf) xqc.e);
                } else {
                    xqc xqc2 = this.a;
                    xqc2.g = xqc.i((qy) xqc2.g, o54, this.b, (yaf) xqc2.e);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i3;
    }

    public final void z(boolean z2) {
        jn jnVar;
        SparseArray sparseArray;
        xqc xqc = this.a;
        xqc.a((qy) xqc.f);
        qy qyVar = (qy) xqc.f;
        int i2 = 0;
        np8.f(((vc) qyVar.o) == null);
        qyVar.b = 0;
        qyVar.c = (long) xqc.b;
        qy qyVar2 = (qy) xqc.f;
        xqc.g = qyVar2;
        xqc.h = qyVar2;
        xqc.c = 0;
        ((n64) xqc.d).d();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        while (true) {
            jnVar = this.c;
            sparseArray = (SparseArray) jnVar.c;
            if (i2 >= sparseArray.size()) {
                break;
            }
            ((p4c) jnVar.o).accept(sparseArray.valueAt(i2));
            i2++;
        }
        jnVar.b = -1;
        sparseArray.clear();
        if (z2) {
            this.A = null;
            this.B = null;
            this.y = true;
        }
    }
}
