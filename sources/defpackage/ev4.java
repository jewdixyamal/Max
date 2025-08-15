package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ev4  reason: default package */
public final class ev4 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gv4 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ev4(gv4 gv4, Continuation continuation) {
        super(2, continuation);
        this.Y = gv4;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ev4) n((jv4) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ev4 ev4 = new ev4(this.Y, continuation);
        ev4.X = obj;
        return ev4;
    }

    public final Object o(Object obj) {
        q0e q0e;
        Object value;
        meb meb;
        q0e q0e2;
        Object value2;
        od2.a0(obj);
        jv4 jv4 = (jv4) this.X;
        gv4 gv4 = this.Y;
        jv4 jv42 = (jv4) gv4.i.getValue();
        boolean z = false;
        boolean z2 = jv42 != null && jv42.a(jv4);
        jv4 jv43 = gv4.k;
        if (jv43 != null && jv43.b(jv4)) {
            z = true;
        }
        gv4.k = jv4;
        do {
            q0e = gv4.b;
            value = q0e.getValue();
            meb meb2 = (meb) value;
            meb meb3 = (meb) q0e.getValue();
            meb = null;
            if (meb3 != null) {
                meb = meb.a(meb3, (String) null, z2, 111);
            }
        } while (!q0e.c(value, meb));
        if (z) {
            do {
                q0e2 = gv4.c;
                value2 = q0e2.getValue();
                List list = (List) value2;
            } while (!q0e2.c(value2, gv4.f().a(gv4)));
        }
        return e5f.a;
    }
}
