package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0000X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"*\u0010\u0011\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"2\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00130\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Llx3;", "context", "", "threadContextElements", "(Llx3;)Ljava/lang/Object;", "countOrElement", "updateThreadContext", "(Llx3;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "Le5f;", "restoreThreadContext", "(Llx3;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/Symbol;", "NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "Lkotlin/Function2;", "Ljx3;", "countAll", "La66;", "Lpse;", "findOne", "Lkotlinx/coroutines/internal/ThreadState;", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
public final class ThreadContextKt {
    public static final Symbol NO_THREAD_ELEMENTS = new Symbol("NO_THREAD_ELEMENTS");
    private static final a66 countAll = new qse(1);
    private static final a66 findOne = new qse(0);
    private static final a66 updateState = new Object();

    /* access modifiers changed from: private */
    public static final Object countAll$lambda$0(Object obj, jx3 jx3) {
        if (!(jx3 instanceof pse)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? jx3 : Integer.valueOf(intValue + 1);
    }

    /* access modifiers changed from: private */
    public static final pse findOne$lambda$1(pse pse, jx3 jx3) {
        if (pse != null) {
            return pse;
        }
        if (jx3 instanceof pse) {
            return (pse) jx3;
        }
        return null;
    }

    public static final void restoreThreadContext(lx3 lx3, Object obj) {
        if (obj != NO_THREAD_ELEMENTS) {
            if (obj instanceof ThreadState) {
                ((ThreadState) obj).restore(lx3);
            } else {
                ((pse) lx3.fold((Object) null, findOne)).restoreThreadContext(lx3, obj);
            }
        }
    }

    public static final Object threadContextElements(lx3 lx3) {
        return lx3.fold(0, countAll);
    }

    /* access modifiers changed from: private */
    public static final ThreadState updateState$lambda$2(ThreadState threadState, jx3 jx3) {
        if (jx3 instanceof pse) {
            pse pse = (pse) jx3;
            threadState.append(pse, pse.updateThreadContext(threadState.context));
        }
        return threadState;
    }

    public static final Object updateThreadContext(lx3 lx3, Object obj) {
        if (obj == null) {
            obj = threadContextElements(lx3);
        }
        return obj == 0 ? NO_THREAD_ELEMENTS : obj instanceof Integer ? lx3.fold(new ThreadState(lx3, ((Number) obj).intValue()), updateState) : ((pse) obj).updateThreadContext(lx3);
    }
}
