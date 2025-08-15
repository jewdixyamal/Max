package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ela  reason: default package */
public final class ela extends LinearLayout implements b5d {
    public final AppCompatTextView a;
    public final OneMeButton b;
    public final ArrayList c = new ArrayList();
    public AnimatorSet o;
    public int s0 = 1;
    public final je7 t0 = tu0.r(3, new s4a(9));
    public final je7 u0 = tu0.r(3, new s4a(10));
    public final je7 v0;

    public ela(Context context) {
        super(context, (AttributeSet) null);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(xoc.O0);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setTextColor(qp4.u0.j(appCompatTextView).getText().e);
        appCompatTextView.setTextAlignment(5);
        appCompatTextView.setSingleLine();
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setSingleLine();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 16;
        appCompatTextView.setLayoutParams(layoutParams);
        i4f.y.b(appCompatTextView, du4.b);
        this.a = appCompatTextView;
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setMode(b7a.o);
        oneMeButton.setSize(c7a.b);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setId(xoc.C0);
        oneMeButton.d(Integer.valueOf(woc.p0), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(marginLayoutParams);
        this.b = oneMeButton;
        this.v0 = tu0.r(3, new xda(context, 10));
        setElevation(fk4.d().getDisplayMetrics().density * 10.0f);
        setGravity(16);
        addView(oneMeButton);
        addView(appCompatTextView);
    }

    public static void d(ela ela, m56 m56, zka zka) {
        ela.getPopupWindow().dismiss();
        m56.invoke(Integer.valueOf(zka.a));
    }

    private final LinearInterpolator getAppearInterpolator() {
        return (LinearInterpolator) this.t0.getValue();
    }

    private final LinearInterpolator getDisappearInterpolator() {
        return (LinearInterpolator) this.u0.getValue();
    }

    private final PopupWindow getPopupWindow() {
        return (PopupWindow) this.v0.getValue();
    }

    public final void a() {
        this.s0 = 1;
        e(false);
    }

    public final boolean b() {
        return this.s0 == 2;
    }

    public final void c(String str, List list, k56 k56, m56 m56) {
        Collection<zka> collection;
        PopupWindow popupWindow;
        char c2;
        OneMeButton oneMeButton;
        List list2 = list;
        m56 m562 = m56;
        setSelectionTitle(str);
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            removeView((View) it.next());
        }
        arrayList.clear();
        List y0 = x53.y0(list2, 5);
        int size = list.size() - 5;
        if (size <= 0) {
            collection = nz4.a;
        } else if (size == 1) {
            collection = Collections.singletonList(x53.o0(list));
        } else {
            ArrayList arrayList2 = new ArrayList(size);
            if (list2 instanceof RandomAccess) {
                int size2 = list.size();
                for (int i = 5; i < size2; i++) {
                    arrayList2.add(list2.get(i));
                }
            } else {
                ListIterator listIterator = list2.listIterator(5);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            collection = arrayList2;
        }
        boolean z = false;
        if (!collection.isEmpty()) {
            h6b h6b = new h6b(getContext(), false);
            h6b.setId(xoc.L0);
            for (zka zka : collection) {
                g6b g6b = new g6b(h6b.getContext(), z);
                g6b g6b2 = g6b;
                g6b.c(g6b, new eqe(zka.b), (Integer) null, true, true);
                g6b2.b(Integer.valueOf(zka.c), Integer.valueOf(lsb.global_icon_primary));
                tu0.K(g6b2, 300, new bz0(this, m562, zka, 2));
                h6b.addView(g6b2, -1, -2);
                z = false;
            }
            popupWindow = getPopupWindow();
            popupWindow.setContentView(h6b);
        } else {
            popupWindow = null;
        }
        int i2 = 0;
        for (Object next : y0) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                zka zka2 = (zka) next;
                z6a z6a = z6a.o;
                c7a c7a = c7a.b;
                b7a b7a = b7a.o;
                if (i2 != 4 || !(!collection.isEmpty())) {
                    OneMeButton oneMeButton2 = new OneMeButton(getContext(), (AttributeSet) null);
                    oneMeButton2.setMode(b7a);
                    oneMeButton2.setSize(c7a);
                    oneMeButton2.setAppearance(z6a);
                    oneMeButton2.setId(xoc.D0);
                    oneMeButton2.d(Integer.valueOf(zka2.c), true);
                    c2 = 65534;
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams.setMarginStart(tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
                    oneMeButton2.setLayoutParams(marginLayoutParams);
                    tu0.K(oneMeButton2, 300, new vu5(m562, 22, zka2));
                    oneMeButton = oneMeButton2;
                } else {
                    oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
                    oneMeButton.setMode(b7a);
                    oneMeButton.setSize(c7a);
                    oneMeButton.setAppearance(z6a);
                    oneMeButton.setId(xoc.K0);
                    oneMeButton.d(Integer.valueOf(jub.ic_more_vertical_filled_16), true);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams2.setMarginStart(tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
                    oneMeButton.setLayoutParams(marginLayoutParams2);
                    tu0.K(oneMeButton, 300, new xx5(22, popupWindow));
                    c2 = 65534;
                }
                arrayList.add(oneMeButton);
                f46.C(oneMeButton, tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density));
                addView(oneMeButton);
                i2 = i3;
                char c3 = c2;
            } else {
                y53.R();
                throw null;
            }
        }
        if (this.s0 != 2) {
            this.s0 = 2;
            setCloseListener(new zja(this, 1, k56));
            e(true);
        }
    }

    public final void e(boolean z) {
        AnimatorSet animatorSet = this.o;
        if (animatorSet != null) {
            ju0.i(animatorSet);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        float alpha = getAlpha();
        float f = 0.0f;
        float f2 = z ? 1.0f : 0.0f;
        long j = 200;
        if (!(alpha == 0.0f || alpha == 1.0f)) {
            j = (long) (Math.abs(alpha - f2) * ((float) 200));
        }
        animatorSet2.setDuration(j);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.ALPHA, new float[]{alpha, f2});
        ofFloat.setInterpolator(z ? getAppearInterpolator() : getDisappearInterpolator());
        ofFloat.addListener(new vi2(this, alpha, z));
        boolean z2 = !z;
        if (z2) {
            f = 1.0f;
        }
        animatorSet2.playTogether(x53.u0(l6d.i0(new r1f(l6d.Z(new at(7, (ViewGroup) getParent()), new wz7(14, this)), new dla(f, z2 ? getAppearInterpolator() : getDisappearInterpolator()))), ofFloat));
        animatorSet2.start();
        this.o = animatorSet2;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            TouchDelegate touchDelegate = view.getTouchDelegate();
            if (touchDelegate != null && touchDelegate.onTouchEvent(motionEvent)) {
                if (motionEvent.getAction() == 1) {
                    view.performClick();
                }
            }
        }
        return true;
    }

    public final void setCloseListener(k56 k56) {
        tu0.K(this.b, 300, new m6(17, k56));
    }

    public final void setSelectionTitle(String str) {
        this.a.setText(str);
    }
}
