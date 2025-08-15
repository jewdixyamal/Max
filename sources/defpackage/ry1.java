package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: ry1  reason: default package */
public interface ry1 extends Continuation {
    void b(nx3 nx3);

    boolean cancel(Throwable th);

    void d(m56 m56);

    void e(Object obj, c66 c66);

    boolean isActive();

    boolean isCancelled();

    Symbol j(Throwable th);

    Symbol l(Object obj, c66 c66);

    void q(Object obj);
}
