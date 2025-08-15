package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: cj  reason: default package */
public final class cj extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gj Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cj(gj gjVar, Continuation continuation) {
        super(2, continuation);
        this.Z = gjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cj) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cj cjVar = new cj(this.Z, continuation);
        cjVar.Y = obj;
        return cjVar;
    }

    public final Object o(Object obj) {
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        gj gjVar = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            pk pkVar = gjVar.a;
            au auVar = new au(10, ((hyc) gjVar.c).g.getLong("user.reactionsLastSync", 0));
            this.X = 1;
            obj = ((k4a) pkVar).J(auVar, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                obj2 = new njc(th);
            }
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = (ru) obj;
        if (obj2 instanceof njc) {
            obj2 = null;
        }
        ru ruVar = (ru) obj2;
        if (ruVar == null) {
            return e5f;
        }
        ((hyc) gjVar.c).l("user.reactionsLastSync", Long.valueOf(ruVar.c));
        List list = ruVar.o;
        Map map = ruVar.s0;
        this.X = 2;
        return gj.c(gjVar, list, map, this) == tx3 ? tx3 : e5f;
    }
}
