package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;

/* renamed from: rt0  reason: default package */
public final /* synthetic */ class rt0 implements c66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rt0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                OnUndeliveredElementKt.callUndeliveredElement((m56) this.b, this.c, (lx3) obj3);
                return e5f.a;
            default:
                e5f e5f = (e5f) obj2;
                lx3 lx3 = (lx3) obj3;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = aj9.h;
                zi9 zi9 = (zi9) this.c;
                Object obj4 = zi9.b;
                aj9 aj9 = (aj9) this.b;
                atomicReferenceFieldUpdater.set(aj9, obj4);
                aj9.e(zi9.b);
                return e5f.a;
        }
    }
}
