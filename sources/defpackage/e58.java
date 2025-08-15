package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.Continuation;

/* renamed from: e58  reason: default package */
public final class e58 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ p58 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e58(p58 p58, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = p58;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e58) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e58(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        p58 p58 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ((r79) p58.c.getValue()).a(this.Z, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cu8 cu8 = (cu8) obj;
        if (cu8 == null) {
            return e5f;
        }
        CharSequence charSequence = p58.q(p58).f.k;
        ((xp7) p58.o.getValue()).f.k = null;
        ArrayList d = p58.r().d();
        p4d r = p58.r();
        r.getClass();
        boolean z = false;
        int size = cu8.n() ? nd7.p((List) cu8.z0.a, new p4c(22)).size() : 0;
        CopyOnWriteArraySet copyOnWriteArraySet = r.a;
        if (size == copyOnWriteArraySet.size()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r4d r4d = (r4d) it.next();
                boolean z2 = r4d.f;
                up7 up7 = r4d.a;
                if (!z2) {
                    if (up7 instanceof j00) {
                        break;
                    }
                }
                if (!awa.b(r4d.c, up7)) {
                    if (!(up7 instanceof j00)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        pnf.o(p58.w0, new v48(charSequence, d, z));
        a48 a48 = new a48(true);
        this.X = 2;
        return p58.t0.o(a48, this) == tx3 ? tx3 : e5f;
    }
}
