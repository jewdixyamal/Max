package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: rgg  reason: default package */
public final class rgg {
    public int a;
    public mo7 b;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public boolean f = false;
    public final Executor g;
    public volatile sx h;
    public volatile sx i;
    public final Semaphore j;
    public final Set k;

    public rgg(Context context, Set set) {
        ThreadPoolExecutor threadPoolExecutor = sx.s0;
        context.getApplicationContext();
        this.g = threadPoolExecutor;
        this.j = new Semaphore(0);
        this.k = set;
    }

    public final void a() {
        if (this.h != null) {
            if (!this.c) {
                this.f = true;
            }
            if (this.i != null) {
                this.h.getClass();
                this.h = null;
                return;
            }
            this.h.getClass();
            sx sxVar = this.h;
            sxVar.o.set(true);
            if (sxVar.b.cancel(false)) {
                this.i = this.h;
            }
            this.h = null;
        }
    }

    public final void b() {
        if (this.i == null && this.h != null) {
            this.h.getClass();
            sx sxVar = this.h;
            Executor executor = this.g;
            if (sxVar.c != 1) {
                int s = au1.s(sxVar.c);
                if (s == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                } else if (s != 2) {
                    throw new IllegalStateException("We should never reach this state");
                } else {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                sxVar.c = 2;
                sxVar.a.b = null;
                executor.execute(sxVar.b);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        z04.g(sb, this);
        sb.append(" id=");
        return zr6.j(sb, this.a, "}");
    }
}
