package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* renamed from: djc  reason: default package */
public final class djc implements gbd, qu7 {
    public final String X = "RestoreScheduledTaskExecutor";
    public final je7 a;
    public final je7 b;
    public final ContextScope c;
    public final q0e o = r0e.a(0);

    public djc(je7 je7, je7 je72, kke kke, ox3 ox3) {
        this.a = je7;
        this.b = je72;
        this.c = j1e.a(((w9a) kke).a().limitedParallelism(1, "restore-tasks-on-connect").plus(ox3));
    }

    public final void a() {
    }

    public final void c(int i) {
        this.o.m((Object) null, Integer.valueOf(i));
    }
}
