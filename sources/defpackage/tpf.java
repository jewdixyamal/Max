package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: tpf  reason: default package */
public final class tpf implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View X;
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewTreeObserver c;
    public final /* synthetic */ vpf o;

    public /* synthetic */ tpf(View view, ViewTreeObserver viewTreeObserver, vpf vpf, View view2, int i) {
        this.a = i;
        this.b = view;
        this.c = viewTreeObserver;
        this.o = vpf;
        this.X = view2;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                boolean isAttachedToWindow = view.isAttachedToWindow();
                View view2 = this.X;
                vpf vpf = this.o;
                ViewTreeObserver viewTreeObserver = this.c;
                if (!isAttachedToWindow) {
                    cd6.a(vpf, view2, viewTreeObserver);
                    return;
                } else {
                    view.addOnAttachStateChangeListener(new tpf(view, viewTreeObserver, vpf, view2, 1));
                    return;
                }
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                return;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                cd6.a(this.o, this.X, this.c);
                return;
        }
    }
}
