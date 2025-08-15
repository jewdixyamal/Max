package defpackage;

import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: f3g  reason: default package */
public final class f3g extends ffe implements a66 {
    public int X;
    public final /* synthetic */ g3g Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f3g(g3g g3g, Continuation continuation) {
        super(2, continuation);
        this.Y = g3g;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f3g) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new f3g(this.Y, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        Object obj3;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        int i2 = 2;
        g3g g3g = this.Y;
        if (i == 0) {
            od2.a0(obj);
            mtf mtf = (mtf) g3g.c.getValue();
            this.X = 1;
            mtf.getClass();
            xlc a = xlc.a(1, "SELECT * FROM webapp_biometry WHERE user_id = ?");
            a.j(1, g3g.b);
            obj3 = ote.i(mtf.a, new CancellationSignal(), new jtf(mtf, a, 0), this);
            if (obj3 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
            obj3 = obj;
        } else if (i == 2) {
            od2.a0(obj);
            obj2 = obj;
            g3g.X.m((Object) null, x53.t0(Collections.singletonList(new t2g()), (List) obj2));
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj3;
        if (list.isEmpty()) {
            return e5f;
        }
        ContextScope a2 = j1e.a(this.b);
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        int i3 = 0;
        for (Object next : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                e3g e3g = r8;
                e3g e3g2 = new e3g(i3, next, (Continuation) null, this.Y, list);
                arrayList.add(j47.h(a2, (nx3) null, e3g, 3));
                i3 = i4;
                i2 = 2;
            } else {
                y53.R();
                throw null;
            }
        }
        this.X = i2;
        obj2 = pag.c(arrayList, this);
        if (obj2 == tx3) {
            return tx3;
        }
        g3g.X.m((Object) null, x53.t0(Collections.singletonList(new t2g()), (List) obj2));
        return e5f;
    }
}
