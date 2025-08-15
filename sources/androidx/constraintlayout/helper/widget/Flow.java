package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;

public class Flow extends cqf {
    public nn5 x0;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [uj6, nn5] */
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        ? uj6 = new uj6();
        uj6.s0 = 0;
        uj6.t0 = 0;
        uj6.u0 = 0;
        uj6.v0 = 0;
        uj6.w0 = 0;
        uj6.x0 = 0;
        uj6.y0 = false;
        uj6.z0 = 0;
        uj6.A0 = 0;
        uj6.B0 = new xk0(0);
        uj6.C0 = null;
        uj6.D0 = -1;
        uj6.E0 = -1;
        uj6.F0 = -1;
        uj6.G0 = -1;
        uj6.H0 = -1;
        uj6.I0 = -1;
        uj6.J0 = 0.5f;
        uj6.K0 = 0.5f;
        uj6.L0 = 0.5f;
        uj6.M0 = 0.5f;
        uj6.N0 = 0.5f;
        uj6.O0 = 0.5f;
        uj6.P0 = 0;
        uj6.Q0 = 0;
        uj6.R0 = 2;
        uj6.S0 = 2;
        uj6.T0 = 0;
        uj6.U0 = -1;
        uj6.V0 = 0;
        uj6.W0 = new ArrayList();
        uj6.X0 = null;
        uj6.Y0 = null;
        uj6.Z0 = null;
        uj6.b1 = 0;
        this.x0 = uj6;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i3c.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == i3c.ConstraintLayout_Layout_android_orientation) {
                    this.x0.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_android_padding) {
                    nn5 nn5 = this.x0;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    nn5.s0 = dimensionPixelSize;
                    nn5.t0 = dimensionPixelSize;
                    nn5.u0 = dimensionPixelSize;
                    nn5.v0 = dimensionPixelSize;
                } else if (index == i3c.ConstraintLayout_Layout_android_paddingStart) {
                    nn5 nn52 = this.x0;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    nn52.u0 = dimensionPixelSize2;
                    nn52.w0 = dimensionPixelSize2;
                    nn52.x0 = dimensionPixelSize2;
                } else if (index == i3c.ConstraintLayout_Layout_android_paddingEnd) {
                    this.x0.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_android_paddingLeft) {
                    this.x0.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_android_paddingTop) {
                    this.x0.s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_android_paddingRight) {
                    this.x0.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_android_paddingBottom) {
                    this.x0.t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_wrapMode) {
                    this.x0.T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.x0.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.x0.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.x0.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.x0.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.x0.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.x0.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.x0.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == i3c.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.x0.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == i3c.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.x0.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == i3c.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.x0.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == i3c.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.x0.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == i3c.ConstraintLayout_Layout_flow_verticalBias) {
                    this.x0.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == i3c.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.x0.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == i3c.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.x0.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == i3c.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.x0.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_verticalGap) {
                    this.x0.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.x0.U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.o = this.x0;
        k();
    }

    public final void i(hj3 hj3, boolean z) {
        nn5 nn5 = this.x0;
        int i = nn5.u0;
        if (i <= 0 && nn5.v0 <= 0) {
            return;
        }
        if (z) {
            nn5.w0 = nn5.v0;
            nn5.x0 = i;
            return;
        }
        nn5.w0 = i;
        nn5.x0 = nn5.v0;
    }

    public final void l(nn5 nn5, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (nn5 != null) {
            nn5.V(mode, size, mode2, size2);
            setMeasuredDimension(nn5.z0, nn5.A0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public final void onMeasure(int i, int i2) {
        l(this.x0, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.x0.L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.x0.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.x0.M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.x0.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.x0.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.x0.J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.x0.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.x0.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.x0.N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.x0.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.x0.O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.x0.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.x0.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.x0.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        nn5 nn5 = this.x0;
        nn5.s0 = i;
        nn5.t0 = i;
        nn5.u0 = i;
        nn5.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.x0.t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.x0.w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.x0.x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.x0.s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.x0.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.x0.K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.x0.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.x0.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.x0.T0 = i;
        requestLayout();
    }
}
