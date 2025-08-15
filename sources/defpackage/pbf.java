package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: pbf  reason: default package */
public final class pbf extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public pbf(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        qbf qbf = new qbf();
        qbf.a = (VectorDrawable) this.a.newDrawable();
        return qbf;
    }

    public final Drawable newDrawable(Resources resources) {
        qbf qbf = new qbf();
        qbf.a = (VectorDrawable) this.a.newDrawable(resources);
        return qbf;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        qbf qbf = new qbf();
        qbf.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return qbf;
    }
}
