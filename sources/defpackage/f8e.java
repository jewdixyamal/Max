package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f8e  reason: default package */
public final class f8e extends jdc {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f8e(Object obj, RecyclerView recyclerView, int i) {
        this.a = i;
        this.c = obj;
        this.b = recyclerView;
    }

    public void a() {
        switch (this.a) {
            case 0:
                h8e.i((h8e) this.c);
                return;
            default:
                return;
        }
    }

    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                h8e.i((h8e) this.c);
                return;
            default:
                return;
        }
    }

    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                h8e.i((h8e) this.c);
                return;
            default:
                super.c(i, i2, obj);
                return;
        }
    }

    public final void d(int i, int i2) {
        switch (this.a) {
            case 0:
                Class<f8e> cls = f8e.class;
                String name = cls.getName();
                RecyclerView recyclerView = this.b;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, name, ey8.j("onItemRangeInserted start. isComputingLayout:", recyclerView.Z()), (Throwable) null);
                }
                h8e.i((h8e) this.c);
                String name2 = cls.getName();
                RecyclerView recyclerView2 = this.b;
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    ir62.d(us7.X, name2, ey8.j("onItemRangeInserted end. isComputingLayout:", recyclerView2.Z()), (Throwable) null);
                    return;
                }
                return;
            default:
                if (i == 0) {
                    zwe.h0((zwe) this.c, this.b);
                    return;
                }
                return;
        }
    }

    public final void e(int i, int i2) {
        switch (this.a) {
            case 0:
                h8e.i((h8e) this.c);
                return;
            default:
                if (i == 0 || i2 == 0) {
                    zwe.h0((zwe) this.c, this.b);
                    return;
                }
                return;
        }
    }

    public final void f(int i, int i2) {
        switch (this.a) {
            case 0:
                h8e.i((h8e) this.c);
                return;
            default:
                if (i == 0) {
                    zwe.h0((zwe) this.c, this.b);
                    return;
                }
                return;
        }
    }
}
