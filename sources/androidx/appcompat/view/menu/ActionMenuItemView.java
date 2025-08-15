package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;

public class ActionMenuItemView extends AppCompatTextView implements pr8, View.OnClickListener, f7 {
    public boolean A0 = j();
    public boolean B0;
    public final int C0;
    public int D0;
    public final int E0;
    public br8 u0;
    public CharSequence v0;
    public Drawable w0;
    public vq8 x0;
    public z6 y0;
    public a7 z0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3c.ActionMenuItemView, 0, 0);
        this.C0 = obtainStyledAttributes.getDimensionPixelSize(p3c.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.E0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.D0 = -1;
        setSaveEnabled(false);
    }

    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    public final void d(br8 br8) {
        this.u0 = br8;
        setIcon(br8.getIcon());
        setTitle(br8.getTitleCondensed());
        setId(br8.a);
        setVisibility(br8.isVisible() ? 0 : 8);
        setEnabled(br8.isEnabled());
        if (br8.hasSubMenu() && this.y0 == null) {
            this.y0 = new z6(this);
        }
    }

    public final boolean e() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.u0.getIcon() == null;
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public br8 getItemData() {
        return this.u0;
    }

    public final boolean j() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void k() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.v0);
        if (this.w0 != null && ((this.u0.J0 & 4) != 4 || (!this.A0 && !this.B0))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.v0 : null);
        CharSequence charSequence2 = this.u0.B0;
        if (TextUtils.isEmpty(charSequence2)) {
            setContentDescription(z3 ? null : this.u0.X);
        } else {
            setContentDescription(charSequence2);
        }
        CharSequence charSequence3 = this.u0.C0;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z3) {
                charSequence = this.u0.X;
            }
            swe.a(this, charSequence);
            return;
        }
        swe.a(this, charSequence3);
    }

    public final void onClick(View view) {
        vq8 vq8 = this.x0;
        if (vq8 != null) {
            vq8.a(this.u0);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0 = j();
        k();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i3 = this.D0) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.C0;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!z && this.w0 != null) {
            super.setPadding((getMeasuredWidth() - this.w0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z6 z6Var;
        if (!this.u0.hasSubMenu() || (z6Var = this.y0) == null || !z6Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.B0 != z) {
            this.B0 = z;
            br8 br8 = this.u0;
            if (br8 != null) {
                wq8 wq8 = br8.y0;
                wq8.v0 = true;
                wq8.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.w0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.E0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        k();
    }

    public void setItemInvoker(vq8 vq8) {
        this.x0 = vq8;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        this.D0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(a7 a7Var) {
        this.z0 = a7Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.v0 = charSequence;
        k();
    }
}
