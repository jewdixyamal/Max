package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: w4c  reason: default package */
public final class w4c extends LinearLayout {
    public u4c a;
    public int b;
    public List c;

    private final void setDataList(List<v4c> list) {
        int size = list.size();
        int i = this.b;
        if (size > i) {
            this.c = x53.y0(list, i);
            a();
            String name = w4c.class.getName();
            int size2 = list.size();
            hm9.p(name, "Buttons count out of limit. Size -> " + size2, (Throwable) null);
            return;
        }
        this.c = list;
        a();
    }

    private final void setMaxButtonsCount(int i) {
        if (i >= 1) {
            this.b = i;
            requestLayout();
        }
    }

    public final void a() {
        int i;
        if (getChildCount() < this.c.size()) {
            int size = this.c.size() - getChildCount();
            for (int i2 = 0; i2 < size; i2++) {
                t4c t4c = new t4c(getContext());
                t4c.setId(View.generateViewId());
                addView(t4c);
            }
        }
        int i3 = 0;
        while (true) {
            if (i3 < getChildCount()) {
                int i4 = i3 + 1;
                View childAt = getChildAt(i3);
                if (childAt != null) {
                    childAt.setVisibility(8);
                    i3 = i4;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                int i5 = 0;
                for (Object next : this.c) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        v4c v4c = (v4c) next;
                        t4c t4c2 = (t4c) getChildAt(i5);
                        t4c2.setId(v4c.a);
                        t4c2.setVisibility(0);
                        s4c s4c = v4c.b;
                        t4c2.setSize(s4c);
                        t4c2.setEnabled(v4c.d);
                        t4c2.setText(v4c.c);
                        tu0.K(t4c2, 300, new vu5(this, 24, v4c));
                        ViewGroup.LayoutParams layoutParams = t4c2.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            if (i5 != 0) {
                                int ordinal = s4c.ordinal();
                                if (ordinal == 0) {
                                    i = tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
                                } else if (ordinal == 1) {
                                    i = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                                marginLayoutParams.setMarginStart(i);
                                t4c2.setLayoutParams(marginLayoutParams);
                            }
                            i5 = i6;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    } else {
                        y53.R();
                        throw null;
                    }
                }
                return;
            }
        }
    }

    public final void setButtonToolDataList(List<v4c> list) {
        setDataList(list);
    }

    public final void setListener(u4c u4c) {
        this.a = u4c;
    }
}
