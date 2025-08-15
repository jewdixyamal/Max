package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: p14  reason: default package */
public final class p14 implements yd8, g6d, q13 {
    public static final Pattern I0 = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern J0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final kr4 A0;
    public wd8 B0;
    public s13[] C0 = new s13[0];
    public f45[] D0 = new f45[0];
    public rxd E0;
    public h14 F0;
    public int G0;
    public List H0;
    public final buc X;
    public final c8d Y;
    public final long Z;
    public final int a;
    public final ey1 b;
    public final y0f c;
    public final sr4 o;
    public final ko7 s0;
    public final n64 t0;
    public final sze u0;
    public final n14[] v0;
    public final mq9 w0;
    public final e4b x0;
    public final IdentityHashMap y0 = new IdentityHashMap();
    public final gk8 z0;

    public p14(int i, h14 h14, c8d c8d, int i2, ey1 ey1, y0f y0f, sr4 sr4, kr4 kr4, buc buc, gk8 gk8, long j, ko7 ko7, n64 n64, mq9 mq9, wmc wmc, i4b i4b) {
        int i3;
        List list;
        int i4;
        int i5;
        oy5[] oy5Arr;
        oy5[] g;
        zh4 b2;
        h14 h142 = h14;
        int i6 = i2;
        sr4 sr42 = sr4;
        n64 n642 = n64;
        this.a = i;
        this.F0 = h142;
        this.Y = c8d;
        this.G0 = i6;
        this.b = ey1;
        this.c = y0f;
        this.o = sr42;
        this.A0 = kr4;
        this.X = buc;
        this.z0 = gk8;
        this.Z = j;
        this.s0 = ko7;
        this.t0 = n642;
        this.w0 = mq9;
        this.x0 = new e4b(h142, wmc, n642);
        int i7 = 0;
        s13[] s13Arr = this.C0;
        mq9.getClass();
        this.E0 = new rxd(10, s13Arr);
        jta b3 = h142.b(i6);
        List list2 = b3.d;
        this.H0 = list2;
        List list3 = b3.c;
        int size = list3.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i8 = 0; i8 < size; i8++) {
            sparseIntArray.put(((t8) list3.get(i8)).a, i8);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i8));
            arrayList.add(arrayList2);
            sparseArray.put(i8, arrayList2);
        }
        int i9 = 0;
        while (i9 < size) {
            t8 t8Var = (t8) list3.get(i9);
            zh4 b4 = b("http://dashif.org/guidelines/trickmode", t8Var.e);
            List list4 = t8Var.f;
            b4 = b4 == null ? b("http://dashif.org/guidelines/trickmode", list4) : b4;
            int i10 = (b4 == null || (i10 = sparseIntArray.get(Integer.parseInt(b4.b), -1)) == -1) ? i9 : i10;
            if (i10 == i9 && (b2 = b("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                int i11 = maf.a;
                String[] split = b2.b.split(",", -1);
                int length = split.length;
                for (int i12 = i7; i12 < length; i12++) {
                    int i13 = sparseIntArray.get(Integer.parseInt(split[i12]), -1);
                    if (i13 != -1) {
                        i10 = Math.min(i10, i13);
                    }
                }
            }
            if (i10 != i9) {
                List list5 = (List) sparseArray.get(i9);
                List list6 = (List) sparseArray.get(i10);
                list6.addAll(list5);
                sparseArray.put(i9, list6);
                arrayList.remove(list5);
            }
            i9++;
            i7 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i14 = 0; i14 < size2; i14++) {
            int[] c0 = s5c.c0((Collection) arrayList.get(i14));
            iArr[i14] = c0;
            Arrays.sort(c0);
        }
        boolean[] zArr = new boolean[size2];
        oy5[][] oy5Arr2 = new oy5[size2][];
        int i15 = 0;
        int i16 = 0;
        while (i15 < size2) {
            int[] iArr2 = iArr[i15];
            int length2 = iArr2.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length2) {
                    break;
                }
                List list7 = ((t8) list3.get(iArr2[i17])).c;
                for (int i18 = 0; i18 < list7.size(); i18++) {
                    if (!((khc) list7.get(i18)).o.isEmpty()) {
                        zArr[i15] = true;
                        i16++;
                        break;
                    }
                }
                i17++;
            }
            int[] iArr3 = iArr[i15];
            int length3 = iArr3.length;
            int i19 = 0;
            while (i19 < length3) {
                int i20 = iArr3[i19];
                t8 t8Var2 = (t8) list3.get(i20);
                List list8 = ((t8) list3.get(i20)).d;
                int[] iArr4 = iArr3;
                int i21 = 0;
                while (i21 < list8.size()) {
                    zh4 zh4 = (zh4) list8.get(i21);
                    int i22 = length3;
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(zh4.a)) {
                        my5 my5 = new my5();
                        my5.k = "application/cea-608";
                        int i23 = t8Var2.a;
                        StringBuilder sb = new StringBuilder(18);
                        sb.append(i23);
                        sb.append(":cea608");
                        my5.a = sb.toString();
                        g = g(zh4, I0, new oy5(my5));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(zh4.a)) {
                        my5 my52 = new my5();
                        my52.k = "application/cea-708";
                        int i24 = t8Var2.a;
                        StringBuilder sb2 = new StringBuilder(18);
                        sb2.append(i24);
                        sb2.append(":cea708");
                        my52.a = sb2.toString();
                        g = g(zh4, J0, new oy5(my52));
                    } else {
                        i21++;
                        list8 = list9;
                        length3 = i22;
                    }
                    oy5Arr = g;
                    i5 = 1;
                }
                int i25 = length3;
                i19++;
                iArr3 = iArr4;
            }
            i5 = 1;
            oy5Arr = new oy5[0];
            oy5Arr2[i15] = oy5Arr;
            if (oy5Arr.length != 0) {
                i16 += i5;
            }
            i15 += i5;
        }
        int size3 = list2.size() + i16 + size2;
        qze[] qzeArr = new qze[size3];
        n14[] n14Arr = new n14[size3];
        int i26 = 0;
        int i27 = 0;
        while (i27 < size2) {
            int[] iArr5 = iArr[i27];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr5.length;
            int i28 = size2;
            int i29 = 0;
            while (i29 < length4) {
                arrayList3.addAll(((t8) list3.get(iArr5[i29])).c);
                i29++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            oy5[] oy5Arr3 = new oy5[size4];
            int i30 = 0;
            while (i30 < size4) {
                int i31 = size4;
                oy5 oy5 = ((khc) arrayList3.get(i30)).a;
                ArrayList arrayList4 = arrayList3;
                int b5 = sr42.b(oy5);
                my5 a2 = oy5.a();
                a2.D = b5;
                oy5Arr3[i30] = a2.a();
                i30++;
                size4 = i31;
                arrayList3 = arrayList4;
            }
            t8 t8Var3 = (t8) list3.get(iArr5[0]);
            int i32 = t8Var3.a;
            String num = i32 != -1 ? Integer.toString(i32) : z7b.h(17, i27, "unset:");
            int i33 = i26 + 1;
            if (zArr[i27]) {
                i3 = i33;
                i33 = i26 + 2;
            } else {
                i3 = -1;
            }
            if (oy5Arr2[i27].length != 0) {
                i4 = i33;
                i33++;
                list = list3;
            } else {
                list = list3;
                i4 = -1;
            }
            qzeArr[i26] = new qze(num, oy5Arr3);
            n14Arr[i26] = new n14(t8Var3.b, 0, iArr5, i26, i3, i4, -1);
            int i34 = i3;
            int i35 = -1;
            if (i34 != -1) {
                String concat = String.valueOf(num).concat(":emsg");
                my5 my53 = new my5();
                my53.a = concat;
                my53.k = "application/x-emsg";
                qzeArr[i34] = new qze(concat, new oy5(my53));
                n14Arr[i34] = new n14(5, 1, iArr5, i26, -1, -1, -1);
                i35 = -1;
            }
            if (i4 != i35) {
                qzeArr[i4] = new qze(String.valueOf(num).concat(":cc"), oy5Arr2[i27]);
                n14Arr[i4] = new n14(3, 1, iArr5, i26, -1, -1, -1);
            }
            i27++;
            size2 = i28;
            iArr = iArr6;
            i26 = i33;
            list3 = list;
        }
        int i36 = 0;
        while (i36 < list2.size()) {
            j45 j45 = (j45) list2.get(i36);
            my5 my54 = new my5();
            my54.a = j45.a();
            my54.k = "application/x-emsg";
            oy5 oy52 = new oy5(my54);
            String a3 = j45.a();
            StringBuilder sb3 = new StringBuilder(rh4.e(12, a3));
            sb3.append(a3);
            sb3.append(":");
            sb3.append(i36);
            qzeArr[i26] = new qze(sb3.toString(), oy52);
            n14Arr[i26] = new n14(5, 2, new int[0], -1, -1, -1, i36);
            i36++;
            i26++;
        }
        Pair create = Pair.create(new sze(qzeArr), n14Arr);
        this.u0 = (sze) create.first;
        this.v0 = (n14[]) create.second;
    }

    public static zh4 b(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            zh4 zh4 = (zh4) list.get(i);
            if (str.equals(zh4.a)) {
                return zh4;
            }
        }
        return null;
    }

    public static oy5[] g(zh4 zh4, Pattern pattern, oy5 oy5) {
        String str = zh4.b;
        if (str == null) {
            return new oy5[]{oy5};
        }
        int i = maf.a;
        String[] split = str.split(";", -1);
        oy5[] oy5Arr = new oy5[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            Matcher matcher = pattern.matcher(split[i2]);
            if (!matcher.matches()) {
                return new oy5[]{oy5};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            my5 a2 = oy5.a();
            String str2 = oy5.a;
            StringBuilder sb = new StringBuilder(rh4.e(12, str2));
            sb.append(str2);
            sb.append(":");
            sb.append(parseInt);
            a2.a = sb.toString();
            a2.C = parseInt;
            a2.c = matcher.group(2);
            oy5Arr[i2] = new oy5(a2);
        }
        return oy5Arr;
    }

    public final long A(long j, w1d w1d) {
        long j2 = j;
        for (s13 s13 : this.C0) {
            if (s13.a == 2) {
                for (c94 c94 : s13.X.h) {
                    z14 z14 = (z14) c94.g;
                    if (z14 != null) {
                        long j3 = c94.b;
                        long v = z14.v(j2, j3);
                        long j4 = c94.c;
                        long j5 = v + j4;
                        long g = c94.g(j5);
                        z14 z142 = (z14) c94.g;
                        long D = z142.D(j3);
                        return w1d.a(j, g, (g >= j2 || (D != -1 && j5 >= ((z142.C() + j4) + D) - 1)) ? g : c94.g(j5 + 1));
                    }
                }
                return j2;
            }
        }
        return j2;
    }

    public final boolean C(long j) {
        return this.E0.C(j);
    }

    public final void J(wd8 wd8, long j) {
        this.B0 = wd8;
        wd8.d(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: frc[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long L(defpackage.m85[] r38, boolean[] r39, defpackage.frc[] r40, boolean[] r41, long r42) {
        /*
            r37 = this;
            r14 = r37
            r0 = r38
            r15 = r40
            r12 = r42
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
            sze r3 = r14.u0
            qze r2 = r2.a()
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
            if (r1 >= r2) goto L_0x005e
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0038
            boolean r2 = r39[r1]
            if (r2 != 0) goto L_0x005b
        L_0x0038:
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.s13
            if (r3 == 0) goto L_0x0044
            s13 r2 = (defpackage.s13) r2
            r2.v(r14)
            goto L_0x0059
        L_0x0044:
            boolean r3 = r2 instanceof defpackage.o13
            if (r3 == 0) goto L_0x0059
            o13 r2 = (defpackage.o13) r2
            s13 r3 = r2.X
            boolean[] r4 = r3.o
            int r2 = r2.c
            boolean r4 = r4[r2]
            defpackage.np8.f(r4)
            boolean[] r3 = r3.o
            r3[r2] = r16
        L_0x0059:
            r15[r1] = r17
        L_0x005b:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x005e:
            r1 = r16
        L_0x0060:
            int r2 = r0.length
            r8 = 1
            if (r1 >= r2) goto L_0x00a9
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.rz4
            if (r3 != 0) goto L_0x006e
            boolean r2 = r2 instanceof defpackage.o13
            if (r2 == 0) goto L_0x00a6
        L_0x006e:
            int r2 = r14.e(r1, r11)
            if (r2 != r10) goto L_0x0079
            r2 = r15[r1]
            boolean r2 = r2 instanceof defpackage.rz4
            goto L_0x008b
        L_0x0079:
            r3 = r15[r1]
            boolean r4 = r3 instanceof defpackage.o13
            if (r4 == 0) goto L_0x0088
            o13 r3 = (defpackage.o13) r3
            s13 r3 = r3.a
            r2 = r15[r2]
            if (r3 != r2) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r8 = r16
        L_0x008a:
            r2 = r8
        L_0x008b:
            if (r2 != 0) goto L_0x00a6
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.o13
            if (r3 == 0) goto L_0x00a4
            o13 r2 = (defpackage.o13) r2
            s13 r3 = r2.X
            boolean[] r4 = r3.o
            int r2 = r2.c
            boolean r4 = r4[r2]
            defpackage.np8.f(r4)
            boolean[] r3 = r3.o
            r3[r2] = r16
        L_0x00a4:
            r15[r1] = r17
        L_0x00a6:
            int r1 = r1 + 1
            goto L_0x0060
        L_0x00a9:
            r9 = r16
        L_0x00ab:
            int r1 = r0.length
            if (r9 >= r1) goto L_0x01fb
            r1 = r0[r9]
            if (r1 != 0) goto L_0x00b9
            r18 = r9
            r36 = r11
            r0 = r15
            goto L_0x01ee
        L_0x00b9:
            r2 = r15[r9]
            if (r2 != 0) goto L_0x01df
            r41[r9] = r8
            r2 = r11[r9]
            n14[] r3 = r14.v0
            r2 = r3[r2]
            int r3 = r2.c
            if (r3 != 0) goto L_0x01b9
            int r3 = r2.f
            if (r3 == r10) goto L_0x00d0
            r29 = r8
            goto L_0x00d2
        L_0x00d0:
            r29 = r16
        L_0x00d2:
            if (r29 == 0) goto L_0x00dc
            sze r4 = r14.u0
            qze r3 = r4.a(r3)
            r4 = r8
            goto L_0x00e0
        L_0x00dc:
            r4 = r16
            r3 = r17
        L_0x00e0:
            int r5 = r2.g
            if (r5 == r10) goto L_0x00e6
            r6 = r8
            goto L_0x00e8
        L_0x00e6:
            r6 = r16
        L_0x00e8:
            if (r6 == 0) goto L_0x00f4
            sze r7 = r14.u0
            qze r5 = r7.a(r5)
            int r7 = r5.a
            int r4 = r4 + r7
            goto L_0x00f6
        L_0x00f4:
            r5 = r17
        L_0x00f6:
            oy5[] r7 = new defpackage.oy5[r4]
            int[] r4 = new int[r4]
            if (r29 == 0) goto L_0x0107
            oy5[] r3 = r3.c
            r3 = r3[r16]
            r7[r16] = r3
            r3 = 5
            r4[r16] = r3
            r3 = r8
            goto L_0x0109
        L_0x0107:
            r3 = r16
        L_0x0109:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            if (r6 == 0) goto L_0x0129
            r6 = r16
        L_0x0112:
            int r8 = r5.a
            if (r6 >= r8) goto L_0x0128
            oy5[] r8 = r5.c
            r8 = r8[r6]
            r7[r3] = r8
            r18 = 3
            r4[r3] = r18
            r10.add(r8)
            r8 = 1
            int r3 = r3 + r8
            int r6 = r6 + 1
            goto L_0x0112
        L_0x0128:
            r8 = 1
        L_0x0129:
            h14 r3 = r14.F0
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x013e
            if (r29 == 0) goto L_0x013e
            e4b r3 = r14.x0
            c4b r5 = new c4b
            java.lang.Object r6 = r3.Z
            n64 r6 = (defpackage.n64) r6
            r5.<init>(r3, r6)
            r6 = r5
            goto L_0x0140
        L_0x013e:
            r6 = r17
        L_0x0140:
            ey1 r3 = r14.b
            ko7 r5 = r14.s0
            h14 r8 = r14.F0
            r32 = r9
            c8d r9 = r14.Y
            r33 = r11
            int r11 = r14.G0
            int[] r12 = r2.a
            int r13 = r2.b
            r35 = r6
            r34 = r7
            long r6 = r14.Z
            y0f r0 = r14.c
            java.lang.Object r3 = r3.b
            p24 r3 = (defpackage.p24) r3
            r24 r3 = r3.a()
            if (r0 == 0) goto L_0x0167
            r3.N(r0)
        L_0x0167:
            f94 r0 = new f94
            r18 = r0
            r19 = r5
            r20 = r8
            r21 = r9
            r22 = r11
            r23 = r12
            r24 = r1
            r25 = r13
            r26 = r3
            r27 = r6
            r30 = r10
            r31 = r35
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31)
            s13 r13 = new s13
            int r2 = r2.b
            n64 r7 = r14.t0
            sr4 r10 = r14.o
            kr4 r11 = r14.A0
            buc r12 = r14.X
            gk8 r8 = r14.z0
            r1 = r13
            r3 = r4
            r4 = r34
            r5 = r0
            r0 = r35
            r6 = r37
            r19 = r8
            r18 = r32
            r8 = r42
            r36 = r33
            r15 = r13
            r13 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            monitor-enter(r37)
            java.util.IdentityHashMap r1 = r14.y0     // Catch:{ all -> 0x01b6 }
            r1.put(r15, r0)     // Catch:{ all -> 0x01b6 }
            monitor-exit(r37)     // Catch:{ all -> 0x01b6 }
            r0 = r40
            r1 = r15
            r0[r18] = r1
            goto L_0x01ee
        L_0x01b6:
            r0 = move-exception
            monitor-exit(r37)     // Catch:{ all -> 0x01b6 }
            throw r0
        L_0x01b9:
            r18 = r9
            r36 = r11
            r0 = r15
            r4 = 2
            if (r3 != r4) goto L_0x01ee
            java.util.List r3 = r14.H0
            int r2 = r2.d
            java.lang.Object r2 = r3.get(r2)
            j45 r2 = (defpackage.j45) r2
            qze r1 = r1.a()
            oy5[] r1 = r1.c
            r1 = r1[r16]
            f45 r3 = new f45
            h14 r4 = r14.F0
            boolean r4 = r4.d
            r3.<init>(r2, r1, r4)
            r0[r18] = r3
            goto L_0x01ee
        L_0x01df:
            r18 = r9
            r36 = r11
            r0 = r15
            boolean r3 = r2 instanceof defpackage.s13
            if (r3 == 0) goto L_0x01ee
            s13 r2 = (defpackage.s13) r2
            f94 r2 = r2.X
            r2.i = r1
        L_0x01ee:
            int r9 = r18 + 1
            r12 = r42
            r15 = r0
            r11 = r36
            r8 = 1
            r10 = -1
            r0 = r38
            goto L_0x00ab
        L_0x01fb:
            r36 = r11
            r0 = r15
            r1 = r38
            r2 = r16
        L_0x0202:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x0273
            r3 = r0[r2]
            if (r3 != 0) goto L_0x0268
            r3 = r1[r2]
            if (r3 == 0) goto L_0x0268
            r3 = r36
            r4 = r3[r2]
            n14[] r5 = r14.v0
            r4 = r5[r4]
            int r5 = r4.c
            r6 = 1
            if (r5 != r6) goto L_0x0264
            int r5 = r14.e(r2, r3)
            r7 = -1
            if (r5 != r7) goto L_0x022b
            rz4 r4 = new rz4
            r4.<init>()
            r0[r2] = r4
            r10 = r42
            goto L_0x026e
        L_0x022b:
            r5 = r0[r5]
            s13 r5 = (defpackage.s13) r5
            int r4 = r4.b
            r8 = r16
        L_0x0233:
            drc[] r9 = r5.y0
            int r10 = r9.length
            if (r8 >= r10) goto L_0x025e
            int[] r10 = r5.b
            r10 = r10[r8]
            if (r10 != r4) goto L_0x0259
            boolean[] r4 = r5.o
            boolean r10 = r4[r8]
            r10 = r10 ^ r6
            defpackage.np8.f(r10)
            r4[r8] = r6
            r4 = r9[r8]
            r10 = r42
            r4.A(r10, r6)
            o13 r4 = new o13
            r9 = r9[r8]
            r4.<init>(r5, r5, r9, r8)
            r0[r2] = r4
            goto L_0x026e
        L_0x0259:
            r10 = r42
            int r8 = r8 + 1
            goto L_0x0233
        L_0x025e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0264:
            r10 = r42
        L_0x0266:
            r7 = -1
            goto L_0x026e
        L_0x0268:
            r10 = r42
            r3 = r36
            r6 = 1
            goto L_0x0266
        L_0x026e:
            int r2 = r2 + 1
            r36 = r3
            goto L_0x0202
        L_0x0273:
            r10 = r42
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
            r4 = r16
        L_0x0282:
            if (r4 >= r3) goto L_0x029c
            r5 = r0[r4]
            boolean r6 = r5 instanceof defpackage.s13
            if (r6 == 0) goto L_0x0290
            s13 r5 = (defpackage.s13) r5
            r1.add(r5)
            goto L_0x0299
        L_0x0290:
            boolean r6 = r5 instanceof defpackage.f45
            if (r6 == 0) goto L_0x0299
            f45 r5 = (defpackage.f45) r5
            r2.add(r5)
        L_0x0299:
            int r4 = r4 + 1
            goto L_0x0282
        L_0x029c:
            int r0 = r1.size()
            s13[] r0 = new defpackage.s13[r0]
            r14.C0 = r0
            r1.toArray(r0)
            int r0 = r2.size()
            f45[] r0 = new defpackage.f45[r0]
            r14.D0 = r0
            r2.toArray(r0)
            mq9 r0 = r14.w0
            s13[] r1 = r14.C0
            r0.getClass()
            rxd r0 = new rxd
            r2 = 10
            r0.<init>(r2, r1)
            r14.E0 = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p14.L(m85[], boolean[], frc[], boolean[], long):long");
    }

    public final boolean a() {
        return this.E0.a();
    }

    public final void c(i6d i6d) {
        s13 s13 = (s13) i6d;
        this.B0.c(this);
    }

    public final int e(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        n14[] n14Arr = this.v0;
        int i3 = n14Arr[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && n14Arr[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    public final long f() {
        return this.E0.f();
    }

    public final void k() {
        this.s0.c();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final long l(long r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            s13[] r3 = r0.C0
            int r4 = r3.length
            r6 = 0
        L_0x0008:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            if (r6 >= r4) goto L_0x00fa
            r10 = r3[r6]
            r10.E0 = r1
            boolean r11 = r10.m()
            if (r11 == 0) goto L_0x0021
            r10.D0 = r1
            r16 = r6
        L_0x001e:
            r6 = 0
            goto L_0x00f5
        L_0x0021:
            r11 = 0
        L_0x0022:
            java.util.ArrayList r12 = r10.v0
            int r12 = r12.size()
            r13 = 0
            if (r11 >= r12) goto L_0x004a
            java.util.ArrayList r12 = r10.v0
            java.lang.Object r12 = r12.get(r11)
            yi0 r12 = (defpackage.yi0) r12
            long r14 = r12.Z
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            r16 = r6
            if (r14 != 0) goto L_0x0042
            long r5 = r12.v0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0042
            goto L_0x004d
        L_0x0042:
            if (r14 <= 0) goto L_0x0045
            goto L_0x004c
        L_0x0045:
            int r11 = r11 + 1
            r6 = r16
            goto L_0x0022
        L_0x004a:
            r16 = r6
        L_0x004c:
            r12 = r13
        L_0x004d:
            if (r12 == 0) goto L_0x0081
            drc r5 = r10.x0
            r6 = 0
            int r7 = r12.d(r6)
            monitor-enter(r5)
            monitor-enter(r5)     // Catch:{ all -> 0x0077 }
            r5.s = r6     // Catch:{ all -> 0x007c }
            xqc r6 = r5.a     // Catch:{ all -> 0x007c }
            java.lang.Object r8 = r6.f     // Catch:{ all -> 0x007c }
            qy r8 = (defpackage.qy) r8     // Catch:{ all -> 0x007c }
            r6.g = r8     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            int r6 = r5.q     // Catch:{ all -> 0x0077 }
            if (r7 < r6) goto L_0x0079
            int r8 = r5.p     // Catch:{ all -> 0x0077 }
            int r8 = r8 + r6
            if (r7 <= r8) goto L_0x006d
            goto L_0x0079
        L_0x006d:
            r11 = -9223372036854775808
            r5.t = r11     // Catch:{ all -> 0x0077 }
            int r7 = r7 - r6
            r5.s = r7     // Catch:{ all -> 0x0077 }
            monitor-exit(r5)
            r5 = r9
            goto L_0x0092
        L_0x0077:
            r0 = move-exception
            goto L_0x007f
        L_0x0079:
            monitor-exit(r5)
            r5 = 0
            goto L_0x0092
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x007f:
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            throw r0
        L_0x0081:
            drc r5 = r10.x0
            long r6 = r10.f()
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x008d
            r6 = r9
            goto L_0x008e
        L_0x008d:
            r6 = 0
        L_0x008e:
            boolean r5 = r5.A(r1, r6)
        L_0x0092:
            if (r5 == 0) goto L_0x00af
            drc r5 = r10.x0
            int r5 = r5.o()
            r6 = 0
            int r5 = r10.u(r5, r6)
            r10.F0 = r5
            drc[] r5 = r10.y0
            int r6 = r5.length
            r7 = 0
        L_0x00a5:
            if (r7 >= r6) goto L_0x001e
            r8 = r5[r7]
            r8.A(r1, r9)
            int r7 = r7 + 1
            goto L_0x00a5
        L_0x00af:
            r10.D0 = r1
            r5 = 0
            r10.H0 = r5
            java.util.ArrayList r6 = r10.v0
            r6.clear()
            r10.F0 = r5
            jo7 r5 = r10.t0
            boolean r5 = r5.o()
            if (r5 == 0) goto L_0x00dd
            drc r5 = r10.x0
            r5.i()
            drc[] r5 = r10.y0
            int r6 = r5.length
            r7 = 0
        L_0x00cc:
            if (r7 >= r6) goto L_0x00d6
            r8 = r5[r7]
            r8.i()
            int r7 = r7 + 1
            goto L_0x00cc
        L_0x00d6:
            jo7 r5 = r10.t0
            r5.a()
            goto L_0x001e
        L_0x00dd:
            jo7 r5 = r10.t0
            r5.c = r13
            drc r5 = r10.x0
            r6 = 0
            r5.z(r6)
            drc[] r5 = r10.y0
            int r7 = r5.length
            r8 = r6
        L_0x00eb:
            if (r8 >= r7) goto L_0x00f5
            r9 = r5[r8]
            r9.z(r6)
            int r8 = r8 + 1
            goto L_0x00eb
        L_0x00f5:
            int r5 = r16 + 1
            r6 = r5
            goto L_0x0008
        L_0x00fa:
            r6 = 0
            f45[] r0 = r0.D0
            int r3 = r0.length
            r5 = r6
        L_0x00ff:
            if (r5 >= r3) goto L_0x011c
            r4 = r0[r5]
            long[] r6 = r4.c
            int r6 = defpackage.maf.b(r6, r1, r9)
            r4.Z = r6
            boolean r10 = r4.o
            if (r10 == 0) goto L_0x0116
            long[] r10 = r4.c
            int r10 = r10.length
            if (r6 != r10) goto L_0x0116
            r10 = r1
            goto L_0x0117
        L_0x0116:
            r10 = r7
        L_0x0117:
            r4.s0 = r10
            int r5 = r5 + 1
            goto L_0x00ff
        L_0x011c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p14.l(long):long");
    }

    public final long n() {
        return -9223372036854775807L;
    }

    public final sze q() {
        return this.u0;
    }

    public final long r() {
        return this.E0.r();
    }

    public final void s(long j, boolean z) {
        long j2;
        for (s13 s13 : this.C0) {
            if (!s13.m()) {
                drc drc = s13.x0;
                int i = drc.q;
                drc.h(j, z, true);
                drc drc2 = s13.x0;
                int i2 = drc2.q;
                if (i2 > i) {
                    synchronized (drc2) {
                        j2 = drc2.p == 0 ? Long.MIN_VALUE : drc2.n[drc2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        drc[] drcArr = s13.y0;
                        if (i3 >= drcArr.length) {
                            break;
                        }
                        drcArr[i3].h(j2, z, s13.o[i3]);
                        i3++;
                    }
                }
                int min = Math.min(s13.u(i2, 0), s13.F0);
                if (min > 0) {
                    maf.I(s13.v0, 0, min);
                    s13.F0 -= min;
                }
            }
        }
    }

    public final void t(long j) {
        this.E0.t(j);
    }
}
