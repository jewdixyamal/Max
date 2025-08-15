package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* renamed from: yxd  reason: default package */
public final class yxd extends gr8 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int G0 = zyb.abc_popup_menu_item_layout;
    public ViewTreeObserver A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public int E0 = 0;
    public boolean F0;
    public final boolean X;
    public final int Y;
    public final int Z;
    public final Context b;
    public final wq8 c;
    public final tq8 o;
    public final int s0;
    public final mr8 t0;
    public final sn u0 = new sn(4, this);
    public final ck v0 = new ck(9, this);
    public PopupWindow.OnDismissListener w0;
    public View x0;
    public View y0;
    public nr8 z0;

    /* JADX WARNING: type inference failed for: r8v1, types: [mr8, wl7] */
    public yxd(int i, int i2, wq8 wq8, Context context, View view, boolean z) {
        this.b = context;
        this.c = wq8;
        this.X = z;
        this.o = new tq8(wq8, LayoutInflater.from(context), z, G0);
        this.Z = i;
        this.s0 = i2;
        Resources resources = context.getResources();
        this.Y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(xtb.abc_config_prefDialogWidth));
        this.x0 = view;
        this.t0 = new wl7(context, (AttributeSet) null, i, i2);
        wq8.b(this, context);
    }

    public final boolean a() {
        return !this.B0 && this.t0.K0.isShowing();
    }

    public final boolean b(qae qae) {
        if (qae.hasVisibleItems()) {
            View view = this.y0;
            ir8 ir8 = new ir8(this.Z, this.s0, qae, this.b, view, this.X);
            nr8 nr8 = this.z0;
            ir8.i = nr8;
            gr8 gr8 = ir8.j;
            if (gr8 != null) {
                gr8.g(nr8);
            }
            boolean u = gr8.u(qae);
            ir8.h = u;
            gr8 gr82 = ir8.j;
            if (gr82 != null) {
                gr82.o(u);
            }
            ir8.k = this.w0;
            this.w0 = null;
            this.c.c(false);
            mr8 mr8 = this.t0;
            int i = mr8.Y;
            int o2 = mr8.o();
            if ((Gravity.getAbsoluteGravity(this.E0, this.x0.getLayoutDirection()) & 7) == 5) {
                i += this.x0.getWidth();
            }
            if (!ir8.b()) {
                if (ir8.f != null) {
                    ir8.d(i, o2, true, true);
                }
            }
            nr8 nr82 = this.z0;
            if (nr82 != null) {
                nr82.o(qae);
            }
            return true;
        }
        return false;
    }

    public final void c(wq8 wq8, boolean z) {
        if (wq8 == this.c) {
            dismiss();
            nr8 nr8 = this.z0;
            if (nr8 != null) {
                nr8.c(wq8, z);
            }
        }
    }

    public final boolean d() {
        return false;
    }

    public final void dismiss() {
        if (a()) {
            this.t0.dismiss();
        }
    }

    public final void f() {
        View view;
        if (!a()) {
            if (this.B0 || (view = this.x0) == null) {
                throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
            }
            this.y0 = view;
            mr8 mr8 = this.t0;
            mr8.K0.setOnDismissListener(this);
            mr8.A0 = this;
            mr8.J0 = true;
            mr8.K0.setFocusable(true);
            View view2 = this.y0;
            boolean z = this.A0 == null;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.A0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.u0);
            }
            view2.addOnAttachStateChangeListener(this.v0);
            mr8.z0 = view2;
            mr8.w0 = this.E0;
            boolean z2 = this.C0;
            Context context = this.b;
            tq8 tq8 = this.o;
            if (!z2) {
                this.D0 = gr8.m(tq8, context, this.Y);
                this.C0 = true;
            }
            mr8.r(this.D0);
            mr8.K0.setInputMethodMode(2);
            Rect rect = this.a;
            mr8.I0 = rect != null ? new Rect(rect) : null;
            mr8.f();
            es4 es4 = mr8.c;
            es4.setOnKeyListener(this);
            if (this.F0) {
                wq8 wq8 = this.c;
                if (wq8.x0 != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(zyb.abc_popup_menu_header_item_layout, es4, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(wq8.x0);
                    }
                    frameLayout.setEnabled(false);
                    es4.addHeaderView(frameLayout, (Object) null, false);
                }
            }
            mr8.p(tq8);
            mr8.f();
        }
    }

    public final void g(nr8 nr8) {
        this.z0 = nr8;
    }

    public final void i() {
        this.C0 = false;
        tq8 tq8 = this.o;
        if (tq8 != null) {
            tq8.notifyDataSetChanged();
        }
    }

    public final es4 j() {
        return this.t0.c;
    }

    public final void l(wq8 wq8) {
    }

    public final void n(View view) {
        this.x0 = view;
    }

    public final void o(boolean z) {
        this.o.c = z;
    }

    public final void onDismiss() {
        this.B0 = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.A0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A0 = this.y0.getViewTreeObserver();
            }
            this.A0.removeGlobalOnLayoutListener(this.u0);
            this.A0 = null;
        }
        this.y0.removeOnAttachStateChangeListener(this.v0);
        PopupWindow.OnDismissListener onDismissListener = this.w0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i) {
        this.E0 = i;
    }

    public final void q(int i) {
        this.t0.Y = i;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.w0 = onDismissListener;
    }

    public final void s(boolean z) {
        this.F0 = z;
    }

    public final void t(int i) {
        this.t0.l(i);
    }
}
