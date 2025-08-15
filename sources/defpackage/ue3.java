package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ue3  reason: default package */
public final class ue3 extends ffe implements a66 {
    public final /* synthetic */ ve3 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ue3(ve3 ve3, boolean z, long j, Continuation continuation) {
        super(2, continuation);
        this.X = ve3;
        this.Y = z;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ue3) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ue3(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ve3 ve3 = this.X;
        t33 t33 = (t33) ((q33) ve3.c.getValue());
        t33.getClass();
        t33.j("app.call.add.dontshowconfirmation", this.Y);
        je1.c.getClass();
        pnf.o(ve3.Y, new c64(":profile/add-members?chat_id=" + this.Z));
        return e5f.a;
    }
}
