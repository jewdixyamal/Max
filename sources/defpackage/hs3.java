package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: hs3  reason: default package */
public final class hs3 extends ffe implements a66 {
    public final /* synthetic */ js3 X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hs3(js3 js3, String str, Continuation continuation) {
        super(2, continuation);
        this.X = js3;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hs3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hs3(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        js3 js3 = this.X;
        List list = ((dn3) js3.b.getValue()).c;
        if (list != null) {
            return js3.a(js3, list, this.Y);
        }
        return null;
    }
}
