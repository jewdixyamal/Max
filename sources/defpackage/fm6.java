package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: fm6  reason: default package */
public final class fm6 implements zd8, gn6 {
    public final j4b A0;
    public final wmc B0 = new wmc(this, false);
    public final long C0;
    public xd8 D0;
    public int E0;
    public tze F0;
    public tn6[] G0;
    public tn6[] H0;
    public int I0;
    public sc3 J0;
    public final tr4 X;
    public final lr4 Y;
    public final huc Z;
    public final am6 a;
    public final hb4 b;
    public final w4d c;
    public final z0f o;
    public final jn s0;
    public final n64 t0;
    public final IdentityHashMap u0;
    public final mfe v0;
    public final oq9 w0;
    public final boolean x0;
    public final int y0;
    public final boolean z0;

    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.Object, mfe] */
    public fm6(am6 am6, hb4 hb4, w4d w4d, z0f z0f, tr4 tr4, lr4 lr4, huc huc, jn jnVar, n64 n64, oq9 oq9, boolean z, int i, boolean z2, j4b j4b, long j) {
        this.a = am6;
        this.b = hb4;
        this.c = w4d;
        this.o = z0f;
        this.X = tr4;
        this.Y = lr4;
        this.Z = huc;
        this.s0 = jnVar;
        this.t0 = n64;
        this.w0 = oq9;
        this.x0 = z;
        this.y0 = i;
        this.z0 = z2;
        this.A0 = j4b;
        this.C0 = j;
        oq9.getClass();
        ls5 ls5 = zw6.b;
        ffc ffc = ffc.X;
        this.J0 = new sc3(ffc, ffc);
        this.u0 = new IdentityHashMap();
        ? obj = new Object();
        obj.a = new SparseArray();
        this.v0 = obj;
        this.G0 = new tn6[0];
        this.H0 = new tn6[0];
    }

    public static qy5 e(qy5 qy5, qy5 qy52, boolean z) {
        List list;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        f99 f99;
        String str3;
        ls5 ls5 = zw6.b;
        List list2 = ffc.X;
        int i4 = -1;
        if (qy52 != null) {
            str3 = qy52.j;
            f99 = qy52.k;
            i3 = qy52.B;
            i2 = qy52.e;
            i = qy52.f;
            str2 = qy52.d;
            str = qy52.b;
            list = qy52.c;
        } else {
            String v = oaf.v(1, qy5.j);
            f99 = qy5.k;
            if (z) {
                i3 = qy5.B;
                i2 = qy5.e;
                i = qy5.f;
                str2 = qy5.d;
                str = qy5.b;
                list2 = qy5.c;
            } else {
                i2 = 0;
                str2 = null;
                i3 = -1;
                i = 0;
                str = null;
            }
            List list3 = list2;
            str3 = v;
            list = list3;
        }
        String c2 = ia9.c(str3);
        int i5 = z ? qy5.g : -1;
        if (z) {
            i4 = qy5.h;
        }
        ny5 ny5 = new ny5();
        ny5.a = qy5.a;
        ny5.b = str;
        ny5.c = zw6.j(list);
        ny5.l = ia9.l(qy5.m);
        ny5.m = ia9.l(c2);
        ny5.i = str3;
        ny5.j = f99;
        ny5.g = i5;
        ny5.h = i4;
        ny5.A = i3;
        ny5.e = i2;
        ny5.f = i;
        ny5.d = str2;
        return new qy5(ny5);
    }

    public final boolean a() {
        return this.J0.a();
    }

    public final void b() {
        for (tn6 tn6 : this.G0) {
            ArrayList arrayList = tn6.y0;
            if (!arrayList.isEmpty()) {
                dm6 dm6 = (dm6) mqd.m(arrayList);
                int b2 = tn6.o.b(dm6);
                if (b2 == 1) {
                    dm6.W0 = true;
                } else if (b2 == 0) {
                    tn6.C0.post(new vs5(tn6, 2, dm6));
                } else if (b2 == 2 && !tn6.e1) {
                    vq7 vq7 = tn6.u0;
                    if (vq7.o()) {
                        vq7.l();
                    }
                }
            }
        }
        this.D0.j(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0090, code lost:
        if (r4 != false) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0055 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(android.net.Uri r17, defpackage.wn7 r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            tn6[] r2 = r0.G0
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L_0x0009:
            if (r6 >= r3) goto L_0x00a6
            r8 = r2[r6]
            xl6 r9 = r8.o
            android.net.Uri[] r10 = r9.e
            boolean r10 = defpackage.oaf.m(r10, r1)
            if (r10 != 0) goto L_0x001d
            r8 = r18
            r4 = 1
            r5 = 1
            goto L_0x00a1
        L_0x001d:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L_0x003f
            n85 r12 = r9.r
            ty4 r12 = defpackage.dy7.n(r12)
            huc r8 = r8.t0
            r8.getClass()
            r8 = r18
            b11 r12 = defpackage.huc.o(r12, r8)
            if (r12 == 0) goto L_0x0041
            int r13 = r12.b
            r14 = 2
            if (r13 != r14) goto L_0x0041
            long r12 = r12.c
            goto L_0x0042
        L_0x003f:
            r8 = r18
        L_0x0041:
            r12 = r10
        L_0x0042:
            r14 = 0
        L_0x0043:
            android.net.Uri[] r15 = r9.e
            int r5 = r15.length
            r4 = -1
            if (r14 >= r5) goto L_0x0055
            r5 = r15[r14]
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            int r14 = r14 + 1
            goto L_0x0043
        L_0x0055:
            r14 = r4
        L_0x0056:
            if (r14 != r4) goto L_0x005b
        L_0x0058:
            r4 = 1
            r5 = 1
            goto L_0x0098
        L_0x005b:
            n85 r5 = r9.r
            int r5 = r5.p(r14)
            if (r5 != r4) goto L_0x0064
            goto L_0x0058
        L_0x0064:
            boolean r4 = r9.t
            android.net.Uri r14 = r9.p
            boolean r14 = r1.equals(r14)
            r4 = r4 | r14
            r9.t = r4
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0096
            n85 r4 = r9.r
            boolean r4 = r4.u(r5, r12)
            if (r4 == 0) goto L_0x0093
            hb4 r4 = r9.g
            java.util.HashMap r4 = r4.b
            java.lang.Object r4 = r4.get(r1)
            gb4 r4 = (defpackage.gb4) r4
            if (r4 == 0) goto L_0x008e
            boolean r4 = defpackage.gb4.a(r4, r12)
            r5 = 1
            r4 = r4 ^ r5
            goto L_0x0090
        L_0x008e:
            r5 = 1
            r4 = 0
        L_0x0090:
            if (r4 == 0) goto L_0x0094
            goto L_0x0097
        L_0x0093:
            r5 = 1
        L_0x0094:
            r4 = 0
            goto L_0x0098
        L_0x0096:
            r5 = 1
        L_0x0097:
            r4 = r5
        L_0x0098:
            if (r4 == 0) goto L_0x00a0
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x00a0
            r4 = r5
            goto L_0x00a1
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L_0x0009
        L_0x00a6:
            xd8 r1 = r0.D0
            r1.j(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm6.c(android.net.Uri, wn7, boolean):boolean");
    }

    public final tn6 d(String str, int i, Uri[] uriArr, qy5[] qy5Arr, qy5 qy5, List list, Map map, long j) {
        Uri[] uriArr2 = uriArr;
        qy5[] qy5Arr2 = qy5Arr;
        xl6 xl6 = new xl6(this.a, this.b, uriArr2, qy5Arr2, this.c, this.o, this.v0, this.C0, list, this.A0);
        lr4 lr4 = this.Y;
        huc huc = this.Z;
        return new tn6(str, i, this.B0, xl6, map, this.t0, j, qy5, this.X, lr4, huc, this.s0, this.y0);
    }

    public final long f() {
        return this.J0.f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: kn6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x028d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long g(defpackage.n85[] r37, boolean[] r38, defpackage.grc[] r39, boolean[] r40, long r41) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r39
            r12 = r41
            int r3 = r1.length
            int[] r14 = new int[r3]
            int r3 = r1.length
            int[] r15 = new int[r3]
            r3 = 0
        L_0x000f:
            int r4 = r1.length
            java.util.IdentityHashMap r10 = r0.u0
            r8 = -1
            if (r3 >= r4) goto L_0x004d
            r4 = r2[r3]
            if (r4 != 0) goto L_0x001b
            r4 = r8
            goto L_0x0025
        L_0x001b:
            java.lang.Object r4 = r10.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L_0x0025:
            r14[r3] = r4
            r15[r3] = r8
            r4 = r1[r3]
            if (r4 == 0) goto L_0x004a
            rze r4 = r4.a()
            r5 = 0
        L_0x0032:
            tn6[] r6 = r0.G0
            int r7 = r6.length
            if (r5 >= r7) goto L_0x004a
            r6 = r6[r5]
            r6.d()
            tze r6 = r6.T0
            int r6 = r6.b(r4)
            if (r6 == r8) goto L_0x0047
            r15[r3] = r5
            goto L_0x004a
        L_0x0047:
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x004d:
            r10.clear()
            int r9 = r1.length
            grc[] r6 = new defpackage.grc[r9]
            int r7 = r1.length
            grc[] r4 = new defpackage.grc[r7]
            int r5 = r1.length
            n85[] r3 = new defpackage.n85[r5]
            tn6[] r11 = r0.G0
            int r11 = r11.length
            tn6[] r11 = new defpackage.tn6[r11]
            r17 = r9
            r9 = 0
            r18 = 0
            r19 = 0
        L_0x0065:
            tn6[] r8 = r0.G0
            int r8 = r8.length
            if (r9 >= r8) goto L_0x0349
            r21 = r6
            r8 = 0
        L_0x006d:
            int r6 = r1.length
            r22 = r7
            if (r8 >= r6) goto L_0x008b
            r6 = r14[r8]
            if (r6 != r9) goto L_0x0079
            r6 = r2[r8]
            goto L_0x007a
        L_0x0079:
            r6 = 0
        L_0x007a:
            r4[r8] = r6
            r6 = r15[r8]
            if (r6 != r9) goto L_0x0083
            r7 = r1[r8]
            goto L_0x0084
        L_0x0083:
            r7 = 0
        L_0x0084:
            r3[r8] = r7
            int r8 = r8 + 1
            r7 = r22
            goto L_0x006d
        L_0x008b:
            tn6[] r6 = r0.G0
            r8 = r6[r9]
            r8.d()
            int r6 = r8.P0
            r24 = r9
            r7 = 0
        L_0x0097:
            if (r7 >= r5) goto L_0x00ef
            r25 = r4[r7]
            r9 = r25
            kn6 r9 = (defpackage.kn6) r9
            if (r9 == 0) goto L_0x00ac
            r25 = r3[r7]
            if (r25 == 0) goto L_0x00a9
            boolean r25 = r38[r7]
            if (r25 != 0) goto L_0x00ac
        L_0x00a9:
            r25 = r10
            goto L_0x00b2
        L_0x00ac:
            r25 = r10
            r27 = r11
            r2 = -1
            goto L_0x00e6
        L_0x00b2:
            int r10 = r8.P0
            r26 = 1
            int r10 = r10 + -1
            r8.P0 = r10
            int r10 = r9.c
            r27 = r11
            r11 = -1
            if (r10 == r11) goto L_0x00e2
            tn6 r10 = r9.b
            r10.d()
            int[] r11 = r10.V0
            r11.getClass()
            int[] r11 = r10.V0
            int r2 = r9.a
            r2 = r11[r2]
            boolean[] r11 = r10.Y0
            boolean r11 = r11[r2]
            defpackage.fm9.k(r11)
            boolean[] r10 = r10.Y0
            r11 = 0
            r10[r2] = r11
            r2 = -1
            r9.c = r2
        L_0x00e0:
            r9 = 0
            goto L_0x00e4
        L_0x00e2:
            r2 = r11
            goto L_0x00e0
        L_0x00e4:
            r4[r7] = r9
        L_0x00e6:
            int r7 = r7 + 1
            r2 = r39
            r10 = r25
            r11 = r27
            goto L_0x0097
        L_0x00ef:
            r25 = r10
            r27 = r11
            r2 = -1
            if (r19 != 0) goto L_0x0106
            boolean r7 = r8.d1
            if (r7 == 0) goto L_0x00fd
            if (r6 != 0) goto L_0x0104
            goto L_0x0106
        L_0x00fd:
            long r6 = r8.a1
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r6 = 0
            goto L_0x0107
        L_0x0106:
            r6 = 1
        L_0x0107:
            xl6 r11 = r8.o
            n85 r7 = r11.r
            r20 = r6
            r10 = r7
            r6 = 0
        L_0x010f:
            hb4 r9 = r11.g
            android.net.Uri[] r2 = r11.e
            if (r6 >= r5) goto L_0x0185
            r28 = r5
            r5 = r3[r6]
            if (r5 != 0) goto L_0x011e
            r29 = r3
            goto L_0x017b
        L_0x011e:
            r29 = r3
            tze r3 = r8.T0
            rze r0 = r5.a()
            int r0 = r3.b(r0)
            int r3 = r8.W0
            if (r0 != r3) goto L_0x0146
            n85 r3 = r11.r
            int r3 = r3.i()
            r2 = r2[r3]
            java.util.HashMap r3 = r9.b
            java.lang.Object r2 = r3.get(r2)
            gb4 r2 = (defpackage.gb4) r2
            if (r2 == 0) goto L_0x0143
            r3 = 0
            r2.v0 = r3
        L_0x0143:
            r11.r = r5
            r10 = r5
        L_0x0146:
            r2 = r4[r6]
            if (r2 != 0) goto L_0x017b
            int r2 = r8.P0
            r3 = 1
            int r2 = r2 + r3
            r8.P0 = r2
            kn6 r2 = new kn6
            r2.<init>(r8, r0)
            r4[r6] = r2
            r40[r6] = r3
            int[] r5 = r8.V0
            if (r5 == 0) goto L_0x017b
            r2.a()
            if (r20 != 0) goto L_0x017b
            rn6[] r2 = r8.G0
            int[] r5 = r8.V0
            r0 = r5[r0]
            r0 = r2[r0]
            int r2 = r0.n()
            if (r2 == 0) goto L_0x0178
            boolean r0 = r0.A(r12, r3)
            if (r0 != 0) goto L_0x0178
            r0 = 1
            goto L_0x0179
        L_0x0178:
            r0 = 0
        L_0x0179:
            r20 = r0
        L_0x017b:
            int r6 = r6 + 1
            r0 = r36
            r5 = r28
            r3 = r29
            r2 = -1
            goto L_0x010f
        L_0x0185:
            r29 = r3
            r28 = r5
            int r0 = r8.P0
            java.util.ArrayList r3 = r8.y0
            if (r0 != 0) goto L_0x01ea
            n85 r0 = r11.r
            int r0 = r0.i()
            r0 = r2[r0]
            java.util.HashMap r2 = r9.b
            java.lang.Object r0 = r2.get(r0)
            gb4 r0 = (defpackage.gb4) r0
            r2 = 0
            if (r0 == 0) goto L_0x01a4
            r0.v0 = r2
        L_0x01a4:
            r0 = 0
            r11.o = r0
            r8.R0 = r0
            r0 = 1
            r8.c1 = r0
            r3.clear()
            vq7 r3 = r8.u0
            boolean r5 = r3.o()
            if (r5 == 0) goto L_0x01cd
            boolean r5 = r8.N0
            if (r5 == 0) goto L_0x01c9
            rn6[] r5 = r8.G0
            int r6 = r5.length
            r7 = r2
        L_0x01bf:
            if (r7 >= r6) goto L_0x01c9
            r9 = r5[r7]
            r9.h()
            int r7 = r7 + 1
            goto L_0x01bf
        L_0x01c9:
            r3.l()
            goto L_0x01d0
        L_0x01cd:
            r8.F()
        L_0x01d0:
            r26 = r4
            r0 = r8
            r32 = r17
            r2 = r22
            r33 = r24
            r34 = r25
            r35 = r27
            r23 = r29
            r17 = -1
            r22 = r14
            r24 = r21
            r21 = r15
            r15 = r11
            goto L_0x029f
        L_0x01ea:
            r0 = 1
            r2 = 0
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x026e
            boolean r3 = defpackage.oaf.a(r10, r7)
            if (r3 != 0) goto L_0x026e
            boolean r3 = r8.d1
            if (r3 != 0) goto L_0x0250
            r5 = 0
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0203
            long r5 = -r12
        L_0x0203:
            r6 = r5
            dm6 r9 = r8.x()
            i78[] r16 = r11.a(r9, r12)
            r30 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List r5 = r8.z0
            r23 = r29
            r3 = r10
            r26 = r4
            r29 = r5
            r4 = r41
            r0 = r21
            r2 = r22
            r22 = r14
            r32 = r17
            r33 = r24
            r17 = -1
            r24 = r0
            r0 = r8
            r14 = r9
            r8 = r30
            r34 = r25
            r25 = r10
            r10 = r29
            r21 = r15
            r35 = r27
            r15 = r11
            r11 = r16
            r3.r(r4, r6, r8, r10, r11)
            qy5 r3 = r14.o
            rze r4 = r15.h
            int r3 = r4.d(r3)
            int r4 = r25.i()
            if (r4 == r3) goto L_0x024e
        L_0x024c:
            r3 = 1
            goto L_0x0269
        L_0x024e:
            r3 = 1
            goto L_0x0287
        L_0x0250:
            r26 = r4
            r0 = r8
            r32 = r17
            r2 = r22
            r33 = r24
            r34 = r25
            r35 = r27
            r23 = r29
            r17 = -1
            r22 = r14
            r24 = r21
            r21 = r15
            r15 = r11
            goto L_0x024c
        L_0x0269:
            r0.c1 = r3
            r4 = r3
            r9 = r4
            goto L_0x028b
        L_0x026e:
            r3 = r0
            r26 = r4
            r0 = r8
            r32 = r17
            r2 = r22
            r33 = r24
            r34 = r25
            r35 = r27
            r23 = r29
            r17 = -1
            r22 = r14
            r24 = r21
            r21 = r15
            r15 = r11
        L_0x0287:
            r4 = r19
            r9 = r20
        L_0x028b:
            if (r9 == 0) goto L_0x029d
            r0.G(r12, r4)
            r11 = 0
        L_0x0291:
            if (r11 >= r2) goto L_0x029d
            r4 = r26[r11]
            if (r4 == 0) goto L_0x0299
            r40[r11] = r3
        L_0x0299:
            int r11 = r11 + 1
            r3 = 1
            goto L_0x0291
        L_0x029d:
            r20 = r9
        L_0x029f:
            java.util.ArrayList r3 = r0.D0
            r3.clear()
            r11 = 0
        L_0x02a5:
            if (r11 >= r2) goto L_0x02b3
            r4 = r26[r11]
            if (r4 == 0) goto L_0x02b0
            kn6 r4 = (defpackage.kn6) r4
            r3.add(r4)
        L_0x02b0:
            int r11 = r11 + 1
            goto L_0x02a5
        L_0x02b3:
            r4 = 1
            r0.d1 = r4
            r3 = 0
            r11 = 0
        L_0x02b8:
            int r4 = r1.length
            if (r11 >= r4) goto L_0x02e8
            r4 = r26[r11]
            r5 = r21[r11]
            r6 = r33
            if (r5 != r6) goto L_0x02d3
            r4.getClass()
            r24[r11] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r5 = r34
            r5.put(r4, r3)
            r3 = 1
            goto L_0x02e1
        L_0x02d3:
            r5 = r34
            r7 = r22[r11]
            if (r7 != r6) goto L_0x02e1
            if (r4 != 0) goto L_0x02dd
            r4 = 1
            goto L_0x02de
        L_0x02dd:
            r4 = 0
        L_0x02de:
            defpackage.fm9.k(r4)
        L_0x02e1:
            int r11 = r11 + 1
            r34 = r5
            r33 = r6
            goto L_0x02b8
        L_0x02e8:
            r6 = r33
            r5 = r34
            if (r3 == 0) goto L_0x0329
            r4 = r18
            r3 = r35
            r3[r4] = r0
            int r18 = r4 + 1
            if (r4 != 0) goto L_0x031b
            r4 = 1
            r15.m = r4
            if (r20 != 0) goto L_0x030c
            r7 = r36
            tn6[] r8 = r7.H0
            int r9 = r8.length
            if (r9 == 0) goto L_0x030a
            r9 = 0
            r8 = r8[r9]
            if (r0 == r8) goto L_0x0330
            goto L_0x030f
        L_0x030a:
            r9 = 0
            goto L_0x030f
        L_0x030c:
            r9 = 0
            r7 = r36
        L_0x030f:
            mfe r0 = r7.v0
            java.lang.Object r0 = r0.a
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            r0.clear()
            r19 = r4
            goto L_0x0330
        L_0x031b:
            r4 = 1
            r9 = 0
            r7 = r36
            int r0 = r7.I0
            if (r6 >= r0) goto L_0x0325
            r11 = r4
            goto L_0x0326
        L_0x0325:
            r11 = r9
        L_0x0326:
            r15.m = r11
            goto L_0x0330
        L_0x0329:
            r9 = 0
            r7 = r36
            r4 = r18
            r3 = r35
        L_0x0330:
            int r0 = r6 + 1
            r9 = r0
            r11 = r3
            r10 = r5
            r0 = r7
            r15 = r21
            r14 = r22
            r3 = r23
            r6 = r24
            r4 = r26
            r5 = r28
            r17 = r32
            r7 = r2
            r2 = r39
            goto L_0x0065
        L_0x0349:
            r7 = r0
            r0 = r2
            r8 = r6
            r3 = r11
            r6 = r17
            r4 = r18
            r9 = 0
            java.lang.System.arraycopy(r8, r9, r0, r9, r6)
            java.lang.Object[] r0 = defpackage.oaf.U(r4, r3)
            tn6[] r0 = (defpackage.tn6[]) r0
            r7.H0 = r0
            ffc r0 = defpackage.zw6.k(r0)
            ig5 r1 = new ig5
            r2 = 21
            r1.<init>(r2)
            java.util.AbstractList r1 = defpackage.br7.Z(r1, r0)
            oq9 r2 = r7.w0
            r2.getClass()
            sc3 r2 = new sc3
            r2.<init>(r0, r1)
            r7.J0 = r2
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm6.g(n85[], boolean[], grc[], boolean[], long):long");
    }

    public final long h(long j, x1d x1d) {
        tn6[] tn6Arr = this.H0;
        int length = tn6Arr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            tn6 tn6 = tn6Arr[i];
            if (tn6.L0 == 2) {
                xl6 xl6 = tn6.o;
                int b2 = xl6.r.b();
                Uri[] uriArr = xl6.e;
                int length2 = uriArr.length;
                hb4 hb4 = xl6.g;
                qm6 b3 = (b2 >= length2 || b2 == -1) ? null : hb4.b(uriArr[xl6.r.i()], true);
                if (b3 != null) {
                    zw6 zw6 = b3.r;
                    if (!zw6.isEmpty() && b3.c) {
                        long j2 = b3.h - hb4.Z;
                        long j3 = j - j2;
                        int d = oaf.d(Long.valueOf(j3), zw6, true);
                        long j4 = ((lm6) zw6.get(d)).X;
                        return x1d.a(j3, j4, d != zw6.size() - 1 ? ((lm6) zw6.get(d + 1)).X : j4) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0121, code lost:
        if (r2[r7] != 1) goto L_0x0127;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0263  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(defpackage.xd8 r27, long r28) {
        /*
            r26 = this;
            r10 = r26
            r11 = 1
            r0 = r27
            r10.D0 = r0
            hb4 r0 = r10.b
            r0.getClass()
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.c
            r1.add(r10)
            java.lang.Object r0 = r0.y0
            r12 = r0
            ym6 r12 = (defpackage.ym6) r12
            r12.getClass()
            boolean r0 = r10.z0
            r13 = 0
            if (r0 == 0) goto L_0x008d
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r12.k
            r0.<init>(r1)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = r13
        L_0x002b:
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x008b
            java.lang.Object r4 = r1.get(r3)
            dr4 r4 = (defpackage.dr4) r4
            java.lang.String r5 = r4.c
            int r3 = r3 + r11
            r6 = r3
        L_0x003b:
            int r7 = r0.size()
            if (r6 >= r7) goto L_0x0087
            java.lang.Object r7 = r0.get(r6)
            dr4 r7 = (defpackage.dr4) r7
            java.lang.String r8 = r7.c
            boolean r8 = android.text.TextUtils.equals(r8, r5)
            if (r8 == 0) goto L_0x0085
            java.lang.String r8 = r4.c
            java.lang.String r9 = r7.c
            if (r8 == 0) goto L_0x0060
            if (r9 == 0) goto L_0x0060
            boolean r14 = android.text.TextUtils.equals(r8, r9)
            if (r14 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r14 = r13
            goto L_0x0061
        L_0x0060:
            r14 = r11
        L_0x0061:
            defpackage.fm9.k(r14)
            if (r8 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r8 = r9
        L_0x0068:
            int r9 = defpackage.oaf.a
            br4[] r4 = r4.a
            int r9 = r4.length
            br4[] r7 = r7.a
            int r14 = r7.length
            int r9 = r9 + r14
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r4, r9)
            int r4 = r4.length
            int r14 = r7.length
            java.lang.System.arraycopy(r7, r13, r9, r4, r14)
            br4[] r9 = (defpackage.br4[]) r9
            dr4 r4 = new dr4
            r4.<init>(r8, r11, r9)
            r0.remove(r6)
            goto L_0x003b
        L_0x0085:
            int r6 = r6 + r11
            goto L_0x003b
        L_0x0087:
            r2.put(r5, r4)
            goto L_0x002b
        L_0x008b:
            r14 = r2
            goto L_0x0092
        L_0x008d:
            java.util.Map r2 = java.util.Collections.emptyMap()
            goto L_0x008b
        L_0x0092:
            java.util.List r0 = r12.e
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ r11
            r10.E0 = r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            am6 r9 = r10.a
            boolean r7 = r10.x0
            java.util.List r6 = r12.f
            if (r1 == 0) goto L_0x02b6
            int r1 = r0.size()
            int[] r2 = new int[r1]
            r3 = r13
            r4 = r3
            r5 = r4
        L_0x00b6:
            int r13 = r0.size()
            if (r3 >= r13) goto L_0x00eb
            java.lang.Object r13 = r0.get(r3)
            wm6 r13 = (defpackage.wm6) r13
            qy5 r13 = r13.b
            int r11 = r13.u
            if (r11 > 0) goto L_0x00e3
            java.lang.String r11 = r13.j
            r13 = 2
            java.lang.String r17 = defpackage.oaf.v(r13, r11)
            if (r17 == 0) goto L_0x00d4
            r11 = 2
            r13 = 1
            goto L_0x00e5
        L_0x00d4:
            r13 = 1
            java.lang.String r11 = defpackage.oaf.v(r13, r11)
            if (r11 == 0) goto L_0x00df
            r2[r3] = r13
            int r5 = r5 + r13
            goto L_0x00e8
        L_0x00df:
            r11 = -1
            r2[r3] = r11
            goto L_0x00e8
        L_0x00e3:
            r13 = 1
            r11 = 2
        L_0x00e5:
            r2[r3] = r11
            int r4 = r4 + r13
        L_0x00e8:
            int r3 = r3 + r13
            r11 = r13
            goto L_0x00b6
        L_0x00eb:
            if (r4 <= 0) goto L_0x00f1
            r11 = r4
            r1 = 1
        L_0x00ef:
            r3 = 0
            goto L_0x00fb
        L_0x00f1:
            if (r5 >= r1) goto L_0x00f8
            int r1 = r1 - r5
            r11 = r1
            r1 = 0
            r3 = 1
            goto L_0x00fb
        L_0x00f8:
            r11 = r1
            r1 = 0
            goto L_0x00ef
        L_0x00fb:
            android.net.Uri[] r4 = new android.net.Uri[r11]
            qy5[] r13 = new defpackage.qy5[r11]
            int[] r5 = new int[r11]
            r17 = r7
            r19 = r8
            r7 = 0
            r18 = 0
        L_0x0108:
            int r8 = r0.size()
            if (r7 >= r8) goto L_0x0140
            if (r1 == 0) goto L_0x011a
            r8 = r2[r7]
            r20 = r9
            r9 = 2
            if (r8 != r9) goto L_0x0118
            goto L_0x011c
        L_0x0118:
            r9 = 1
            goto L_0x0124
        L_0x011a:
            r20 = r9
        L_0x011c:
            if (r3 == 0) goto L_0x0126
            r8 = r2[r7]
            r9 = 1
            if (r8 == r9) goto L_0x0124
            goto L_0x0127
        L_0x0124:
            r8 = r9
            goto L_0x013c
        L_0x0126:
            r9 = 1
        L_0x0127:
            java.lang.Object r8 = r0.get(r7)
            wm6 r8 = (defpackage.wm6) r8
            android.net.Uri r9 = r8.a
            r4[r18] = r9
            qy5 r8 = r8.b
            r13[r18] = r8
            r8 = 1
            int r9 = r18 + 1
            r5[r18] = r7
            r18 = r9
        L_0x013c:
            int r7 = r7 + r8
            r9 = r20
            goto L_0x0108
        L_0x0140:
            r20 = r9
            r7 = 0
            r8 = 1
            r0 = r13[r7]
            java.lang.String r0 = r0.j
            r2 = 2
            int r9 = defpackage.oaf.u(r2, r0)
            int r7 = defpackage.oaf.u(r8, r0)
            if (r7 == r8) goto L_0x015b
            if (r7 != 0) goto L_0x0164
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0164
        L_0x015b:
            if (r9 > r8) goto L_0x0164
            int r0 = r7 + r9
            if (r0 <= 0) goto L_0x0164
            r18 = 1
            goto L_0x0166
        L_0x0164:
            r18 = 0
        L_0x0166:
            if (r1 != 0) goto L_0x016c
            if (r7 <= 0) goto L_0x016c
            r2 = 1
            goto L_0x016d
        L_0x016c:
            r2 = 0
        L_0x016d:
            java.lang.String r8 = "main"
            qy5 r3 = r12.h
            java.util.List r1 = r12.i
            r0 = r26
            r21 = r1
            r1 = r8
            r22 = r3
            r3 = r4
            r4 = r13
            r10 = r5
            r5 = r22
            r22 = r6
            r6 = r21
            r21 = r7
            r7 = r14
            r24 = r8
            r23 = r14
            r14 = r19
            r19 = r20
            r20 = r9
            r8 = r28
            tn6 r0 = r0.d(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.add(r0)
            r14.add(r10)
            if (r17 == 0) goto L_0x02bf
            if (r18 == 0) goto L_0x02bf
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            qy5 r2 = r12.h
            if (r20 <= 0) goto L_0x0263
            qy5[] r3 = new defpackage.qy5[r11]
            r4 = 0
        L_0x01ac:
            if (r4 >= r11) goto L_0x020a
            r5 = r13[r4]
            java.lang.String r6 = r5.j
            r7 = 2
            java.lang.String r6 = defpackage.oaf.v(r7, r6)
            java.lang.String r8 = defpackage.ia9.c(r6)
            ny5 r9 = new ny5
            r9.<init>()
            java.lang.String r10 = r5.a
            r9.a = r10
            java.lang.String r10 = r5.b
            r9.b = r10
            java.util.List r10 = r5.c
            zw6 r10 = defpackage.zw6.j(r10)
            r9.c = r10
            java.lang.String r10 = r5.m
            java.lang.String r10 = defpackage.ia9.l(r10)
            r9.l = r10
            java.lang.String r8 = defpackage.ia9.l(r8)
            r9.m = r8
            r9.i = r6
            f99 r6 = r5.k
            r9.j = r6
            int r6 = r5.g
            r9.g = r6
            int r6 = r5.h
            r9.h = r6
            int r6 = r5.t
            r9.s = r6
            int r6 = r5.u
            r9.t = r6
            float r6 = r5.v
            r9.u = r6
            int r6 = r5.e
            r9.e = r6
            int r5 = r5.f
            r9.f = r5
            qy5 r5 = new qy5
            r5.<init>(r9)
            r3[r4] = r5
            r5 = 1
            int r4 = r4 + r5
            goto L_0x01ac
        L_0x020a:
            rze r4 = new rze
            r5 = r24
            r4.<init>(r5, r3)
            r1.add(r4)
            if (r21 <= 0) goto L_0x0233
            if (r2 != 0) goto L_0x021e
            boolean r3 = r22.isEmpty()
            if (r3 == 0) goto L_0x0233
        L_0x021e:
            rze r3 = new rze
            r4 = 0
            r5 = r13[r4]
            qy5 r2 = e(r5, r2, r4)
            qy5[] r2 = new defpackage.qy5[]{r2}
            java.lang.String r4 = "main:audio"
            r3.<init>(r4, r2)
            r1.add(r3)
        L_0x0233:
            java.util.List r2 = r12.i
            if (r2 == 0) goto L_0x0261
            r3 = 0
        L_0x0238:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x0261
            java.lang.String r4 = "main:cc:"
            java.lang.String r4 = defpackage.zr6.h(r3, r4)
            rze r5 = new rze
            java.lang.Object r6 = r2.get(r3)
            qy5 r6 = (defpackage.qy5) r6
            r9 = r19
            cb4 r9 = (defpackage.cb4) r9
            qy5 r6 = r9.c(r6)
            qy5[] r6 = new defpackage.qy5[]{r6}
            r5.<init>(r4, r6)
            r1.add(r5)
            r4 = 1
            int r3 = r3 + r4
            goto L_0x0238
        L_0x0261:
            r4 = 1
            goto L_0x027d
        L_0x0263:
            r5 = r24
            r4 = 1
            qy5[] r3 = new defpackage.qy5[r11]
            r6 = 0
        L_0x0269:
            if (r6 >= r11) goto L_0x0275
            r7 = r13[r6]
            qy5 r7 = e(r7, r2, r4)
            r3[r6] = r7
            int r6 = r6 + r4
            goto L_0x0269
        L_0x0275:
            rze r2 = new rze
            r2.<init>(r5, r3)
            r1.add(r2)
        L_0x027d:
            rze r2 = new rze
            ny5 r3 = new ny5
            r3.<init>()
            java.lang.String r4 = "ID3"
            r3.a = r4
            java.lang.String r4 = "application/id3"
            java.lang.String r4 = defpackage.ia9.l(r4)
            r3.m = r4
            qy5 r4 = new qy5
            r4.<init>(r3)
            qy5[] r3 = new defpackage.qy5[]{r4}
            java.lang.String r4 = "main:id3"
            r2.<init>(r4, r3)
            r1.add(r2)
            r3 = 0
            rze[] r4 = new defpackage.rze[r3]
            java.lang.Object[] r3 = r1.toArray(r4)
            rze[] r3 = (defpackage.rze[]) r3
            int r1 = r1.indexOf(r2)
            int[] r1 = new int[]{r1}
            r0.E(r3, r1)
            goto L_0x02bf
        L_0x02b6:
            r22 = r6
            r17 = r7
            r19 = r9
            r23 = r14
            r14 = r8
        L_0x02bf:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = r22.size()
            r10.<init>(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = r22.size()
            r11.<init>(r0)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = r22.size()
            r13.<init>(r0)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r9 = 0
        L_0x02e0:
            int r0 = r22.size()
            if (r9 >= r0) goto L_0x03b1
            r7 = r22
            java.lang.Object r0 = r7.get(r9)
            um6 r0 = (defpackage.um6) r0
            java.lang.String r0 = r0.c
            boolean r1 = r8.add(r0)
            if (r1 != 0) goto L_0x02ff
            r18 = r7
            r20 = r8
            r21 = r9
        L_0x02fc:
            r0 = 1
            goto L_0x03a9
        L_0x02ff:
            r10.clear()
            r11.clear()
            r13.clear()
            r1 = 0
            r16 = 1
        L_0x030b:
            int r2 = r7.size()
            if (r1 >= r2) goto L_0x034a
            java.lang.Object r2 = r7.get(r1)
            um6 r2 = (defpackage.um6) r2
            java.lang.String r2 = r2.c
            boolean r2 = defpackage.oaf.a(r0, r2)
            if (r2 == 0) goto L_0x0347
            java.lang.Object r2 = r7.get(r1)
            um6 r2 = (defpackage.um6) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r13.add(r3)
            android.net.Uri r3 = r2.a
            r10.add(r3)
            qy5 r2 = r2.b
            r11.add(r2)
            java.lang.String r2 = r2.j
            r3 = 1
            int r2 = defpackage.oaf.u(r3, r2)
            if (r2 != r3) goto L_0x0341
            r2 = r3
            goto L_0x0342
        L_0x0341:
            r2 = 0
        L_0x0342:
            r2 = r16 & r2
            r16 = r2
            goto L_0x0348
        L_0x0347:
            r3 = 1
        L_0x0348:
            int r1 = r1 + r3
            goto L_0x030b
        L_0x034a:
            java.lang.String r1 = "audio:"
            java.lang.String r6 = defpackage.wg0.i(r1, r0)
            r0 = 0
            android.net.Uri[] r1 = new android.net.Uri[r0]
            int r2 = defpackage.oaf.a
            java.lang.Object[] r1 = r10.toArray(r1)
            r3 = r1
            android.net.Uri[] r3 = (android.net.Uri[]) r3
            qy5[] r1 = new defpackage.qy5[r0]
            java.lang.Object[] r0 = r11.toArray(r1)
            r4 = r0
            qy5[] r4 = (defpackage.qy5[]) r4
            java.util.List r18 = java.util.Collections.emptyList()
            r2 = 1
            r5 = 0
            r0 = r26
            r1 = r6
            r25 = r6
            r6 = r18
            r18 = r7
            r7 = r23
            r20 = r8
            r21 = r9
            r8 = r28
            tn6 r0 = r0.d(r1, r2, r3, r4, r5, r6, r7, r8)
            int[] r1 = defpackage.s5c.c0(r13)
            r14.add(r1)
            r15.add(r0)
            if (r17 == 0) goto L_0x02fc
            if (r16 == 0) goto L_0x02fc
            r1 = 0
            qy5[] r2 = new defpackage.qy5[r1]
            java.lang.Object[] r2 = r11.toArray(r2)
            qy5[] r2 = (defpackage.qy5[]) r2
            rze r3 = new rze
            r4 = r25
            r3.<init>(r4, r2)
            rze[] r2 = new defpackage.rze[]{r3}
            int[] r3 = new int[r1]
            r0.E(r2, r3)
            goto L_0x02fc
        L_0x03a9:
            int r9 = r21 + 1
            r22 = r18
            r8 = r20
            goto L_0x02e0
        L_0x03b1:
            int r0 = r15.size()
            r10 = r26
            r10.I0 = r0
            r11 = 0
        L_0x03ba:
            java.util.List r0 = r12.g
            int r1 = r0.size()
            if (r11 >= r1) goto L_0x0423
            java.lang.Object r0 = r0.get(r11)
            um6 r0 = (defpackage.um6) r0
            java.lang.String r1 = "subtitle:"
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = defpackage.rh4.n(r11, r1, r2)
            java.lang.String r2 = r0.c
            r1.append(r2)
            java.lang.String r13 = r1.toString()
            android.net.Uri r1 = r0.a
            android.net.Uri[] r3 = new android.net.Uri[]{r1}
            qy5 r8 = r0.b
            qy5[] r4 = new defpackage.qy5[]{r8}
            java.util.List r6 = java.util.Collections.emptyList()
            r2 = 3
            r5 = 0
            r0 = r26
            r1 = r13
            r7 = r23
            r16 = r12
            r12 = r8
            r8 = r28
            tn6 r0 = r0.d(r1, r2, r3, r4, r5, r6, r7, r8)
            int[] r1 = new int[]{r11}
            r14.add(r1)
            r15.add(r0)
            rze r1 = new rze
            r9 = r19
            cb4 r9 = (defpackage.cb4) r9
            qy5 r2 = r9.c(r12)
            qy5[] r2 = new defpackage.qy5[]{r2}
            r1.<init>(r13, r2)
            rze[] r1 = new defpackage.rze[]{r1}
            r7 = 0
            int[] r2 = new int[r7]
            r0.E(r1, r2)
            r0 = 1
            int r11 = r11 + r0
            r12 = r16
            goto L_0x03ba
        L_0x0423:
            r7 = 0
            tn6[] r0 = new defpackage.tn6[r7]
            java.lang.Object[] r0 = r15.toArray(r0)
            tn6[] r0 = (defpackage.tn6[]) r0
            r10.G0 = r0
            int[][] r0 = new int[r7][]
            java.lang.Object[] r0 = r14.toArray(r0)
            int[][] r0 = (int[][]) r0
            tn6[] r0 = r10.G0
            int r0 = r0.length
            r10.E0 = r0
            r0 = r7
        L_0x043c:
            int r1 = r10.I0
            if (r0 >= r1) goto L_0x044b
            tn6[] r1 = r10.G0
            r1 = r1[r0]
            xl6 r1 = r1.o
            r2 = 1
            r1.m = r2
            int r0 = r0 + r2
            goto L_0x043c
        L_0x044b:
            tn6[] r0 = r10.G0
            int r1 = r0.length
            r13 = r7
        L_0x044f:
            if (r13 >= r1) goto L_0x046b
            r2 = r0[r13]
            boolean r3 = r2.O0
            if (r3 != 0) goto L_0x0468
            po7 r3 = new po7
            r3.<init>()
            long r4 = r2.a1
            r3.a = r4
            qo7 r4 = new qo7
            r4.<init>(r3)
            r2.o(r4)
        L_0x0468:
            r2 = 1
            int r13 = r13 + r2
            goto L_0x044f
        L_0x046b:
            tn6[] r0 = r10.G0
            r10.H0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm6.i(xd8, long):void");
    }

    public final void k() {
        tn6[] tn6Arr = this.G0;
        int length = tn6Arr.length;
        int i = 0;
        while (i < length) {
            tn6 tn6 = tn6Arr[i];
            tn6.D();
            if (!tn6.e1 || tn6.O0) {
                i++;
            } else {
                throw ParserException.a((RuntimeException) null, "Loading finished before preparation is complete.");
            }
        }
    }

    public final long l(long j) {
        tn6[] tn6Arr = this.H0;
        if (tn6Arr.length > 0) {
            boolean G = tn6Arr[0].G(j, false);
            int i = 1;
            while (true) {
                tn6[] tn6Arr2 = this.H0;
                if (i >= tn6Arr2.length) {
                    break;
                }
                tn6Arr2[i].G(j, G);
                i++;
            }
            if (G) {
                ((SparseArray) this.v0.a).clear();
            }
        }
        return j;
    }

    public final long n() {
        return -9223372036854775807L;
    }

    public final boolean o(qo7 qo7) {
        if (this.F0 != null) {
            return this.J0.o(qo7);
        }
        for (tn6 tn6 : this.G0) {
            if (!tn6.O0) {
                po7 po7 = new po7();
                po7.a = tn6.a1;
                tn6.o(new qo7(po7));
            }
        }
        return false;
    }

    public final tze q() {
        tze tze = this.F0;
        tze.getClass();
        return tze;
    }

    public final long r() {
        return this.J0.r();
    }

    public final void s(long j, boolean z) {
        for (tn6 tn6 : this.H0) {
            if (tn6.N0 && !tn6.z()) {
                int length = tn6.G0.length;
                for (int i = 0; i < length; i++) {
                    tn6.G0[i].g(j, z, tn6.Y0[i]);
                }
            }
        }
    }

    public final void t(long j) {
        this.J0.t(j);
    }
}
