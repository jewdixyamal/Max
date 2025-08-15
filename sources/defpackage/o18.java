package defpackage;

import android.content.res.ColorStateList;

/* renamed from: o18  reason: default package */
public final class o18 extends mn {
    public static final int u0 = m2c.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] v0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public ColorStateList s0;
    public boolean t0;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.s0 == null) {
            int z = mr0.z(this, tsb.colorControlActivated);
            int z2 = mr0.z(this, tsb.colorOnSurface);
            int z3 = mr0.z(this, tsb.colorSurface);
            this.s0 = new ColorStateList(v0, new int[]{mr0.N(z3, 1.0f, z), mr0.N(z3, 0.54f, z2), mr0.N(z3, 0.38f, z2), mr0.N(z3, 0.38f, z2)});
        }
        return this.s0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.t0 && fd3.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.t0 = z;
        if (z) {
            fd3.c(this, getMaterialThemeColorsTintList());
        } else {
            fd3.c(this, (ColorStateList) null);
        }
    }
}
