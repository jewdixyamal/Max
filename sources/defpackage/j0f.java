package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: j0f  reason: default package */
public class j0f {
    public static final j0f C = new j0f(new h0f());
    public static final String D = Integer.toString(1, 36);
    public static final String E = Integer.toString(2, 36);
    public static final String F = Integer.toString(3, 36);
    public static final String G = Integer.toString(4, 36);
    public static final String H = Integer.toString(5, 36);
    public static final String I = Integer.toString(6, 36);
    public static final String J = Integer.toString(7, 36);
    public static final String K = Integer.toString(8, 36);
    public static final String L = Integer.toString(9, 36);
    public static final String M = Integer.toString(10, 36);
    public static final String N = Integer.toString(11, 36);
    public static final String O = Integer.toString(12, 36);
    public static final String P = Integer.toString(13, 36);
    public static final String Q = Integer.toString(14, 36);
    public static final String R = Integer.toString(15, 36);
    public static final String S = Integer.toString(16, 36);
    public static final String T = Integer.toString(17, 36);
    public static final String U = Integer.toString(18, 36);
    public static final String V = Integer.toString(19, 36);
    public static final String W = Integer.toString(20, 36);
    public static final String X = Integer.toString(21, 36);
    public static final String Y = Integer.toString(22, 36);
    public static final String Z = Integer.toString(23, 36);
    public static final String a0 = Integer.toString(24, 36);
    public static final String b0 = Integer.toString(25, 36);
    public static final String c0 = Integer.toString(26, 36);
    public static final String d0 = Integer.toString(27, 36);
    public static final String e0 = Integer.toString(28, 36);
    public static final String f0 = Integer.toString(29, 36);
    public static final String g0 = Integer.toString(30, 36);
    public static final String h0 = Integer.toString(31, 36);
    public final cx6 A;
    public final jx6 B;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final zw6 l;
    public final int m;
    public final zw6 n;
    public final int o;
    public final int p;
    public final int q;
    public final zw6 r;
    public final f0f s;
    public final zw6 t;
    public final int u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        int i2 = oaf.a;
    }

    public j0f(h0f h0f) {
        this.a = h0f.a;
        this.b = h0f.b;
        this.c = h0f.c;
        this.d = h0f.d;
        this.e = h0f.e;
        this.f = h0f.f;
        this.g = h0f.g;
        this.h = h0f.h;
        this.i = h0f.i;
        this.j = h0f.j;
        this.k = h0f.k;
        this.l = h0f.l;
        this.m = h0f.m;
        this.n = h0f.n;
        this.o = h0f.o;
        this.p = h0f.p;
        this.q = h0f.q;
        this.r = h0f.r;
        this.s = h0f.s;
        this.t = h0f.t;
        this.u = h0f.u;
        this.v = h0f.v;
        this.w = h0f.w;
        this.x = h0f.x;
        this.y = h0f.y;
        this.z = h0f.z;
        this.A = cx6.b(h0f.A);
        this.B = jx6.j(h0f.B);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, h0f] */
    public static j0f b(Bundle bundle) {
        f0f f0f;
        ffc ffc;
        ? obj = new Object();
        j0f j0f = C;
        obj.a = bundle.getInt(I, j0f.a);
        obj.b = bundle.getInt(J, j0f.b);
        obj.c = bundle.getInt(K, j0f.c);
        obj.d = bundle.getInt(L, j0f.d);
        obj.e = bundle.getInt(M, j0f.e);
        obj.f = bundle.getInt(N, j0f.f);
        obj.g = bundle.getInt(O, j0f.g);
        obj.h = bundle.getInt(P, j0f.h);
        obj.i = bundle.getInt(Q, j0f.i);
        obj.j = bundle.getInt(R, j0f.j);
        obj.k = bundle.getBoolean(S, j0f.k);
        String[] stringArray = bundle.getStringArray(T);
        String[] strArr = new String[0];
        if (stringArray == null) {
            stringArray = strArr;
        }
        obj.l = zw6.k(stringArray);
        obj.m = bundle.getInt(b0, j0f.m);
        String[] stringArray2 = bundle.getStringArray(D);
        String[] strArr2 = new String[0];
        if (stringArray2 == null) {
            stringArray2 = strArr2;
        }
        obj.n = h0f.e(stringArray2);
        obj.o = bundle.getInt(E, j0f.o);
        obj.p = bundle.getInt(U, j0f.p);
        obj.q = bundle.getInt(V, j0f.q);
        String[] stringArray3 = bundle.getStringArray(W);
        String[] strArr3 = new String[0];
        if (stringArray3 == null) {
            stringArray3 = strArr3;
        }
        obj.r = zw6.k(stringArray3);
        Bundle bundle2 = bundle.getBundle(g0);
        if (bundle2 != null) {
            qk9 qk9 = new qk9();
            f0f f0f2 = f0f.d;
            qk9.a = bundle2.getInt(f0f.e, f0f2.a);
            qk9.b = bundle2.getBoolean(f0f.f, f0f2.b);
            qk9.c = bundle2.getBoolean(f0f.g, f0f2.c);
            f0f = new f0f(qk9);
        } else {
            qk9 qk92 = new qk9();
            f0f f0f3 = f0f.d;
            qk92.a = bundle.getInt(d0, f0f3.a);
            qk92.b = bundle.getBoolean(e0, f0f3.b);
            qk92.c = bundle.getBoolean(f0, f0f3.c);
            f0f = new f0f(qk92);
        }
        obj.s = f0f;
        String[] stringArray4 = bundle.getStringArray(F);
        String[] strArr4 = new String[0];
        if (stringArray4 == null) {
            stringArray4 = strArr4;
        }
        obj.t = h0f.e(stringArray4);
        obj.u = bundle.getInt(G, j0f.u);
        obj.v = bundle.getInt(c0, j0f.v);
        obj.w = bundle.getBoolean(H, j0f.w);
        obj.x = bundle.getBoolean(h0, j0f.x);
        obj.y = bundle.getBoolean(X, j0f.y);
        obj.z = bundle.getBoolean(Y, j0f.z);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Z);
        if (parcelableArrayList == null) {
            ffc = ffc.X;
        } else {
            ww6 i2 = zw6.i();
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle3 = (Bundle) parcelableArrayList.get(i3);
                bundle3.getClass();
                Bundle bundle4 = bundle3.getBundle(c0f.c);
                bundle4.getClass();
                rze b2 = rze.b(bundle4);
                int[] intArray = bundle3.getIntArray(c0f.d);
                intArray.getClass();
                i2.a(new c0f(b2, s5c.i(intArray)));
            }
            ffc = i2.j();
        }
        obj.A = new HashMap();
        for (int i4 = 0; i4 < ffc.o; i4++) {
            c0f c0f = (c0f) ffc.get(i4);
            obj.A.put(c0f.a, c0f);
        }
        int[] intArray2 = bundle.getIntArray(a0);
        int[] iArr = new int[0];
        if (intArray2 == null) {
            intArray2 = iArr;
        }
        obj.B = new HashSet();
        for (int valueOf : intArray2) {
            obj.B.add(Integer.valueOf(valueOf));
        }
        return new j0f(obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, h0f] */
    public h0f a() {
        ? obj = new Object();
        obj.d(this);
        return obj;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(I, this.a);
        bundle.putInt(J, this.b);
        bundle.putInt(K, this.c);
        bundle.putInt(L, this.d);
        bundle.putInt(M, this.e);
        bundle.putInt(N, this.f);
        bundle.putInt(O, this.g);
        bundle.putInt(P, this.h);
        bundle.putInt(Q, this.i);
        bundle.putInt(R, this.j);
        bundle.putBoolean(S, this.k);
        zw6 zw6 = this.l;
        bundle.putStringArray(T, (String[]) zw6.toArray(new String[0]));
        bundle.putInt(b0, this.m);
        bundle.putStringArray(D, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(E, this.o);
        bundle.putInt(U, this.p);
        bundle.putInt(V, this.q);
        bundle.putStringArray(W, (String[]) this.r.toArray(new String[0]));
        bundle.putStringArray(F, (String[]) this.t.toArray(new String[0]));
        bundle.putInt(G, this.u);
        bundle.putInt(c0, this.v);
        bundle.putBoolean(H, this.w);
        f0f f0f = this.s;
        bundle.putInt(d0, f0f.a);
        bundle.putBoolean(e0, f0f.b);
        bundle.putBoolean(f0, f0f.c);
        f0f.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f0f.e, f0f.a);
        bundle2.putBoolean(f0f.f, f0f.b);
        bundle2.putBoolean(f0f.g, f0f.c);
        bundle.putBundle(g0, bundle2);
        bundle.putBoolean(h0, this.x);
        bundle.putBoolean(X, this.y);
        bundle.putBoolean(Y, this.z);
        bundle.putParcelableArrayList(Z, nu0.R(this.A.values(), new hme(19)));
        bundle.putIntArray(a0, s5c.c0(this.B));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j0f j0f = (j0f) obj;
        if (this.a == j0f.a && this.b == j0f.b && this.c == j0f.c && this.d == j0f.d && this.e == j0f.e && this.f == j0f.f && this.g == j0f.g && this.h == j0f.h && this.k == j0f.k && this.i == j0f.i && this.j == j0f.j && this.l.equals(j0f.l) && this.m == j0f.m && this.n.equals(j0f.n) && this.o == j0f.o && this.p == j0f.p && this.q == j0f.q && this.r.equals(j0f.r) && this.s.equals(j0f.s) && this.t.equals(j0f.t) && this.u == j0f.u && this.v == j0f.v && this.w == j0f.w && this.x == j0f.x && this.y == j0f.y && this.z == j0f.z) {
            cx6 cx6 = this.A;
            cx6.getClass();
            if (ngg.q(cx6, j0f.A) && this.B.equals(j0f.B)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.l.hashCode();
        int hashCode2 = this.n.hashCode();
        int hashCode3 = this.r.hashCode();
        int hashCode4 = this.s.hashCode();
        int hashCode5 = this.t.hashCode();
        int hashCode6 = this.A.hashCode();
        return this.B.hashCode() + ((hashCode6 + ((((((((((((((hashCode5 + ((hashCode4 + ((hashCode3 + ((((((((hashCode2 + ((((hashCode + ((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.k ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31)) * 31) + this.m) * 31)) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31)) * 31)) * 31)) * 31) + this.u) * 31) + this.v) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31) + (this.z ? 1 : 0)) * 31)) * 31);
    }
}
