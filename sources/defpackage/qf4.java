package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: qf4  reason: default package */
public final class qf4 implements zff {
    public final int a;
    public final boolean b;
    public final va8 c;
    public final ExecutorService d;
    public final id6 e;
    public final int f;
    public final boolean g = false;
    public final boolean h = false;

    public qf4(int i, boolean z, va8 va8, ScheduledExecutorService scheduledExecutorService, hd0 hd0, int i2) {
        this.a = i;
        this.b = z;
        this.c = va8;
        this.d = scheduledExecutorService;
        this.e = hd0;
        this.f = i2;
    }

    public final /* bridge */ /* synthetic */ bgf a(Context context, xw0 xw0, i63 i63, boolean z, g03 g03) {
        return b(context, xw0, i63, z, nk4.a, g03);
    }

    public final rf4 b(Context context, xw0 xw0, i63 i63, boolean z, Executor executor, agf agf) {
        ExecutorService executorService = this.d;
        boolean z2 = executorService == null;
        if (executorService == null) {
            int i = oaf.a;
            executorService = Executors.newSingleThreadExecutor(new pd3(2, "Effect:DefaultVideoFrameProcessor:GlThread"));
        }
        ExecutorService executorService2 = executorService;
        agf agf2 = agf;
        try {
            return (rf4) executorService2.submit(new pf4(this, context, xw0, i63, z, new nx0(executorService2, z2, (wff) new lf4(agf2, 1)), executor, agf2)).get();
        } catch (ExecutionException e2) {
            throw new Exception(e2);
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            throw new Exception(e3);
        }
    }
}
