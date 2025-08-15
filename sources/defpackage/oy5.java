package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: oy5  reason: default package */
public final class oy5 implements su0 {
    public static final oy5 R0 = new oy5(new my5());
    public static final ig5 S0 = new ig5(16);
    public final long A0;
    public final int B0;
    public final int C0;
    public final float D0;
    public final int E0;
    public final float F0;
    public final byte[] G0;
    public final int H0;
    public final h63 I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public final int N0;
    public final int O0;
    public final int P0;
    public int Q0;
    public final int X;
    public final int Y;
    public final int Z;
    public final String a;
    public final String b;
    public final String c;
    public final int o;
    public final int s0;
    public final String t0;
    public final e99 u0;
    public final String v0;
    public final String w0;
    public final int x0;
    public final List y0;
    public final cr4 z0;

    public oy5(my5 my5) {
        this.a = my5.a;
        this.b = my5.b;
        this.c = maf.E(my5.c);
        this.o = my5.d;
        this.X = my5.e;
        int i = my5.f;
        this.Y = i;
        int i2 = my5.g;
        this.Z = i2;
        this.s0 = i2 != -1 ? i2 : i;
        this.t0 = my5.h;
        this.u0 = my5.i;
        this.v0 = my5.j;
        this.w0 = my5.k;
        this.x0 = my5.l;
        List list = my5.m;
        this.y0 = list == null ? Collections.emptyList() : list;
        cr4 cr4 = my5.n;
        this.z0 = cr4;
        this.A0 = my5.o;
        this.B0 = my5.p;
        this.C0 = my5.q;
        this.D0 = my5.r;
        int i3 = my5.s;
        int i4 = 0;
        this.E0 = i3 == -1 ? 0 : i3;
        float f = my5.t;
        this.F0 = f == -1.0f ? 1.0f : f;
        this.G0 = my5.u;
        this.H0 = my5.v;
        this.I0 = my5.w;
        this.J0 = my5.x;
        this.K0 = my5.y;
        this.L0 = my5.z;
        int i5 = my5.A;
        this.M0 = i5 == -1 ? 0 : i5;
        int i6 = my5.B;
        this.N0 = i6 != -1 ? i6 : i4;
        this.O0 = my5.C;
        int i7 = my5.D;
        if (i7 != 0 || cr4 == null) {
            this.P0 = i7;
        } else {
            this.P0 = 1;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [my5, java.lang.Object] */
    public final my5 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.o;
        obj.e = this.X;
        obj.f = this.Y;
        obj.g = this.Z;
        obj.h = this.t0;
        obj.i = this.u0;
        obj.j = this.v0;
        obj.k = this.w0;
        obj.l = this.x0;
        obj.m = this.y0;
        obj.n = this.z0;
        obj.o = this.A0;
        obj.p = this.B0;
        obj.q = this.C0;
        obj.r = this.D0;
        obj.s = this.E0;
        obj.t = this.F0;
        obj.u = this.G0;
        obj.v = this.H0;
        obj.w = this.I0;
        obj.x = this.J0;
        obj.y = this.K0;
        obj.z = this.L0;
        obj.A = this.M0;
        obj.B = this.N0;
        obj.C = this.O0;
        obj.D = this.P0;
        return obj;
    }

    public final int b() {
        int i;
        int i2 = this.B0;
        if (i2 == -1 || (i = this.C0) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean c(oy5 oy5) {
        List list = this.y0;
        if (list.size() != oy5.y0.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) oy5.y0.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final oy5 d(oy5 oy5) {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        oy5 oy52 = oy5;
        if (this == oy52) {
            return this;
        }
        int g = ha9.g(this.w0);
        String str3 = oy52.a;
        String str4 = oy52.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (!(g == 3 || g == 1) || (str = oy52.c) == null) {
            str = this.c;
        }
        int i4 = this.Y;
        if (i4 == -1) {
            i4 = oy52.Y;
        }
        int i5 = this.Z;
        if (i5 == -1) {
            i5 = oy52.Z;
        }
        String str5 = this.t0;
        if (str5 == null) {
            String q = maf.q(g, oy52.t0);
            if (maf.L(q).length == 1) {
                str5 = q;
            }
        }
        e99 e99 = oy52.u0;
        e99 e992 = this.u0;
        if (e992 != null) {
            if (e99 != null) {
                c99[] c99Arr = e99.a;
                if (c99Arr.length != 0) {
                    int i6 = maf.a;
                    c99[] c99Arr2 = e992.a;
                    Object[] copyOf = Arrays.copyOf(c99Arr2, c99Arr2.length + c99Arr.length);
                    System.arraycopy(c99Arr, 0, copyOf, c99Arr2.length, c99Arr.length);
                    e992 = new e99((c99[]) copyOf);
                }
            }
            e99 = e992;
        }
        float f = this.D0;
        if (f == -1.0f && g == 2) {
            f = oy52.D0;
        }
        int i7 = this.o | oy52.o;
        int i8 = this.X | oy52.X;
        ArrayList arrayList = new ArrayList();
        cr4 cr4 = oy52.z0;
        if (cr4 != null) {
            ar4[] ar4Arr = cr4.a;
            int length = ar4Arr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = length;
                ar4 ar4 = ar4Arr[i9];
                ar4[] ar4Arr2 = ar4Arr;
                if (ar4.X != null) {
                    arrayList.add(ar4);
                }
                i9++;
                length = i10;
                ar4Arr = ar4Arr2;
            }
            str2 = cr4.c;
        } else {
            str2 = null;
        }
        cr4 cr42 = this.z0;
        if (cr42 != null) {
            if (str2 == null) {
                str2 = cr42.c;
            }
            int size = arrayList.size();
            ar4[] ar4Arr3 = cr42.a;
            int length2 = ar4Arr3.length;
            int i11 = 0;
            while (true) {
                String str6 = str2;
                if (i11 >= length2) {
                    break;
                }
                ar4 ar42 = ar4Arr3[i11];
                ar4[] ar4Arr4 = ar4Arr3;
                if (ar42.X != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            i = size;
                            i2 = length2;
                            i3 = 1;
                            arrayList.add(ar42);
                            break;
                        }
                        i = size;
                        i2 = length2;
                        if (((ar4) arrayList.get(i12)).b.equals(ar42.b)) {
                            break;
                        }
                        i12++;
                        length2 = i2;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = length2;
                }
                i3 = 1;
                i11 += i3;
                str2 = str6;
                ar4Arr3 = ar4Arr4;
                length2 = i2;
                size = i;
            }
        }
        cr4 cr43 = arrayList.isEmpty() ? null : new cr4(str2, arrayList);
        my5 a2 = a();
        a2.a = str3;
        a2.b = str4;
        a2.c = str;
        a2.d = i7;
        a2.e = i8;
        a2.f = i4;
        a2.g = i5;
        a2.h = str5;
        a2.i = e99;
        a2.n = cr43;
        a2.r = f;
        return new oy5(a2);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || oy5.class != obj.getClass()) {
            return false;
        }
        oy5 oy5 = (oy5) obj;
        int i2 = this.Q0;
        if (i2 == 0 || (i = oy5.Q0) == 0 || i2 == i) {
            return this.o == oy5.o && this.X == oy5.X && this.Y == oy5.Y && this.Z == oy5.Z && this.x0 == oy5.x0 && this.A0 == oy5.A0 && this.B0 == oy5.B0 && this.C0 == oy5.C0 && this.E0 == oy5.E0 && this.H0 == oy5.H0 && this.J0 == oy5.J0 && this.K0 == oy5.K0 && this.L0 == oy5.L0 && this.M0 == oy5.M0 && this.N0 == oy5.N0 && this.O0 == oy5.O0 && this.P0 == oy5.P0 && Float.compare(this.D0, oy5.D0) == 0 && Float.compare(this.F0, oy5.F0) == 0 && maf.a(this.a, oy5.a) && maf.a(this.b, oy5.b) && maf.a(this.t0, oy5.t0) && maf.a(this.v0, oy5.v0) && maf.a(this.w0, oy5.w0) && maf.a(this.c, oy5.c) && Arrays.equals(this.G0, oy5.G0) && maf.a(this.u0, oy5.u0) && maf.a(this.I0, oy5.I0) && maf.a(this.z0, oy5.z0) && c(oy5);
        }
        return false;
    }

    public final int hashCode() {
        if (this.Q0 == 0) {
            int i = 0;
            String str = this.a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.o) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31;
            String str4 = this.t0;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            e99 e99 = this.u0;
            int hashCode5 = (hashCode4 + (e99 == null ? 0 : Arrays.hashCode(e99.a))) * 31;
            String str5 = this.v0;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.w0;
            if (str6 != null) {
                i = str6.hashCode();
            }
            this.Q0 = ((((((((((((((((Float.floatToIntBits(this.F0) + ((((Float.floatToIntBits(this.D0) + ((((((((((hashCode6 + i) * 31) + this.x0) * 31) + ((int) this.A0)) * 31) + this.B0) * 31) + this.C0) * 31)) * 31) + this.E0) * 31)) * 31) + this.H0) * 31) + this.J0) * 31) + this.K0) * 31) + this.L0) * 31) + this.M0) * 31) + this.N0) * 31) + this.O0) * 31) + this.P0;
        }
        return this.Q0;
    }

    public final String toString() {
        String str = this.a;
        int e = rh4.e(104, str);
        String str2 = this.b;
        int e2 = rh4.e(e, str2);
        String str3 = this.v0;
        int e3 = rh4.e(e2, str3);
        String str4 = this.w0;
        int e4 = rh4.e(e3, str4);
        String str5 = this.t0;
        int e5 = rh4.e(e4, str5);
        String str6 = this.c;
        StringBuilder sb = new StringBuilder(rh4.e(e5, str6));
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(this.s0);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(this.B0);
        sb.append(", ");
        sb.append(this.C0);
        sb.append(", ");
        sb.append(this.D0);
        sb.append("], [");
        sb.append(this.J0);
        sb.append(", ");
        return zr6.j(sb, this.K0, "])");
    }
}
