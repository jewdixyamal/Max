package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: l18  reason: default package */
public final class l18 extends AppCompatCheckBox {
    public static final int M0 = m2c.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[] N0 = {tsb.state_indeterminate};
    public static final int[] O0;
    public static final int[][] P0;
    public static final int Q0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public Drawable A0;
    public boolean B0;
    public ColorStateList C0;
    public ColorStateList D0;
    public PorterDuff.Mode E0;
    public int F0;
    public int[] G0;
    public boolean H0;
    public CharSequence I0;
    public CompoundButton.OnCheckedChangeListener J0;
    public final sf K0;
    public final rj0 L0;
    public final LinkedHashSet s0 = new LinkedHashSet();
    public final LinkedHashSet t0 = new LinkedHashSet();
    public ColorStateList u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public CharSequence y0;
    public Drawable z0;

    static {
        int i = tsb.state_error;
        O0 = new int[]{i};
        P0 = new int[][]{new int[]{16842910, i}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l18(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            int r6 = defpackage.tsb.checkboxStyle
            int r7 = M0
            android.content.Context r12 = defpackage.y18.a(r12, r13, r6, r7)
            r11.<init>(r12, r13, r6)
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            r11.s0 = r12
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            r11.t0 = r12
            android.content.Context r12 = r11.getContext()
            int r0 = defpackage.yub.mtrl_checkbox_button_checked_unchecked
            sf r1 = new sf
            r1.<init>(r12)
            android.content.res.Resources r2 = r12.getResources()
            android.content.res.Resources$Theme r12 = r12.getTheme()
            java.lang.ThreadLocal r3 = defpackage.vic.a
            android.graphics.drawable.Drawable r12 = defpackage.qic.a(r2, r0, r12)
            r1.a = r12
            pf r0 = r1.Y
            r12.setCallback(r0)
            rf r12 = new rf
            android.graphics.drawable.Drawable r0 = r1.a
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            r12.<init>((android.graphics.drawable.Drawable.ConstantState) r0)
            r11.K0 = r1
            rj0 r12 = new rj0
            r0 = 2
            r12.<init>(r11, r0)
            r11.L0 = r12
            android.content.Context r12 = r11.getContext()
            android.graphics.drawable.Drawable r0 = defpackage.gd3.a(r11)
            r11.z0 = r0
            android.content.res.ColorStateList r0 = r11.getSuperButtonTintList()
            r11.C0 = r0
            r8 = 0
            r11.setSupportButtonTintList(r8)
            int[] r9 = defpackage.z2c.MaterialCheckBox
            r10 = 0
            int[] r5 = new int[r10]
            defpackage.sre.a(r12, r13, r6, r7)
            r0 = r12
            r1 = r13
            r2 = r9
            r3 = r6
            r4 = r7
            defpackage.sre.b(r0, r1, r2, r3, r4, r5)
            k8g r0 = new k8g
            android.content.res.TypedArray r13 = r12.obtainStyledAttributes(r13, r9, r6, r7)
            r0.<init>((java.lang.Object) r12, (java.lang.Object) r13)
            int r1 = defpackage.z2c.MaterialCheckBox_buttonIcon
            android.graphics.drawable.Drawable r1 = r0.n(r1)
            r11.A0 = r1
            android.graphics.drawable.Drawable r1 = r11.z0
            r2 = 1
            if (r1 == 0) goto L_0x00bb
            int r1 = defpackage.tsb.isMaterial3Theme
            boolean r1 = defpackage.kq0.E(r1, r12, r10)
            if (r1 == 0) goto L_0x00bb
            int r1 = defpackage.z2c.MaterialCheckBox_android_button
            int r1 = r13.getResourceId(r1, r10)
            int r3 = defpackage.z2c.MaterialCheckBox_buttonCompat
            int r3 = r13.getResourceId(r3, r10)
            int r4 = Q0
            if (r1 != r4) goto L_0x00bb
            if (r3 != 0) goto L_0x00bb
            super.setButtonDrawable((android.graphics.drawable.Drawable) r8)
            int r1 = defpackage.yub.mtrl_checkbox_button
            android.graphics.drawable.Drawable r1 = defpackage.s36.n(r12, r1)
            r11.z0 = r1
            r11.B0 = r2
            android.graphics.drawable.Drawable r1 = r11.A0
            if (r1 != 0) goto L_0x00bb
            int r1 = defpackage.yub.mtrl_checkbox_button_icon
            android.graphics.drawable.Drawable r1 = defpackage.s36.n(r12, r1)
            r11.A0 = r1
        L_0x00bb:
            int r1 = defpackage.z2c.MaterialCheckBox_buttonIconTint
            android.content.res.ColorStateList r12 = defpackage.ju0.p(r12, r0, r1)
            r11.D0 = r12
            int r12 = defpackage.z2c.MaterialCheckBox_buttonIconTintMode
            r1 = -1
            int r12 = r13.getInt(r12, r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r12 = defpackage.mqd.A(r12, r1)
            r11.E0 = r12
            int r12 = defpackage.z2c.MaterialCheckBox_useMaterialThemeColors
            boolean r12 = r13.getBoolean(r12, r10)
            r11.v0 = r12
            int r12 = defpackage.z2c.MaterialCheckBox_centerIfNoTextEnabled
            boolean r12 = r13.getBoolean(r12, r2)
            r11.w0 = r12
            int r12 = defpackage.z2c.MaterialCheckBox_errorShown
            boolean r12 = r13.getBoolean(r12, r10)
            r11.x0 = r12
            int r12 = defpackage.z2c.MaterialCheckBox_errorAccessibilityLabel
            java.lang.CharSequence r12 = r13.getText(r12)
            r11.y0 = r12
            int r12 = defpackage.z2c.MaterialCheckBox_checkedState
            boolean r12 = r13.hasValue(r12)
            if (r12 == 0) goto L_0x0103
            int r12 = defpackage.z2c.MaterialCheckBox_checkedState
            int r12 = r13.getInt(r12, r10)
            r11.setCheckedState(r12)
        L_0x0103:
            r0.z()
            r11.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l18.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int i = this.F0;
        return i == 1 ? getResources().getString(wzb.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(wzb.mtrl_checkbox_state_description_unchecked) : getResources().getString(wzb.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.u0 == null) {
            int z = mr0.z(this, tsb.colorControlActivated);
            int z2 = mr0.z(this, tsb.colorError);
            int z3 = mr0.z(this, tsb.colorSurface);
            int z4 = mr0.z(this, tsb.colorOnSurface);
            this.u0 = new ColorStateList(P0, new int[]{mr0.N(z3, 1.0f, z2), mr0.N(z3, 1.0f, z), mr0.N(z3, 0.54f, z4), mr0.N(z3, 0.38f, z4), mr0.N(z3, 0.38f, z4)});
        }
        return this.u0;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.C0;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        h6 h6Var;
        Drawable drawable = this.z0;
        ColorStateList colorStateList3 = this.C0;
        PorterDuff.Mode b = fd3.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b != null) {
                aq4.i(drawable, b);
            }
        }
        this.z0 = drawable;
        Drawable drawable2 = this.A0;
        ColorStateList colorStateList4 = this.D0;
        PorterDuff.Mode mode = this.E0;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                aq4.i(drawable2, mode);
            }
        }
        this.A0 = drawable2;
        if (this.B0) {
            sf sfVar = this.K0;
            if (sfVar != null) {
                Drawable drawable3 = sfVar.a;
                rj0 rj0 = this.L0;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (rj0.a == null) {
                        rj0.a = new ke(rj0);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(rj0.a);
                }
                ArrayList arrayList = sfVar.X;
                qf qfVar = sfVar.b;
                if (!(arrayList == null || rj0 == null)) {
                    arrayList.remove(rj0);
                    if (sfVar.X.size() == 0 && (h6Var = sfVar.o) != null) {
                        qfVar.b.removeListener(h6Var);
                        sfVar.o = null;
                    }
                }
                Drawable drawable4 = sfVar.a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (rj0.a == null) {
                        rj0.a = new ke(rj0);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(rj0.a);
                } else if (rj0 != null) {
                    if (sfVar.X == null) {
                        sfVar.X = new ArrayList();
                    }
                    if (!sfVar.X.contains(rj0)) {
                        sfVar.X.add(rj0);
                        if (sfVar.o == null) {
                            sfVar.o = new h6(1, (Object) sfVar);
                        }
                        qfVar.b.addListener(sfVar.o);
                    }
                }
            }
            Drawable drawable5 = this.z0;
            if ((drawable5 instanceof AnimatedStateListDrawable) && sfVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(ivb.checked, ivb.unchecked, sfVar, false);
                ((AnimatedStateListDrawable) this.z0).addTransition(ivb.indeterminate, ivb.unchecked, sfVar, false);
            }
        }
        Drawable drawable6 = this.z0;
        if (!(drawable6 == null || (colorStateList2 = this.C0) == null)) {
            aq4.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.A0;
        if (!(drawable7 == null || (colorStateList = this.D0) == null)) {
            aq4.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.z0;
        Drawable drawable9 = this.A0;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                if (f >= ((float) drawable8.getIntrinsicWidth()) / ((float) drawable8.getIntrinsicHeight())) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (((float) intrinsicWidth2) / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * ((float) intrinsicHeight));
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    public Drawable getButtonDrawable() {
        return this.z0;
    }

    public Drawable getButtonIconDrawable() {
        return this.A0;
    }

    public ColorStateList getButtonIconTintList() {
        return this.D0;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.E0;
    }

    public ColorStateList getButtonTintList() {
        return this.C0;
    }

    public int getCheckedState() {
        return this.F0;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.y0;
    }

    public final boolean isChecked() {
        return this.F0 == 1;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.v0 && this.C0 == null && this.D0 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, N0);
        }
        if (this.x0) {
            View.mergeDrawableStates(onCreateDrawableState, O0);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            } else if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            } else {
                i2++;
            }
        }
        this.G0 = copyOf;
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        Drawable a;
        if (!this.w0 || !TextUtils.isEmpty(getText()) || (a = gd3.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a.getIntrinsicWidth()) / 2) * (mqd.t(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a.getBounds();
            aq4.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.x0) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.y0);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k18)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k18 k18 = (k18) parcelable;
        super.onRestoreInstanceState(k18.getSuperState());
        setCheckedState(k18.a);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, k18, android.os.Parcelable] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.a = getCheckedState();
        return baseSavedState;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(s36.n(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.A0 = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(s36.n(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            this.D0 = colorStateList;
            b();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.E0 != mode) {
            this.E0 = mode;
            b();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.C0 != colorStateList) {
            this.C0 = colorStateList;
            b();
        }
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.w0 = z;
    }

    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.F0 != i) {
            this.F0 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.I0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.H0) {
                this.H0 = true;
                LinkedHashSet linkedHashSet = this.t0;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        au1.r(it.next());
                        throw null;
                    }
                }
                if (!(this.F0 == 2 || (onCheckedChangeListener = this.J0) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
                if (autofillManager != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.H0 = false;
            }
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.y0 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.x0 != z) {
            this.x0 = z;
            refreshDrawableState();
            Iterator it = this.s0.iterator();
            if (it.hasNext()) {
                au1.r(it.next());
                throw null;
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.J0 = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.I0 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.v0 = z;
        if (z) {
            fd3.c(this, getMaterialThemeColorsTintList());
        } else {
            fd3.c(this, (ColorStateList) null);
        }
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public void setButtonDrawable(Drawable drawable) {
        this.z0 = drawable;
        this.B0 = false;
        b();
    }
}
