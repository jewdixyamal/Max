package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: cqf  reason: default package */
public abstract class cqf extends ri3 {
    public boolean v0;
    public boolean w0;

    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i3c.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == i3c.ConstraintLayout_Layout_android_visibility) {
                    this.v0 = true;
                } else if (index == i3c.ConstraintLayout_Layout_android_elevation) {
                    this.w0 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void l(nn5 nn5, int i, int i2);

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.v0 || this.w0) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.b; i++) {
                    View view = (View) constraintLayout.a.get(this.a[i]);
                    if (view != null) {
                        if (this.v0) {
                            view.setVisibility(visibility);
                        }
                        if (this.w0 && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
