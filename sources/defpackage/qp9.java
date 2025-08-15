package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;

/* renamed from: qp9  reason: default package */
public final class qp9 extends LinearLayout {
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        while (true) {
            if (i < getChildCount()) {
                int i2 = i + 1;
                View childAt = getChildAt(i);
                if (childAt != null) {
                    ((cmd) childAt).b.d();
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                return;
            }
        }
    }

    public final void setTabs(int i) {
        removeAllViews();
        for (int i2 = 0; i2 < i; i2++) {
            cmd cmd = new cmd(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(tu0.G(((float) 86) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density));
            float f = (float) 4;
            marginLayoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
            marginLayoutParams.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
            cmd.setLayoutParams(marginLayoutParams);
            cmd.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 8.0f));
            cmd.setBackgroundColor(qp4.u0.j(cmd).b().k);
            v3c.y(new xh0(3, (Continuation) null, 22), cmd);
            addView(cmd, i2);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            int i2 = 0;
            while (true) {
                if (i2 < getChildCount()) {
                    int i3 = i2 + 1;
                    View childAt = getChildAt(i2);
                    if (childAt != null) {
                        ((cmd) childAt).b.c();
                        i2 = i3;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    return;
                }
            }
        } else {
            int i4 = 0;
            while (true) {
                if (i4 < getChildCount()) {
                    int i5 = i4 + 1;
                    View childAt2 = getChildAt(i4);
                    if (childAt2 != null) {
                        ((cmd) childAt2).b.d();
                        i4 = i5;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    return;
                }
            }
        }
    }
}
