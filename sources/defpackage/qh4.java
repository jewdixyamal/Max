package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: qh4  reason: default package */
public final class qh4 {
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    /* JADX WARNING: type inference failed for: r10v2, types: [opc, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.sh4 r7, int r8, java.util.ArrayList r9, defpackage.opc r10) {
        /*
            r6 = this;
            r5g r7 = r7.d
            opc r0 = r7.c
            if (r0 != 0) goto L_0x00e1
            java.lang.Object r0 = r6.c
            ij3 r0 = (defpackage.ij3) r0
            eo6 r1 = r0.d
            if (r7 == r1) goto L_0x00e1
            ocf r0 = r0.e
            if (r7 != r0) goto L_0x0014
            goto L_0x00e1
        L_0x0014:
            if (r10 != 0) goto L_0x002a
            opc r10 = new opc
            r10.<init>()
            r0 = 0
            r10.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.b = r0
            r10.a = r7
            r9.add(r10)
        L_0x002a:
            r7.c = r10
            java.util.ArrayList r0 = r10.b
            r0.add(r7)
            sh4 r0 = r7.h
            java.util.ArrayList r1 = r0.k
            java.util.Iterator r1 = r1.iterator()
        L_0x0039:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r1.next()
            oh4 r2 = (defpackage.oh4) r2
            boolean r3 = r2 instanceof defpackage.sh4
            if (r3 == 0) goto L_0x0039
            sh4 r2 = (defpackage.sh4) r2
            r6.a(r2, r8, r9, r10)
            goto L_0x0039
        L_0x004f:
            sh4 r1 = r7.i
            java.util.ArrayList r2 = r1.k
            java.util.Iterator r2 = r2.iterator()
        L_0x0057:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x006d
            java.lang.Object r3 = r2.next()
            oh4 r3 = (defpackage.oh4) r3
            boolean r4 = r3 instanceof defpackage.sh4
            if (r4 == 0) goto L_0x0057
            sh4 r3 = (defpackage.sh4) r3
            r6.a(r3, r8, r9, r10)
            goto L_0x0057
        L_0x006d:
            r2 = 1
            if (r8 != r2) goto L_0x0095
            boolean r3 = r7 instanceof defpackage.ocf
            if (r3 == 0) goto L_0x0095
            r3 = r7
            ocf r3 = (defpackage.ocf) r3
            sh4 r3 = r3.k
            java.util.ArrayList r3 = r3.k
            java.util.Iterator r3 = r3.iterator()
        L_0x007f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0095
            java.lang.Object r4 = r3.next()
            oh4 r4 = (defpackage.oh4) r4
            boolean r5 = r4 instanceof defpackage.sh4
            if (r5 == 0) goto L_0x007f
            sh4 r4 = (defpackage.sh4) r4
            r6.a(r4, r8, r9, r10)
            goto L_0x007f
        L_0x0095:
            java.util.ArrayList r0 = r0.l
            java.util.Iterator r0 = r0.iterator()
        L_0x009b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00ab
            java.lang.Object r3 = r0.next()
            sh4 r3 = (defpackage.sh4) r3
            r6.a(r3, r8, r9, r10)
            goto L_0x009b
        L_0x00ab:
            java.util.ArrayList r0 = r1.l
            java.util.Iterator r0 = r0.iterator()
        L_0x00b1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c1
            java.lang.Object r1 = r0.next()
            sh4 r1 = (defpackage.sh4) r1
            r6.a(r1, r8, r9, r10)
            goto L_0x00b1
        L_0x00c1:
            if (r8 != r2) goto L_0x00e1
            boolean r0 = r7 instanceof defpackage.ocf
            if (r0 == 0) goto L_0x00e1
            ocf r7 = (defpackage.ocf) r7
            sh4 r7 = r7.k
            java.util.ArrayList r7 = r7.l
            java.util.Iterator r7 = r7.iterator()
        L_0x00d1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r7.next()
            sh4 r0 = (defpackage.sh4) r0
            r6.a(r0, r8, r9, r10)
            goto L_0x00d1
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qh4.a(sh4, int, java.util.ArrayList, opc):void");
    }

    public void b(ij3 ij3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ij3 ij32 = ij3;
        Iterator it = ij32.q0.iterator();
        while (it.hasNext()) {
            hj3 hj3 = (hj3) it.next();
            int[] iArr = hj3.p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (hj3.g0 == 8) {
                hj3.a = true;
            } else {
                float f2 = hj3.w;
                if (f2 < 1.0f && i7 == 3) {
                    hj3.r = 2;
                }
                float f3 = hj3.z;
                if (f3 < 1.0f && i8 == 3) {
                    hj3.s = 2;
                }
                if (hj3.W > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        hj3.r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        hj3.s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (hj3.r == 0) {
                            hj3.r = 3;
                        }
                        if (hj3.s == 0) {
                            hj3.s = 3;
                        }
                    }
                }
                oi3 oi3 = hj3.K;
                oi3 oi32 = hj3.I;
                if (i7 == 3 && hj3.r == 1 && (oi32.f == null || oi3.f == null)) {
                    i7 = 2;
                }
                oi3 oi33 = hj3.L;
                oi3 oi34 = hj3.J;
                int i9 = (i8 == 3 && hj3.s == 1 && (oi34.f == null || oi33.f == null)) ? 2 : i8;
                eo6 eo6 = hj3.d;
                eo6.d = i7;
                int i10 = hj3.r;
                eo6.a = i10;
                ocf ocf = hj3.e;
                ocf.d = i9;
                int i11 = hj3.s;
                ocf.a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q = hj3.q();
                    if (i7 == 4) {
                        i4 = (ij3.q() - oi32.g) - oi3.g;
                        i7 = 1;
                    } else {
                        i4 = q;
                    }
                    int k = hj3.k();
                    if (i9 == 4) {
                        i5 = (ij3.k() - oi34.g) - oi33.g;
                        i6 = 1;
                    } else {
                        i5 = k;
                        i6 = i9;
                    }
                    f(i7, i4, i6, i5, hj3);
                    hj3.d.e.d(hj3.q());
                    hj3.e.e.d(hj3.k());
                    hj3.a = true;
                } else {
                    int[] iArr2 = ij32.p0;
                    oi3[] oi3Arr = hj3.Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, hj3);
                        }
                        int k2 = hj3.k();
                        f(1, (int) ((((float) k2) * hj3.W) + 0.5f), 1, k2, hj3);
                        hj3.d.e.d(hj3.q());
                        hj3.e.e.d(hj3.k());
                        hj3.a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, hj3);
                        hj3.d.e.m = hj3.q();
                    } else {
                        if (i10 == 2) {
                            int i12 = iArr2[0];
                            if (i12 == 1 || i12 == 4) {
                                f(1, (int) ((f2 * ((float) ij3.q())) + 0.5f), i9, hj3.k(), hj3);
                                hj3.d.e.d(hj3.q());
                                hj3.e.e.d(hj3.k());
                                hj3.a = true;
                            }
                        } else if (oi3Arr[0].f == null || oi3Arr[1].f == null) {
                            f(2, 0, i9, 0, hj3);
                            hj3.d.e.d(hj3.q());
                            hj3.e.e.d(hj3.k());
                            hj3.a = true;
                        }
                        i = 3;
                    }
                    if (i9 == i) {
                        if (i7 != 2 && i7 != 1) {
                            i2 = i;
                            i3 = 1;
                            if (i7 == i2 && i9 == i2) {
                                if (i10 != i3 || i11 == i3) {
                                    f(2, 0, 2, 0, hj3);
                                    hj3.d.e.m = hj3.q();
                                    hj3.e.e.m = hj3.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i3] == 1) {
                                    f(1, (int) ((f2 * ((float) ij3.q())) + 0.5f), 1, (int) ((f3 * ((float) ij3.k())) + 0.5f), hj3);
                                    hj3.d.e.d(hj3.q());
                                    hj3.e.e.d(hj3.k());
                                    hj3.a = true;
                                }
                            }
                        } else if (i11 == i) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, hj3);
                            }
                            int q2 = hj3.q();
                            float f4 = hj3.W;
                            if (hj3.X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q2, 1, (int) ((((float) q2) * f4) + 0.5f), hj3);
                            hj3.d.e.d(hj3.q());
                            hj3.e.e.d(hj3.k());
                            hj3.a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, hj3);
                            hj3.e.e.m = hj3.k();
                        } else if (i11 == 2) {
                            int i13 = iArr2[1];
                            if (i13 == 1 || i13 == 4) {
                                f(i7, hj3.q(), 1, (int) ((f3 * ((float) ij3.k())) + 0.5f), hj3);
                                hj3.d.e.d(hj3.q());
                                hj3.e.e.d(hj3.k());
                                hj3.a = true;
                            }
                        } else if (oi3Arr[2].f == null || oi3Arr[3].f == null) {
                            f(2, 0, i9, 0, hj3);
                            hj3.d.e.d(hj3.q());
                            hj3.e.e.d(hj3.k());
                            hj3.a = true;
                        }
                    }
                    i3 = 1;
                    i2 = 3;
                    if (i10 != i3) {
                    }
                    f(2, 0, 2, 0, hj3);
                    hj3.d.e.m = hj3.q();
                    hj3.e.e.m = hj3.k();
                }
            }
        }
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.e;
        arrayList.clear();
        ij3 ij3 = (ij3) this.d;
        ij3.d.f();
        ij3.e.f();
        arrayList.add(ij3.d);
        arrayList.add(ij3.e);
        Iterator it = ij3.q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            hj3 hj3 = (hj3) it.next();
            if (hj3 instanceof fh6) {
                r5g r5g = new r5g(hj3);
                hj3.d.f();
                hj3.e.f();
                r5g.f = ((fh6) hj3).u0;
                arrayList.add(r5g);
            } else {
                if (hj3.x()) {
                    if (hj3.b == null) {
                        hj3.b = new g12(hj3, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(hj3.b);
                } else {
                    arrayList.add(hj3.d);
                }
                if (hj3.y()) {
                    if (hj3.c == null) {
                        hj3.c = new g12(hj3, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(hj3.c);
                } else {
                    arrayList.add(hj3.e);
                }
                if (hj3 instanceof uj6) {
                    arrayList.add(new r5g(hj3));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((r5g) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            r5g r5g2 = (r5g) it3.next();
            if (r5g2.b != ij3) {
                r5g2.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        ij3 ij32 = (ij3) this.c;
        e(ij32.d, 0, arrayList2);
        e(ij32.e, 1, arrayList2);
        this.a = false;
    }

    public int d(ij3 ij3, int i) {
        ArrayList arrayList;
        int i2;
        long j;
        float f2;
        ij3 ij32 = ij3;
        int i3 = i;
        ArrayList arrayList2 = (ArrayList) this.f;
        int size = arrayList2.size();
        long j2 = 0;
        int i4 = 0;
        long j3 = 0;
        while (i4 < size) {
            r5g r5g = ((opc) arrayList2.get(i4)).a;
            if (!(r5g instanceof g12) ? i3 != 0 ? (r5g instanceof ocf) : (r5g instanceof eo6) : ((g12) r5g).f == i3) {
                sh4 sh4 = (i3 == 0 ? ij32.d : ij32.e).h;
                sh4 sh42 = (i3 == 0 ? ij32.d : ij32.e).i;
                boolean contains = r5g.h.l.contains(sh4);
                sh4 sh43 = r5g.i;
                boolean contains2 = sh43.l.contains(sh42);
                long j4 = r5g.j();
                sh4 sh44 = r5g.h;
                if (!contains || !contains2) {
                    arrayList = arrayList2;
                    i2 = i4;
                    j = contains ? Math.max(opc.b(sh44, (long) sh44.f), ((long) sh44.f) + j4) : contains2 ? Math.max(-opc.a(sh43, (long) sh43.f), ((long) (-sh43.f)) + j4) : (r5g.j() + ((long) sh44.f)) - ((long) sh43.f);
                } else {
                    long b2 = opc.b(sh44, j2);
                    arrayList = arrayList2;
                    long a2 = opc.a(sh43, j2);
                    long j5 = b2 - j4;
                    int i5 = sh43.f;
                    i2 = i4;
                    if (j5 >= ((long) (-i5))) {
                        j5 += (long) i5;
                    }
                    long j6 = (long) sh44.f;
                    long j7 = ((-a2) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    hj3 hj3 = r5g.b;
                    if (i3 == 0) {
                        f2 = hj3.d0;
                    } else if (i3 == 1) {
                        f2 = hj3.e0;
                    } else {
                        hj3.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = (float) (f2 > 0.0f ? (long) ((((float) j5) / (1.0f - f2)) + (((float) j7) / f2)) : 0);
                    j = (((long) sh44.f) + ((((long) ((f3 * f2) + 0.5f)) + j4) + ((long) z7b.f(1.0f, f2, f3, 0.5f)))) - ((long) sh43.f);
                }
            } else {
                arrayList = arrayList2;
                j = j2;
                i2 = i4;
            }
            j3 = Math.max(j3, j);
            i4 = i2 + 1;
            arrayList2 = arrayList;
            ij32 = ij3;
            j2 = 0;
        }
        return (int) j3;
    }

    public void e(r5g r5g, int i, ArrayList arrayList) {
        sh4 sh4;
        Iterator it = r5g.h.k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            sh4 = r5g.i;
            if (!hasNext) {
                break;
            }
            oh4 oh4 = (oh4) it.next();
            if (oh4 instanceof sh4) {
                a((sh4) oh4, i, arrayList, (opc) null);
            } else if (oh4 instanceof r5g) {
                a(((r5g) oh4).h, i, arrayList, (opc) null);
            }
        }
        Iterator it2 = sh4.k.iterator();
        while (it2.hasNext()) {
            oh4 oh42 = (oh4) it2.next();
            if (oh42 instanceof sh4) {
                a((sh4) oh42, i, arrayList, (opc) null);
            } else if (oh42 instanceof r5g) {
                a(((r5g) oh42).i, i, arrayList, (opc) null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((ocf) r5g).k.k.iterator();
            while (it3.hasNext()) {
                oh4 oh43 = (oh4) it3.next();
                if (oh43 instanceof sh4) {
                    a((sh4) oh43, i, arrayList, (opc) null);
                }
            }
        }
    }

    public void f(int i, int i2, int i3, int i4, hj3 hj3) {
        xk0 xk0 = (xk0) this.h;
        xk0.b = i;
        xk0.d = i3;
        xk0.e = i2;
        xk0.f = i4;
        ((dob) this.g).c(hj3, xk0);
        hj3.O(xk0.g);
        hj3.L(xk0.h);
        hj3.E = xk0.c;
        hj3.I(xk0.i);
    }

    public void g() {
        qk0 qk0;
        Iterator it = ((ij3) this.c).q0.iterator();
        while (it.hasNext()) {
            hj3 hj3 = (hj3) it.next();
            if (!hj3.a) {
                int[] iArr = hj3.p0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = hj3.r;
                int i4 = hj3.s;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                ek4 ek4 = hj3.d.e;
                boolean z3 = ek4.j;
                ek4 ek42 = hj3.e.e;
                boolean z4 = ek42.j;
                if (z3 && z4) {
                    f(1, ek4.g, 1, ek42.g, hj3);
                    hj3.a = true;
                } else if (z3 && z) {
                    f(1, ek4.g, 2, ek42.g, hj3);
                    if (i2 == 3) {
                        hj3.e.e.m = hj3.k();
                    } else {
                        hj3.e.e.d(hj3.k());
                        hj3.a = true;
                    }
                } else if (z4 && z2) {
                    f(2, ek4.g, 1, ek42.g, hj3);
                    if (i == 3) {
                        hj3.d.e.m = hj3.q();
                    } else {
                        hj3.d.e.d(hj3.q());
                        hj3.a = true;
                    }
                }
                if (hj3.a && (qk0 = hj3.e.l) != null) {
                    qk0.d(hj3.a0);
                }
            }
        }
    }
}
