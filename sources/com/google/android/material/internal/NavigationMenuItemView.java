package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

public class NavigationMenuItemView extends by5 implements pr8 {
    public static final int[] F0 = {16842912};
    public br8 A0;
    public ColorStateList B0;
    public boolean C0;
    public Drawable D0;
    public final fr0 E0;
    public int u0;
    public boolean v0;
    public boolean w0;
    public final boolean x0 = true;
    public final CheckedTextView y0;
    public FrameLayout z0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fr0 fr0 = new fr0(4, this);
        this.E0 = fr0;
        setOrientation(0);
        LayoutInflater.from(context).inflate(vyb.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(stb.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(ivb.design_menu_item_text);
        this.y0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        zmf.j(checkedTextView, fr0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.z0 == null) {
                this.z0 = (FrameLayout) ((ViewStub) findViewById(ivb.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.z0.removeAllViews();
            this.z0.addView(view);
        }
    }

    public final void d(br8 br8) {
        StateListDrawable stateListDrawable;
        this.A0 = br8;
        int i = br8.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(br8.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(vsb.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(F0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = zmf.a;
            setBackground(stateListDrawable);
        }
        setCheckable(br8.isCheckable());
        setChecked(br8.isChecked());
        setEnabled(br8.isEnabled());
        setTitle(br8.X);
        setIcon(br8.getIcon());
        setActionView(br8.getActionView());
        setContentDescription(br8.B0);
        swe.a(this, br8.C0);
        br8 br82 = this.A0;
        CharSequence charSequence = br82.X;
        CheckedTextView checkedTextView = this.y0;
        if (charSequence == null && br82.getIcon() == null && this.A0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.z0;
            if (frameLayout != null) {
                rh7 rh7 = (rh7) frameLayout.getLayoutParams();
                rh7.width = -1;
                this.z0.setLayoutParams(rh7);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.z0;
        if (frameLayout2 != null) {
            rh7 rh72 = (rh7) frameLayout2.getLayoutParams();
            rh72.width = -2;
            this.z0.setLayoutParams(rh72);
        }
    }

    public br8 getItemData() {
        return this.A0;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        br8 br8 = this.A0;
        if (br8 != null && br8.isCheckable() && this.A0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, F0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.w0 != z) {
            this.w0 = z;
            this.E0.h(this.y0, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.y0;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (!z || !this.x0) ? 0 : 1);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.C0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                aq4.h(drawable, this.B0);
            }
            int i = this.u0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.v0) {
            if (this.D0 == null) {
                Resources resources = getResources();
                int i2 = yub.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = vic.a;
                Drawable a = qic.a(resources, i2, theme);
                this.D0 = a;
                if (a != null) {
                    int i3 = this.u0;
                    a.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.D0;
        }
        this.y0.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.y0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.u0 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.B0 = colorStateList;
        this.C0 = colorStateList != null;
        br8 br8 = this.A0;
        if (br8 != null) {
            setIcon(br8.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.y0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.v0 = z;
    }

    public void setTextAppearance(int i) {
        this.y0.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.y0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.y0.setText(charSequence);
    }
}
