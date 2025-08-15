package defpackage;

import java.lang.Thread;
import kotlin.coroutines.Continuation;

/* renamed from: nca  reason: default package */
public final /* synthetic */ class nca implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ uca a;
    public final /* synthetic */ Thread.UncaughtExceptionHandler b;

    public /* synthetic */ nca(uca uca, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uca;
        this.b = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        uca uca = this.a;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        String str = uca.g;
        ir6 ir6 = hm9.m;
        if (ir6 != null) {
            ir6.b(ir6, us7.t0, str, "!!! APPCRASH !!!", (Object[]) null, th, 8);
        }
        uca.h();
        Object unused = j47.f0(hz4.a, new sca(uca, (Continuation) null));
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
