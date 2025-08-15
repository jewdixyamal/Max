package defpackage;

import android.view.MenuItem;

/* renamed from: er8  reason: default package */
public final class er8 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ fr8 b;

    public er8(fr8 fr8, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = fr8;
        this.a = onActionExpandListener;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.M(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.M(menuItem));
    }
}
