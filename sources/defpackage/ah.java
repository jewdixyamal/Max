package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: ah  reason: default package */
public final class ah implements ViewTreeObserver.OnPreDrawListener {
    public final xu3 X;
    public boolean Y;
    public final /* synthetic */ ch Z;
    public final ViewGroup a;
    public final View b;
    public final View c;
    public final boolean o;

    public ah(ch chVar, xu3 xu3, View view, View view2, ViewGroup viewGroup, boolean z) {
        this.Z = chVar;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
        this.o = z;
        this.X = xu3;
    }

    public final void a() {
        if (!this.Y) {
            this.Y = true;
            View view = this.c;
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
            }
            this.Z.m(this.a, this.b, this.c, this.o, true, this.X);
        }
    }

    public final boolean onPreDraw() {
        a();
        return true;
    }
}
