package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: hr  reason: default package */
public final class hr extends ffe implements a66 {
    public kr X;
    public int Y;
    public final /* synthetic */ kr Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hr(kr krVar, Continuation continuation) {
        super(2, continuation);
        this.Z = krVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hr) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hr(this.Z, continuation);
    }

    public final Object o(Object obj) {
        kr krVar;
        kr krVar2;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            krVar2 = this.Z;
            nn7 nn7 = (nn7) krVar2.v0.getValue();
            this.X = krVar2;
            this.Y = 1;
            obj = j47.t0(((w9a) ((kke) nn7.c.getValue())).b(), new mn7(nn7, true, (Continuation) null), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            krVar2 = this.X;
            od2.a0(obj);
        } else if (i == 2) {
            krVar = this.X;
            od2.a0(obj);
            krVar.x0 = (Map) obj;
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        krVar2.w0 = (Map) obj;
        kr krVar3 = this.Z;
        nn7 nn72 = (nn7) krVar3.v0.getValue();
        this.X = krVar3;
        this.Y = 2;
        Object t0 = j47.t0(((w9a) ((kke) nn72.c.getValue())).b(), new mn7(nn72, false, (Continuation) null), this);
        if (t0 == tx3) {
            return tx3;
        }
        kr krVar4 = krVar3;
        obj = t0;
        krVar = krVar4;
        krVar.x0 = (Map) obj;
        return e5f.a;
    }
}
