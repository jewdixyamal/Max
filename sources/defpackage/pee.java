package defpackage;

import android.view.Surface;

/* renamed from: pee  reason: default package */
public final /* synthetic */ class pee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tj3 b;
    public final /* synthetic */ Surface c;

    public /* synthetic */ pee(tj3 tj3, Surface surface, int i) {
        this.a = i;
        this.b = tj3;
        this.c = surface;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.accept(new bc0(3, this.c));
                return;
            default:
                this.b.accept(new bc0(4, this.c));
                return;
        }
    }
}
