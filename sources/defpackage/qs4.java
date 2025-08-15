package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* renamed from: qs4  reason: default package */
public final class qs4 extends n15 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final c5 i = new c5(26, (Object) this);
    public final e33 j = new e33(1, this);
    public final q64 k = new q64(8, (Object) this);
    public boolean l;
    public boolean m;
    public boolean n;
    public long o = Long.MAX_VALUE;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public qs4(m15 m15) {
        super(m15);
        this.f = z7.P(tsb.motionDurationShort3, 67, m15.getContext());
        this.e = z7.P(tsb.motionDurationShort3, 50, m15.getContext());
        this.g = z7.Q(m15.getContext(), tsb.motionEasingLinearInterpolator, og.a);
    }

    public final void a() {
        if (this.p.isTouchExplorationEnabled() && ft.n(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new dd4(7, this));
    }

    public final int c() {
        return wzb.exposed_dropdown_menu_content_description;
    }

    public final int d() {
        return yub.mtrl_dropdown_arrow;
    }

    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    public final View.OnClickListener f() {
        return this.i;
    }

    public final q64 h() {
        return this.k;
    }

    public final boolean i(int i2) {
        return i2 != 0;
    }

    public final boolean j() {
        return this.l;
    }

    public final boolean l() {
        return this.n;
    }

    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new ei1(2, this));
            this.h.setOnDismissListener(new ps4(this));
            this.h.setThreshold(0);
            TextInputLayout textInputLayout = this.a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!ft.n(editText) && this.p.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = zmf.a;
                this.d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final void n(l4 l4Var) {
        if (!ft.n(this.h)) {
            l4Var.h(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText((CharSequence) null);
        }
    }

    public final void o(AccessibilityEvent accessibilityEvent) {
        if (this.p.isEnabled() && !ft.n(this.h)) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                u();
                this.m = true;
                this.o = System.currentTimeMillis();
            }
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) this.f);
        ofFloat.addUpdateListener(new z00(7, (Object) this));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) this.e);
        ofFloat2.addUpdateListener(new z00(7, (Object) this));
        this.q = ofFloat2;
        ofFloat2.addListener(new h6(4, (Object) this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            this.h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
    }

    public final void t(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        if (this.h != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                this.m = false;
            }
            if (!this.m) {
                t(!this.n);
                if (this.n) {
                    this.h.requestFocus();
                    this.h.showDropDown();
                    return;
                }
                this.h.dismissDropDown();
                return;
            }
            this.m = false;
        }
    }
}
