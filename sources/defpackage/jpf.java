package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: jpf  reason: default package */
public final class jpf implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View X;
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ lpf c;
    public final /* synthetic */ ViewTreeObserver o;

    public /* synthetic */ jpf(View view, lpf lpf, ViewTreeObserver viewTreeObserver, ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = view;
        this.c = lpf;
        this.o = viewTreeObserver;
        this.X = viewGroup;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                boolean isAttachedToWindow = view.isAttachedToWindow();
                View view2 = this.X;
                ViewTreeObserver viewTreeObserver = this.o;
                lpf lpf = this.c;
                if (!isAttachedToWindow) {
                    mpf.a(lpf, viewTreeObserver, (ViewGroup) view2);
                    return;
                }
                view.addOnAttachStateChangeListener(new jpf(view, lpf, viewTreeObserver, (ViewGroup) view2, 2));
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                this.b.removeOnAttachStateChangeListener(this);
                mpf.a(this.c, this.o, (ViewGroup) this.X);
                return;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                mpf.a(this.c, this.o, (ViewGroup) this.X);
                return;
        }
    }
}
