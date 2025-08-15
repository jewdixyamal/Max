package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: y6  reason: default package */
public final class y6 implements vde {
    public int A0 = 16;
    public int X = 4096;
    public char Y;
    public int Z = 4096;
    public CharSequence a;
    public CharSequence b;
    public Intent c;
    public char o;
    public Drawable s0;
    public final Context t0;
    public CharSequence u0;
    public CharSequence v0;
    public ColorStateList w0 = null;
    public PorterDuff.Mode x0 = null;
    public boolean y0 = false;
    public boolean z0 = false;

    public y6(Context context, CharSequence charSequence) {
        this.t0 = context;
        this.a = charSequence;
    }

    public final vde a(k7 k7Var) {
        throw new UnsupportedOperationException();
    }

    public final k7 b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.s0;
        if (drawable == null) {
            return;
        }
        if (this.y0 || this.z0) {
            this.s0 = drawable;
            Drawable mutate = drawable.mutate();
            this.s0 = mutate;
            if (this.y0) {
                aq4.h(mutate, this.w0);
            }
            if (this.z0) {
                aq4.i(this.s0, this.x0);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.Z;
    }

    public final char getAlphabeticShortcut() {
        return this.Y;
    }

    public final CharSequence getContentDescription() {
        return this.u0;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.s0;
    }

    public final ColorStateList getIconTintList() {
        return this.w0;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.x0;
    }

    public final Intent getIntent() {
        return this.c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.X;
    }

    public final char getNumericShortcut() {
        return this.o;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        return charSequence != null ? charSequence : this.a;
    }

    public final CharSequence getTooltipText() {
        return this.v0;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.A0 & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.A0 & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.A0 & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.A0 & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.Y = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.A0 = z | (this.A0 & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.A0 = (z ? 2 : 0) | (this.A0 & -3);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final vde m53setContentDescription(CharSequence charSequence) {
        this.u0 = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.A0 = (z ? 16 : 0) | (this.A0 & -17);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.s0 = drawable;
        c();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.w0 = colorStateList;
        this.y0 = true;
        c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.x0 = mode;
        this.z0 = true;
        c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.o = c2;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.o = c2;
        this.Y = Character.toLowerCase(c3);
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final vde m54setTooltipText(CharSequence charSequence) {
        this.v0 = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.A0 & 8;
        if (z) {
            i = 0;
        }
        this.A0 = i2 | i;
        return this;
    }

    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.Y = Character.toLowerCase(c2);
        this.Z = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.u0 = charSequence;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i) {
        this.o = c2;
        this.X = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.a = this.t0.getResources().getString(i);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.v0 = charSequence;
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.s0 = kt3.b(this.t0, i);
        c();
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.o = c2;
        this.X = KeyEvent.normalizeMetaState(i);
        this.Y = Character.toLowerCase(c3);
        this.Z = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
