package defpackage;

import android.util.SparseArray;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.io.EOFException;

/* renamed from: erc  reason: default package */
public class erc implements yze {
    public qy5 A;
    public qy5 B;
    public long C;
    public boolean D = true;
    public boolean E;
    public long F;
    public boolean G;
    public final xqc a;
    public final mx1 b = new Object();
    public final jn c = new jn(new p4c(18), (byte) 0);
    public final tr4 d;
    public final lr4 e;
    public crc f;
    public qy5 g;
    public fr4 h;
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public int[] l = new int[1000];
    public int[] m = new int[1000];
    public long[] n = new long[1000];
    public wze[] o = new wze[1000];
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
    public erc(n64 n64, tr4 tr4, lr4 lr4) {
        this.d = tr4;
        this.e = lr4;
        this.a = new xqc(n64, (byte) 0);
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
            monitor-enter(r9)     // Catch:{ all -> 0x004f }
            r0 = 0
            r9.s = r0     // Catch:{ all -> 0x006e }
            xqc r1 = r9.a     // Catch:{ all -> 0x006e }
            java.lang.Object r2 = r1.f     // Catch:{ all -> 0x006e }
            qy r2 = (defpackage.qy) r2     // Catch:{ all -> 0x006e }
            r1.g = r2     // Catch:{ all -> 0x006e }
            monitor-exit(r9)     // Catch:{ all -> 0x004f }
            int r6 = r9.o(r0)     // Catch:{ all -> 0x004f }
            boolean r1 = r9.r()     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x006c
            long[] r1 = r9.n     // Catch:{ all -> 0x004f }
            r1 = r1[r6]     // Catch:{ all -> 0x004f }
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x006c
            long r1 = r9.v     // Catch:{ all -> 0x004f }
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0029
            if (r12 != 0) goto L_0x0029
            goto L_0x006c
        L_0x0029:
            boolean r1 = r9.D     // Catch:{ all -> 0x004f }
            r2 = -1
            if (r1 == 0) goto L_0x0051
            int r1 = r9.p     // Catch:{ all -> 0x004f }
            int r3 = r9.s     // Catch:{ all -> 0x004f }
            int r1 = r1 - r3
            r3 = r0
        L_0x0034:
            if (r3 >= r1) goto L_0x0049
            long[] r4 = r9.n     // Catch:{ all -> 0x004f }
            r4 = r4[r6]     // Catch:{ all -> 0x004f }
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x003f
            goto L_0x005e
        L_0x003f:
            int r6 = r6 + 1
            int r4 = r9.i     // Catch:{ all -> 0x004f }
            if (r6 != r4) goto L_0x0046
            r6 = r0
        L_0x0046:
            int r3 = r3 + 1
            goto L_0x0034
        L_0x0049:
            if (r12 == 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            r3 = r1
            goto L_0x005e
        L_0x004f:
            r10 = move-exception
            goto L_0x0071
        L_0x0051:
            int r12 = r9.p     // Catch:{ all -> 0x004f }
            int r1 = r9.s     // Catch:{ all -> 0x004f }
            int r7 = r12 - r1
            r8 = 1
            r3 = r9
            r4 = r10
            int r3 = r3.k(r4, r6, r7, r8)     // Catch:{ all -> 0x004f }
        L_0x005e:
            if (r3 != r2) goto L_0x0062
            monitor-exit(r9)
            return r0
        L_0x0062:
            r9.t = r10     // Catch:{ all -> 0x004f }
            int r10 = r9.s     // Catch:{ all -> 0x004f }
            int r10 = r10 + r3
            r9.s = r10     // Catch:{ all -> 0x004f }
            monitor-exit(r9)
            r9 = 1
            return r9
        L_0x006c:
            monitor-exit(r9)
            return r0
        L_0x006e:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x006e }
            throw r10     // Catch:{ all -> 0x004f }
        L_0x0071:
            monitor-exit(r9)     // Catch:{ all -> 0x004f }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erc.A(long, boolean):boolean");
    }

    public final synchronized void B(int i2) {
        boolean z2;
        if (i2 >= 0) {
            try {
                if (this.s + i2 <= this.p) {
                    z2 = true;
                    fm9.f(z2);
                    this.s += i2;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        z2 = false;
        fm9.f(z2);
        this.s += i2;
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
    public void a(long r17, int r19, int r20, int r21, defpackage.wze r22) {
        /*
            r16 = this;
            r1 = r16
            r0 = r20
            boolean r2 = r1.z
            if (r2 == 0) goto L_0x0010
            qy5 r2 = r1.A
            defpackage.fm9.l(r2)
            r1.e(r2)
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
            if (r8 == 0) goto L_0x004f
            long r8 = r1.t
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0031
            return
        L_0x0031:
            if (r2 != 0) goto L_0x004f
            boolean r2 = r1.E
            if (r2 != 0) goto L_0x004c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "Overriding unexpected non-sync sample for format: "
            r2.<init>(r8)
            qy5 r8 = r1.B
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            defpackage.z04.c0(r2)
            r1.E = r4
        L_0x004c:
            r2 = r19 | 1
            goto L_0x0051
        L_0x004f:
            r2 = r19
        L_0x0051:
            boolean r8 = r1.G
            r9 = -1
            if (r8 == 0) goto L_0x00b1
            if (r5 == 0) goto L_0x00b0
            monitor-enter(r16)
            int r5 = r1.p     // Catch:{ all -> 0x0068 }
            if (r5 != 0) goto L_0x006a
            long r10 = r1.u     // Catch:{ all -> 0x0068 }
            int r5 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0065
            r5 = r4
            goto L_0x0066
        L_0x0065:
            r5 = r3
        L_0x0066:
            monitor-exit(r16)
            goto L_0x00a5
        L_0x0068:
            r0 = move-exception
            goto L_0x00ae
        L_0x006a:
            monitor-enter(r16)     // Catch:{ all -> 0x0068 }
            long r10 = r1.u     // Catch:{ all -> 0x00ab }
            int r5 = r1.s     // Catch:{ all -> 0x00ab }
            long r12 = r1.m(r5)     // Catch:{ all -> 0x00ab }
            long r10 = java.lang.Math.max(r10, r12)     // Catch:{ all -> 0x00ab }
            monitor-exit(r16)     // Catch:{ all -> 0x0068 }
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x007f
            monitor-exit(r16)
            r5 = r3
            goto L_0x00a5
        L_0x007f:
            int r5 = r1.p     // Catch:{ all -> 0x0068 }
            int r8 = r5 + -1
            int r8 = r1.o(r8)     // Catch:{ all -> 0x0068 }
        L_0x0087:
            int r10 = r1.s     // Catch:{ all -> 0x0068 }
            if (r5 <= r10) goto L_0x009d
            long[] r10 = r1.n     // Catch:{ all -> 0x0068 }
            r10 = r10[r8]     // Catch:{ all -> 0x0068 }
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x009d
            int r5 = r5 + -1
            int r8 = r8 + -1
            if (r8 != r9) goto L_0x0087
            int r8 = r1.i     // Catch:{ all -> 0x0068 }
            int r8 = r8 - r4
            goto L_0x0087
        L_0x009d:
            int r8 = r1.q     // Catch:{ all -> 0x0068 }
            int r8 = r8 + r5
            r1.i(r8)     // Catch:{ all -> 0x0068 }
            monitor-exit(r16)
            r5 = r4
        L_0x00a5:
            if (r5 != 0) goto L_0x00a8
            goto L_0x00b0
        L_0x00a8:
            r1.G = r3
            goto L_0x00b1
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x00ae:
            monitor-exit(r16)     // Catch:{ all -> 0x0068 }
            throw r0
        L_0x00b0:
            return
        L_0x00b1:
            xqc r5 = r1.a
            long r10 = r5.c
            long r12 = (long) r0
            long r10 = r10 - r12
            r5 = r21
            long r12 = (long) r5
            long r10 = r10 - r12
            monitor-enter(r16)
            int r5 = r1.p     // Catch:{ all -> 0x00da }
            if (r5 <= 0) goto L_0x00dd
            int r5 = r5 - r4
            int r5 = r1.o(r5)     // Catch:{ all -> 0x00da }
            long[] r8 = r1.k     // Catch:{ all -> 0x00da }
            r12 = r8[r5]     // Catch:{ all -> 0x00da }
            int[] r8 = r1.l     // Catch:{ all -> 0x00da }
            r5 = r8[r5]     // Catch:{ all -> 0x00da }
            long r14 = (long) r5     // Catch:{ all -> 0x00da }
            long r12 = r12 + r14
            int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x00d5
            r5 = r4
            goto L_0x00d6
        L_0x00d5:
            r5 = r3
        L_0x00d6:
            defpackage.fm9.f(r5)     // Catch:{ all -> 0x00da }
            goto L_0x00dd
        L_0x00da:
            r0 = move-exception
            goto L_0x020f
        L_0x00dd:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r5 & r2
            if (r5 == 0) goto L_0x00e4
            r5 = r4
            goto L_0x00e5
        L_0x00e4:
            r5 = r3
        L_0x00e5:
            r1.w = r5     // Catch:{ all -> 0x00da }
            long r12 = r1.v     // Catch:{ all -> 0x00da }
            long r12 = java.lang.Math.max(r12, r6)     // Catch:{ all -> 0x00da }
            r1.v = r12     // Catch:{ all -> 0x00da }
            int r5 = r1.p     // Catch:{ all -> 0x00da }
            int r5 = r1.o(r5)     // Catch:{ all -> 0x00da }
            long[] r8 = r1.n     // Catch:{ all -> 0x00da }
            r8[r5] = r6     // Catch:{ all -> 0x00da }
            long[] r6 = r1.k     // Catch:{ all -> 0x00da }
            r6[r5] = r10     // Catch:{ all -> 0x00da }
            int[] r6 = r1.l     // Catch:{ all -> 0x00da }
            r6[r5] = r0     // Catch:{ all -> 0x00da }
            int[] r0 = r1.m     // Catch:{ all -> 0x00da }
            r0[r5] = r2     // Catch:{ all -> 0x00da }
            wze[] r0 = r1.o     // Catch:{ all -> 0x00da }
            r0[r5] = r22     // Catch:{ all -> 0x00da }
            long[] r0 = r1.j     // Catch:{ all -> 0x00da }
            long r6 = r1.C     // Catch:{ all -> 0x00da }
            r0[r5] = r6     // Catch:{ all -> 0x00da }
            jn r0 = r1.c     // Catch:{ all -> 0x00da }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x00da }
            android.util.SparseArray r0 = (android.util.SparseArray) r0     // Catch:{ all -> 0x00da }
            int r0 = r0.size()     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x011d
            r0 = r4
            goto L_0x011e
        L_0x011d:
            r0 = r3
        L_0x011e:
            if (r0 != 0) goto L_0x013b
            jn r0 = r1.c     // Catch:{ all -> 0x00da }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x00da }
            android.util.SparseArray r0 = (android.util.SparseArray) r0     // Catch:{ all -> 0x00da }
            int r2 = r0.size()     // Catch:{ all -> 0x00da }
            int r2 = r2 - r4
            java.lang.Object r0 = r0.valueAt(r2)     // Catch:{ all -> 0x00da }
            arc r0 = (defpackage.arc) r0     // Catch:{ all -> 0x00da }
            qy5 r0 = r0.a     // Catch:{ all -> 0x00da }
            qy5 r2 = r1.B     // Catch:{ all -> 0x00da }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x019b
        L_0x013b:
            qy5 r0 = r1.B     // Catch:{ all -> 0x00da }
            r0.getClass()     // Catch:{ all -> 0x00da }
            tr4 r2 = r1.d     // Catch:{ all -> 0x00da }
            if (r2 == 0) goto L_0x014b
            lr4 r5 = r1.e     // Catch:{ all -> 0x00da }
            rr4 r2 = r2.b(r5, r0)     // Catch:{ all -> 0x00da }
            goto L_0x014d
        L_0x014b:
            ta4 r2 = defpackage.rr4.q     // Catch:{ all -> 0x00da }
        L_0x014d:
            jn r5 = r1.c     // Catch:{ all -> 0x00da }
            int r6 = r1.q     // Catch:{ all -> 0x00da }
            int r7 = r1.p     // Catch:{ all -> 0x00da }
            int r6 = r6 + r7
            arc r7 = new arc     // Catch:{ all -> 0x00da }
            r7.<init>(r0, r2)     // Catch:{ all -> 0x00da }
            int r0 = r5.b     // Catch:{ all -> 0x00da }
            java.lang.Object r2 = r5.c     // Catch:{ all -> 0x00da }
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch:{ all -> 0x00da }
            if (r0 != r9) goto L_0x016f
            int r0 = r2.size()     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x0169
            r0 = r4
            goto L_0x016a
        L_0x0169:
            r0 = r3
        L_0x016a:
            defpackage.fm9.k(r0)     // Catch:{ all -> 0x00da }
            r5.b = r3     // Catch:{ all -> 0x00da }
        L_0x016f:
            int r0 = r2.size()     // Catch:{ all -> 0x00da }
            if (r0 <= 0) goto L_0x0198
            int r0 = r2.size()     // Catch:{ all -> 0x00da }
            int r0 = r0 - r4
            int r0 = r2.keyAt(r0)     // Catch:{ all -> 0x00da }
            if (r6 < r0) goto L_0x0182
            r8 = r4
            goto L_0x0183
        L_0x0182:
            r8 = r3
        L_0x0183:
            defpackage.fm9.f(r8)     // Catch:{ all -> 0x00da }
            if (r0 != r6) goto L_0x0198
            int r0 = r2.size()     // Catch:{ all -> 0x00da }
            int r0 = r0 - r4
            java.lang.Object r0 = r2.valueAt(r0)     // Catch:{ all -> 0x00da }
            java.lang.Object r5 = r5.o     // Catch:{ all -> 0x00da }
            pj3 r5 = (defpackage.pj3) r5     // Catch:{ all -> 0x00da }
            r5.accept(r0)     // Catch:{ all -> 0x00da }
        L_0x0198:
            r2.append(r6, r7)     // Catch:{ all -> 0x00da }
        L_0x019b:
            int r0 = r1.p     // Catch:{ all -> 0x00da }
            int r0 = r0 + r4
            r1.p = r0     // Catch:{ all -> 0x00da }
            int r2 = r1.i     // Catch:{ all -> 0x00da }
            if (r0 != r2) goto L_0x020d
            int r0 = r2 + 1000
            long[] r4 = new long[r0]     // Catch:{ all -> 0x00da }
            long[] r5 = new long[r0]     // Catch:{ all -> 0x00da }
            long[] r6 = new long[r0]     // Catch:{ all -> 0x00da }
            int[] r7 = new int[r0]     // Catch:{ all -> 0x00da }
            int[] r8 = new int[r0]     // Catch:{ all -> 0x00da }
            wze[] r9 = new defpackage.wze[r0]     // Catch:{ all -> 0x00da }
            int r10 = r1.r     // Catch:{ all -> 0x00da }
            int r2 = r2 - r10
            long[] r11 = r1.k     // Catch:{ all -> 0x00da }
            java.lang.System.arraycopy(r11, r10, r5, r3, r2)     // Catch:{ all -> 0x00da }
            long[] r10 = r1.n     // Catch:{ all -> 0x00da }
            int r11 = r1.r     // Catch:{ all -> 0x00da }
            java.lang.System.arraycopy(r10, r11, r6, r3, r2)     // Catch:{ all -> 0x00da }
            int[] r10 = r1.m     // Catch:{ all -> 0x00da }
            int r11 = r1.r     // Catch:{ all -> 0x00da }
            java.lang.System.arraycopy(r10, r11, r7, r3, r2)     // Catch:{ all -> 0x00da }
            int[] r10 = r1.l     // Catch:{ all -> 0x00da }
            int r11 = r1.r     // Catch:{ all -> 0x00da }
            java.lang.System.arraycopy(r10, r11, r8, r3, r2)     // Catch:{ all -> 0x00da }
            wze[] r10 = r1.o     // Catch:{ all -> 0x00da }
            int r11 = r1.r     // Catch:{ all -> 0x00da }
            java.lang.System.arraycopy(r10, r11, r9, r3, r2)     // Catch:{ all -> 0x00da }
            long[] r10 = r1.j     // Catch:{ all -> 0x00da }
            int r11 = r1.r     // Catch:{ all -> 0x00da }
            java.lang.System.arraycopy(r10, r11, r4, r3, r2)     // Catch:{ all -> 0x00da }
            int r10 = r1.r     // Catch:{ all -> 0x00da }
            long[] r11 = r1.k     // Catch:{ all -> 0x00da }
            java.lang.System.arraycopy(r11, r3, r5, r2, r10)     // Catch:{ all -> 0x00da }
            long[] r11 = r1.n     // Catch:{ all -> 0x00da }
            java.lang.System.arraycopy(r11, r3, r6, r2, r10)     // Catch:{ all -> 0x00da }
            int[] r11 = r1.m     // Catch:{ all -> 0x00da }
            java.lang.System.arraycopy(r11, r3, r7, r2, r10)     // Catch:{ all -> 0x00da }
            int[] r11 = r1.l     // Catch:{ all -> 0x00da }
            java.lang.System.arraycopy(r11, r3, r8, r2, r10)     // Catch:{ all -> 0x00da }
            wze[] r11 = r1.o     // Catch:{ all -> 0x00da }
            java.lang.System.arraycopy(r11, r3, r9, r2, r10)     // Catch:{ all -> 0x00da }
            long[] r11 = r1.j     // Catch:{ all -> 0x00da }
            java.lang.System.arraycopy(r11, r3, r4, r2, r10)     // Catch:{ all -> 0x00da }
            r1.k = r5     // Catch:{ all -> 0x00da }
            r1.n = r6     // Catch:{ all -> 0x00da }
            r1.m = r7     // Catch:{ all -> 0x00da }
            r1.l = r8     // Catch:{ all -> 0x00da }
            r1.o = r9     // Catch:{ all -> 0x00da }
            r1.j = r4     // Catch:{ all -> 0x00da }
            r1.r = r3     // Catch:{ all -> 0x00da }
            r1.i = r0     // Catch:{ all -> 0x00da }
        L_0x020d:
            monitor-exit(r16)
            return
        L_0x020f:
            monitor-exit(r16)     // Catch:{ all -> 0x00da }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erc.a(long, int, int, int, wze):void");
    }

    public final void b(wpa wpa, int i2, int i3) {
        while (true) {
            xqc xqc = this.a;
            if (i2 > 0) {
                int d2 = xqc.d(i2);
                qy qyVar = (qy) xqc.h;
                wc wcVar = (wc) qyVar.o;
                wpa.e(((int) (xqc.c - qyVar.b)) + wcVar.b, wcVar.a, d2);
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

    public final int c(m24 m24, int i2, boolean z2) {
        xqc xqc = this.a;
        int d2 = xqc.d(i2);
        qy qyVar = (qy) xqc.h;
        wc wcVar = (wc) qyVar.o;
        int read = m24.read(wcVar.a, ((int) (xqc.c - qyVar.b)) + wcVar.b, d2);
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

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0111, code lost:
        if (r1 != 16) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0113, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.qy5 r7) {
        /*
            r6 = this;
            r0 = 1
            qy5 r1 = r6.l(r7)
            r2 = 0
            r6.z = r2
            r6.A = r7
            monitor-enter(r6)
            r6.y = r2     // Catch:{ all -> 0x0059 }
            qy5 r7 = r6.B     // Catch:{ all -> 0x0059 }
            boolean r7 = defpackage.oaf.a(r1, r7)     // Catch:{ all -> 0x0059 }
            if (r7 == 0) goto L_0x0019
            monitor-exit(r6)
            r0 = r2
            goto L_0x011a
        L_0x0019:
            jn r7 = r6.c     // Catch:{ all -> 0x0059 }
            java.lang.Object r7 = r7.c     // Catch:{ all -> 0x0059 }
            android.util.SparseArray r7 = (android.util.SparseArray) r7     // Catch:{ all -> 0x0059 }
            int r7 = r7.size()     // Catch:{ all -> 0x0059 }
            if (r7 != 0) goto L_0x0027
            r7 = r0
            goto L_0x0028
        L_0x0027:
            r7 = r2
        L_0x0028:
            if (r7 != 0) goto L_0x005c
            jn r7 = r6.c     // Catch:{ all -> 0x0059 }
            java.lang.Object r7 = r7.c     // Catch:{ all -> 0x0059 }
            android.util.SparseArray r7 = (android.util.SparseArray) r7     // Catch:{ all -> 0x0059 }
            int r3 = r7.size()     // Catch:{ all -> 0x0059 }
            int r3 = r3 - r0
            java.lang.Object r7 = r7.valueAt(r3)     // Catch:{ all -> 0x0059 }
            arc r7 = (defpackage.arc) r7     // Catch:{ all -> 0x0059 }
            qy5 r7 = r7.a     // Catch:{ all -> 0x0059 }
            boolean r7 = r7.equals(r1)     // Catch:{ all -> 0x0059 }
            if (r7 == 0) goto L_0x005c
            jn r7 = r6.c     // Catch:{ all -> 0x0059 }
            java.lang.Object r7 = r7.c     // Catch:{ all -> 0x0059 }
            android.util.SparseArray r7 = (android.util.SparseArray) r7     // Catch:{ all -> 0x0059 }
            int r1 = r7.size()     // Catch:{ all -> 0x0059 }
            int r1 = r1 - r0
            java.lang.Object r7 = r7.valueAt(r1)     // Catch:{ all -> 0x0059 }
            arc r7 = (defpackage.arc) r7     // Catch:{ all -> 0x0059 }
            qy5 r7 = r7.a     // Catch:{ all -> 0x0059 }
            r6.B = r7     // Catch:{ all -> 0x0059 }
            goto L_0x005e
        L_0x0059:
            r7 = move-exception
            goto L_0x0124
        L_0x005c:
            r6.B = r1     // Catch:{ all -> 0x0059 }
        L_0x005e:
            boolean r7 = r6.D     // Catch:{ all -> 0x0059 }
            qy5 r1 = r6.B     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = r1.n     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = r1.j     // Catch:{ all -> 0x0059 }
            java.util.ArrayList r4 = defpackage.ia9.a     // Catch:{ all -> 0x0059 }
            if (r3 != 0) goto L_0x006d
        L_0x006a:
            r1 = r2
            goto L_0x0114
        L_0x006d:
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -2123537834: goto L_0x00ee;
                case -432837260: goto L_0x00e3;
                case -432837259: goto L_0x00d8;
                case -53558318: goto L_0x00cd;
                case 187078296: goto L_0x00c2;
                case 187094639: goto L_0x00b7;
                case 1504578661: goto L_0x00ac;
                case 1504619009: goto L_0x00a1;
                case 1504831518: goto L_0x0093;
                case 1903231877: goto L_0x0085;
                case 1903589369: goto L_0x0077;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x00f8
        L_0x0077:
            java.lang.String r5 = "audio/g711-mlaw"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0081
            goto L_0x00f8
        L_0x0081:
            r4 = 10
            goto L_0x00f8
        L_0x0085:
            java.lang.String r5 = "audio/g711-alaw"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x008f
            goto L_0x00f8
        L_0x008f:
            r4 = 9
            goto L_0x00f8
        L_0x0093:
            java.lang.String r5 = "audio/mpeg"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x009d
            goto L_0x00f8
        L_0x009d:
            r4 = 8
            goto L_0x00f8
        L_0x00a1:
            java.lang.String r5 = "audio/flac"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00aa
            goto L_0x00f8
        L_0x00aa:
            r4 = 7
            goto L_0x00f8
        L_0x00ac:
            java.lang.String r5 = "audio/eac3"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00b5
            goto L_0x00f8
        L_0x00b5:
            r4 = 6
            goto L_0x00f8
        L_0x00b7:
            java.lang.String r5 = "audio/raw"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00c0
            goto L_0x00f8
        L_0x00c0:
            r4 = 5
            goto L_0x00f8
        L_0x00c2:
            java.lang.String r5 = "audio/ac3"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00cb
            goto L_0x00f8
        L_0x00cb:
            r4 = 4
            goto L_0x00f8
        L_0x00cd:
            java.lang.String r5 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00d6
            goto L_0x00f8
        L_0x00d6:
            r4 = 3
            goto L_0x00f8
        L_0x00d8:
            java.lang.String r5 = "audio/mpeg-L2"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00e1
            goto L_0x00f8
        L_0x00e1:
            r4 = 2
            goto L_0x00f8
        L_0x00e3:
            java.lang.String r5 = "audio/mpeg-L1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00ec
            goto L_0x00f8
        L_0x00ec:
            r4 = r0
            goto L_0x00f8
        L_0x00ee:
            java.lang.String r5 = "audio/eac3-joc"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r4 = r2
        L_0x00f8:
            switch(r4) {
                case 0: goto L_0x0113;
                case 1: goto L_0x0113;
                case 2: goto L_0x0113;
                case 3: goto L_0x00fd;
                case 4: goto L_0x0113;
                case 5: goto L_0x0113;
                case 6: goto L_0x0113;
                case 7: goto L_0x0113;
                case 8: goto L_0x0113;
                case 9: goto L_0x0113;
                case 10: goto L_0x0113;
                default: goto L_0x00fb;
            }
        L_0x00fb:
            goto L_0x006a
        L_0x00fd:
            if (r1 != 0) goto L_0x0101
            goto L_0x006a
        L_0x0101:
            jt r1 = defpackage.ia9.e(r1)     // Catch:{ all -> 0x0059 }
            if (r1 != 0) goto L_0x0109
            goto L_0x006a
        L_0x0109:
            int r1 = r1.b()     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x006a
            r3 = 16
            if (r1 == r3) goto L_0x006a
        L_0x0113:
            r1 = r0
        L_0x0114:
            r7 = r7 & r1
            r6.D = r7     // Catch:{ all -> 0x0059 }
            r6.E = r2     // Catch:{ all -> 0x0059 }
            monitor-exit(r6)
        L_0x011a:
            crc r6 = r6.f
            if (r6 == 0) goto L_0x0123
            if (r0 == 0) goto L_0x0123
            r6.c()
        L_0x0123:
            return
        L_0x0124:
            monitor-exit(r6)     // Catch:{ all -> 0x0059 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erc.e(qy5):void");
    }

    public final long f(int i2) {
        this.u = Math.max(this.u, m(i2));
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
            ((pj3) jnVar.o).accept(sparseArray.valueAt(i7));
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

    public final void g(long j2, boolean z2, boolean z3) {
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
                        int k2 = k(j2, i4, i3, z2);
                        if (k2 != -1) {
                            j3 = f(k2);
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

    public final void h() {
        long f2;
        xqc xqc = this.a;
        synchronized (this) {
            int i2 = this.p;
            f2 = i2 == 0 ? -1 : f(i2);
        }
        xqc.c(f2);
    }

    public final long i(int i2) {
        int i3 = this.q;
        int i4 = this.p;
        int i5 = (i3 + i4) - i2;
        boolean z2 = false;
        fm9.f(i5 >= 0 && i5 <= i4 - this.s);
        int i6 = this.p - i5;
        this.p = i6;
        this.v = Math.max(this.u, m(i6));
        if (i5 == 0 && this.w) {
            z2 = true;
        }
        this.w = z2;
        jn jnVar = this.c;
        SparseArray sparseArray = (SparseArray) jnVar.c;
        int size = sparseArray.size() - 1;
        while (size >= 0 && i2 < sparseArray.keyAt(size)) {
            ((pj3) jnVar.o).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
            size--;
        }
        jnVar.b = sparseArray.size() > 0 ? Math.min(jnVar.b, sparseArray.size() - 1) : -1;
        int i7 = this.p;
        if (i7 == 0) {
            return 0;
        }
        int o2 = o(i7 - 1);
        return this.k[o2] + ((long) this.l[o2]);
    }

    public final void j(int i2) {
        long i3 = i(i2);
        xqc xqc = this.a;
        fm9.f(i3 <= xqc.c);
        xqc.c = i3;
        int i4 = (i3 > 0 ? 1 : (i3 == 0 ? 0 : -1));
        int i5 = xqc.b;
        if (i4 != 0) {
            qy qyVar = (qy) xqc.f;
            if (i3 != qyVar.b) {
                while (xqc.c > qyVar.c) {
                    qyVar = (qy) qyVar.X;
                }
                qy qyVar2 = (qy) qyVar.X;
                qyVar2.getClass();
                xqc.b(qyVar2);
                qy qyVar3 = new qy(i5, 5, qyVar.c);
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
        xqc.b((qy) xqc.f);
        qy qyVar4 = new qy(i5, 5, xqc.c);
        xqc.f = qyVar4;
        xqc.g = qyVar4;
        xqc.h = qyVar4;
    }

    public final int k(long j2, int i2, int i3, boolean z2) {
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

    public qy5 l(qy5 qy5) {
        if (this.F == 0 || qy5.s == Long.MAX_VALUE) {
            return qy5;
        }
        ny5 a2 = qy5.a();
        a2.r = qy5.s + this.F;
        return a2.a();
    }

    public final long m(int i2) {
        long j2 = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int o2 = o(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = Math.max(j2, this.n[o2]);
            if ((this.m[o2] & 1) != 0) {
                break;
            }
            o2--;
            if (o2 == -1) {
                o2 = this.i - 1;
            }
        }
        return j2;
    }

    public final int n() {
        return this.q + this.s;
    }

    public final int o(int i2) {
        int i3 = this.r + i2;
        int i4 = this.i;
        return i3 < i4 ? i3 : i3 - i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int p(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.s     // Catch:{ all -> 0x0026 }
            int r4 = r8.o(r0)     // Catch:{ all -> 0x0026 }
            boolean r0 = r8.r()     // Catch:{ all -> 0x0026 }
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
            int r9 = r1.k(r2, r4, r5, r6)     // Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erc.p(long, boolean):int");
    }

    public final synchronized qy5 q() {
        return this.y ? null : this.B;
    }

    public final boolean r() {
        return this.s != this.p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean s(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.r()     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r0 != 0) goto L_0x001c
            if (r3 != 0) goto L_0x001a
            boolean r3 = r2.w     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x001a
            qy5 r3 = r2.B     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0019
            qy5 r0 = r2.g     // Catch:{ all -> 0x0017 }
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
            int r0 = r2.n()     // Catch:{ all -> 0x0017 }
            java.lang.Object r3 = r3.s(r0)     // Catch:{ all -> 0x0017 }
            arc r3 = (defpackage.arc) r3     // Catch:{ all -> 0x0017 }
            qy5 r3 = r3.a     // Catch:{ all -> 0x0017 }
            qy5 r0 = r2.g     // Catch:{ all -> 0x0017 }
            if (r3 == r0) goto L_0x0030
            monitor-exit(r2)
            return r1
        L_0x0030:
            int r3 = r2.s     // Catch:{ all -> 0x0017 }
            int r3 = r2.o(r3)     // Catch:{ all -> 0x0017 }
            boolean r3 = r2.t(r3)     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return r3
        L_0x003c:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erc.s(boolean):boolean");
    }

    public final boolean t(int i2) {
        fr4 fr4 = this.h;
        return fr4 == null || fr4.getState() == 4 || ((this.m[i2] & 1073741824) == 0 && this.h.b());
    }

    public final void u() {
        fr4 fr4 = this.h;
        if (fr4 != null && fr4.getState() == 1) {
            DrmSession$DrmSessionException d2 = this.h.d();
            d2.getClass();
            throw d2;
        }
    }

    public final void v(qy5 qy5, y7g y7g) {
        qy5 qy52;
        qy5 qy53 = this.g;
        boolean z2 = qy53 == null;
        dr4 dr4 = qy53 == null ? null : qy53.r;
        this.g = qy5;
        dr4 dr42 = qy5.r;
        tr4 tr4 = this.d;
        if (tr4 != null) {
            int d2 = tr4.d(qy5);
            ny5 a2 = qy5.a();
            a2.J = d2;
            qy52 = a2.a();
        } else {
            qy52 = qy5;
        }
        y7g.c = qy52;
        y7g.b = this.h;
        if (tr4 != null) {
            if (z2 || !oaf.a(dr4, dr42)) {
                fr4 fr4 = this.h;
                lr4 lr4 = this.e;
                fr4 a3 = tr4.a(lr4, qy5);
                this.h = a3;
                y7g.b = a3;
                if (fr4 != null) {
                    fr4.f(lr4);
                }
            }
        }
    }

    public final synchronized long w() {
        try {
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return r() ? this.j[o(this.s)] : this.C;
    }

    public final int x(y7g y7g, p54 p54, int i2, boolean z2) {
        int i3;
        boolean z3 = false;
        boolean z4 = (i2 & 2) != 0;
        mx1 mx1 = this.b;
        synchronized (this) {
            try {
                p54.Y = false;
                i3 = -3;
                if (!r()) {
                    if (!z2) {
                        if (!this.w) {
                            qy5 qy5 = this.B;
                            if (qy5 != null) {
                                if (!z4) {
                                    if (qy5 != this.g) {
                                    }
                                }
                                v(qy5, y7g);
                            }
                        }
                    }
                    p54.b = 4;
                    p54.Z = Long.MIN_VALUE;
                    i3 = -4;
                } else {
                    qy5 qy52 = ((arc) this.c.s(n())).a;
                    if (!z4) {
                        if (qy52 == this.g) {
                            int o2 = o(this.s);
                            if (!t(o2)) {
                                p54.Y = true;
                            } else {
                                p54.b = this.m[o2];
                                if (this.s == this.p - 1 && (z2 || this.w)) {
                                    p54.a(536870912);
                                }
                                p54.Z = this.n[o2];
                                mx1.a = this.l[o2];
                                mx1.b = this.k[o2];
                                mx1.c = this.o[o2];
                                i3 = -4;
                            }
                        }
                    }
                    v(qy52, y7g);
                }
                i3 = -5;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (i3 == -4 && !p54.f(4)) {
            if ((i2 & 1) != 0) {
                z3 = true;
            }
            if ((i2 & 4) == 0) {
                if (z3) {
                    xqc xqc = this.a;
                    xqc.j((qy) xqc.g, p54, this.b, (wpa) xqc.e);
                } else {
                    xqc xqc2 = this.a;
                    xqc2.g = xqc.j((qy) xqc2.g, p54, this.b, (wpa) xqc2.e);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i3;
    }

    public final void y(boolean z2) {
        jn jnVar;
        SparseArray sparseArray;
        xqc xqc = this.a;
        xqc.b((qy) xqc.f);
        qy qyVar = (qy) xqc.f;
        int i2 = 0;
        fm9.k(((wc) qyVar.o) == null);
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
            ((pj3) jnVar.o).accept(sparseArray.valueAt(i2));
            i2++;
        }
        jnVar.b = -1;
        sparseArray.clear();
        if (z2) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized boolean z(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x0022 }
            r0 = 0
            r4.s = r0     // Catch:{ all -> 0x0026 }
            xqc r1 = r4.a     // Catch:{ all -> 0x0026 }
            java.lang.Object r2 = r1.f     // Catch:{ all -> 0x0026 }
            qy r2 = (defpackage.qy) r2     // Catch:{ all -> 0x0026 }
            r1.g = r2     // Catch:{ all -> 0x0026 }
            monitor-exit(r4)     // Catch:{ all -> 0x0022 }
            int r1 = r4.q     // Catch:{ all -> 0x0022 }
            if (r5 < r1) goto L_0x0024
            int r2 = r4.p     // Catch:{ all -> 0x0022 }
            int r2 = r2 + r1
            if (r5 <= r2) goto L_0x0018
            goto L_0x0024
        L_0x0018:
            r2 = -9223372036854775808
            r4.t = r2     // Catch:{ all -> 0x0022 }
            int r5 = r5 - r1
            r4.s = r5     // Catch:{ all -> 0x0022 }
            monitor-exit(r4)
            r4 = 1
            return r4
        L_0x0022:
            r5 = move-exception
            goto L_0x0029
        L_0x0024:
            monitor-exit(r4)
            return r0
        L_0x0026:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0026 }
            throw r5     // Catch:{ all -> 0x0022 }
        L_0x0029:
            monitor-exit(r4)     // Catch:{ all -> 0x0022 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erc.z(int):boolean");
    }
}
