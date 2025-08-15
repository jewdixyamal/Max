package defpackage;

import java.util.concurrent.Callable;

/* renamed from: dlc  reason: default package */
public final /* synthetic */ class dlc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k56 b;

    public /* synthetic */ dlc(int i, k56 k56) {
        this.a = i;
        this.b = k56;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                return this.b.invoke();
            default:
                return this.b.invoke();
        }
    }
}
