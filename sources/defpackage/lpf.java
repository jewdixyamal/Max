package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: lpf  reason: default package */
public final class lpf implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ k56 a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ View c;

    public lpf(k56 k56, ViewTreeObserver viewTreeObserver, ViewGroup viewGroup) {
        this.a = k56;
        this.b = viewTreeObserver;
        this.c = viewGroup;
    }

    public final void onGlobalLayout() {
        if (((Boolean) this.a.invoke()).booleanValue()) {
            mpf.a(this, this.b, (ViewGroup) this.c);
        }
    }
}
