package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: h7e  reason: default package */
public final class h7e extends ffe implements a66 {
    public w3e X;
    public List Y;
    public int Z;
    public int s0;
    public int t0;
    public final /* synthetic */ i7e u0;
    public final /* synthetic */ w3e v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h7e(i7e i7e, w3e w3e, Continuation continuation) {
        super(2, continuation);
        this.u0 = i7e;
        this.v0 = w3e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h7e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h7e(this.u0, this.v0, continuation);
    }

    public final Object o(Object obj) {
        w3e w3e;
        List list;
        int i;
        int i2;
        w3e w3e2;
        boolean z = true;
        tx3 tx3 = tx3.a;
        int i3 = this.t0;
        e5f e5f = e5f.a;
        i7e i7e = this.u0;
        if (i3 == 0) {
            od2.a0(obj);
            list = ((xnd) i7e.v0.getValue()).b;
            int L = y53.L(list);
            if (L >= 0) {
                i = 0;
                while (true) {
                    w3e2 = (w3e) list.get(i);
                    if (this.v0.a != w3e2.a) {
                        if (i == L) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            i = -1;
            w3e2 = null;
            if (w3e2 == null) {
                return e5f;
            }
            boolean z2 = !w3e2.s0;
            db3 d = ((sc5) i7e.Y.getValue()).d(w3e2.a, z2);
            this.X = w3e2;
            this.Y = list;
            this.Z = i;
            this.s0 = z2 ? 1 : 0;
            this.t0 = 1;
            if (s36.e(d, this) == tx3) {
                return tx3;
            }
            i2 = z2;
            w3e = w3e2;
        } else if (i3 == 1) {
            i2 = this.s0;
            i = this.Z;
            list = this.Y;
            w3e = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(i, w3e.k(w3e, (ArrayList) null, false, i2 != 0, 127));
        q0e q0e = i7e.v0;
        xnd xnd = (xnd) q0e.getValue();
        wnd wnd = xnd.a;
        xnd xnd2 = xnd.c;
        xnd.getClass();
        q0e.m((Object) null, new xnd(wnd, arrayList));
        if (i2 == 0) {
            z = false;
        }
        pnf.o(i7e.t0, new vnd(z ? woc.n : woc.w, z ? vga.c : vga.d));
        return e5f;
    }
}
