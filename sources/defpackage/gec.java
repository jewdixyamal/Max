package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: gec  reason: default package */
public final /* synthetic */ class gec implements Runnable {
    public final /* synthetic */ Runnable X;
    public final /* synthetic */ RecyclerView a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ gec(RecyclerView recyclerView, int i, int i2, Runnable runnable, Runnable runnable2) {
        this.a = recyclerView;
        this.b = i;
        this.c = i2;
        this.o = runnable;
        this.X = runnable2;
    }

    public final void run() {
        kp.c(this.a, this.b + 1, this.c, this.o, this.X);
    }
}
