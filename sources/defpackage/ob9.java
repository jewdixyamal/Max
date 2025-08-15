package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ob9  reason: default package */
public final class ob9 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xs Z;
    public final /* synthetic */ int s0 = 100;
    public final /* synthetic */ xb9 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ob9(xs xsVar, xb9 xb9, Continuation continuation) {
        super(2, continuation);
        this.Z = xsVar;
        this.t0 = xb9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ob9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ob9 ob9 = new ob9(this.Z, this.t0, continuation);
        ob9.Y = obj;
        return ob9;
    }

    public final Object o(Object obj) {
        long[] jArr;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            xs xsVar = this.Z;
            int i2 = xsVar.c;
            xb9 xb9 = this.t0;
            int i3 = this.s0;
            if (i2 <= i3) {
                long[] E0 = x53.E0(xsVar);
                this.Y = E0;
                this.X = 1;
                xb9.getClass();
                Object k = j1e.k(new wb9(xb9, (Continuation) null, E0), this);
                if (k == tx3) {
                    return tx3;
                }
                long[] jArr2 = E0;
                obj = k;
                jArr = jArr2;
            } else {
                ArrayList I0 = x53.I0(xsVar, i3, i3);
                ContextScope a = j1e.a(this.b);
                ArrayList arrayList = new ArrayList(z53.S(I0, 10));
                Iterator it = I0.iterator();
                while (it.hasNext()) {
                    arrayList.add(j47.h(a, (nx3) null, new nb9(it.next(), (Continuation) null, sx3, xb9), 3));
                }
                this.X = 2;
                obj = pag.c(arrayList, this);
                if (obj == tx3) {
                    return tx3;
                }
                return (List) obj;
            }
        } else if (i == 1) {
            jArr = (long[]) this.Y;
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                hm9.p("MissedContactsController", "fail", th);
                return null;
            }
        } else if (i == 2) {
            od2.a0(obj);
            return (List) obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Collections.singletonList(new kpa(jArr, obj));
    }
}
