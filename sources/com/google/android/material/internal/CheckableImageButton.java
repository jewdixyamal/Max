package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] u0 = {16842912};
    public boolean o;
    public boolean s0 = true;
    public boolean t0 = true;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, vsb.imageButtonStyle);
        zmf.j(this, new fr0(1, this));
    }

    public final boolean isChecked() {
        return this.o;
    }

    public final int[] onCreateDrawableState(int i) {
        return this.o ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), u0) : super.onCreateDrawableState(i);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b03)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b03 b03 = (b03) parcelable;
        super.onRestoreInstanceState(b03.a);
        setChecked(b03.c);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, b03, z] */
    public final Parcelable onSaveInstanceState() {
        ? zVar = new z(super.onSaveInstanceState());
        zVar.c = this.o;
        return zVar;
    }

    public void setCheckable(boolean z) {
        if (this.s0 != z) {
            this.s0 = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.s0 && this.o != z) {
            this.o = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.t0 = z;
    }

    public void setPressed(boolean z) {
        if (this.t0) {
            super.setPressed(z);
        }
    }

    public final void toggle() {
        setChecked(!this.o);
    }
}
