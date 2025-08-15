package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: c6g  reason: default package */
public final class c6g extends j7 implements uq8 {
    public i7 X;
    public WeakReference Y;
    public final /* synthetic */ d6g Z;
    public final Context c;
    public final wq8 o;

    public c6g(d6g d6g, Context context, imc imc) {
        this.Z = d6g;
        this.c = context;
        this.X = imc;
        wq8 wq8 = new wq8(context);
        wq8.w0 = 1;
        this.o = wq8;
        wq8.X = this;
    }

    public final void Q(wq8 wq8) {
        if (this.X != null) {
            g();
            e7 e7Var = this.Z.t0.o;
            if (e7Var != null) {
                e7Var.l();
            }
        }
    }

    public final void a() {
        d6g d6g = this.Z;
        if (d6g.w0 == this) {
            if (d6g.D0) {
                d6g.x0 = this;
                d6g.y0 = this.X;
            } else {
                this.X.l(this);
            }
            this.X = null;
            d6g.c0(false);
            ActionBarContextView actionBarContextView = d6g.t0;
            if (actionBarContextView.y0 == null) {
                actionBarContextView.e();
            }
            d6g.Y.setHideOnContentScrollEnabled(d6g.I0);
            d6g.w0 = null;
        }
    }

    public final View b() {
        WeakReference weakReference = this.Y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final wq8 c() {
        return this.o;
    }

    public final MenuInflater d() {
        return new ude(this.c);
    }

    public final CharSequence e() {
        return this.Z.t0.getSubtitle();
    }

    public final CharSequence f() {
        return this.Z.t0.getTitle();
    }

    public final void g() {
        if (this.Z.w0 == this) {
            wq8 wq8 = this.o;
            wq8.w();
            try {
                this.X.G(this, wq8);
            } finally {
                wq8.v();
            }
        }
    }

    public final boolean h() {
        return this.Z.t0.G0;
    }

    public final void i(View view) {
        this.Z.t0.setCustomView(view);
        this.Y = new WeakReference(view);
    }

    public final void j(int i) {
        k(this.Z.o.getResources().getString(i));
    }

    public final void k(CharSequence charSequence) {
        this.Z.t0.setSubtitle(charSequence);
    }

    public final void l(int i) {
        m(this.Z.o.getResources().getString(i));
    }

    public final void m(CharSequence charSequence) {
        this.Z.t0.setTitle(charSequence);
    }

    public final void n(boolean z) {
        this.a = z;
        this.Z.t0.setTitleOptional(z);
    }

    public final boolean z(wq8 wq8, MenuItem menuItem) {
        i7 i7Var = this.X;
        if (i7Var != null) {
            return i7Var.i(this, menuItem);
        }
        return false;
    }
}
