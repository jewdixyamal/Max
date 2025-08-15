package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: kpf  reason: default package */
public final /* synthetic */ class kpf extends p66 implements k56 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kpf(vpf vpf, View view, ViewTreeObserver viewTreeObserver) {
        super(0, 0, j47.class, viewTreeObserver, "dispose", "attach$dispose(Landroid/view/ViewTreeObserver;Lone/me/sdk/contextmenu/helper/ViewWatcher$attach$listener$1;Landroid/view/View;)V");
        this.c = vpf;
        this.b = view;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                mpf.a((ViewTreeObserver.OnGlobalLayoutListener) this.receiver, (ViewTreeObserver) this.c, (ViewGroup) this.b);
                return e5f.a;
            default:
                cd6.a((vpf) this.c, this.b, (ViewTreeObserver) this.receiver);
                return e5f.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kpf(ViewTreeObserver viewTreeObserver, ViewGroup viewGroup, lpf lpf) {
        super(0, 0, j47.class, lpf, "dispose", "doOnGlobalLayout$dispose(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver;Landroid/view/View;)V");
        this.c = viewTreeObserver;
        this.b = viewGroup;
    }
}
