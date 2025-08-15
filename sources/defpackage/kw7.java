package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: kw7  reason: default package */
public final class kw7 implements t2e {
    public final /* synthetic */ int a;
    public final f4e b;
    public final FrameLayout c;

    public kw7(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                i2e i2e = new i2e(context);
                this.c = i2e;
                this.b = new f4e(i2e);
                return;
            case 2:
                a4g a4g = new a4g(context);
                this.c = a4g;
                this.b = new f4e(a4g);
                return;
            default:
                iw7 iw7 = new iw7(context);
                this.c = iw7;
                this.b = new f4e(iw7);
                return;
        }
    }

    private final void c(gw7 gw7) {
    }

    public final void a(z2e z2e) {
        switch (this.a) {
            case 0:
                f4e f4e = this.b;
                f4e.b(z2e);
                f4e.c();
                ((iw7) this.c).a(z2e, Math.max(350, f4e.b ? f4e.d : f4e.c));
                return;
            case 1:
                f4e f4e2 = this.b;
                f4e2.b(z2e);
                f4e2.c();
                ((i2e) this.c).a(z2e);
                return;
            default:
                f4e f4e3 = this.b;
                f4e3.b(z2e);
                f4e3.c();
                ((a4g) this.c).a(z2e, Math.max(350, f4e3.b ? f4e3.d : f4e3.c));
                return;
        }
    }

    public final void b(gw7 gw7) {
        switch (this.a) {
            case 0:
                ((iw7) this.c).b(gw7);
                return;
            case 1:
                return;
            default:
                ((a4g) this.c).b(gw7);
                return;
        }
    }

    public final void setParent(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                f4e f4e = this.b;
                iw7 iw7 = (iw7) this.c;
                iw7.setSizeConfigurator(f4e);
                viewGroup.addView(iw7, new ViewGroup.LayoutParams(-1, -1));
                return;
            case 1:
                f4e f4e2 = this.b;
                i2e i2e = (i2e) this.c;
                i2e.setSizeConfigurator(f4e2);
                viewGroup.addView(i2e, new ViewGroup.LayoutParams(-1, -1));
                return;
            default:
                f4e f4e3 = this.b;
                a4g a4g = (a4g) this.c;
                a4g.setSizeConfigurator(f4e3);
                viewGroup.addView(a4g, new ViewGroup.LayoutParams(-1, -1));
                return;
        }
    }
}
