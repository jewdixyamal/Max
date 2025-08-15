package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i01  reason: default package */
public final class i01 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k01 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i01(k01 k01, Continuation continuation) {
        super(2, continuation);
        this.Y = k01;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((i01) n((jb) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        i01 i01 = new i01(this.Y, continuation);
        i01.X = obj;
        return i01;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        jb jbVar = (jb) this.X;
        k01 k01 = this.Y;
        k01.getClass();
        uj1 uj1 = null;
        if (jbVar instanceof xa) {
            xa xaVar = (xa) jbVar;
            if (!xaVar.a) {
                uj1 = wj1.x;
            } else if (!xaVar.b) {
                uj1 = wj1.w;
            }
        } else if (jbVar instanceof za) {
            za zaVar = (za) jbVar;
            if (!zaVar.a) {
                uj1 = wj1.v;
            } else if (!zaVar.b) {
                uj1 = wj1.u;
            }
        } else if (jbVar instanceof db) {
            db dbVar = (db) jbVar;
            if (!dbVar.a) {
                uj1 = wj1.t;
            } else if (!dbVar.b) {
                uj1 = wj1.s;
            }
        } else if (jbVar instanceof cb) {
            cb cbVar = (cb) jbVar;
            cbVar.getClass();
            if (!cbVar.a) {
                uj1 = wj1.y;
            }
        } else if (jbVar instanceof hb) {
            hb hbVar = (hb) jbVar;
            hbVar.getClass();
            uj1 = hbVar.a ? wj1.B : wj1.C;
        }
        if (uj1 != null) {
            pnf.o(k01.t0, uj1);
        }
        return e5f.a;
    }
}
