package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import java.util.EnumMap;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: rwc  reason: default package */
public final class rwc extends LinearLayout {
    public static final AccelerateDecelerateInterpolator x0 = new AccelerateDecelerateInterpolator();
    public k56 a = new hbc(12);
    public final je7 b;
    public k56 c;
    public final je7 o;
    public k56 s0;
    public final je7 t0;
    public final EnumMap u0;
    public final EnumMap v0;
    public final EnumMap w0;

    public rwc(Context context) {
        super(context);
        this.b = tu0.r(3, new kwc(context, this, 0));
        this.c = new hbc(12);
        this.o = tu0.r(3, new kwc(context, this, 1));
        this.s0 = new hbc(12);
        this.t0 = tu0.r(3, new kwc(context, this, 2));
        Class<lwc> cls = lwc.class;
        this.u0 = new EnumMap(cls);
        this.v0 = new EnumMap(cls);
        this.w0 = new EnumMap(cls);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
    }

    public static void a(lwc lwc, EnumMap enumMap, EnumMap enumMap2, m56 m56) {
        ValueAnimator valueAnimator = (ValueAnimator) enumMap.get(lwc);
        if (valueAnimator != null) {
            ju0.i(valueAnimator);
        }
        ValueAnimator valueAnimator2 = (ValueAnimator) enumMap2.get(lwc);
        if (valueAnimator2 != null) {
            ju0.i(valueAnimator2);
        }
        enumMap2.put(lwc, (Object) null);
        enumMap.put(lwc, m56.invoke(valueAnimator));
    }

    private final iwc getMentionButton() {
        return (iwc) this.o.getValue();
    }

    private final iwc getReactionButton() {
        return (iwc) this.t0.getValue();
    }

    private final iwc getScrollToBottomButton() {
        return (iwc) this.b.getValue();
    }

    public final void b(lwc lwc) {
        iwc d = d(lwc);
        EnumMap enumMap = this.v0;
        if (enumMap.get(lwc) == null) {
            ViewParent parent = d.getParent();
            EnumMap enumMap2 = this.u0;
            if (parent != null || enumMap2.get(lwc) != null) {
                EnumMap enumMap3 = this.w0;
                k56 k56 = (k56) enumMap3.remove(lwc);
                if (k56 != null) {
                    k56.invoke();
                }
                ValueAnimator valueAnimator = (ValueAnimator) enumMap.get(lwc);
                if (valueAnimator != null) {
                    ju0.i(valueAnimator);
                }
                enumMap.put(lwc, (Object) null);
                ValueAnimator valueAnimator2 = (ValueAnimator) enumMap2.get(lwc);
                if (valueAnimator2 != null) {
                    ju0.i(valueAnimator2);
                }
                enumMap2.put(lwc, (Object) null);
                if (isInLayout()) {
                    enumMap.put(lwc, new ValueAnimator());
                    enumMap3.put(lwc, mpf.b(this, new nwc(this, lwc)));
                    return;
                }
                iwc d2 = d(lwc);
                a(lwc, enumMap, enumMap2, new qwc(d2, this, lwc, this, d2));
            }
        }
    }

    public final void c(lwc lwc) {
        iwc d = d(lwc);
        EnumMap enumMap = this.u0;
        if (enumMap.get(lwc) == null) {
            ViewParent parent = d.getParent();
            EnumMap enumMap2 = this.v0;
            if (parent == null || enumMap2.get(lwc) != null) {
                EnumMap enumMap3 = this.w0;
                k56 k56 = (k56) enumMap3.remove(lwc);
                if (k56 != null) {
                    k56.invoke();
                }
                ValueAnimator valueAnimator = (ValueAnimator) enumMap2.get(lwc);
                if (valueAnimator != null) {
                    ju0.i(valueAnimator);
                }
                enumMap2.put(lwc, (Object) null);
                ValueAnimator valueAnimator2 = (ValueAnimator) enumMap.get(lwc);
                if (valueAnimator2 != null) {
                    ju0.i(valueAnimator2);
                }
                enumMap.put(lwc, (Object) null);
                if (isInLayout()) {
                    enumMap.put(lwc, new ValueAnimator());
                    enumMap3.put(lwc, mpf.b(this, new pt2(d, this, lwc)));
                    return;
                }
                if (d.getParent() != null) {
                    removeView(d);
                }
                if (lwc == lwc.a) {
                    addView(d, getChildCount());
                } else {
                    addView(d, 0);
                }
                a(lwc, enumMap, enumMap2, new lr1(d, this, lwc, 12));
            }
        }
    }

    public final iwc d(lwc lwc) {
        int i = mwc.$EnumSwitchMapping$0[lwc.ordinal()];
        if (i == 1) {
            return getScrollToBottomButton();
        }
        if (i == 2) {
            return getMentionButton();
        }
        if (i == 3) {
            return getReactionButton();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void setOnClickListener(m56 m56) {
        this.a = new ffb(1, m56);
        this.c = new ffb(2, m56);
        this.s0 = new ffb(3, m56);
    }
}
