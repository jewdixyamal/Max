package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: ejc  reason: default package */
public final class ejc implements hw1 {
    public final hw1 b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ejc(hw1 hw1) {
        this(hw1, (byte) 0);
        this.c = 0;
        this.d = hw1;
    }

    public final void a() {
        this.b.a();
    }

    public bm7 b(float f) {
        switch (this.c) {
            case 0:
                return ((hw1) this.d).b(f);
            default:
                return q(f);
        }
    }

    public final void c(ce3 ce3) {
        this.b.c(ce3);
    }

    public bm7 d(float f) {
        switch (this.c) {
            case 0:
                return ((hw1) this.d).d(f);
            default:
                return r(f);
        }
    }

    public final Rect e() {
        return this.b.e();
    }

    public final void f(int i) {
        this.b.f(i);
    }

    public final void g(eu6 eu6) {
        this.b.g(eu6);
    }

    public bm7 h(bw4 bw4) {
        switch (this.c) {
            case 0:
                return ((hw1) this.d).h(bw4);
            default:
                return s(bw4);
        }
    }

    public bm7 i(ArrayList arrayList, int i, int i2) {
        switch (this.c) {
            case 1:
                boolean z = true;
                if (arrayList.size() != 1) {
                    z = false;
                }
                c54.j("Only support one capture config.", z);
                bm7 l = this.b.l(i, i2);
                b76 a = b76.a(l);
                f76 f76 = new f76(l, 2);
                ok4 k = ju0.k();
                a.getClass();
                return kq0.b(Collections.singletonList(kq0.K(kq0.K(kq0.K(a, f76, k), new ypc(this, 27, arrayList), ju0.k()), new f76(l, 3), ju0.k())));
            default:
                return t(arrayList, i, i2);
        }
    }

    public final void j(bad bad) {
        this.b.j(bad);
    }

    public bm7 k(boolean z) {
        switch (this.c) {
            case 0:
                return ((hw1) this.d).k(z);
            default:
                return p(z);
        }
    }

    public final bm7 l(int i, int i2) {
        return this.b.l(i, i2);
    }

    public final ce3 m() {
        return this.b.m();
    }

    public final void n() {
        this.b.n();
    }

    public final void o() {
        this.b.o();
    }

    public final bm7 p(boolean z) {
        return this.b.k(z);
    }

    public final bm7 q(float f) {
        return this.b.b(f);
    }

    public final bm7 r(float f) {
        return this.b.d(f);
    }

    public final bm7 s(bw4 bw4) {
        return this.b.h(bw4);
    }

    public final bm7 t(ArrayList arrayList, int i, int i2) {
        return this.b.i(arrayList, i, i2);
    }

    public ejc(hw1 hw1, byte b2) {
        this.b = hw1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ejc(hw1 hw1, bqc bqc) {
        this(hw1, (byte) 0);
        this.c = 1;
        this.d = bqc;
    }
}
