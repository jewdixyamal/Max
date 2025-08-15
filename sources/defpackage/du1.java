package defpackage;

import java.util.concurrent.Executor;

/* renamed from: du1  reason: default package */
public final class du1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final Object c;
    public final Object o;

    public du1(gh7 gh7, eg7 eg7) {
        this.c = gh7;
        this.o = eg7;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((Executor) this.c).execute(new cu1(0, this));
                return;
            default:
                if (!this.b) {
                    ((gh7) this.c).d((eg7) this.o);
                    this.b = true;
                    return;
                }
                return;
        }
    }

    public du1(eu1 eu1, Executor executor) {
        this.o = eu1;
        this.b = false;
        this.c = executor;
    }
}
