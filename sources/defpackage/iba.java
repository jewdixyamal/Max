package defpackage;

import java.lang.Thread;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: iba  reason: default package */
public final class iba {
    public static final /* synthetic */ bc7[] p;
    public final fh8 a;
    public volatile vse b;
    public final Thread.UncaughtExceptionHandler c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final khe e = new khe(new gba(this, 1));
    public final x45 f;
    public final x45 g;
    public final x45 h;
    public final x45 i;
    public final x45 j;
    public final x45 k;
    public final khe l;
    public final khe m;
    public final khe n;
    public final khe o;

    static {
        Class<iba> cls = iba.class;
        p = new bc7[]{new hob(cls, "ioExecutor", "getIoExecutor()Ljava/util/concurrent/ExecutorService;", 0), z7b.g(nec.a, cls, "computationExecutor", "getComputationExecutor()Ljava/util/concurrent/ExecutorService;", 0), new hob(cls, "singleExecutor", "getSingleExecutor()Ljava/util/concurrent/ExecutorService;", 0), new hob(cls, "singleLowPriorityExecutor", "getSingleLowPriorityExecutor()Ljava/util/concurrent/ExecutorService;", 0), new hob(cls, "network", "getNetwork()Ljava/util/concurrent/ExecutorService;", 0), new hob(cls, "singleTransmitExecutor", "getSingleTransmitExecutor()Ljava/util/concurrent/ExecutorService;", 0)};
        int i2 = ft4.o;
        kt4 kt4 = kt4.SECONDS;
        new fh8(false, z7.R(Integer.MAX_VALUE, kt4), z7.R(Integer.MAX_VALUE, kt4), new ww9(9), new ww9(9));
    }

    public iba(fh8 fh8, rd3 rd3, x45 x45, x45 x452, x45 x453) {
        x45 x454 = x45;
        x45 x455 = x453;
        fe feVar = fe.a;
        x45 x456 = new x45("single", 1, 0, false, true, 0, 72);
        x45 x457 = new x45("single-low", 1, 0, false, true, 1, 8);
        x45 x458 = new x45("trnsmt", 1, 1, 0, true, false, 10);
        this.a = fh8;
        this.b = feVar;
        this.c = rd3;
        this.f = x454;
        this.g = x455;
        this.h = x456;
        this.i = x457;
        this.j = x452;
        this.k = x458;
        this.l = new khe(new fba(this, x454, 1));
        this.m = new khe(new fba(this, x455, 2));
        this.n = new khe(new fba(this, x456, 3));
        this.o = new khe(new fba(this, x456, 0));
    }

    public final ExecutorService a() {
        bc7 bc7 = p[1];
        return e(this.g);
    }

    public final eba b() {
        return (eba) this.e.getValue();
    }

    public final ExecutorService c() {
        bc7 bc7 = p[0];
        return e(this.f);
    }

    public final ExecutorService d() {
        bc7 bc7 = p[2];
        return e(this.h);
    }

    public final ExecutorService e(x45 x45) {
        return (ExecutorService) this.d.computeIfAbsent(x45, new di(11, new ga(this, 23, x45)));
    }

    public final ExecutorService f(int i2, String str, int i3, int i4) {
        eba b2 = b();
        b2.getClass();
        LinkedTransferQueue linkedTransferQueue = new LinkedTransferQueue();
        int i5 = i2;
        int i6 = i3;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i5, i6, 60000, TimeUnit.MILLISECONDS, linkedTransferQueue, b2.a.s(str, Integer.valueOf(i4)));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.setRejectedExecutionHandler(new qw1(1));
        return i(threadPoolExecutor, str);
    }

    public final ExecutorService g() {
        eba b2 = b();
        b2.getClass();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 60000, TimeUnit.MILLISECONDS, new LinkedTransferQueue(), b2.a.s("tam-srvc", 5));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.setRejectedExecutionHandler(new qw1(1));
        return i(threadPoolExecutor, "tam-srvc");
    }

    public final ScheduledExecutorService h(ExecutorService executorService, String str) {
        boolean z = executorService instanceof m55;
        khe khe = this.o;
        return z ? new zg4(executorService, khe) : j(new zg4(executorService, khe), str);
    }

    public final ExecutorService i(tk5 tk5, String str) {
        return this.a.b ? new m55(tk5, new hba(this, 0), new q12(str, 3)) : tk5;
    }

    public final ScheduledExecutorService j(ScheduledExecutorService scheduledExecutorService, String str) {
        return (!this.a.b || (scheduledExecutorService instanceof atc)) ? scheduledExecutorService : new atc(scheduledExecutorService, new hba(this, 1), new q12(str, 4));
    }
}
