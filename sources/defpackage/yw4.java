package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: yw4  reason: default package */
public final class yw4 extends tu0 {
    public final /* synthetic */ tu0 n;
    public final /* synthetic */ ThreadPoolExecutor o;

    public yw4(tu0 tu0, ThreadPoolExecutor threadPoolExecutor) {
        this.n = tu0;
        this.o = threadPoolExecutor;
    }

    public final void v(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.o;
        try {
            this.n.v(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void y(t99 t99) {
        ThreadPoolExecutor threadPoolExecutor = this.o;
        try {
            this.n.y(t99);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
