package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* renamed from: yn  reason: default package */
public final class yn extends wl7 implements ao {
    public CharSequence L0;
    public ListAdapter M0;
    public final Rect N0 = new Rect();
    public int O0;
    public final /* synthetic */ bo P0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yn(bo boVar, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.P0 = boVar;
        this.z0 = boVar;
        this.J0 = true;
        this.K0.setFocusable(true);
        this.A0 = new wn(0, this);
    }

    public final CharSequence e() {
        return this.L0;
    }

    public final void g(CharSequence charSequence) {
        this.L0 = charSequence;
    }

    public final void m(int i) {
        this.O0 = i;
    }

    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        ln lnVar = this.K0;
        boolean isShowing = lnVar.isShowing();
        s();
        this.K0.setInputMethodMode(2);
        f();
        es4 es4 = this.c;
        es4.setChoiceMode(1);
        es4.setTextDirection(i);
        es4.setTextAlignment(i2);
        bo boVar = this.P0;
        int selectedItemPosition = boVar.getSelectedItemPosition();
        es4 es42 = this.c;
        if (lnVar.isShowing() && es42 != null) {
            es42.setListSelectionHidden(false);
            es42.setSelection(selectedItemPosition);
            if (es42.getChoiceMode() != 0) {
                es42.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = boVar.getViewTreeObserver()) != null) {
            sn snVar = new sn(1, this);
            viewTreeObserver.addOnGlobalLayoutListener(snVar);
            this.K0.setOnDismissListener(new xn(this, snVar));
        }
    }

    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.M0 = listAdapter;
    }

    public final void s() {
        int i;
        ln lnVar = this.K0;
        Drawable background = lnVar.getBackground();
        bo boVar = this.P0;
        if (background != null) {
            background.getPadding(boVar.v0);
            int layoutDirection = boVar.getLayoutDirection();
            Rect rect = boVar.v0;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = boVar.v0;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = boVar.getPaddingLeft();
        int paddingRight = boVar.getPaddingRight();
        int width = boVar.getWidth();
        int i2 = boVar.u0;
        if (i2 == -2) {
            int a = boVar.a((SpinnerAdapter) this.M0, lnVar.getBackground());
            int i3 = boVar.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = boVar.v0;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (a > i4) {
                a = i4;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.Y = boVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.X) - this.O0) + i : paddingLeft + this.O0 + i;
    }
}
