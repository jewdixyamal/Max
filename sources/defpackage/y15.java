package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: y15  reason: default package */
public final class y15 extends jdc {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public y15(dxc dxc, RecyclerView recyclerView, hdc hdc) {
        this.b = dxc;
        this.c = recyclerView;
        this.d = hdc;
    }

    public void a() {
        switch (this.a) {
            case 0:
                h();
                return;
            default:
                return;
        }
    }

    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                Class<y15> cls = y15.class;
                String name = cls.getName();
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.d;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, name, ey8.j("onItemRangeInserted start. isComputingLayout:", endlessRecyclerView2.Z()), (Throwable) null);
                }
                h();
                String name2 = cls.getName();
                EndlessRecyclerView2 endlessRecyclerView22 = (EndlessRecyclerView2) this.d;
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    ir62.d(us7.X, name2, ey8.j("onItemRangeInserted end. isComputingLayout:", endlessRecyclerView22.Z()), (Throwable) null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                h();
                return;
            default:
                super.c(i, i2, obj);
                return;
        }
    }

    public final void d(int i, int i2) {
        switch (this.a) {
            case 0:
                h();
                return;
            default:
                dxc dxc = (dxc) this.b;
                if (i2 == dxc.X && dxc.h0(dxc, (RecyclerView) this.c, i)) {
                    String str = ((dxc) this.b).Y;
                    RecyclerView recyclerView = (RecyclerView) this.c;
                    ir6 ir6 = hm9.m;
                    if (ir6 != null && ir6.c()) {
                        ir6.d(us7.X, str, ey8.j("onItemRangeInserted start. isComputingLayout:", recyclerView.Z()), (Throwable) null);
                    }
                    dxc.i0((dxc) this.b, (hdc) this.d);
                    String str2 = ((dxc) this.b).Y;
                    RecyclerView recyclerView2 = (RecyclerView) this.c;
                    ir6 ir62 = hm9.m;
                    if (ir62 != null && ir62.c()) {
                        ir62.d(us7.X, str2, ey8.j("onItemRangeInserted end. isComputingLayout:", recyclerView2.Z()), (Throwable) null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void e(int i, int i2) {
        switch (this.a) {
            case 0:
                h();
                return;
            default:
                dxc dxc = (dxc) this.b;
                int i3 = dxc.X;
                hdc hdc = (hdc) this.d;
                RecyclerView recyclerView = (RecyclerView) this.c;
                if (1 == i3 && dxc.h0(dxc, recyclerView, i)) {
                    dxc.i0(dxc, hdc);
                    return;
                } else if (1 == dxc.X && dxc.h0(dxc, recyclerView, i2)) {
                    dxc.i0(dxc, hdc);
                    return;
                } else {
                    return;
                }
        }
    }

    public final void f(int i, int i2) {
        switch (this.a) {
            case 0:
                h();
                return;
            default:
                dxc dxc = (dxc) this.b;
                if (i2 == dxc.X && dxc.h0(dxc, (RecyclerView) this.c, i)) {
                    dxc.i0(dxc, (hdc) this.d);
                    return;
                }
                return;
        }
    }

    public void h() {
        kp.x((EndlessRecyclerView2) this.d, (i76) this.c);
    }

    public y15(EndlessRecyclerView2 endlessRecyclerView2) {
        this.d = endlessRecyclerView2;
        this.b = new AtomicBoolean(true);
        this.c = new i76((Object) this, 3, (Object) endlessRecyclerView2);
    }
}
