package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: qy5  reason: default package */
public final class qy5 {
    public static final qy5 M = new ny5().a();
    public static final String N = Integer.toString(0, 36);
    public static final String O = Integer.toString(1, 36);
    public static final String P = Integer.toString(2, 36);
    public static final String Q = Integer.toString(3, 36);
    public static final String R = Integer.toString(4, 36);
    public static final String S = Integer.toString(5, 36);
    public static final String T = Integer.toString(6, 36);
    public static final String U = Integer.toString(7, 36);
    public static final String V = Integer.toString(8, 36);
    public static final String W = Integer.toString(9, 36);
    public static final String X = Integer.toString(10, 36);
    public static final String Y = Integer.toString(11, 36);
    public static final String Z = Integer.toString(12, 36);
    public static final String a0 = Integer.toString(13, 36);
    public static final String b0 = Integer.toString(14, 36);
    public static final String c0 = Integer.toString(15, 36);
    public static final String d0 = Integer.toString(16, 36);
    public static final String e0 = Integer.toString(17, 36);
    public static final String f0 = Integer.toString(18, 36);
    public static final String g0 = Integer.toString(19, 36);
    public static final String h0 = Integer.toString(20, 36);
    public static final String i0 = Integer.toString(21, 36);
    public static final String j0 = Integer.toString(22, 36);
    public static final String k0 = Integer.toString(23, 36);
    public static final String l0 = Integer.toString(24, 36);
    public static final String m0 = Integer.toString(25, 36);
    public static final String n0 = Integer.toString(26, 36);
    public static final String o0 = Integer.toString(27, 36);
    public static final String p0 = Integer.toString(28, 36);
    public static final String q0 = Integer.toString(29, 36);
    public static final String r0 = Integer.toString(30, 36);
    public static final String s0 = Integer.toString(31, 36);
    public static final String t0 = Integer.toString(32, 36);
    public final i63 A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public int L;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final f99 k;
    public final Object l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final dr4 r;
    public final long s;
    public final int t;
    public final int u;
    public final float v;
    public final int w;
    public final float x;
    public final byte[] y;
    public final int z;

    public qy5(ny5 ny5) {
        boolean z2;
        String str;
        this.a = ny5.a;
        String T2 = oaf.T(ny5.d);
        this.d = T2;
        int i2 = 0;
        if (ny5.c.isEmpty() && ny5.b != null) {
            this.c = zw6.n(new od7(T2, ny5.b));
            this.b = ny5.b;
        } else if (ny5.c.isEmpty() || ny5.b != null) {
            if (!ny5.c.isEmpty() || ny5.b != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= ny5.c.size()) {
                        z2 = false;
                        break;
                    } else if (((od7) ny5.c.get(i3)).b.equals(ny5.b)) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            z2 = true;
            fm9.k(z2);
            this.c = ny5.c;
            this.b = ny5.b;
        } else {
            List list = ny5.c;
            this.c = list;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((od7) list.get(0)).b;
                    break;
                }
                od7 od7 = (od7) it.next();
                if (TextUtils.equals(od7.a, T2)) {
                    str = od7.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = ny5.e;
        this.f = ny5.f;
        int i4 = ny5.g;
        this.g = i4;
        int i5 = ny5.h;
        this.h = i5;
        this.i = i5 != -1 ? i5 : i4;
        this.j = ny5.i;
        this.k = ny5.j;
        this.l = ny5.k;
        this.m = ny5.l;
        this.n = ny5.m;
        this.o = ny5.n;
        this.p = ny5.o;
        List list2 = ny5.p;
        this.q = list2 == null ? Collections.emptyList() : list2;
        dr4 dr4 = ny5.q;
        this.r = dr4;
        this.s = ny5.r;
        this.t = ny5.s;
        this.u = ny5.t;
        this.v = ny5.u;
        int i6 = ny5.v;
        this.w = i6 == -1 ? 0 : i6;
        float f2 = ny5.w;
        this.x = f2 == -1.0f ? 1.0f : f2;
        this.y = ny5.x;
        this.z = ny5.y;
        this.A = ny5.z;
        this.B = ny5.A;
        this.C = ny5.B;
        this.D = ny5.C;
        int i7 = ny5.D;
        this.E = i7 == -1 ? 0 : i7;
        int i8 = ny5.E;
        this.F = i8 != -1 ? i8 : i2;
        this.G = ny5.F;
        this.H = ny5.G;
        this.I = ny5.H;
        this.J = ny5.I;
        int i9 = ny5.J;
        if (i9 != 0 || dr4 == null) {
            this.K = i9;
        } else {
            this.K = 1;
        }
    }

    public static String e(qy5 qy5) {
        String str;
        String str2;
        int i2;
        if (qy5 == null) {
            return "null";
        }
        StringBuilder l2 = au1.l("id=");
        l2.append(qy5.a);
        l2.append(", mimeType=");
        l2.append(qy5.n);
        String str3 = qy5.m;
        if (str3 != null) {
            l2.append(", container=");
            l2.append(str3);
        }
        int i3 = qy5.i;
        if (i3 != -1) {
            l2.append(", bitrate=");
            l2.append(i3);
        }
        String str4 = qy5.j;
        if (str4 != null) {
            l2.append(", codecs=");
            l2.append(str4);
        }
        dr4 dr4 = qy5.r;
        if (dr4 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i4 = 0; i4 < dr4.o; i4++) {
                UUID uuid = dr4.a[i4].b;
                if (uuid.equals(ew0.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(ew0.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(ew0.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(ew0.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(ew0.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            l2.append(", drm=[");
            new o97(String.valueOf(','), 0).a(l2, linkedHashSet.iterator());
            l2.append(']');
        }
        int i5 = qy5.t;
        if (!(i5 == -1 || (i2 = qy5.u) == -1)) {
            l2.append(", res=");
            l2.append(i5);
            l2.append("x");
            l2.append(i2);
        }
        i63 i63 = qy5.A;
        if (i63 != null) {
            int i6 = i63.f;
            int i7 = i63.e;
            if (!(i7 == -1 || i6 == -1) || i63.e()) {
                l2.append(", color=");
                if (i63.e()) {
                    String c2 = i63.c(i63.a);
                    String b2 = i63.b(i63.b);
                    String d2 = i63.d(i63.c);
                    int i8 = oaf.a;
                    Locale locale = Locale.US;
                    str = c2 + "/" + b2 + "/" + d2;
                } else {
                    str = "NA/NA/NA";
                }
                if (i7 == -1 || i6 == -1) {
                    str2 = "NA/NA";
                } else {
                    str2 = i7 + "/" + i6;
                }
                l2.append(str + "/" + str2);
            }
        }
        float f2 = qy5.v;
        if (f2 != -1.0f) {
            l2.append(", fps=");
            l2.append(f2);
        }
        int i9 = qy5.B;
        if (i9 != -1) {
            l2.append(", channels=");
            l2.append(i9);
        }
        int i10 = qy5.C;
        if (i10 != -1) {
            l2.append(", sample_rate=");
            l2.append(i10);
        }
        String str5 = qy5.d;
        if (str5 != null) {
            l2.append(", language=");
            l2.append(str5);
        }
        List list = qy5.c;
        if (!list.isEmpty()) {
            l2.append(", labels=[");
            new o97(String.valueOf(','), 0).a(l2, list.iterator());
            l2.append("]");
        }
        int i11 = qy5.e;
        if (i11 != 0) {
            l2.append(", selectionFlags=[");
            o97 o97 = new o97(String.valueOf(','), 0);
            int i12 = oaf.a;
            ArrayList arrayList = new ArrayList();
            if ((i11 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i11 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i11 & 2) != 0) {
                arrayList.add("forced");
            }
            o97.a(l2, arrayList.iterator());
            l2.append("]");
        }
        int i13 = qy5.f;
        if (i13 != 0) {
            l2.append(", roleFlags=[");
            o97 o972 = new o97(String.valueOf(','), 0);
            int i14 = oaf.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i13 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i13 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i13 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i13 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i13 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i13 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i13 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i13 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i13 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i13 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i13 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i13 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i13 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i13 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i13 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            o972.a(l2, arrayList2.iterator());
            l2.append("]");
        }
        Object obj = qy5.l;
        if (obj != null) {
            l2.append(", customData=");
            l2.append(obj);
        }
        return l2.toString();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ny5] */
    public final ny5 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.j;
        obj.j = this.k;
        obj.k = this.l;
        obj.l = this.m;
        obj.m = this.n;
        obj.n = this.o;
        obj.o = this.p;
        obj.p = this.q;
        obj.q = this.r;
        obj.r = this.s;
        obj.s = this.t;
        obj.t = this.u;
        obj.u = this.v;
        obj.v = this.w;
        obj.w = this.x;
        obj.x = this.y;
        obj.y = this.z;
        obj.z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.C = this.D;
        obj.D = this.E;
        obj.E = this.F;
        obj.F = this.G;
        obj.G = this.H;
        obj.H = this.I;
        obj.I = this.J;
        obj.J = this.K;
        return obj;
    }

    public final int b() {
        int i2;
        int i3 = this.t;
        if (i3 == -1 || (i2 = this.u) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public final boolean c(qy5 qy5) {
        List list = this.q;
        if (list.size() != qy5.q.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals((byte[]) list.get(i2), (byte[]) qy5.q.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final Bundle d(boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putString(N, this.a);
        bundle.putString(O, this.b);
        List<od7> list = this.c;
        ArrayList arrayList = new ArrayList(list.size());
        for (od7 od7 : list) {
            od7.getClass();
            Bundle bundle2 = new Bundle();
            String str = od7.a;
            if (str != null) {
                bundle2.putString(od7.c, str);
            }
            bundle2.putString(od7.d, od7.b);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(t0, arrayList);
        bundle.putString(P, this.d);
        bundle.putInt(Q, this.e);
        bundle.putInt(R, this.f);
        bundle.putInt(S, this.g);
        bundle.putInt(T, this.h);
        bundle.putString(U, this.j);
        if (!z2) {
            bundle.putParcelable(V, this.k);
        }
        bundle.putString(W, this.m);
        bundle.putString(X, this.n);
        bundle.putInt(Y, this.o);
        int i2 = 0;
        while (true) {
            List list2 = this.q;
            if (i2 >= list2.size()) {
                break;
            }
            bundle.putByteArray(Z + "_" + Integer.toString(i2, 36), (byte[]) list2.get(i2));
            i2++;
        }
        bundle.putParcelable(a0, this.r);
        bundle.putLong(b0, this.s);
        bundle.putInt(c0, this.t);
        bundle.putInt(d0, this.u);
        bundle.putFloat(e0, this.v);
        bundle.putInt(f0, this.w);
        bundle.putFloat(g0, this.x);
        bundle.putByteArray(h0, this.y);
        bundle.putInt(i0, this.z);
        i63 i63 = this.A;
        if (i63 != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt(i63.j, i63.a);
            bundle3.putInt(i63.k, i63.b);
            bundle3.putInt(i63.l, i63.c);
            bundle3.putByteArray(i63.m, i63.d);
            bundle3.putInt(i63.n, i63.e);
            bundle3.putInt(i63.o, i63.f);
            bundle.putBundle(j0, bundle3);
        }
        bundle.putInt(k0, this.B);
        bundle.putInt(l0, this.C);
        bundle.putInt(m0, this.D);
        bundle.putInt(n0, this.E);
        bundle.putInt(o0, this.F);
        bundle.putInt(p0, this.G);
        bundle.putInt(r0, this.I);
        bundle.putInt(s0, this.J);
        bundle.putInt(q0, this.K);
        return bundle;
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj == null || qy5.class != obj.getClass()) {
            return false;
        }
        qy5 qy5 = (qy5) obj;
        int i3 = this.L;
        if (i3 == 0 || (i2 = qy5.L) == 0 || i3 == i2) {
            return this.e == qy5.e && this.f == qy5.f && this.g == qy5.g && this.h == qy5.h && this.o == qy5.o && this.s == qy5.s && this.t == qy5.t && this.u == qy5.u && this.w == qy5.w && this.z == qy5.z && this.B == qy5.B && this.C == qy5.C && this.D == qy5.D && this.E == qy5.E && this.F == qy5.F && this.G == qy5.G && this.I == qy5.I && this.J == qy5.J && this.K == qy5.K && Float.compare(this.v, qy5.v) == 0 && Float.compare(this.x, qy5.x) == 0 && Objects.equals(this.a, qy5.a) && Objects.equals(this.b, qy5.b) && this.c.equals(qy5.c) && Objects.equals(this.j, qy5.j) && Objects.equals(this.m, qy5.m) && Objects.equals(this.n, qy5.n) && Objects.equals(this.d, qy5.d) && Arrays.equals(this.y, qy5.y) && Objects.equals(this.k, qy5.k) && Objects.equals(this.A, qy5.A) && Objects.equals(this.r, qy5.r) && c(qy5) && Objects.equals(this.l, qy5.l);
        }
        return false;
    }

    public final qy5 f(qy5 qy5) {
        String str;
        float f2;
        String str2;
        int i2;
        int i3;
        qy5 qy52 = qy5;
        if (this == qy52) {
            return this;
        }
        int g2 = ia9.g(this.n);
        String str3 = qy52.a;
        String str4 = qy52.b;
        if (str4 == null) {
            str4 = this.b;
        }
        List list = qy52.c;
        if (list.isEmpty()) {
            list = this.c;
        }
        if (!(g2 == 3 || g2 == 1) || (str = qy52.d) == null) {
            str = this.d;
        }
        int i4 = this.g;
        if (i4 == -1) {
            i4 = qy52.g;
        }
        int i5 = this.h;
        if (i5 == -1) {
            i5 = qy52.h;
        }
        String str5 = this.j;
        if (str5 == null) {
            String v2 = oaf.v(g2, qy52.j);
            if (oaf.e0(v2).length == 1) {
                str5 = v2;
            }
        }
        f99 f99 = qy52.k;
        f99 f992 = this.k;
        if (f992 != null) {
            f99 = f992.b(f99);
        }
        float f3 = this.v;
        if (f3 == -1.0f && g2 == 2) {
            f3 = qy52.v;
        }
        int i6 = this.e | qy52.e;
        int i7 = this.f | qy52.f;
        ArrayList arrayList = new ArrayList();
        dr4 dr4 = qy52.r;
        if (dr4 != null) {
            br4[] br4Arr = dr4.a;
            int length = br4Arr.length;
            f2 = f3;
            int i8 = 0;
            while (i8 < length) {
                int i9 = length;
                br4 br4 = br4Arr[i8];
                br4[] br4Arr2 = br4Arr;
                if (br4.X != null) {
                    arrayList.add(br4);
                }
                i8++;
                length = i9;
                br4Arr = br4Arr2;
            }
            str2 = dr4.c;
        } else {
            f2 = f3;
            str2 = null;
        }
        dr4 dr42 = this.r;
        if (dr42 != null) {
            if (str2 == null) {
                str2 = dr42.c;
            }
            int size = arrayList.size();
            br4[] br4Arr3 = dr42.a;
            int length2 = br4Arr3.length;
            int i10 = 0;
            while (true) {
                String str6 = str2;
                if (i10 >= length2) {
                    break;
                }
                br4 br42 = br4Arr3[i10];
                br4[] br4Arr4 = br4Arr3;
                if (br42.X != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            i2 = size;
                            i3 = length2;
                            arrayList.add(br42);
                            break;
                        }
                        i2 = size;
                        i3 = length2;
                        if (((br4) arrayList.get(i11)).b.equals(br42.b)) {
                            break;
                        }
                        i11++;
                        length2 = i3;
                        size = i2;
                    }
                } else {
                    i2 = size;
                    i3 = length2;
                }
                i10++;
                str2 = str6;
                br4Arr3 = br4Arr4;
                length2 = i3;
                size = i2;
            }
        }
        dr4 dr43 = arrayList.isEmpty() ? null : new dr4(str2, arrayList);
        ny5 a2 = a();
        a2.a = str3;
        a2.b = str4;
        a2.c = zw6.j(list);
        a2.d = str;
        a2.e = i6;
        a2.f = i7;
        a2.g = i4;
        a2.h = i5;
        a2.i = str5;
        a2.j = f99;
        a2.q = dr43;
        a2.u = f2;
        qy5 qy53 = qy5;
        a2.H = qy53.I;
        a2.I = qy53.J;
        return new qy5(a2);
    }

    public final int hashCode() {
        if (this.L == 0) {
            int i2 = 0;
            String str = this.a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
            String str4 = this.j;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            f99 f99 = this.k;
            int hashCode5 = (hashCode4 + (f99 == null ? 0 : f99.hashCode())) * 31;
            Object obj = this.l;
            int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.m;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            this.L = ((((((((((((((((((((Float.floatToIntBits(this.x) + ((((Float.floatToIntBits(this.v) + ((((((((((hashCode7 + i2) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.t) * 31) + this.u) * 31)) * 31) + this.w) * 31)) * 31) + this.z) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K;
        }
        return this.L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.t);
        sb.append(", ");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.A);
        sb.append("], [");
        sb.append(this.B);
        sb.append(", ");
        return zr6.j(sb, this.C, "])");
    }
}
