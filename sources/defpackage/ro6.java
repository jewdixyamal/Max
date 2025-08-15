package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: ro6  reason: default package */
public final class ro6 {
    public int a;
    public boolean b;
    public int c;
    public vi6[] d;
    public int e;
    public int f;
    public int g;
    public final boolean h = true;
    public final bt0 i;

    public ro6(bt0 bt0) {
        this.i = bt0;
        this.a = Integer.MAX_VALUE;
        this.c = 4096;
        this.d = new vi6[8];
        this.e = 7;
    }

    public final void a(int i2) {
        int i3;
        if (i2 > 0) {
            int length = this.d.length - 1;
            int i4 = 0;
            while (true) {
                i3 = this.e;
                if (length < i3 || i2 <= 0) {
                    vi6[] vi6Arr = this.d;
                    int i5 = i3 + 1;
                    System.arraycopy(vi6Arr, i5, vi6Arr, i5 + i4, this.f);
                    vi6[] vi6Arr2 = this.d;
                    int i6 = this.e + 1;
                    Arrays.fill(vi6Arr2, i6, i6 + i4, (Object) null);
                    this.e += i4;
                } else {
                    int i7 = this.d[length].a;
                    i2 -= i7;
                    this.g -= i7;
                    this.f--;
                    i4++;
                    length--;
                }
            }
            vi6[] vi6Arr3 = this.d;
            int i52 = i3 + 1;
            System.arraycopy(vi6Arr3, i52, vi6Arr3, i52 + i4, this.f);
            vi6[] vi6Arr22 = this.d;
            int i62 = this.e + 1;
            Arrays.fill(vi6Arr22, i62, i62 + i4, (Object) null);
            this.e += i4;
        }
    }

    public final void b(vi6 vi6) {
        int i2 = this.c;
        int i3 = vi6.a;
        if (i3 > i2) {
            ys.c0(this.d, (Object) null);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i3) - i2);
        int i4 = this.f + 1;
        vi6[] vi6Arr = this.d;
        if (i4 > vi6Arr.length) {
            vi6[] vi6Arr2 = new vi6[(vi6Arr.length * 2)];
            System.arraycopy(vi6Arr, 0, vi6Arr2, vi6Arr.length, vi6Arr.length);
            this.e = this.d.length - 1;
            this.d = vi6Arr2;
        }
        int i5 = this.e;
        this.e = i5 - 1;
        this.d[i5] = vi6;
        this.f++;
        this.g += i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: byte} */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, bt0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.aw0 r13) {
        /*
            r12 = this;
            r0 = 8
            boolean r1 = r12.h
            bt0 r2 = r12.i
            r3 = 127(0x7f, float:1.78E-43)
            r4 = 0
            if (r1 == 0) goto L_0x008d
            int[] r1 = defpackage.cr6.a
            int r1 = r13.c()
            r5 = 0
            r7 = r4
            r8 = r5
        L_0x0015:
            if (r7 >= r1) goto L_0x0028
            byte r10 = r13.f(r7)
            byte[] r11 = defpackage.naf.a
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte[] r11 = defpackage.cr6.b
            byte r10 = r11[r10]
            long r10 = (long) r10
            long r8 = r8 + r10
            int r7 = r7 + 1
            goto L_0x0015
        L_0x0028:
            r1 = 7
            long r10 = (long) r1
            long r8 = r8 + r10
            r1 = 3
            long r7 = r8 >> r1
            int r1 = (int) r7
            int r7 = r13.c()
            if (r1 >= r7) goto L_0x008d
            bt0 r1 = new bt0
            r1.<init>()
            int[] r7 = defpackage.cr6.a
            int r7 = r13.c()
            r8 = r5
            r5 = r4
        L_0x0042:
            if (r4 >= r7) goto L_0x0065
            byte r6 = r13.f(r4)
            byte[] r10 = defpackage.naf.a
            r6 = r6 & 255(0xff, float:3.57E-43)
            int[] r10 = defpackage.cr6.a
            r10 = r10[r6]
            byte[] r11 = defpackage.cr6.b
            byte r6 = r11[r6]
            long r8 = r8 << r6
            long r10 = (long) r10
            long r8 = r8 | r10
            int r5 = r5 + r6
        L_0x0058:
            if (r5 < r0) goto L_0x0062
            int r5 = r5 - r0
            long r10 = r8 >> r5
            int r6 = (int) r10
            r1.u0(r6)
            goto L_0x0058
        L_0x0062:
            int r4 = r4 + 1
            goto L_0x0042
        L_0x0065:
            if (r5 <= 0) goto L_0x0073
            int r0 = r0 - r5
            long r6 = r8 << r0
            r8 = 255(0xff, double:1.26E-321)
            long r4 = r8 >>> r5
            long r4 = r4 | r6
            int r13 = (int) r4
            r1.u0(r13)
        L_0x0073:
            long r4 = r1.b
            aw0 r13 = r1.e(r4)
            int r0 = r13.c()
            r1 = 128(0x80, float:1.794E-43)
            r12.e(r0, r3, r1)
            r2.getClass()
            int r12 = r13.c()
            r13.k(r2, r12)
            goto L_0x009e
        L_0x008d:
            int r0 = r13.c()
            r12.e(r0, r3, r4)
            r2.getClass()
            int r12 = r13.c()
            r13.k(r2, r12)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro6.c(aw0):void");
    }

    public final void d(ArrayList arrayList) {
        int i2;
        int i3;
        if (this.b) {
            int i4 = this.a;
            if (i4 < this.c) {
                e(i4, 31, 32);
            }
            this.b = false;
            this.a = Integer.MAX_VALUE;
            e(this.c, 31, 32);
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            vi6 vi6 = (vi6) arrayList.get(i5);
            aw0 i6 = vi6.b.i();
            Integer num = (Integer) so6.b.get(i6);
            aw0 aw0 = vi6.c;
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && 7 >= i2) {
                    vi6[] vi6Arr = so6.a;
                    if (tpa.f(vi6Arr[intValue].c, aw0)) {
                        i3 = i2;
                    } else if (tpa.f(vi6Arr[i2].c, aw0)) {
                        int i7 = i2;
                        i2 = intValue + 2;
                        i3 = i7;
                    }
                }
                i3 = i2;
                i2 = -1;
            } else {
                i3 = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i8 = this.e + 1;
                int length = this.d.length;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    if (tpa.f(this.d[i8].b, i6)) {
                        if (tpa.f(this.d[i8].c, aw0)) {
                            i2 = so6.a.length + (i8 - this.e);
                            break;
                        } else if (i3 == -1) {
                            i3 = (i8 - this.e) + so6.a.length;
                        }
                    }
                    i8++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i3 == -1) {
                this.i.u0(64);
                c(i6);
                c(aw0);
                b(vi6);
            } else {
                aw0 aw02 = vi6.d;
                i6.getClass();
                if (!i6.h(aw02.c(), aw02) || !(!tpa.f(vi6.i, i6))) {
                    e(i3, 63, 64);
                    c(aw0);
                    b(vi6);
                } else {
                    e(i3, 15, 0);
                    c(aw0);
                }
            }
        }
    }

    public final void e(int i2, int i3, int i4) {
        bt0 bt0 = this.i;
        if (i2 < i3) {
            bt0.u0(i2 | i4);
            return;
        }
        bt0.u0(i4 | i3);
        int i5 = i2 - i3;
        while (i5 >= 128) {
            bt0.u0(128 | (i5 & 127));
            i5 >>>= 7;
        }
        bt0.u0(i5);
    }
}
