package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: s48  reason: default package */
public final class s48 extends hdc {
    public final tg X;
    public final o20 Y;
    public final xp7 Z;
    public final t48 o;
    public final cq7 s0;
    public final jic t0;
    public boolean u0;

    public s48(Context context, t48 t48, tg tgVar, o20 o20, xp7 xp7, cq7 cq7) {
        this.o = t48;
        this.X = tgVar;
        this.Y = o20;
        this.Z = xp7;
        this.s0 = cq7;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(jtb.compose_view_item_height);
        this.t0 = dimensionPixelSize <= 0 ? null : new jic(0.0f, dimensionPixelSize, dimensionPixelSize, 12);
    }

    public final int j() {
        return this.Z.f.b();
    }

    public final long k(int i) {
        up7 up7;
        r4d i2 = this.Z.f.i(i);
        if (i2 == null || (up7 = i2.a) == null) {
            return 0;
        }
        return up7.b;
    }

    public final void r(dec dec, int i) {
        u48 u48 = (u48) dec;
        r4d i2 = this.Z.f.i(i);
        if (i2 != null) {
            boolean z = i2.e;
            boolean z2 = z != u48.P0;
            u48.P0 = z;
            u48.L0 = i2;
            hm9.m("u48", "Dispose", new Object[0]);
            SimpleDraweeView simpleDraweeView = u48.M0;
            simpleDraweeView.animate().cancel();
            dq7 dq7 = u48.Q0;
            if (dq7 != null) {
                dq7.a();
            }
            BitmapDrawable bitmapDrawable = null;
            u48.Q0 = null;
            cq7 cq7 = u48.K0;
            up7 up7 = i2.a;
            dq7 a = cq7.a(u48, up7);
            a.c();
            u48.Q0 = a;
            if (u48.I0) {
                tg tgVar = u48.F0;
                boolean z3 = z2 && tgVar.p();
                r4d r4d = u48.L0;
                if (r4d != null) {
                    simpleDraweeView.animate().cancel();
                    View view = u48.O0;
                    if (z3) {
                        if (r4d.e) {
                            simpleDraweeView.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.5f).setDuration(100).setInterpolator(tgVar.a.n());
                            view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(100).setInterpolator(tgVar.a.n());
                        } else {
                            simpleDraweeView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(100).setInterpolator(tgVar.a.n());
                            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).setInterpolator(tgVar.a.n());
                        }
                    } else if (r4d.e) {
                        simpleDraweeView.setScaleX(0.8f);
                        simpleDraweeView.setScaleY(0.8f);
                        simpleDraweeView.setAlpha(0.5f);
                        view.setScaleX(0.8f);
                        view.setScaleY(0.8f);
                    } else {
                        simpleDraweeView.setScaleX(1.0f);
                        simpleDraweeView.setScaleY(1.0f);
                        simpleDraweeView.setAlpha(1.0f);
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                    }
                }
            }
            if ((up7 instanceof j00) && !awa.b(i2.c, up7)) {
                bitmapDrawable = u48.H0.b(((j00) up7).u0, false);
            }
            ((la6) simpleDraweeView.getHierarchy()).i(bitmapDrawable, 1);
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        return new u48(LayoutInflater.from(viewGroup.getContext()).inflate(yyb.row_media_bar_selected, viewGroup, false), this.X, this.o, this.Y, this.u0, this.t0, this.s0);
    }

    public final void x(dec dec) {
        ((u48) dec).M0.animate().cancel();
    }
}
