package defpackage;

/* renamed from: vh6  reason: default package */
public final /* synthetic */ class vh6 implements cm4 {
    public final /* synthetic */ wh6 a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ vh6(wh6 wh6, Runnable runnable) {
        this.a = wh6;
        this.b = runnable;
    }

    public final void dispose() {
        this.a.a.removeCallbacks(this.b);
    }
}
