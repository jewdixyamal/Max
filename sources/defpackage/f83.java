package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* renamed from: f83  reason: default package */
public final class f83 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ m83 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f83(m83 m83, Continuation continuation) {
        super(2, continuation);
        this.Z = m83;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f83) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        f83 f83 = new f83(this.Z, continuation);
        f83.Y = obj;
        return f83;
    }

    public final Object o(Object obj) {
        Throwable th;
        sx3 sx3;
        q0e q0e;
        Object value;
        p83 p83;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.Y;
            bc7[] bc7Arr = m83.m;
            m83 m83 = this.Z;
            u83 u83 = (u83) m83.h.getValue();
            p83 p832 = u83 instanceof p83 ? (p83) u83 : null;
            Long l = p832 != null ? p832.c : null;
            do {
                q0e = m83.h;
                value = q0e.getValue();
                u83 u832 = (u83) value;
                u832.getClass();
                if (u832 instanceof p83) {
                    p83 p833 = (p83) u832;
                    List list = p833.a;
                    if (!(x53.q0(list) instanceof r83)) {
                        list = x53.u0(list, r83.a);
                    }
                    p83 = p83.a(p833, list, 6);
                } else {
                    p83 = new p83((Long) null, Collections.singletonList(r83.a), false);
                }
            } while (!q0e.c(value, p83));
            try {
                pk pkVar = (pk) m83.d.getValue();
                long[] jArr = m83.g;
                tq2 tq2 = new tq2((sla) null, 0);
                tq2.h("userIds", jArr);
                tq2.e(50, NewHtcHomeBadger.COUNT);
                if (l != null) {
                    ((HashMap) tq2.b).put("marker", l);
                }
                this.Y = sx32;
                this.X = 1;
                Object J = ((k4a) pkVar).J(tq2, this);
                if (J == tx3) {
                    return tx3;
                }
                sx3 sx33 = sx32;
                obj = J;
                sx3 = sx33;
            } catch (Throwable th2) {
                sx3 sx34 = sx32;
                th = th2;
                sx3 = sx34;
                if (th instanceof CancellationException) {
                    return null;
                }
                hm9.p(sx3.getClass().getName(), "request error!", th);
                return null;
            }
        } else if (i == 1) {
            sx3 = (sx3) this.Y;
            try {
                od2.a0(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (uq2) obj;
    }
}
