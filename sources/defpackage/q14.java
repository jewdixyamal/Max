package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: q14  reason: default package */
public final class q14 implements zd8, h6d, r13 {
    public static final Pattern I0 = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern J0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final lr4 A0;
    public xd8 B0;
    public t13[] C0 = new t13[0];
    public g45[] D0 = new g45[0];
    public sc3 E0;
    public i14 F0;
    public int G0;
    public List H0;
    public final huc X;
    public final die Y;
    public final long Z;
    public final int a;
    public final jn b;
    public final z0f c;
    public final tr4 o;
    public final lo7 s0;
    public final n64 t0;
    public final tze u0;
    public final o14[] v0;
    public final oq9 w0;
    public final e4b x0;
    public final IdentityHashMap y0 = new IdentityHashMap();
    public final jn z0;

    public q14(int i, i14 i14, die die, int i2, jn jnVar, z0f z0f, tr4 tr4, lr4 lr4, huc huc, jn jnVar2, long j, lo7 lo7, n64 n64, oq9 oq9, ey1 ey1, j4b j4b) {
        int i3;
        int i4;
        int i5;
        qy5[] qy5Arr;
        qy5[] m;
        ai4 b2;
        Integer num;
        i14 i142 = i14;
        int i6 = i2;
        jn jnVar3 = jnVar;
        tr4 tr42 = tr4;
        n64 n642 = n64;
        this.a = i;
        this.F0 = i142;
        this.Y = die;
        this.G0 = i6;
        this.b = jnVar3;
        this.c = z0f;
        this.o = tr42;
        this.A0 = lr4;
        this.X = huc;
        this.z0 = jnVar2;
        this.Z = j;
        this.s0 = lo7;
        this.t0 = n642;
        this.w0 = oq9;
        this.x0 = new e4b(i142, ey1, n642);
        int i7 = 0;
        oq9.getClass();
        ls5 ls5 = zw6.b;
        ffc ffc = ffc.X;
        this.E0 = new sc3(ffc, ffc);
        kta b3 = i142.b(i6);
        List list = b3.d;
        this.H0 = list;
        List list2 = b3.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(ngg.j(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i8 = 0; i8 < size; i8++) {
            hashMap.put(Long.valueOf(((u8) list2.get(i8)).a), Integer.valueOf(i8));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i8));
            arrayList.add(arrayList2);
            sparseArray.put(i8, arrayList2);
        }
        int i9 = 0;
        while (i9 < size) {
            u8 u8Var = (u8) list2.get(i9);
            ai4 b4 = b("http://dashif.org/guidelines/trickmode", u8Var.e);
            List list3 = u8Var.f;
            b4 = b4 == null ? b("http://dashif.org/guidelines/trickmode", list3) : b4;
            int intValue = (b4 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(b4.b)))) == null) ? i9 : num.intValue();
            if (intValue == i9 && (b2 = b("urn:mpeg:dash:adaptation-set-switching:2016", list3)) != null) {
                int i10 = oaf.a;
                String[] split = b2.b.split(",", -1);
                int length = split.length;
                for (int i11 = i7; i11 < length; i11++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i11])));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i9) {
                List list4 = (List) sparseArray.get(i9);
                List list5 = (List) sparseArray.get(intValue);
                list5.addAll(list4);
                sparseArray.put(i9, list5);
                arrayList.remove(list4);
            }
            i9++;
            i7 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            int[] c0 = s5c.c0((Collection) arrayList.get(i12));
            iArr[i12] = c0;
            Arrays.sort(c0);
        }
        boolean[] zArr = new boolean[size2];
        qy5[][] qy5Arr2 = new qy5[size2][];
        int i13 = 0;
        int i15 = 0;
        while (i13 < size2) {
            int[] iArr2 = iArr[i13];
            int length2 = iArr2.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length2) {
                    break;
                }
                List list6 = ((u8) list2.get(iArr2[i16])).c;
                int[] iArr3 = iArr2;
                for (int i17 = 0; i17 < list6.size(); i17++) {
                    if (!((lhc) list6.get(i17)).o.isEmpty()) {
                        zArr[i13] = true;
                        i15++;
                        break;
                    }
                }
                i16++;
                iArr2 = iArr3;
            }
            int[] iArr4 = iArr[i13];
            int length3 = iArr4.length;
            int i18 = 0;
            while (i18 < length3) {
                int i19 = iArr4[i18];
                u8 u8Var2 = (u8) list2.get(i19);
                List list7 = ((u8) list2.get(i19)).d;
                int[] iArr5 = iArr4;
                int i20 = length3;
                int i21 = 0;
                while (i21 < list7.size()) {
                    ai4 ai4 = (ai4) list7.get(i21);
                    List list8 = list7;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(ai4.a)) {
                        ny5 ny5 = new ny5();
                        ny5.m = ia9.l("application/cea-608");
                        ny5.a = zr6.k(new StringBuilder(), u8Var2.a, ":cea608");
                        m = m(ai4, I0, new qy5(ny5));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(ai4.a)) {
                        ny5 ny52 = new ny5();
                        ny52.m = ia9.l("application/cea-708");
                        ny52.a = zr6.k(new StringBuilder(), u8Var2.a, ":cea708");
                        m = m(ai4, J0, new qy5(ny52));
                    } else {
                        i21++;
                        list7 = list8;
                    }
                    qy5Arr = m;
                    i5 = 1;
                }
                i18++;
                iArr4 = iArr5;
                length3 = i20;
            }
            i5 = 1;
            qy5Arr = new qy5[0];
            qy5Arr2[i13] = qy5Arr;
            if (qy5Arr.length != 0) {
                i15 += i5;
            }
            i13 += i5;
            int i22 = i5;
        }
        int size3 = list.size() + i15 + size2;
        rze[] rzeArr = new rze[size3];
        o14[] o14Arr = new o14[size3];
        int i23 = 0;
        int i24 = 0;
        while (i23 < size2) {
            int[] iArr6 = iArr[i23];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr6.length;
            int i25 = size2;
            int i26 = 0;
            while (i26 < length4) {
                arrayList3.addAll(((u8) list2.get(iArr6[i26])).c);
                i26++;
                iArr = iArr;
            }
            int[][] iArr7 = iArr;
            int size4 = arrayList3.size();
            qy5[] qy5Arr3 = new qy5[size4];
            int i27 = 0;
            while (i27 < size4) {
                int i28 = size4;
                qy5 qy5 = ((lhc) arrayList3.get(i27)).a;
                ArrayList arrayList4 = arrayList3;
                ny5 a2 = qy5.a();
                a2.J = tr42.d(qy5);
                qy5Arr3[i27] = new qy5(a2);
                i27++;
                size4 = i28;
                arrayList3 = arrayList4;
            }
            u8 u8Var3 = (u8) list2.get(iArr6[0]);
            long j2 = u8Var3.a;
            String l = j2 != -1 ? Long.toString(j2) : zr6.h(i23, "unset:");
            int i29 = i24 + 1;
            if (zArr[i23]) {
                i3 = i29;
                i29 = i24 + 2;
            } else {
                i3 = -1;
            }
            if (qy5Arr2[i23].length != 0) {
                i4 = i29;
                i29++;
            } else {
                i4 = -1;
            }
            d(jnVar3, qy5Arr3);
            List list9 = list2;
            rzeArr[i24] = new rze(l, qy5Arr3);
            ls5 ls52 = zw6.b;
            ffc ffc2 = ffc.X;
            o14Arr[i24] = new o14(u8Var3.b, 0, iArr6, i24, i3, i4, -1, ffc2);
            int i30 = i3;
            int i31 = -1;
            if (i30 != -1) {
                String g = au1.g(l, ":emsg");
                ny5 ny53 = new ny5();
                ny53.a = g;
                ny53.m = ia9.l("application/x-emsg");
                rzeArr[i30] = new rze(g, new qy5(ny53));
                o14Arr[i30] = new o14(5, 1, iArr6, i24, -1, -1, -1, ffc2);
                i31 = -1;
            }
            if (i4 != i31) {
                String g2 = au1.g(l, ":cc");
                o14Arr[i4] = new o14(3, 1, iArr6, i24, -1, -1, -1, zw6.k(qy5Arr2[i23]));
                d(jnVar3, qy5Arr2[i23]);
                rzeArr[i4] = new rze(g2, qy5Arr2[i23]);
            }
            i23++;
            size2 = i25;
            tr42 = tr4;
            iArr = iArr7;
            i24 = i29;
            list2 = list9;
        }
        int i32 = 0;
        while (i32 < list.size()) {
            k45 k45 = (k45) list.get(i32);
            ny5 ny54 = new ny5();
            ny54.a = k45.a();
            ny54.m = ia9.l("application/x-emsg");
            rzeArr[i24] = new rze(k45.a() + ":" + i32, new qy5(ny54));
            ls5 ls53 = zw6.b;
            o14Arr[i24] = new o14(5, 2, new int[0], -1, -1, -1, i32, ffc.X);
            i32++;
            i24++;
        }
        Pair create = Pair.create(new tze(rzeArr), o14Arr);
        this.u0 = (tze) create.first;
        this.v0 = (o14[]) create.second;
    }

    public static ai4 b(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            ai4 ai4 = (ai4) list.get(i);
            if (str.equals(ai4.a)) {
                return ai4;
            }
        }
        return null;
    }

    public static void d(jn jnVar, qy5[] qy5Arr) {
        for (int i = 0; i < qy5Arr.length; i++) {
            qy5 qy5 = qy5Arr[i];
            cb4 cb4 = (cb4) jnVar.o;
            if (cb4.c && cb4.b.a(qy5)) {
                ny5 a2 = qy5.a();
                a2.m = ia9.l("application/x-media3-cues");
                a2.G = cb4.b.l(qy5);
                StringBuilder sb = new StringBuilder();
                sb.append(qy5.n);
                String str = qy5.j;
                sb.append(str != null ? " ".concat(str) : "");
                a2.i = sb.toString();
                a2.r = Long.MAX_VALUE;
                qy5 = a2.a();
            }
            qy5Arr[i] = qy5;
        }
    }

    public static qy5[] m(ai4 ai4, Pattern pattern, qy5 qy5) {
        String str = ai4.b;
        if (str == null) {
            return new qy5[]{qy5};
        }
        int i = oaf.a;
        String[] split = str.split(";", -1);
        qy5[] qy5Arr = new qy5[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            Matcher matcher = pattern.matcher(split[i2]);
            if (!matcher.matches()) {
                return new qy5[]{qy5};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            ny5 a2 = qy5.a();
            a2.a = qy5.a + ":" + parseInt;
            a2.F = parseInt;
            a2.d = matcher.group(2);
            qy5Arr[i2] = new qy5(a2);
        }
        return qy5Arr;
    }

    public final boolean a() {
        return this.E0.a();
    }

    public final int c(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        o14[] o14Arr = this.v0;
        int i3 = o14Arr[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && o14Arr[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    public final long f() {
        return this.E0.f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: grc[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long g(defpackage.n85[] r37, boolean[] r38, defpackage.grc[] r39, boolean[] r40, long r41) {
        /*
            r36 = this;
            r14 = r36
            r0 = r37
            r15 = r39
            r12 = r41
            int r1 = r0.length
            int[] r11 = new int[r1]
            r16 = 0
            r1 = r16
        L_0x000f:
            int r2 = r0.length
            r10 = -1
            if (r1 >= r2) goto L_0x0029
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0024
            tze r3 = r14.u0
            rze r2 = r2.a()
            int r2 = r3.b(r2)
            r11[r1] = r2
            goto L_0x0026
        L_0x0024:
            r11[r1] = r10
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0029:
            r1 = r16
        L_0x002b:
            int r2 = r0.length
            r17 = 0
            if (r1 >= r2) goto L_0x0052
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0038
            boolean r2 = r38[r1]
            if (r2 != 0) goto L_0x004f
        L_0x0038:
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.t13
            if (r3 == 0) goto L_0x0044
            t13 r2 = (defpackage.t13) r2
            r2.B(r14)
            goto L_0x004d
        L_0x0044:
            boolean r3 = r2 instanceof defpackage.p13
            if (r3 == 0) goto L_0x004d
            p13 r2 = (defpackage.p13) r2
            r2.b()
        L_0x004d:
            r15[r1] = r17
        L_0x004f:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0052:
            r1 = r16
        L_0x0054:
            int r2 = r0.length
            r8 = 1
            if (r1 >= r2) goto L_0x0091
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.sz4
            if (r3 != 0) goto L_0x0062
            boolean r2 = r2 instanceof defpackage.p13
            if (r2 == 0) goto L_0x008e
        L_0x0062:
            int r2 = r14.c(r1, r11)
            if (r2 != r10) goto L_0x006d
            r2 = r15[r1]
            boolean r2 = r2 instanceof defpackage.sz4
            goto L_0x007f
        L_0x006d:
            r3 = r15[r1]
            boolean r4 = r3 instanceof defpackage.p13
            if (r4 == 0) goto L_0x007c
            p13 r3 = (defpackage.p13) r3
            t13 r3 = r3.a
            r2 = r15[r2]
            if (r3 != r2) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r8 = r16
        L_0x007e:
            r2 = r8
        L_0x007f:
            if (r2 != 0) goto L_0x008e
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.p13
            if (r3 == 0) goto L_0x008c
            p13 r2 = (defpackage.p13) r2
            r2.b()
        L_0x008c:
            r15[r1] = r17
        L_0x008e:
            int r1 = r1 + 1
            goto L_0x0054
        L_0x0091:
            r9 = r16
        L_0x0093:
            int r1 = r0.length
            if (r9 >= r1) goto L_0x01cf
            r1 = r0[r9]
            if (r1 != 0) goto L_0x00a1
            r18 = r9
            r35 = r11
            r4 = r15
            goto L_0x01c2
        L_0x00a1:
            r2 = r15[r9]
            if (r2 != 0) goto L_0x01b0
            r40[r9] = r8
            r2 = r11[r9]
            o14[] r3 = r14.v0
            r2 = r3[r2]
            int r3 = r2.c
            if (r3 != 0) goto L_0x018a
            int r3 = r2.f
            if (r3 == r10) goto L_0x00b8
            r28 = r8
            goto L_0x00ba
        L_0x00b8:
            r28 = r16
        L_0x00ba:
            if (r28 == 0) goto L_0x00c4
            tze r4 = r14.u0
            rze r3 = r4.a(r3)
            r4 = r8
            goto L_0x00c8
        L_0x00c4:
            r4 = r16
            r3 = r17
        L_0x00c8:
            int r5 = r2.g
            if (r5 == r10) goto L_0x00d3
            o14[] r6 = r14.v0
            r5 = r6[r5]
            zw6 r5 = r5.h
            goto L_0x00d7
        L_0x00d3:
            ffc r5 = defpackage.zw6.m()
        L_0x00d7:
            int r6 = r5.size()
            int r6 = r6 + r4
            qy5[] r4 = new defpackage.qy5[r6]
            int[] r6 = new int[r6]
            if (r28 == 0) goto L_0x00ed
            qy5 r3 = r3.c()
            r4[r16] = r3
            r3 = 5
            r6[r16] = r3
            r3 = r8
            goto L_0x00ef
        L_0x00ed:
            r3 = r16
        L_0x00ef:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r10 = r16
        L_0x00f6:
            int r8 = r5.size()
            if (r10 >= r8) goto L_0x0110
            java.lang.Object r8 = r5.get(r10)
            qy5 r8 = (defpackage.qy5) r8
            r4[r3] = r8
            r18 = 3
            r6[r3] = r18
            r7.add(r8)
            r8 = 1
            int r3 = r3 + r8
            int r10 = r10 + 1
            goto L_0x00f6
        L_0x0110:
            r8 = 1
            i14 r3 = r14.F0
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x0121
            if (r28 == 0) goto L_0x0121
            e4b r3 = r14.x0
            d4b r3 = r3.a()
            r10 = r3
            goto L_0x0123
        L_0x0121:
            r10 = r17
        L_0x0123:
            jn r3 = r14.b
            lo7 r5 = r14.s0
            i14 r8 = r14.F0
            r32 = r9
            die r9 = r14.Y
            r33 = r11
            int r11 = r14.G0
            int[] r12 = r2.a
            int r13 = r2.b
            r34 = r6
            r29 = r7
            long r6 = r14.Z
            z0f r0 = r14.c
            r18 = r3
            r19 = r5
            r20 = r8
            r21 = r9
            r22 = r11
            r23 = r12
            r24 = r1
            r25 = r13
            r26 = r6
            r30 = r10
            r31 = r0
            g94 r5 = r18.k(r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31)
            t13 r0 = new t13
            int r2 = r2.b
            n64 r7 = r14.t0
            tr4 r11 = r14.o
            lr4 r12 = r14.A0
            huc r13 = r14.X
            jn r8 = r14.z0
            r1 = r0
            r3 = r34
            r6 = r36
            r19 = r8
            r18 = r32
            r8 = r41
            r15 = r10
            r10 = r11
            r35 = r33
            r11 = r12
            r12 = r13
            r13 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            monitor-enter(r36)
            java.util.IdentityHashMap r1 = r14.y0     // Catch:{ all -> 0x0187 }
            r1.put(r0, r15)     // Catch:{ all -> 0x0187 }
            monitor-exit(r36)     // Catch:{ all -> 0x0187 }
            r4 = r39
            r4[r18] = r0
            goto L_0x01c2
        L_0x0187:
            r0 = move-exception
            monitor-exit(r36)     // Catch:{ all -> 0x0187 }
            throw r0
        L_0x018a:
            r18 = r9
            r35 = r11
            r4 = r15
            r0 = 2
            if (r3 != r0) goto L_0x01c2
            java.util.List r0 = r14.H0
            int r2 = r2.d
            java.lang.Object r0 = r0.get(r2)
            k45 r0 = (defpackage.k45) r0
            rze r1 = r1.a()
            qy5 r1 = r1.c()
            g45 r2 = new g45
            i14 r3 = r14.F0
            boolean r3 = r3.d
            r2.<init>(r0, r1, r3)
            r4[r18] = r2
            goto L_0x01c2
        L_0x01b0:
            r18 = r9
            r35 = r11
            r4 = r15
            boolean r0 = r2 instanceof defpackage.t13
            if (r0 == 0) goto L_0x01c2
            t13 r2 = (defpackage.t13) r2
            g94 r0 = r2.u()
            r0.c(r1)
        L_0x01c2:
            int r9 = r18 + 1
            r0 = r37
            r12 = r41
            r15 = r4
            r11 = r35
            r8 = 1
            r10 = -1
            goto L_0x0093
        L_0x01cf:
            r35 = r11
            r4 = r15
            r0 = r37
            r1 = r16
        L_0x01d6:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x021d
            r2 = r4[r1]
            if (r2 != 0) goto L_0x0212
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0212
            r2 = r35
            r3 = r2[r1]
            o14[] r5 = r14.v0
            r3 = r5[r3]
            int r5 = r3.c
            r6 = 1
            if (r5 != r6) goto L_0x020e
            int r5 = r14.c(r1, r2)
            r7 = -1
            if (r5 != r7) goto L_0x01ff
            sz4 r3 = new sz4
            r3.<init>()
            r4[r1] = r3
            r8 = r41
            goto L_0x0218
        L_0x01ff:
            r5 = r4[r5]
            t13 r5 = (defpackage.t13) r5
            int r3 = r3.b
            r8 = r41
            p13 r3 = r5.D(r3, r8)
            r4[r1] = r3
            goto L_0x0218
        L_0x020e:
            r8 = r41
        L_0x0210:
            r7 = -1
            goto L_0x0218
        L_0x0212:
            r8 = r41
            r2 = r35
            r6 = 1
            goto L_0x0210
        L_0x0218:
            int r1 = r1 + 1
            r35 = r2
            goto L_0x01d6
        L_0x021d:
            r8 = r41
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r4.length
            r3 = r16
        L_0x022c:
            if (r3 >= r2) goto L_0x0246
            r5 = r4[r3]
            boolean r6 = r5 instanceof defpackage.t13
            if (r6 == 0) goto L_0x023a
            t13 r5 = (defpackage.t13) r5
            r0.add(r5)
            goto L_0x0243
        L_0x023a:
            boolean r6 = r5 instanceof defpackage.g45
            if (r6 == 0) goto L_0x0243
            g45 r5 = (defpackage.g45) r5
            r1.add(r5)
        L_0x0243:
            int r3 = r3 + 1
            goto L_0x022c
        L_0x0246:
            int r2 = r0.size()
            t13[] r2 = new defpackage.t13[r2]
            r14.C0 = r2
            r0.toArray(r2)
            int r2 = r1.size()
            g45[] r2 = new defpackage.g45[r2]
            r14.D0 = r2
            r1.toArray(r2)
            oq9 r1 = r14.w0
            yv3 r2 = new yv3
            r3 = 9
            r2.<init>(r3)
            java.util.AbstractList r2 = defpackage.br7.Z(r2, r0)
            r1.getClass()
            sc3 r1 = new sc3
            r1.<init>(r0, r2)
            r14.E0 = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q14.g(n85[], boolean[], grc[], boolean[], long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r3 < (((r0.C() + r8) + r6) - 1)) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long h(long r18, defpackage.x1d r20) {
        /*
            r17 = this;
            r1 = r18
            r0 = r17
            t13[] r0 = r0.C0
            int r3 = r0.length
            r4 = 0
            r5 = r4
        L_0x0009:
            if (r5 >= r3) goto L_0x0074
            r6 = r0[r5]
            int r7 = r6.a
            r8 = 2
            if (r7 != r8) goto L_0x0071
            g94 r0 = r6.X
            c94[] r0 = r0.i
            int r3 = r0.length
        L_0x0017:
            if (r4 >= r3) goto L_0x006f
            r5 = r0[r4]
            java.lang.Object r6 = r5.g
            a24 r6 = (defpackage.a24) r6
            if (r6 == 0) goto L_0x006c
            long r6 = r5.e()
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x002c
            goto L_0x006c
        L_0x002c:
            java.lang.Object r0 = r5.g
            a24 r0 = (defpackage.a24) r0
            defpackage.fm9.l(r0)
            long r3 = r5.b
            long r3 = r0.v(r1, r3)
            long r8 = r5.c
            long r3 = r3 + r8
            long r10 = r5.g(r3)
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x0061
            r12 = -1
            int r12 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            r13 = 1
            if (r12 == 0) goto L_0x005a
            defpackage.fm9.l(r0)
            long r15 = r0.C()
            long r15 = r15 + r8
            long r15 = r15 + r6
            long r15 = r15 - r13
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0061
        L_0x005a:
            long r3 = r3 + r13
            long r3 = r5.g(r3)
            r5 = r3
            goto L_0x0062
        L_0x0061:
            r5 = r10
        L_0x0062:
            r0 = r20
            r1 = r18
            r3 = r10
            long r0 = r0.a(r1, r3, r5)
            goto L_0x0070
        L_0x006c:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x006f:
            r0 = r1
        L_0x0070:
            return r0
        L_0x0071:
            int r5 = r5 + 1
            goto L_0x0009
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q14.h(long, x1d):long");
    }

    public final void i(xd8 xd8, long j) {
        this.B0 = xd8;
        xd8.e(this);
    }

    public final void j(j6d j6d) {
        t13 t13 = (t13) j6d;
        this.B0.j(this);
    }

    public final void k() {
        this.s0.c();
    }

    public final long l(long j) {
        int i;
        ArrayList arrayList;
        zi0 zi0;
        boolean z;
        long j2 = j;
        t13[] t13Arr = this.C0;
        int length = t13Arr.length;
        int i2 = 0;
        while (i2 < length) {
            t13 t13 = t13Arr[i2];
            t13.E0 = j2;
            if (t13.y()) {
                t13.D0 = j2;
                i = i2;
            } else {
                int i3 = 0;
                while (true) {
                    arrayList = t13.v0;
                    if (i3 >= arrayList.size()) {
                        i = i2;
                        break;
                    }
                    zi0 = (zi0) arrayList.get(i3);
                    int i4 = (zi0.Z > j2 ? 1 : (zi0.Z == j2 ? 0 : -1));
                    i = i2;
                    if (i4 == 0 && zi0.v0 == -9223372036854775807L) {
                        break;
                    } else if (i4 > 0) {
                        break;
                    } else {
                        i3++;
                        i2 = i;
                    }
                }
                zi0 = null;
                erc erc = t13.x0;
                if (zi0 != null) {
                    z = erc.z(zi0.d(0));
                } else {
                    z = erc.A(j2, j2 < t13.f());
                }
                erc[] ercArr = t13.y0;
                if (z) {
                    t13.F0 = t13.A(erc.n(), 0);
                    for (erc A : ercArr) {
                        A.A(j2, true);
                    }
                } else {
                    t13.D0 = j2;
                    t13.H0 = false;
                    arrayList.clear();
                    t13.F0 = 0;
                    vq7 vq7 = t13.t0;
                    if (vq7.o()) {
                        erc.h();
                        for (erc h : ercArr) {
                            h.h();
                        }
                        vq7.l();
                    } else {
                        vq7.o = null;
                        erc.y(false);
                        for (erc y : ercArr) {
                            y.y(false);
                        }
                        i2 = i + 1;
                    }
                }
            }
            i2 = i + 1;
        }
        for (g45 g45 : this.D0) {
            int b2 = oaf.b(g45.c, j2, true);
            g45.Z = b2;
            g45.s0 = (!g45.o || b2 != g45.c.length) ? -9223372036854775807L : j2;
        }
        return j2;
    }

    public final long n() {
        return -9223372036854775807L;
    }

    public final boolean o(qo7 qo7) {
        return this.E0.o(qo7);
    }

    public final tze q() {
        return this.u0;
    }

    public final long r() {
        return this.E0.r();
    }

    public final void s(long j, boolean z) {
        long j2;
        for (t13 t13 : this.C0) {
            if (!t13.y()) {
                erc erc = t13.x0;
                int i = erc.q;
                erc.g(j, z, true);
                erc erc2 = t13.x0;
                int i2 = erc2.q;
                if (i2 > i) {
                    synchronized (erc2) {
                        j2 = erc2.p == 0 ? Long.MIN_VALUE : erc2.n[erc2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        erc[] ercArr = t13.y0;
                        if (i3 >= ercArr.length) {
                            break;
                        }
                        ercArr[i3].g(j2, z, t13.o[i3]);
                        i3++;
                    }
                }
                int min = Math.min(t13.A(i2, 0), t13.F0);
                if (min > 0) {
                    oaf.X(t13.v0, 0, min);
                    t13.F0 -= min;
                }
            }
        }
    }

    public final void t(long j) {
        this.E0.t(j);
    }
}
