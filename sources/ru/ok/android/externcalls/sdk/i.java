package ru.ok.android.externcalls.sdk;

public final /* synthetic */ class i implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj3 b;

    public /* synthetic */ i(rj3 rj3, int i) {
        this.a = i;
        this.b = rj3;
    }

    public final void accept(Object obj) {
        int i = this.a;
        rj3 rj3 = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                rj3.accept(th);
                return;
            case 1:
                rj3.accept(th);
                return;
            case 2:
                rj3.accept(th);
                return;
            default:
                rj3.accept(th);
                return;
        }
    }
}
