package defpackage;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.SystemPropsKt;

/* renamed from: joe  reason: default package */
public abstract class joe {
    public static final String a = SystemPropsKt.systemProp("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    public static final long b = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);
    public static final int c;
    public static final int d = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, (Object) null);
    public static final long e = TimeUnit.SECONDS.toNanos(SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));
    public static final qx7 f = qx7.X;
    public static final fm5 g = new fm5(0, 10);
    public static final fm5 h = new fm5(1, 10);

    static {
        int available_processors = SystemPropsKt.getAVAILABLE_PROCESSORS();
        c = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.core.pool.size", available_processors < 2 ? 2 : available_processors, 1, 0, 8, (Object) null);
    }
}
