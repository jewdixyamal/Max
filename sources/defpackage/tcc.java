package defpackage;

/* renamed from: tcc  reason: default package */
public final /* synthetic */ class tcc implements Runnable {
    public final /* synthetic */ Throwable X;
    public final /* synthetic */ adc a;
    public final /* synthetic */ nb0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int o;

    public /* synthetic */ tcc(adc adc, nb0 nb0, long j, int i, RuntimeException runtimeException) {
        this.a = adc;
        this.b = nb0;
        this.c = j;
        this.o = i;
        this.X = runtimeException;
    }

    public final void run() {
        this.a.F(this.b, this.c, this.o, (Exception) this.X);
    }
}
