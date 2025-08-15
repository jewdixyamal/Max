package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: yu7  reason: default package */
public final class yu7 implements on5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mv7 b;

    public /* synthetic */ yu7(mv7 mv7, int i) {
        this.a = i;
        this.b = mv7;
    }

    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object C = ema.C(new xu7(this.b, (List) obj, 0), continuation);
                return C == tx3.a ? C : e5f.a;
            default:
                Object C2 = ema.C(new xu7(this.b, (List) obj, 1), continuation);
                return C2 == tx3.a ? C2 : e5f.a;
        }
    }
}
