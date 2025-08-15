package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: cr8  reason: default package */
public final class cr8 extends k7 implements ActionProvider.VisibilityListener {
    public qqd b;
    public final ActionProvider c;
    public final /* synthetic */ fr8 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cr8(fr8 fr8, Context context, ActionProvider actionProvider) {
        super(context);
        this.d = fr8;
        this.c = actionProvider;
    }

    public final boolean a() {
        return this.c.hasSubMenu();
    }

    public final boolean b() {
        return this.c.isVisible();
    }

    public final View c() {
        return this.c.onCreateActionView();
    }

    public final View d(MenuItem menuItem) {
        return this.c.onCreateActionView(menuItem);
    }

    public final boolean e() {
        return this.c.onPerformDefaultAction();
    }

    public final void f(SubMenu subMenu) {
        this.d.getClass();
        this.c.onPrepareSubMenu(subMenu);
    }

    public final boolean g() {
        return this.c.overridesItemVisibility();
    }

    public final void h(qqd qqd) {
        this.b = qqd;
        this.c.setVisibilityListener(this);
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        qqd qqd = this.b;
        if (qqd != null) {
            wq8 wq8 = ((br8) qqd.b).y0;
            wq8.s0 = true;
            wq8.p(true);
        }
    }
}
