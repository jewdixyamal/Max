package defpackage;

import android.os.Bundle;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: zz5  reason: default package */
public final class zz5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ForwardPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zz5(Continuation continuation, ForwardPickerScreen forwardPickerScreen) {
        super(2, continuation);
        this.Y = forwardPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zz5) n((nz5) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zz5 zz5 = new zz5(continuation, this.Y);
        zz5.X = obj;
        return zz5;
    }

    public final Object o(Object obj) {
        xx6 xx6;
        od2.a0(obj);
        nz5 nz5 = (nz5) this.X;
        if (nz5 instanceof jz5) {
            jz5 jz5 = (jz5) nz5;
            Long l = jz5.a;
            if (l != null) {
                long longValue = l.longValue();
                dz5 dz5 = dz5.c;
                Boolean valueOf = Boolean.valueOf(jz5.d);
                dz5.P1().d();
                f64 P1 = dz5.P1();
                y7g y7g = new y7g(13);
                y7g.b = ":chats";
                y7g.D(Long.valueOf(longValue), "id");
                y7g.D("local", "type");
                y7g.D(Boolean.TRUE, "from_forward");
                Set set = jz5.b;
                if (set != null) {
                    y7g.D(x53.n0(set, ",", (String) null, (String) null, (m56) null, 62), "forward_msg_ids");
                }
                Long l2 = jz5.c;
                if (l2 != null) {
                    y7g.D(Long.valueOf(l2.longValue()), "forward_attach_id");
                }
                y7g.D(valueOf, "is_forward_attach");
                P1.c(y7g.r(), (Bundle) null);
            } else {
                dz5.c.P1().d();
            }
            zy5 zy5 = jz5.e;
            if (!(zy5 == null || (xx6 = (xx6) wy5.a.getAccessor().e()) == null)) {
                xx6.f(zy5.a, zy5.b);
            }
        } else {
            boolean z = nz5 instanceof mz5;
            ForwardPickerScreen forwardPickerScreen = this.Y;
            if (z) {
                forwardPickerScreen.y0 = new pz5(forwardPickerScreen, 5);
            } else if (nz5 instanceof lz5) {
                bc7[] bc7Arr = ForwardPickerScreen.I0;
                forwardPickerScreen.C0(true);
            } else if (nz5 instanceof kz5) {
                bc7[] bc7Arr2 = ForwardPickerScreen.I0;
                forwardPickerScreen.C0(false);
                txa v0 = forwardPickerScreen.v0();
                v0.c.d();
                v0.Y.m((Object) null, wz4.a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
