package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.main.MainScreen;

/* renamed from: jx7  reason: default package */
public final class jx7 extends ffe implements a66 {
    public final /* synthetic */ MainScreen X;
    public final /* synthetic */ ix7 Y;
    public final /* synthetic */ qp4 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jx7(MainScreen mainScreen, ix7 ix7, qp4 qp4, Continuation continuation) {
        super(2, continuation);
        this.X = mainScreen;
        this.Y = ix7;
        this.Z = qp4;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jx7) n((fka) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jx7(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        qp4 qp4;
        od2.a0(obj);
        Iterator it = this.X.c.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            qp4 = this.Z;
            if (!hasNext) {
                break;
            }
            ViewGroup viewGroup = (ViewGroup) ((Map.Entry) it.next()).getValue();
            if (!viewGroup.isAttachedToWindow()) {
                qp4.d(qp4, viewGroup);
            }
        }
        ix7 ix7 = this.Y;
        if (!ix7.isAttachedToWindow()) {
            qp4.d(qp4, ix7);
        }
        return e5f.a;
    }
}
