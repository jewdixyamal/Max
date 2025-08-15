package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.a;

/* renamed from: bna  reason: default package */
public final class bna extends ga7 {
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bna(a aVar, int i) {
        super(aVar);
        this.d = i;
    }

    public final int c(View view) {
        switch (this.d) {
            case 0:
                ((a) this.b).getClass();
                return a.E(view) + ((pdc) view.getLayoutParams()).rightMargin;
            default:
                ((a) this.b).getClass();
                return a.z(view) + ((pdc) view.getLayoutParams()).bottomMargin;
        }
    }

    public final int d(View view) {
        switch (this.d) {
            case 0:
                pdc pdc = (pdc) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.D(view) + pdc.leftMargin + pdc.rightMargin;
            default:
                pdc pdc2 = (pdc) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.C(view) + pdc2.topMargin + pdc2.bottomMargin;
        }
    }

    public final int e(View view) {
        switch (this.d) {
            case 0:
                pdc pdc = (pdc) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.C(view) + pdc.topMargin + pdc.bottomMargin;
            default:
                pdc pdc2 = (pdc) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.D(view) + pdc2.leftMargin + pdc2.rightMargin;
        }
    }

    public final int f(View view) {
        switch (this.d) {
            case 0:
                ((a) this.b).getClass();
                return a.B(view) - ((pdc) view.getLayoutParams()).leftMargin;
            default:
                ((a) this.b).getClass();
                return a.F(view) - ((pdc) view.getLayoutParams()).topMargin;
        }
    }

    public final int g() {
        switch (this.d) {
            case 0:
                return ((a) this.b).n;
            default:
                return ((a) this.b).o;
        }
    }

    public final int h() {
        switch (this.d) {
            case 0:
                a aVar = (a) this.b;
                return aVar.n - aVar.K();
            default:
                a aVar2 = (a) this.b;
                return aVar2.o - aVar2.I();
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return ((a) this.b).K();
            default:
                return ((a) this.b).I();
        }
    }

    public final int j() {
        switch (this.d) {
            case 0:
                return ((a) this.b).l;
            default:
                return ((a) this.b).m;
        }
    }

    public final int k() {
        switch (this.d) {
            case 0:
                return ((a) this.b).m;
            default:
                return ((a) this.b).l;
        }
    }

    public final int m() {
        switch (this.d) {
            case 0:
                return ((a) this.b).J();
            default:
                return ((a) this.b).L();
        }
    }

    public final int n() {
        switch (this.d) {
            case 0:
                a aVar = (a) this.b;
                return (aVar.n - aVar.J()) - aVar.K();
            default:
                a aVar2 = (a) this.b;
                return (aVar2.o - aVar2.L()) - aVar2.I();
        }
    }

    public final int p(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.c;
                ((a) this.b).P(rect, view);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.c;
                ((a) this.b).P(rect2, view);
                return rect2.bottom;
        }
    }

    public final int q(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.c;
                ((a) this.b).P(rect, view);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.c;
                ((a) this.b).P(rect2, view);
                return rect2.top;
        }
    }

    public final void r(int i) {
        switch (this.d) {
            case 0:
                ((a) this.b).T(i);
                return;
            default:
                ((a) this.b).U(i);
                return;
        }
    }
}
