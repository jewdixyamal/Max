package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import java.io.File;
import java.util.Locale;

/* renamed from: sme  reason: default package */
public class sme {
    public static final khe a0 = new khe(new xid(29));
    public static ase b0;
    public static final q0e c0;
    public static final w7c d0;
    public final int A;
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
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final Integer V;
    public final Integer W;
    public final Integer X;
    public final Integer Y;
    public final Integer Z;
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final t63 f;
    public final is0 g;
    public final is0 h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    static {
        q0e a2 = r0e.a((Object) null);
        c0 = a2;
        d0 = new w7c(a2);
    }

    public sme(String str, String str2, boolean z2, int i2, String str3, t63 t63, is0 is0, is0 is02) {
        this.a = str;
        this.b = str2;
        this.c = z2;
        this.d = i2;
        this.e = str3;
        this.f = t63;
        this.g = is0;
        this.h = is02;
        int i3 = t63.v;
        this.i = ote.b0(i3, 0.15f);
        this.j = z2 ? q2c.darkPopup : q2c.defaultPopup;
        this.k = t63.a;
        this.l = t63.b;
        this.m = t63.c;
        this.n = t63.e;
        this.o = t63.f;
        this.p = t63.Q;
        this.q = t63.R;
        this.r = t63.S;
        this.s = t63.h;
        this.t = t63.j;
        this.u = t63.k;
        this.v = t63.l;
        this.w = t63.m;
        this.x = t63.n;
        this.y = t63.o;
        this.z = t63.p;
        this.A = t63.q;
        this.B = t63.r;
        this.C = t63.s;
        this.D = t63.t;
        this.E = t63.u;
        this.F = i3;
        this.G = t63.w;
        this.H = t63.x;
        this.I = t63.y;
        this.J = t63.z;
        this.K = t63.A;
        this.L = t63.B;
        this.M = t63.C;
        this.N = t63.D;
        this.O = t63.E;
        this.P = t63.F;
        this.Q = t63.G;
        this.R = t63.H;
        this.S = t63.I;
        this.T = t63.J;
        this.U = t63.K;
        this.V = t63.L;
        this.W = t63.M;
        this.X = t63.N;
        this.Y = t63.O;
        this.Z = t63.P;
    }

    public static final boolean b(String str, boolean z2) {
        File file = new File(str);
        if (z2 && !file.isFile()) {
            return false;
        }
        if (!z2 || file.exists()) {
            return file.getName().toLowerCase(Locale.getDefault()).endsWith(".ttstyle");
        }
        return false;
    }

    public final RippleDrawable a() {
        return new RippleDrawable(ColorStateList.valueOf(this.i), (Drawable) null, (Drawable) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sme)) {
            return false;
        }
        sme sme = (sme) obj;
        if (tpa.f(this.a, sme.a) && tpa.f(this.b, sme.b) && this.c == sme.c && this.d == sme.d && tpa.f(this.e, sme.e)) {
            return tpa.f(this.f, sme.f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + rh4.d((ms2.d(rh4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c) + this.d) * 31, 31, this.e);
    }
}
