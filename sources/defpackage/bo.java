package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: bo  reason: default package */
public final class bo extends Spinner {
    public static final int[] w0 = {16843505};
    public final x8 a;
    public final Context b;
    public final rn c;
    public SpinnerAdapter o;
    public final boolean s0;
    public final ao t0;
    public int u0;
    public final Rect v0 = new Rect();

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r6 != null) goto L_0x004d;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bo(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            int r0 = defpackage.vsb.spinnerStyle
            r10.<init>(r11, r12, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r10.v0 = r1
            android.content.Context r1 = r10.getContext()
            defpackage.gse.a(r1, r10)
            int[] r1 = defpackage.p3c.Spinner
            r2 = 0
            k8g r1 = defpackage.k8g.x(r11, r12, r1, r0, r2)
            x8 r3 = new x8
            r3.<init>((android.view.View) r10)
            r10.a = r3
            int r3 = defpackage.p3c.Spinner_popupTheme
            java.lang.Object r4 = r1.b
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            int r3 = r4.getResourceId(r3, r2)
            if (r3 == 0) goto L_0x0035
            du3 r5 = new du3
            r5.<init>(r11, r3)
            r10.b = r5
            goto L_0x0037
        L_0x0035:
            r10.b = r11
        L_0x0037:
            r3 = -1
            r5 = 0
            int[] r6 = w0     // Catch:{ Exception -> 0x0053, all -> 0x0051 }
            android.content.res.TypedArray r6 = r11.obtainStyledAttributes(r12, r6, r0, r2)     // Catch:{ Exception -> 0x0053, all -> 0x0051 }
            boolean r7 = r6.hasValue(r2)     // Catch:{ Exception -> 0x005b, all -> 0x004a }
            if (r7 == 0) goto L_0x004d
            int r3 = r6.getInt(r2, r2)     // Catch:{ Exception -> 0x005b, all -> 0x004a }
            goto L_0x004d
        L_0x004a:
            r10 = move-exception
            r5 = r6
            goto L_0x0055
        L_0x004d:
            r6.recycle()
            goto L_0x005e
        L_0x0051:
            r10 = move-exception
            goto L_0x0055
        L_0x0053:
            r6 = r5
            goto L_0x005b
        L_0x0055:
            if (r5 == 0) goto L_0x005a
            r5.recycle()
        L_0x005a:
            throw r10
        L_0x005b:
            if (r6 == 0) goto L_0x005e
            goto L_0x004d
        L_0x005e:
            r6 = 1
            if (r3 == 0) goto L_0x009e
            if (r3 == r6) goto L_0x0064
            goto L_0x00ad
        L_0x0064:
            yn r3 = new yn
            android.content.Context r7 = r10.b
            r3.<init>(r10, r7, r12, r0)
            android.content.Context r7 = r10.b
            int[] r8 = defpackage.p3c.Spinner
            k8g r2 = defpackage.k8g.x(r7, r12, r8, r0, r2)
            int r7 = defpackage.p3c.Spinner_android_dropDownWidth
            java.lang.Object r8 = r2.b
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r9 = -2
            int r7 = r8.getLayoutDimension(r7, r9)
            r10.u0 = r7
            int r7 = defpackage.p3c.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r7 = r2.n(r7)
            r3.i(r7)
            int r7 = defpackage.p3c.Spinner_android_prompt
            java.lang.String r7 = r4.getString(r7)
            r3.L0 = r7
            r2.z()
            r10.t0 = r3
            rn r2 = new rn
            r2.<init>(r10, r10, r3)
            r10.c = r2
            goto L_0x00ad
        L_0x009e:
            un r2 = new un
            r2.<init>(r10)
            r10.t0 = r2
            int r3 = defpackage.p3c.Spinner_android_prompt
            java.lang.String r3 = r4.getString(r3)
            r2.c = r3
        L_0x00ad:
            int r2 = defpackage.p3c.Spinner_android_entries
            java.lang.CharSequence[] r2 = r4.getTextArray(r2)
            if (r2 == 0) goto L_0x00c5
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r11, r4, r2)
            int r11 = defpackage.zyb.support_simple_spinner_dropdown_item
            r3.setDropDownViewResource(r11)
            r10.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00c5:
            r1.z()
            r10.s0 = r6
            android.widget.SpinnerAdapter r11 = r10.o
            if (r11 == 0) goto L_0x00d3
            r10.setAdapter((android.widget.SpinnerAdapter) r11)
            r10.o = r5
        L_0x00d3:
            x8 r10 = r10.a
            r10.E(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.v0;
        drawable.getPadding(rect);
        return i2 + rect.left + rect.right;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.i();
        }
    }

    public int getDropDownHorizontalOffset() {
        ao aoVar = this.t0;
        return aoVar != null ? aoVar.c() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        ao aoVar = this.t0;
        return aoVar != null ? aoVar.o() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.t0 != null ? this.u0 : super.getDropDownWidth();
    }

    public final ao getInternalPopup() {
        return this.t0;
    }

    public Drawable getPopupBackground() {
        ao aoVar = this.t0;
        return aoVar != null ? aoVar.b() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.b;
    }

    public CharSequence getPrompt() {
        ao aoVar = this.t0;
        return aoVar != null ? aoVar.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        x8 x8Var = this.a;
        if (x8Var != null) {
            return x8Var.B();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x8 x8Var = this.a;
        if (x8Var != null) {
            return x8Var.C();
        }
        return null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ao aoVar = this.t0;
        if (aoVar != null && aoVar.a()) {
            aoVar.dismiss();
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.t0 != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        zn znVar = (zn) parcelable;
        super.onRestoreInstanceState(znVar.getSuperState());
        if (znVar.a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new sn(0, this));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, zn] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        ao aoVar = this.t0;
        baseSavedState.a = aoVar != null && aoVar.a();
        return baseSavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rn rnVar = this.c;
        if (rnVar == null || !rnVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        ao aoVar = this.t0;
        if (aoVar == null) {
            return super.performClick();
        }
        if (aoVar.a()) {
            return true;
        }
        this.t0.n(getTextDirection(), getTextAlignment());
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.H();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.I(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        ao aoVar = this.t0;
        if (aoVar != null) {
            aoVar.m(i);
            aoVar.d(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        ao aoVar = this.t0;
        if (aoVar != null) {
            aoVar.l(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.t0 != null) {
            this.u0 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        ao aoVar = this.t0;
        if (aoVar != null) {
            aoVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(s36.n(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        ao aoVar = this.t0;
        if (aoVar != null) {
            aoVar.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.O(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.P(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.widget.ListAdapter, vn, java.lang.Object] */
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.s0) {
            this.o = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        ao aoVar = this.t0;
        if (aoVar != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ? obj = new Object();
            obj.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                tn.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            aoVar.p(obj);
        }
    }
}
