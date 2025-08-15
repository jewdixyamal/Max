package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ca7  reason: default package */
public final class ca7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ c8d s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ca7(String str, String str2, c8d c8d, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = str2;
        this.s0 = c8d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ca7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ca7(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            StringBuilder sb = new StringBuilder("Process js event: ");
            String str = this.Y;
            sb.append(str);
            sb.append(", data = ");
            String str2 = this.Z;
            sb.append(str2);
            hm9.G("JsBridge", sb.toString(), (Throwable) null);
            Iterator it = ((List) this.s0.c).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((ia7) obj2).c().contains(str)) {
                    break;
                }
            }
            ia7 ia7 = (ia7) obj2;
            if (ia7 != null) {
                this.X = 1;
                if (ia7.a(str, str2, this) == tx3) {
                    return tx3;
                }
            } else {
                hm9.p("JsBridge", "Unhandled method " + str + " in JsBridge", (Throwable) null);
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
