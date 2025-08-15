package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* renamed from: r99  reason: default package */
public final class r99 extends vj0 implements Handler.Callback {
    public final ob6 C0;
    public final o75 D0;
    public final Handler E0;
    public final k99 F0;
    public nd7 G0;
    public boolean H0;
    public boolean I0;
    public long J0;
    public f99 K0;
    public long L0;

    /* JADX WARNING: type inference failed for: r3v2, types: [k99, p54] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r99(o75 o75, Looper looper) {
        super(5);
        Handler handler;
        ob6 ob6 = ob6.X;
        this.D0 = o75;
        if (looper == null) {
            handler = null;
        } else {
            int i = oaf.a;
            handler = new Handler(looper, this);
        }
        this.E0 = handler;
        this.C0 = ob6;
        this.F0 = new p54(1);
        this.L0 = -9223372036854775807L;
    }

    public final int D(qy5 qy5) {
        if (!this.C0.n(qy5)) {
            return vj0.b(0, 0, 0, 0);
        }
        return vj0.b(qy5.K == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void F(f99 f99, ArrayList arrayList) {
        int i = 0;
        while (true) {
            d99[] d99Arr = f99.a;
            if (i < d99Arr.length) {
                qy5 k = d99Arr[i].k();
                if (k != null) {
                    ob6 ob6 = this.C0;
                    if (ob6.n(k)) {
                        nd7 c = ob6.c(k);
                        byte[] o = d99Arr[i].o();
                        o.getClass();
                        k99 k99 = this.F0;
                        k99.v();
                        k99.x(o.length);
                        k99.X.put(o);
                        k99.y();
                        f99 m = c.m(k99);
                        if (m != null) {
                            F(m, arrayList);
                        }
                        i++;
                    }
                }
                arrayList.add(d99Arr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final long G(long j) {
        boolean z = false;
        fm9.k(j != -9223372036854775807L);
        if (this.L0 != -9223372036854775807L) {
            z = true;
        }
        fm9.k(z);
        return j - this.L0;
    }

    public final void H(f99 f99) {
        o75 o75 = this.D0;
        u75 u75 = o75.a;
        ed8 a = u75.q1.a();
        int i = 0;
        while (true) {
            d99[] d99Arr = f99.a;
            if (i >= d99Arr.length) {
                break;
            }
            d99Arr[i].w(a);
            i++;
        }
        u75.q1 = a.a();
        gd8 b2 = u75.b2();
        boolean equals = b2.equals(u75.Y0);
        pm7 pm7 = u75.x0;
        if (!equals) {
            u75.Y0 = b2;
            pm7.c(14, new q64(18, (Object) o75));
        }
        pm7.c(28, new q64(20, (Object) f99));
        pm7.b();
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            H((f99) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final String k() {
        return "MetadataRenderer";
    }

    public final boolean m() {
        return this.I0;
    }

    public final boolean o() {
        return true;
    }

    public final void p() {
        this.K0 = null;
        this.G0 = null;
        this.L0 = -9223372036854775807L;
    }

    public final void r(long j, boolean z) {
        this.K0 = null;
        this.H0 = false;
        this.I0 = false;
    }

    public final void x(qy5[] qy5Arr, long j, long j2) {
        this.G0 = this.C0.c(qy5Arr[0]);
        f99 f99 = this.K0;
        if (f99 != null) {
            long j3 = this.L0;
            long j4 = f99.b;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                f99 = new f99(j5, f99.a);
            }
            this.K0 = f99;
        }
        this.L0 = j2;
    }

    public final void z(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.H0 && this.K0 == null) {
                k99 k99 = this.F0;
                k99.v();
                y7g y7g = this.c;
                y7g.t();
                int y = y(y7g, k99, 0);
                if (y == -4) {
                    if (k99.f(4)) {
                        this.H0 = true;
                    } else if (k99.Z >= this.w0) {
                        k99.v0 = this.J0;
                        k99.y();
                        nd7 nd7 = this.G0;
                        int i = oaf.a;
                        f99 m = nd7.m(k99);
                        if (m != null) {
                            ArrayList arrayList = new ArrayList(m.a.length);
                            F(m, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.K0 = new f99(G(k99.Z), (d99[]) arrayList.toArray(new d99[0]));
                            }
                        }
                    }
                } else if (y == -5) {
                    qy5 qy5 = (qy5) y7g.c;
                    qy5.getClass();
                    this.J0 = qy5.s;
                }
            }
            f99 f99 = this.K0;
            if (f99 == null || f99.b > G(j)) {
                z = false;
            } else {
                f99 f992 = this.K0;
                Handler handler = this.E0;
                if (handler != null) {
                    handler.obtainMessage(1, f992).sendToTarget();
                } else {
                    H(f992);
                }
                this.K0 = null;
                z = true;
            }
            if (this.H0 && this.K0 == null) {
                this.I0 = true;
            }
        }
    }
}
