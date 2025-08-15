package defpackage;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: fzc  reason: default package */
public final class fzc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hzc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fzc(hzc hzc, Continuation continuation) {
        super(2, continuation);
        this.Y = hzc;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fzc) n((bzc) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fzc fzc = new fzc(this.Y, continuation);
        fzc.X = obj;
        return fzc;
    }

    public final Object o(Object obj) {
        fl2 fl2;
        od2.a0(obj);
        bzc bzc = (bzc) this.X;
        boolean z = bzc instanceof azc;
        hzc hzc = this.Y;
        if (z) {
            fl2 fl22 = hzc.o;
            jl2 jl2 = ((azc) bzc).a;
            il2 il2 = (il2) fl22.a;
            il2.getClass();
            if (jl2.a == il2.i) {
                il2.h = true;
                il2.k = jl2.X;
                il2.c = jl2.b;
                il2.j = jl2.o;
                ArrayList arrayList = il2.f;
                arrayList.addAll(jl2.c);
                if (il2.k > 0) {
                    if (il2.d == 0) {
                        il2.d = 1;
                        if (1 + 1 <= arrayList.size() && il2.g != null) {
                            nx8 nx8 = (nx8) arrayList.get(il2.d - 1);
                        }
                    }
                    fl2 fl23 = il2.g;
                    if (fl23 != null) {
                        fl23.d(il2.d, il2.k);
                    }
                    fl2 fl24 = il2.g;
                    if (fl24 != null) {
                        fl24.e((nx8) arrayList.get(il2.d - 1));
                    }
                }
                if (il2.k == 0 && (fl2 = il2.g) != null) {
                    fl2.f();
                }
            }
        } else if (bzc instanceof zyc) {
            fl2 fl25 = hzc.o;
            oi0 oi0 = ((zyc) bzc).a;
            il2 il22 = (il2) fl25.a;
            if (oi0.a == il22.i) {
                il22.a();
                fl2 fl26 = il22.g;
                if (fl26 != null) {
                    fl26.f();
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
