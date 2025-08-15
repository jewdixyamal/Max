package defpackage;

import java.util.ArrayList;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: il2  reason: default package */
public final class il2 {
    public final mn5 a;
    public final pk b;
    public String c = null;
    public int d = 0;
    public final ContextScope e;
    public final ArrayList f;
    public fl2 g;
    public boolean h;
    public long i;
    public long j;
    public int k;

    public il2(xk1 xk1, pk pkVar) {
        this.a = xk1;
        this.b = pkVar;
        hde a2 = f46.a();
        jd4 jd4 = ql4.a;
        this.e = j1e.a(a2.plus(MainDispatcherLoader.dispatcher.getImmediate()));
        this.f = new ArrayList();
        this.h = true;
    }

    public final void a() {
        this.i = 0;
        this.k = 0;
        this.d = 0;
        this.f.clear();
        this.j = 0;
        this.c = null;
        this.h = true;
    }
}
