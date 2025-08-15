package defpackage;

import java.util.Collections;
import java.util.concurrent.Callable;

/* renamed from: ae  reason: default package */
public final /* synthetic */ class ae implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ ae(int i) {
        this.a = i;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                return be.a;
            case 1:
                return Collections.emptyList();
            default:
                return Thread.currentThread();
        }
    }
}
