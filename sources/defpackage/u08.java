package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;

/* renamed from: u08  reason: default package */
public final class u08 extends jm {
    public final wl7 s0;
    public final AccessibilityManager t0;
    public final Rect u0 = new Rect();
    public final int v0;
    public final float w0;
    public ColorStateList x0;
    public int y0;
    public ColorStateList z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u08(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = defpackage.tsb.autoCompleteTextViewStyle
            r6 = 0
            android.content.Context r8 = defpackage.y18.a(r8, r9, r3, r6)
            r7.<init>(r8, r9, r3)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.u0 = r8
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.z2c.MaterialAutoCompleteTextView
            int r4 = defpackage.m2c.Widget_AppCompat_AutoCompleteTextView
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = defpackage.sre.d(r0, r1, r2, r3, r4, r5)
            int r0 = defpackage.z2c.MaterialAutoCompleteTextView_android_inputType
            boolean r0 = r9.hasValue(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0035
            int r0 = defpackage.z2c.MaterialAutoCompleteTextView_android_inputType
            int r0 = r9.getInt(r0, r6)
            if (r0 != 0) goto L_0x0035
            r7.setKeyListener(r1)
        L_0x0035:
            int r0 = defpackage.z2c.MaterialAutoCompleteTextView_simpleItemLayout
            int r2 = defpackage.vyb.mtrl_auto_complete_simple_item
            int r0 = r9.getResourceId(r0, r2)
            r7.v0 = r0
            int r0 = defpackage.z2c.MaterialAutoCompleteTextView_android_popupElevation
            int r2 = defpackage.stb.mtrl_exposed_dropdown_menu_popup_elevation
            int r0 = r9.getDimensionPixelOffset(r0, r2)
            float r0 = (float) r0
            r7.w0 = r0
            int r0 = defpackage.z2c.MaterialAutoCompleteTextView_dropDownBackgroundTint
            boolean r0 = r9.hasValue(r0)
            if (r0 == 0) goto L_0x005e
            int r0 = defpackage.z2c.MaterialAutoCompleteTextView_dropDownBackgroundTint
            int r0 = r9.getColor(r0, r6)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r7.x0 = r0
        L_0x005e:
            int r0 = defpackage.z2c.MaterialAutoCompleteTextView_simpleItemSelectedColor
            int r0 = r9.getColor(r0, r6)
            r7.y0 = r0
            int r0 = defpackage.z2c.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor
            android.content.res.ColorStateList r0 = defpackage.ju0.q(r8, r9, r0)
            r7.z0 = r0
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r7.t0 = r0
            wl7 r0 = new wl7
            int r2 = defpackage.vsb.listPopupWindowStyle
            r0.<init>(r8, r1, r2, r6)
            r7.s0 = r0
            r8 = 1
            r0.J0 = r8
            ln r1 = r0.K0
            r1.setFocusable(r8)
            r0.z0 = r7
            r8 = 2
            ln r1 = r0.K0
            r1.setInputMethodMode(r8)
            android.widget.ListAdapter r8 = r7.getAdapter()
            r0.p(r8)
            wn r8 = new wn
            r1 = 1
            r8.<init>(r1, r7)
            r0.A0 = r8
            int r8 = defpackage.z2c.MaterialAutoCompleteTextView_simpleItems
            boolean r8 = r9.hasValue(r8)
            if (r8 == 0) goto L_0x00b1
            int r8 = defpackage.z2c.MaterialAutoCompleteTextView_simpleItems
            int r8 = r9.getResourceId(r8, r6)
            r7.setSimpleItems((int) r8)
        L_0x00b1:
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u08.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void b(u08 u08, Object obj) {
        u08.setText(u08.convertSelectionToString(obj), false);
    }

    public final TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.t0;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (!(accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null)) {
                for (AccessibilityServiceInfo next : enabledAccessibilityServiceList) {
                    if (next.getSettingsActivityName() == null || !next.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void dismissDropDown() {
        if (d()) {
            this.s0.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.x0;
    }

    public CharSequence getHint() {
        TextInputLayout c = c();
        return (c == null || !c.S0) ? super.getHint() : c.getHint();
    }

    public float getPopupElevation() {
        return this.w0;
    }

    public int getSimpleItemSelectedColor() {
        return this.y0;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.z0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c = c();
        if (c != null && c.S0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s0.dismiss();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout c = c();
            int i3 = 0;
            if (!(adapter == null || c == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                wl7 wl7 = this.s0;
                int min = Math.min(adapter.getCount(), Math.max(0, !wl7.K0.isShowing() ? -1 : wl7.c.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, c);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable background = wl7.K0.getBackground();
                if (background != null) {
                    Rect rect = this.u0;
                    background.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = c.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        if (!d()) {
            super.onWindowFocusChanged(z);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.s0.p(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        wl7 wl7 = this.s0;
        if (wl7 != null) {
            wl7.i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.x0 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof q18) {
            ((q18) dropDownBackground).l(this.x0);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.s0.B0 = getOnItemSelectedListener();
    }

    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout c = c();
        if (c != null) {
            c.s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.y0 = i;
        if (getAdapter() instanceof t08) {
            ((t08) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.z0 = colorStateList;
        if (getAdapter() instanceof t08) {
            ((t08) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public final void showDropDown() {
        if (d()) {
            this.s0.f();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new t08(this, getContext(), this.v0, strArr));
    }
}
