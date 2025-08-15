package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: of5  reason: default package */
public final class of5 extends ffe implements a66 {
    public yg5 X;
    public int Y;
    public final /* synthetic */ pf5 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ long u0;
    public final /* synthetic */ String v0;
    public final /* synthetic */ String w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public of5(pf5 pf5, long j, long j2, long j3, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.Z = pf5;
        this.s0 = j;
        this.t0 = j2;
        this.u0 = j3;
        this.v0 = str;
        this.w0 = str2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((of5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new of5(this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    public final Object o(Object obj) {
        yg5 yg5;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        pf5 pf5 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            hm9.m(pf5.a, "File attach click. Start process download", new Object[0]);
            tq2 tq2 = new tq2(this.s0, 14, (byte) 0);
            this.Y = 1;
            obj = ((k4a) ((pk) pf5.b.getValue())).J(tq2, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            yg5 = this.X;
            od2.a0(obj);
            String str = yg5.c;
            ((no4) pf5.j.getValue()).a(this.u0, this.s0, this.v0, this.w0, str);
            return ozd.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yg5 yg52 = (yg5) obj;
        if (tpa.f(yg52.o, Boolean.TRUE) && ((jp) ((hp) pf5.i.getValue())).g.getBoolean("app.privacy.unsafe.files", false)) {
            se5 se5 = (se5) ((qe5) pf5.h.getValue());
            se5.getClass();
            if (se5.n(PmsKey.f126unsafefilesalert, false)) {
                return new nzd(yg52.c);
            }
        }
        d20 d20 = d20.X;
        this.X = yg52;
        this.Y = 2;
        if (((k6f) pf5.e.getValue()).a(this.t0, this.u0, this.v0, d20, this) == tx3) {
            return tx3;
        }
        yg5 = yg52;
        String str2 = yg5.c;
        ((no4) pf5.j.getValue()).a(this.u0, this.s0, this.v0, this.w0, str2);
        return ozd.a;
    }
}
