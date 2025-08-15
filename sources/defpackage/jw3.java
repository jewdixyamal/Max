package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;
import ru.ok.android.externcalls.sdk.Conversation;

/* renamed from: jw3  reason: default package */
public final /* synthetic */ class jw3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ jw3(AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (Conversation.State) this.b.get();
            case 1:
                AtomicReference atomicReference = this.b;
                int i = OneMeApplication.s0;
                long nanoTime = System.nanoTime();
                eca eca = (eca) jyc.a.getAccessor().c(eca.class);
                eca.getClass();
                hm9.m("OneMeInitialDataStorage", "load", new Object[0]);
                List list = (List) j47.f0(hz4.a, new dca(eca, (Continuation) null));
                boolean z = false;
                boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
                boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
                if (booleanValue && booleanValue2) {
                    z = true;
                }
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, "OneMeInitialDataStorage", ey8.j("load finished ", z), (Throwable) null);
                }
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    us7 us7 = us7.X;
                    int i2 = ft4.o;
                    ir62.d(us7, "InitialDataTask", "initialDataStorage().load() by ".concat(ft4.j(z7.S(System.nanoTime() - nanoTime, kt4.NANOSECONDS))), (Throwable) null);
                }
                atomicReference.set(Boolean.valueOf(z));
                return e5f.a;
            case 2:
                int i3 = OneMeApplication.s0;
                Boolean bool = (Boolean) this.b.get();
                bool.booleanValue();
                return bool;
            default:
                zl4 zl4 = (zl4) this.b.getAndSet(iz4.a);
                if (zl4 != null) {
                    zl4.g();
                }
                return e5f.a;
        }
    }
}
