package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: u82  reason: default package */
public final class u82 {
    public long A;
    public List B;
    public f92 C;
    public c92 D;
    public String E;
    public fm5 F;
    public int G;
    public String H;
    public List I;
    public int J;
    public z82 K;
    public long L;
    public boolean M;
    public boolean N;
    public boolean O;
    public long P;
    public int Q;
    public us R = new qpd(0);
    public int S;
    public k10 T;
    public long U;
    public int V;
    public long W;
    public int X;
    public long Y;
    public long Z;
    public long a;
    public List a0;
    public j92 b;
    public long b0;
    public i92 c;
    public long c0;
    public long d;
    public oq0 d0 = oq0.c;
    public Map e;
    public long e0;
    public long f;
    public uaa f0;
    public String g;
    public long g0;
    public String h;
    public long h0;
    public String i;
    public boolean i0;
    public long j;
    public Map j0;
    public long k;
    public long k0;
    public long l;
    public boolean l0;
    public int m;
    public g92 m0 = null;
    public e92 n = new e92();
    public long n0;
    public String o;
    public String o0;
    public b92 p;
    public long p0;
    public x82 q;
    public long q0;
    public x82 r;
    public int r0 = 2;
    public x82 s;
    public x82 t;
    public x82 u;
    public x82 v;
    public x82 w;
    public long x;
    public List y;
    public List z;

    public final void a(v82 v82) {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        this.B.add(v82);
    }

    public final k92 b() {
        return new k92(this);
    }

    public final List c() {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        return this.B;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [qpd, java.util.Map] */
    public final Map d() {
        if (this.e == null) {
            this.e = new qpd(2);
        }
        return this.e;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qpd, us] */
    /* JADX WARNING: type inference failed for: r3v1, types: [qpd, us] */
    public final void e(Map map) {
        if (map == null) {
            this.R = new qpd(2);
            return;
        }
        ? qpd = new qpd(map.size());
        this.R = qpd;
        qpd.putAll(map);
    }
}
