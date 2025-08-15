package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: vw5  reason: default package */
public final class vw5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ yw5 Z;
    public final /* synthetic */ je7 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vw5(yw5 yw5, je7 je7, Continuation continuation) {
        super(2, continuation);
        this.Z = yw5;
        this.s0 = je7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vw5) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vw5 vw5 = new vw5(this.Z, this.s0, continuation);
        vw5.Y = obj;
        return vw5;
    }

    public final Object o(Object obj) {
        xs xsVar;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        yw5 yw5 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            List<at5> list = (List) this.Y;
            if (list.size() != 1 || !tpa.f(((at5) x53.g0(list)).a, "all.chat.folder")) {
                xs xsVar2 = new xs((Collection) yw5.x0.getValue());
                ArrayList arrayList = new ArrayList(z53.S(list, 10));
                for (at5 at5 : list) {
                    boolean f = tpa.f(at5.a, "all.chat.folder");
                    String str = at5.a;
                    if (!f) {
                        if (at5.v0.contains(new Long(yw5.b))) {
                            xsVar2.add(str);
                        }
                    }
                    arrayList.add(new w9f(at5, tpa.f(str, "all.chat.folder") ? v9f.a : v9f.b, new iqe(((hda) this.s0.getValue()).a(at5.b, at5.y0, 2, false, 0, true))));
                }
                if (((Set) yw5.w0.get()) == null) {
                    yw5.w0.updateAndGet(new oz0(list, 1, yw5));
                }
                this.Y = xsVar2;
                this.X = 2;
                yw5.s0.m((Object) null, arrayList);
                if (e5f == tx3) {
                    return tx3;
                }
                xsVar = xsVar2;
                yw5.x0.setValue(xsVar);
                return e5f;
            }
            q0e q0e = yw5.s0;
            nz4 nz4 = nz4.a;
            this.X = 1;
            q0e.m((Object) null, nz4);
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            xsVar = (xs) this.Y;
            od2.a0(obj);
            yw5.x0.setValue(xsVar);
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
