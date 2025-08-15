package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: cla  reason: default package */
public final class cla extends FrameLayout implements b5d, kre {
    public static final /* synthetic */ bc7[] H0;
    public OneMeButton A0;
    public View B0;
    public View C0;
    public final Rect D0;
    public boolean E0;
    public boolean F0;
    public k56 G0;
    public final bla a = new bla(this, 0, false);
    public final bla b = new bla(this, 1);
    public final bla c = new bla(this, 2);
    public final bla o = new bla(this, 3);
    public final bla s0 = new bla(this, 4, false);
    public final bla t0 = new bla(this, 5);
    public final TextView u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    static {
        Class<cla> cls = cla.class;
        H0 = new bc7[]{new oi9(cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), rh4.g(nec.a, cls, "form", "getForm()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Form;"), new oi9(cls, "rightActions", "getRightActions()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Action$Right;"), new oi9(cls, "leftActions", "getLeftActions()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Action$Left;"), new oi9(cls, "actionsHorizontalPadding", "getActionsHorizontalPadding()Lkotlin/Pair;"), new oi9(cls, "isTextShimmerEnabled", "isTextShimmerEnabled()Z")};
    }

    public cla(Context context, int i) {
        super(context, (AttributeSet) null, 0);
        TextView textView = new TextView(context);
        textView.setId(xoc.O0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(qp4.u0.j(textView).getText().e);
        textView.setTextAlignment(5);
        textView.setSingleLine();
        this.u0 = textView;
        this.v0 = tu0.r(3, new jka(context, this, 0));
        this.w0 = tu0.r(3, new jka(context, this, 1));
        this.x0 = tu0.r(3, new jka(context, this, 2));
        this.y0 = tu0.r(3, new zj7(23, this));
        this.z0 = tu0.r(3, new jka(context, this, 3));
        this.D0 = new Rect();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(textView, new FrameLayout.LayoutParams(-2, -2));
        k();
        l();
        addOnLayoutChangeListener(new qq0(9, this));
        if (isLaidOut()) {
            e(this);
        }
    }

    public static final void d(cla cla, ska ska) {
        View view;
        OneMeButton oneMeButton;
        cla.removeView(cla.B0);
        cla.removeView(cla.C0);
        Context context = cla.getContext();
        ala searchViewInteraction = cla.getSearchViewInteraction();
        boolean z = ska instanceof pka;
        View view2 = null;
        pka pka = z ? (pka) ska : null;
        View Y = c54.Y(context, pka != null ? pka.a : null, searchViewInteraction);
        if (Y != null) {
            Y.setId(xoc.t0);
        } else {
            Y = null;
        }
        cla.C0 = Y;
        Context context2 = cla.getContext();
        ala searchViewInteraction2 = cla.getSearchViewInteraction();
        fka customTheme = cla.getCustomTheme();
        if (z) {
            view = c54.Y(context2, ((pka) ska).b, searchViewInteraction2);
        } else {
            if (ska instanceof rka) {
                oneMeButton = new OneMeButton(context2, (AttributeSet) null);
                oneMeButton.setCustomTheme(customTheme);
                oneMeButton.d(Integer.valueOf(jub.ic_more_vertical_filled_16), true);
                tu0.K(oneMeButton, 300, new pwe(ska, 0));
            } else if (ska instanceof mka) {
                oneMeButton = new OneMeButton(context2, (AttributeSet) null);
                oneMeButton.d(Integer.valueOf(jub.ic_done_28), true);
                tu0.K(oneMeButton, 300, new pwe(ska, 1));
            } else if (ska instanceof lka) {
                oneMeButton = new OneMeButton(context2, (AttributeSet) null);
                oneMeButton.d(Integer.valueOf(jub.ic_cancel_outline_28), true);
                tu0.K(oneMeButton, 300, new pwe(ska, 2));
            } else if (ska instanceof nka) {
                view = null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            view = oneMeButton;
        }
        if (view != null) {
            view.setId(xoc.s0);
            view2 = view;
        }
        cla.B0 = view2;
        if (view2 != null) {
            cla.addView(view2);
            f46.C(view2, tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density));
        }
        View view3 = cla.C0;
        if (view3 != null) {
            cla.addView(view3);
            f46.C(view3, tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density));
        }
    }

    public static final void e(cla cla) {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        Rect bounds;
        int i;
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo2;
        Rect bounds2;
        int i2;
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo3;
        Rect bounds3;
        TextView textView = cla.u0;
        int left = textView.getLeft();
        int right = textView.getRight();
        int height = cla.getHeight();
        Rect rect = cla.D0;
        rect.set(left, 0, right, height);
        je7 je7 = cla.w0;
        if (je7.a()) {
            rect.left = Math.min(((s5a) je7.getValue()).getLeft(), rect.left);
        }
        je7 je72 = cla.v0;
        if (je72.a()) {
            fmd fmd = (fmd) je72.getValue();
            rect.left = Math.min(fmd.getLeft(), rect.left);
            rect.right = Math.max(fmd.getRight(), rect.right);
        }
        OneMeButton oneMeButton = cla.A0;
        int i3 = -1;
        Region region = null;
        if (oneMeButton != null) {
            TouchDelegate touchDelegate = oneMeButton.getTouchDelegate();
            if (!(touchDelegate == null || (touchDelegateInfo3 = touchDelegate.getTouchDelegateInfo()) == null)) {
                Region regionAt = touchDelegateInfo3.getRegionCount() <= 0 ? null : touchDelegateInfo3.getRegionAt(0);
                if (!(regionAt == null || (bounds3 = regionAt.getBounds()) == null)) {
                    i2 = bounds3.right;
                    rect.left = Math.max(i2, oneMeButton.getRight());
                }
            }
            i2 = -1;
            rect.left = Math.max(i2, oneMeButton.getRight());
        }
        je7 je73 = cla.x0;
        if (je73.a()) {
            rect.right = Math.max(((ImageView) je73.getValue()).getRight(), rect.right);
        }
        View view = cla.B0;
        if (view != null) {
            TouchDelegate touchDelegate2 = view.getTouchDelegate();
            if (!(touchDelegate2 == null || (touchDelegateInfo2 = touchDelegate2.getTouchDelegateInfo()) == null)) {
                Region regionAt2 = touchDelegateInfo2.getRegionCount() <= 0 ? null : touchDelegateInfo2.getRegionAt(0);
                if (!(regionAt2 == null || (bounds2 = regionAt2.getBounds()) == null)) {
                    i = bounds2.left;
                    rect.right = Math.min(i, view.getLeft());
                }
            }
            i = -1;
            rect.right = Math.min(i, view.getLeft());
        }
        View view2 = cla.C0;
        if (view2 != null) {
            TouchDelegate touchDelegate3 = view2.getTouchDelegate();
            if (!(touchDelegate3 == null || (touchDelegateInfo = touchDelegate3.getTouchDelegateInfo()) == null)) {
                if (touchDelegateInfo.getRegionCount() > 0) {
                    region = touchDelegateInfo.getRegionAt(0);
                }
                if (!(region == null || (bounds = region.getBounds()) == null)) {
                    i3 = bounds.left;
                }
            }
            rect.right = Math.min(i3, view2.getLeft());
        }
    }

    private final fka getCurrentTheme() {
        fka customTheme = getCustomTheme();
        return customTheme == null ? qp4.u0.j(this) : customTheme;
    }

    private final ala getSearchViewInteraction() {
        return (ala) this.y0.getValue();
    }

    private final int getVerticalPaddingOffset() {
        return (getPaddingTop() / 2) - (getPaddingBottom() / 2);
    }

    public static void h(View view, int i, int i2) {
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    public static void i(View view, int i, int i2) {
        view.layout(i, i2 - (view.getMeasuredHeight() / 2), view.getMeasuredWidth() + i, view.getMeasuredHeight() + (i2 - (view.getMeasuredHeight() / 2)));
    }

    public final void a() {
        ((ela) this.z0.getValue()).a();
    }

    public final boolean b() {
        je7 je7 = this.z0;
        return je7.a() && ((ela) je7.getValue()).b();
    }

    public final void c(String str, List list, k56 k56, m56 m56) {
        ((ela) this.z0.getValue()).c(str, list, k56, m56);
    }

    public final void f(boolean z) {
        this.F0 = !z;
        int i = 8;
        this.u0.setVisibility(z ? 0 : 8);
        je7 je7 = this.v0;
        if (je7.a()) {
            ((fmd) je7.getValue()).setVisibility(z ? 0 : 8);
        }
        je7 je72 = this.w0;
        if (je72.a()) {
            ((s5a) je72.getValue()).setVisibility(z ? 0 : 8);
        }
        je7 je73 = this.x0;
        if (je73.a()) {
            ((ImageView) je73.getValue()).setVisibility(z ? 0 : 8);
        }
        OneMeButton oneMeButton = this.A0;
        if (oneMeButton != null) {
            oneMeButton.setVisibility(z ? 0 : 8);
        }
        View view = this.B0;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
        View view2 = this.C0;
        if (view2 != null) {
            if (z) {
                i = 0;
            }
            view2.setVisibility(i);
        }
    }

    public final boolean g() {
        eha searchView = getSearchView();
        cha state = searchView != null ? searchView.getState() : null;
        return state == cha.c || state == cha.o || state == cha.b;
    }

    public final kpa getActionsHorizontalPadding() {
        bc7 bc7 = H0[4];
        return (kpa) this.s0.b;
    }

    public final fka getCustomTheme() {
        bc7 bc7 = H0[0];
        return (fka) this.a.b;
    }

    public final uka getForm() {
        bc7 bc7 = H0[1];
        return (uka) this.b.b;
    }

    public final qka getLeftActions() {
        bc7 bc7 = H0[3];
        return (qka) this.o.b;
    }

    public final ska getRightActions() {
        bc7 bc7 = H0[2];
        return (ska) this.c.b;
    }

    public final eha getSearchView() {
        View view = this.B0;
        eha eha = view instanceof eha ? (eha) view : null;
        if (eha != null) {
            return eha;
        }
        View view2 = this.C0;
        if (view2 instanceof eha) {
            return (eha) view2;
        }
        return null;
    }

    public final TextView getTitle() {
        return this.u0;
    }

    public final int j(int i, int i2, int i3, int i4, View view, View view2) {
        int measuredWidth;
        if (view == null || view2 == null) {
            if (view != null) {
                measureChild(view, i, i2);
                measuredWidth = view.getMeasuredWidth();
            } else if (view2 == null) {
                return 0;
            } else {
                measureChild(view2, i, i2);
                measuredWidth = view2.getMeasuredWidth();
            }
            return measuredWidth + i3;
        }
        measureChild(view, i, i2);
        measureChild(view2, i, i2);
        return view2.getMeasuredWidth() + view.getMeasuredWidth() + i4 + i3;
    }

    public final void k() {
        int ordinal = getForm().ordinal();
        TextView textView = this.u0;
        if (ordinal == 0) {
            i4f.B.b(textView, du4.b);
            textView.setTextColor(getCurrentTheme().getText().e);
            OneMeButton oneMeButton = this.A0;
            if (oneMeButton != null) {
                i24.b(oneMeButton, getLeftActions(), getCustomTheme());
            }
            View view = this.C0;
            if (view != null) {
                i24.c(view, getRightActions(), false);
            }
            View view2 = this.B0;
            if (view2 != null) {
                i24.c(view2, getRightActions(), true);
            }
        } else if (ordinal == 1) {
            i4f.z.b(textView, du4.b);
            textView.setTextColor(getCurrentTheme().getText().e);
            View view3 = this.C0;
            if (view3 != null) {
                i24.d(view3, getRightActions(), false);
            }
            View view4 = this.B0;
            if (view4 != null) {
                i24.d(view4, getRightActions(), true);
            }
        } else if (ordinal == 2) {
            i4f.B.b(textView, du4.b);
            textView.setTextColor(getCurrentTheme().getText().e);
            OneMeButton oneMeButton2 = this.A0;
            if (oneMeButton2 != null) {
                i24.b(oneMeButton2, getLeftActions(), getCustomTheme());
            }
            View view5 = this.C0;
            if (view5 != null) {
                i24.c(view5, getRightActions(), false);
            }
            View view6 = this.B0;
            if (view6 != null) {
                i24.c(view6, getRightActions(), true);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        je7 je7 = this.v0;
        if (je7.a()) {
            fmd fmd = (fmd) je7.getValue();
            bc7 bc7 = H0[5];
            if (((Boolean) this.t0.b).booleanValue()) {
                i4f.j.b(fmd, du4.b);
                fmd.setTextColor(getCurrentTheme().getText().h);
                return;
            }
            i4f.p.b(fmd, du4.b);
            fmd.setTextColor(getCurrentTheme().getText().g);
        }
    }

    public final void l() {
        int ordinal = getForm().ordinal();
        je7 je7 = this.w0;
        TextView textView = this.u0;
        if (ordinal == 0) {
            textView.setGravity(17);
            if (je7.a()) {
                s5a s5a = (s5a) je7.getValue();
                ViewGroup.LayoutParams layoutParams = s5a.getLayoutParams();
                if (layoutParams != null) {
                    float f = (float) 24;
                    layoutParams.width = tu0.G(fk4.d().getDisplayMetrics().density * f);
                    layoutParams.height = tu0.G(f * fk4.d().getDisplayMetrics().density);
                    s5a.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            kpa actionsHorizontalPadding = getActionsHorizontalPadding();
            int intValue = actionsHorizontalPadding != null ? ((Number) actionsHorizontalPadding.a).intValue() : tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
            kpa actionsHorizontalPadding2 = getActionsHorizontalPadding();
            setPadding(intValue, 0, actionsHorizontalPadding2 != null ? ((Number) actionsHorizontalPadding2.b).intValue() : tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density), 0);
        } else if (ordinal == 1) {
            textView.setGravity(8388611);
            if (je7.a()) {
                s5a s5a2 = (s5a) je7.getValue();
                ViewGroup.LayoutParams layoutParams2 = s5a2.getLayoutParams();
                if (layoutParams2 != null) {
                    float f2 = (float) 24;
                    layoutParams2.width = tu0.G(fk4.d().getDisplayMetrics().density * f2);
                    layoutParams2.height = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
                    s5a2.setLayoutParams(layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            kpa actionsHorizontalPadding3 = getActionsHorizontalPadding();
            int intValue2 = actionsHorizontalPadding3 != null ? ((Number) actionsHorizontalPadding3.a).intValue() : tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
            kpa actionsHorizontalPadding4 = getActionsHorizontalPadding();
            setPadding(intValue2, 0, actionsHorizontalPadding4 != null ? ((Number) actionsHorizontalPadding4.b).intValue() : tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density), 0);
        } else if (ordinal == 2) {
            textView.setGravity(8388611);
            if (je7.a()) {
                s5a s5a3 = (s5a) je7.getValue();
                ViewGroup.LayoutParams layoutParams3 = s5a3.getLayoutParams();
                if (layoutParams3 != null) {
                    float f3 = (float) 40;
                    layoutParams3.width = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                    layoutParams3.height = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
                    s5a3.setLayoutParams(layoutParams3);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            kpa actionsHorizontalPadding5 = getActionsHorizontalPadding();
            int intValue3 = actionsHorizontalPadding5 != null ? ((Number) actionsHorizontalPadding5.a).intValue() : tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
            kpa actionsHorizontalPadding6 = getActionsHorizontalPadding();
            setPadding(intValue3, 0, actionsHorizontalPadding6 != null ? ((Number) actionsHorizontalPadding6.b).intValue() : tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density), 0);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int verticalPaddingOffset;
        int measuredHeight2;
        int verticalPaddingOffset2;
        int measuredHeight3;
        int verticalPaddingOffset3;
        int ordinal = getForm().ordinal();
        je7 je7 = this.w0;
        je7 je72 = this.x0;
        TextView textView = this.u0;
        je7 je73 = this.v0;
        je7 je74 = this.z0;
        if (ordinal == 0) {
            View z2 = br7.z(je74);
            if (z2 != null) {
                i(z2, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            OneMeButton oneMeButton = this.A0;
            if (oneMeButton != null) {
                oneMeButton.layout(getPaddingLeft(), ((getMeasuredHeight() / 2) - (oneMeButton.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), oneMeButton.getMeasuredWidth() + getPaddingLeft(), (oneMeButton.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
            View z3 = br7.z(je73);
            if (z3 != null) {
                measuredHeight = (((getMeasuredHeight() - z3.getMeasuredHeight()) - textView.getMeasuredHeight()) - tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density)) / 2;
                verticalPaddingOffset = getVerticalPaddingOffset();
            } else {
                measuredHeight = (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2);
                verticalPaddingOffset = getVerticalPaddingOffset();
            }
            int i5 = measuredHeight + verticalPaddingOffset;
            View view = this.B0;
            View view2 = this.C0;
            if ((view2 instanceof eha) && g()) {
                eha eha = (eha) view2;
                eha.layout((getMeasuredWidth() - getPaddingRight()) - eha.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (eha.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (eha.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            } else if (view != null && view2 != null) {
                view.layout((getMeasuredWidth() - getPaddingRight()) - view.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                float f = (float) 12;
                view2.layout(rh4.q(f, fk4.d().getDisplayMetrics().density, c54.x(view) - view2.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (view2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), rh4.q(f, fk4.d().getDisplayMetrics().density, c54.x(view)), (view2.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view2 != null) {
                view2.layout((getMeasuredWidth() - getPaddingRight()) - view2.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view2.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view != null) {
                view.layout((getMeasuredWidth() - getPaddingRight()) - view.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
            View z4 = br7.z(je7);
            View z5 = br7.z(je72);
            int measuredHeight4 = (textView.getMeasuredHeight() / 2) + i5;
            int i6 = 0;
            int G = z4 != null ? (tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density) + z4.getMeasuredWidth()) / 2 : 0;
            if (z5 != null) {
                i6 = (tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density) + z5.getMeasuredWidth()) / 2;
            }
            int measuredWidth = (((getMeasuredWidth() / 2) - G) - i6) - (textView.getMeasuredWidth() / 2);
            if (z4 != null) {
                i(z4, measuredWidth, measuredHeight4);
                measuredWidth = wg0.d((float) 8, fk4.d().getDisplayMetrics().density, z4.getMeasuredWidth(), measuredWidth);
            }
            h(textView, measuredWidth, i5);
            float f2 = (float) 2;
            int d = wg0.d(f2, fk4.d().getDisplayMetrics().density, textView.getMeasuredWidth(), measuredWidth);
            if (z5 != null) {
                i(z5, d, measuredHeight4);
            }
            if (z3 != null) {
                int measuredWidth2 = (getMeasuredWidth() / 2) - (z3.getMeasuredWidth() / 2);
                View z6 = br7.z(je7);
                h(z3, measuredWidth2, tu0.G(f2 * fk4.d().getDisplayMetrics().density) + (z6 != null ? z6.getBottom() : textView.getBottom()));
            }
        } else if (ordinal == 1) {
            View z7 = br7.z(je74);
            if (z7 != null) {
                i(z7, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            View z8 = br7.z(je73);
            if (z8 != null) {
                measuredHeight2 = (((getMeasuredHeight() - z8.getMeasuredHeight()) - textView.getMeasuredHeight()) - tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density)) / 2;
                verticalPaddingOffset2 = getVerticalPaddingOffset();
            } else {
                measuredHeight2 = (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2);
                verticalPaddingOffset2 = getVerticalPaddingOffset();
            }
            int i7 = measuredHeight2 + verticalPaddingOffset2;
            h(textView, getPaddingLeft(), i7);
            View z9 = br7.z(je72);
            if (z9 != null) {
                i(z9, rh4.c((float) 2, fk4.d().getDisplayMetrics().density, textView.getRight()), (textView.getMeasuredHeight() / 2) + i7);
            }
            if (z8 != null) {
                h(z8, getPaddingLeft(), tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density) + textView.getBottom());
            }
            View view3 = this.B0;
            View view4 = this.C0;
            if ((view4 instanceof eha) && g()) {
                eha eha2 = (eha) view4;
                eha2.layout((getMeasuredWidth() - getPaddingRight()) - eha2.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (eha2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (eha2.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            } else if (view3 != null && view4 != null) {
                view3.layout((getMeasuredWidth() - getPaddingRight()) - view3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view3.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
                float f3 = (float) 16;
                view4.layout(rh4.q(f3, fk4.d().getDisplayMetrics().density, c54.x(view3) - view4.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (view4.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), rh4.q(f3, fk4.d().getDisplayMetrics().density, c54.x(view3)), (view4.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view4 != null) {
                view4.layout((getMeasuredWidth() - getPaddingRight()) - view4.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view4.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view4.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view3 != null) {
                view3.layout((getMeasuredWidth() - getPaddingRight()) - view3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view3.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
        } else if (ordinal == 2) {
            View z10 = br7.z(je74);
            if (z10 != null) {
                i(z10, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            View z11 = br7.z(je73);
            if (z11 != null) {
                measuredHeight3 = ((getMeasuredHeight() - z11.getMeasuredHeight()) - textView.getMeasuredHeight()) / 2;
                verticalPaddingOffset3 = getVerticalPaddingOffset();
            } else {
                measuredHeight3 = (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2);
                verticalPaddingOffset3 = getVerticalPaddingOffset();
            }
            int i8 = measuredHeight3 + verticalPaddingOffset3;
            int paddingLeft = getPaddingLeft();
            OneMeButton oneMeButton2 = this.A0;
            if (oneMeButton2 != null) {
                oneMeButton2.layout(getPaddingLeft(), ((getMeasuredHeight() / 2) - (oneMeButton2.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), oneMeButton2.getMeasuredWidth() + getPaddingLeft(), (oneMeButton2.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                paddingLeft += oneMeButton2.getMeasuredWidth();
            }
            View z12 = br7.z(je7);
            if (z12 != null) {
                int G2 = paddingLeft + (this.A0 != null ? tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density) / 2 : tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
                i(z12, G2, (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                paddingLeft = G2 + z12.getMeasuredWidth();
            }
            float f4 = (float) 8;
            int G3 = tu0.G(fk4.d().getDisplayMetrics().density * f4) + paddingLeft;
            h(textView, G3, i8);
            View z13 = br7.z(je72);
            if (z13 != null) {
                i(z13, rh4.c((float) 2, fk4.d().getDisplayMetrics().density, textView.getRight()), (textView.getMeasuredHeight() / 2) + i8);
            }
            if (z11 != null) {
                h(z11, G3, textView.getBottom());
            }
            View view5 = this.B0;
            View view6 = this.C0;
            if ((view6 instanceof eha) && g()) {
                eha eha3 = (eha) view6;
                eha3.layout((getMeasuredWidth() - getPaddingRight()) - eha3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (eha3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (eha3.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            } else if (view5 != null && view6 != null) {
                view5.layout((getMeasuredWidth() - getPaddingRight()) - view5.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view5.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view5.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
                view6.layout(rh4.q(f4, fk4.d().getDisplayMetrics().density, c54.x(view5) - view6.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (view6.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), rh4.q(f4, fk4.d().getDisplayMetrics().density, c54.x(view5)), (view6.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view6 != null) {
                view6.layout((getMeasuredWidth() - getPaddingRight()) - view6.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view6.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view6.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view5 != null) {
                view5.layout((getMeasuredWidth() - getPaddingRight()) - view5.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view5.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view5.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int ordinal = getForm().ordinal();
        je7 je7 = this.w0;
        TextView textView = this.u0;
        je7 je72 = this.x0;
        je7 je73 = this.v0;
        je7 je74 = this.z0;
        if (ordinal == 0) {
            int size = View.MeasureSpec.getSize(i);
            int paddingTop = getPaddingTop() + tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density) + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            View z = br7.z(je74);
            if (z != null) {
                z.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
            }
            if (z != null) {
                measureChild(z, i3, i4);
            }
            int paddingRight = getPaddingRight();
            View view = this.B0;
            View view2 = this.C0;
            float f = (float) 12;
            int i5 = size;
            float f2 = f;
            View view3 = view2;
            int i6 = paddingTop;
            TextView textView2 = textView;
            int j = paddingRight + j(i, i2, tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), view, view3);
            int paddingLeft2 = getPaddingLeft();
            OneMeButton oneMeButton = this.A0;
            if (oneMeButton != null) {
                measureChild(oneMeButton, i3, i4);
                paddingLeft2 = wg0.d(f2, fk4.d().getDisplayMetrics().density, oneMeButton.getMeasuredWidth(), paddingLeft2);
            }
            int max = i5 - (Math.max(paddingLeft2, j) * 2);
            View z2 = br7.z(je73);
            if (z2 != null) {
                z2.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            View z3 = br7.z(je7);
            if (z3 != null) {
                measureChild(z3, i3, i4);
                max -= tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density) + z3.getMeasuredWidth();
            }
            View z4 = br7.z(je72);
            if (z4 != null) {
                measureChild(z4, i3, i4);
                max -= tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density) + z4.getMeasuredWidth();
            }
            textView2.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(i5, i6);
        } else if (ordinal == 1) {
            int size2 = View.MeasureSpec.getSize(i);
            int paddingBottom = getPaddingBottom() + getPaddingTop() + tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density);
            int paddingLeft3 = (size2 - getPaddingLeft()) - getPaddingRight();
            View z5 = br7.z(je74);
            if (z5 != null) {
                z5.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft3, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
            }
            int i7 = paddingBottom;
            int j2 = paddingLeft3 - j(i, i2, tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density), this.B0, this.C0);
            View z6 = br7.z(je73);
            if (z6 != null) {
                z6.measure(View.MeasureSpec.makeMeasureSpec(j2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            View z7 = br7.z(je72);
            if (z7 != null) {
                measureChild(z7, i3, i4);
                j2 -= tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density) + z7.getMeasuredWidth();
            }
            textView.measure(View.MeasureSpec.makeMeasureSpec(j2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(size2, i7);
        } else if (ordinal == 2) {
            int size3 = View.MeasureSpec.getSize(i);
            float f3 = (float) 64;
            int paddingBottom2 = getPaddingBottom() + getPaddingTop() + tu0.G(fk4.d().getDisplayMetrics().density * f3);
            int paddingLeft4 = (size3 - getPaddingLeft()) - getPaddingRight();
            View z8 = br7.z(je74);
            if (z8 != null) {
                z8.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft4, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom2, 1073741824));
            }
            View view4 = this.B0;
            View view5 = this.C0;
            float f4 = (float) 8;
            int i8 = paddingLeft4;
            int G = tu0.G(fk4.d().getDisplayMetrics().density * f4);
            float f5 = f3;
            int i9 = size3;
            int j3 = i8 - j(i, i2, G, tu0.G(fk4.d().getDisplayMetrics().density * f4), view4, view5);
            OneMeButton oneMeButton2 = this.A0;
            if (oneMeButton2 != null) {
                measureChild(oneMeButton2, i3, i4);
                j3 -= oneMeButton2.getMeasuredWidth();
            }
            View z9 = br7.z(je7);
            if (z9 != null) {
                measureChild(z9, i3, i4);
                j3 -= tu0.G(f4 * fk4.d().getDisplayMetrics().density) + (z9.getMeasuredWidth() + (this.A0 != null ? tu0.G(fk4.d().getDisplayMetrics().density * f4) / 2 : tu0.G(fk4.d().getDisplayMetrics().density * f4)));
            }
            View z10 = br7.z(je73);
            if (z10 != null) {
                z10.measure(View.MeasureSpec.makeMeasureSpec(j3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            View z11 = br7.z(je72);
            if (z11 != null) {
                measureChild(z11, i3, i4);
                j3 -= tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density) + z11.getMeasuredWidth();
            }
            textView.measure(View.MeasureSpec.makeMeasureSpec(j3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(i9, getPaddingBottom() + getPaddingTop() + tu0.G(f5 * fk4.d().getDisplayMetrics().density));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onThemeChanged(fka fka) {
        pq9 pq9 = qp4.u0;
        qp4 b2 = pq9.b(getContext());
        fka currentTheme = getCurrentTheme();
        b2.getClass();
        qp4.c(this, currentTheme);
        k();
        je7 je7 = this.v0;
        if (je7.a()) {
            fmd fmd = (fmd) je7.getValue();
            CharSequence text = fmd.getText();
            Object[] objArr = null;
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                objArr = spanned.getSpans(0, fmd.getText().length(), kre.class);
            }
            if (objArr == null) {
                objArr = new kre[0];
            }
            for (Object obj : objArr) {
                kre kre = (kre) obj;
                kre.onThemeChanged(getCurrentTheme());
                qqe.b(fmd, kre);
            }
        }
        je7 je72 = this.x0;
        if (je72.a()) {
            ImageView imageView = (ImageView) je72.getValue();
            imageView.setImageTintList(ColorStateList.valueOf(pq9.j(imageView).getIcon().f));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate;
        View view;
        TouchDelegate touchDelegate2;
        View view2;
        TouchDelegate touchDelegate3;
        OneMeButton oneMeButton;
        if (motionEvent == null || this.F0) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            if (this.D0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                k56 k56 = this.G0;
                if (k56 != null) {
                    k56.invoke();
                }
                performClick();
                return true;
            }
        }
        OneMeButton oneMeButton2 = this.A0;
        if (oneMeButton2 == null || (touchDelegate3 = oneMeButton2.getTouchDelegate()) == null || !touchDelegate3.onTouchEvent(motionEvent)) {
            View view3 = this.C0;
            if (view3 == null || (touchDelegate2 = view3.getTouchDelegate()) == null || !touchDelegate2.onTouchEvent(motionEvent)) {
                View view4 = this.B0;
                if (!(view4 == null || (touchDelegate = view4.getTouchDelegate()) == null || !touchDelegate.onTouchEvent(motionEvent) || motionEvent.getAction() != 1 || (view = this.B0) == null)) {
                    view.performClick();
                }
                return true;
            }
            if (motionEvent.getAction() == 1 && (view2 = this.C0) != null) {
                view2.performClick();
            }
            return true;
        }
        if (motionEvent.getAction() == 1 && (oneMeButton = this.A0) != null) {
            oneMeButton.performClick();
        }
        return true;
    }

    public final void setActionsHorizontalPadding(kpa kpa) {
        this.s0.o1(this, H0[4], kpa);
    }

    public final void setAvatar(tka tka) {
        if (getForm() != uka.b) {
            je7 je7 = this.w0;
            int i = 8;
            if (tka != null) {
                s5a s5a = (s5a) je7.getValue();
                s5a.g(oag.a(tka.b, Long.valueOf(tka.c)), true);
                s5a.setAvatarUrl(tka.a);
                s5a.j(s5a, tka.d, (m5a) null, 30);
                s5a.setCustomOverlay(tka.e);
                if (!g() && !this.F0) {
                    i = 0;
                }
                s5a.setVisibility(i);
            } else if (je7.a()) {
                ((s5a) je7.getValue()).setVisibility(8);
            }
            if (!g()) {
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalStateException("setAvatar can't be applied for Form.Main");
    }

    public final void setAvatarAlpha(float f) {
        je7 je7 = this.w0;
        if (je7.a()) {
            ((s5a) je7.getValue()).setAlpha(f);
        }
    }

    public final void setCustomTheme(fka fka) {
        this.a.o1(this, H0[0], fka);
    }

    public final void setDropdownRotationProgress(float f) {
        je7 je7 = this.x0;
        if (je7.a()) {
            ((ImageView) je7.getValue()).setRotation(ote.d(f, 0.0f, 1.0f) * 180.0f);
        }
    }

    public final void setForm(uka uka) {
        this.b.o1(this, H0[1], uka);
    }

    public final void setLeftActions(qka qka) {
        this.o.o1(this, H0[3], qka);
    }

    public final void setRightActions(ska ska) {
        this.c.o1(this, H0[2], ska);
    }

    public final void setShowDropdown(boolean z) {
        ((View) this.x0.getValue()).setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public final void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public final void setTextShimmerEnabled(boolean z) {
        this.t0.o1(this, H0[5], Boolean.valueOf(z));
    }

    public final void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public final void setTitleAlpha(float f) {
        this.u0.setAlpha(f);
    }

    public final void setTitleClickListener(k56 k56) {
        this.G0 = k56;
    }

    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    public final void setSubtitle(CharSequence charSequence) {
        int i = 0;
        this.E0 = charSequence != null;
        je7 je7 = this.v0;
        if (charSequence != null) {
            ((fmd) je7.getValue()).setText(charSequence);
            View view = (View) je7.getValue();
            if (g() || this.F0) {
                i = 8;
            }
            view.setVisibility(i);
        } else if (je7.a()) {
            ((fmd) je7.getValue()).setVisibility(8);
        }
        if (!g()) {
            requestLayout();
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.u0.setText(charSequence);
    }
}
