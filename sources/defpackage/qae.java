package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: qae  reason: default package */
public final class qae extends wq8 implements SubMenu {
    public final wq8 K0;
    public final br8 L0;

    public qae(Context context, wq8 wq8, br8 br8) {
        super(context);
        this.K0 = wq8;
        this.L0 = br8;
    }

    public final boolean d(br8 br8) {
        return this.K0.d(br8);
    }

    public final boolean e(wq8 wq8, MenuItem menuItem) {
        return super.e(wq8, menuItem) || this.K0.e(wq8, menuItem);
    }

    public final boolean f(br8 br8) {
        return this.K0.f(br8);
    }

    public final MenuItem getItem() {
        return this.L0;
    }

    public final String j() {
        br8 br8 = this.L0;
        int i = br8 != null ? br8.a : 0;
        if (i == 0) {
            return null;
        }
        return zr6.h(i, "android:menu:actionviewstates:");
    }

    public final wq8 k() {
        return this.K0.k();
    }

    public final boolean m() {
        return this.K0.m();
    }

    public final boolean n() {
        return this.K0.n();
    }

    public final boolean o() {
        return this.K0.o();
    }

    public final void setGroupDividerEnabled(boolean z) {
        this.K0.setGroupDividerEnabled(z);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        u(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.L0.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z) {
        this.K0.setQwertyMode(z);
    }

    public final SubMenu setHeaderIcon(int i) {
        u(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        u(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.L0.setIcon(i);
        return this;
    }
}
