package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q99  reason: default package */
public final class q99 extends uj0 implements Handler.Callback {
    public final j99 A0;
    public j47 B0;
    public boolean C0;
    public boolean D0;
    public long E0;
    public long F0;
    public e99 G0;
    public final vu4 x0;
    public final n75 y0;
    public final Handler z0;

    /* JADX WARNING: type inference failed for: r3v2, types: [j99, o54] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q99(n75 n75, Looper looper) {
        super(5);
        Handler handler;
        vu4 vu4 = vu4.o;
        this.y0 = n75;
        if (looper == null) {
            handler = null;
        } else {
            int i = maf.a;
            handler = new Handler(looper, this);
        }
        this.z0 = handler;
        this.x0 = vu4;
        this.A0 = new o54(1);
        this.F0 = -9223372036854775807L;
    }

    public final int A(oy5 oy5) {
        if (!this.x0.r(oy5)) {
            return uj0.b(0, 0, 0);
        }
        return uj0.b(oy5.P0 == 0 ? 4 : 2, 0, 0);
    }

    public final void C(e99 e99, ArrayList arrayList) {
        int i = 0;
        while (true) {
            c99[] c99Arr = e99.a;
            if (i < c99Arr.length) {
                oy5 k = c99Arr[i].k();
                if (k != null) {
                    vu4 vu4 = this.x0;
                    if (vu4.r(k)) {
                        j47 m = vu4.m(k);
                        byte[] o = c99Arr[i].o();
                        o.getClass();
                        j99 j99 = this.A0;
                        j99.v();
                        j99.x(o.length);
                        j99.o.put(o);
                        j99.y();
                        e99 v = m.v(j99);
                        if (v != null) {
                            C(v, arrayList);
                        }
                        i++;
                    }
                }
                arrayList.add(c99Arr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void D(e99 e99) {
        n75 n75 = this.y0;
        t75 t75 = n75.a;
        dd8 a = t75.j1.a();
        int i = 0;
        while (true) {
            c99[] c99Arr = e99.a;
            if (i >= c99Arr.length) {
                break;
            }
            c99Arr[i].p(a);
            i++;
        }
        t75.j1 = new fd8(a);
        fd8 Z1 = t75.Z1();
        boolean equals = Z1.equals(t75.V0);
        z23 z23 = t75.x0;
        if (!equals) {
            t75.V0 = Z1;
            z23.h(14, new q64(17, (Object) n75));
        }
        z23.h(28, new q64(19, (Object) e99));
        z23.e();
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            D((e99) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final String i() {
        return "MetadataRenderer";
    }

    public final boolean k() {
        return this.D0;
    }

    public final boolean l() {
        return true;
    }

    public final void m() {
        this.G0 = null;
        this.F0 = -9223372036854775807L;
        this.B0 = null;
    }

    public final void o(long j, boolean z) {
        this.G0 = null;
        this.F0 = -9223372036854775807L;
        this.C0 = false;
        this.D0 = false;
    }

    public final void s(oy5[] oy5Arr, long j, long j2) {
        this.B0 = this.x0.m(oy5Arr[0]);
    }

    public final void w(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.C0 && this.G0 == null) {
                j99 j99 = this.A0;
                j99.v();
                imc imc = this.b;
                imc.N();
                int v = v(imc, j99, 0);
                if (v == -4) {
                    if (j99.f(4)) {
                        this.C0 = true;
                    } else {
                        j99.u0 = this.E0;
                        j99.y();
                        j47 j47 = this.B0;
                        int i = maf.a;
                        e99 v2 = j47.v(j99);
                        if (v2 != null) {
                            ArrayList arrayList = new ArrayList(v2.a.length);
                            C(v2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.G0 = new e99((List) arrayList);
                                this.F0 = j99.Y;
                            }
                        }
                    }
                } else if (v == -5) {
                    oy5 oy5 = (oy5) imc.c;
                    oy5.getClass();
                    this.E0 = oy5.A0;
                }
            }
            e99 e99 = this.G0;
            if (e99 == null || this.F0 > j) {
                z = false;
            } else {
                Handler handler = this.z0;
                if (handler != null) {
                    handler.obtainMessage(0, e99).sendToTarget();
                } else {
                    D(e99);
                }
                this.G0 = null;
                this.F0 = -9223372036854775807L;
                z = true;
            }
            if (this.C0 && this.G0 == null) {
                this.D0 = true;
            }
        }
    }
}
