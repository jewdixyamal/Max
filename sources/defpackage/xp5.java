package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: xp5  reason: default package */
public final class xp5 implements on5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mec b;

    public /* synthetic */ xp5(mec mec, int i) {
        this.a = i;
        this.b = mec;
    }

    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.a = obj;
                throw new AbortFlowException(this);
            case 1:
                this.b.a = obj;
                throw new AbortFlowException(this);
            default:
                mec mec = this.b;
                Object obj2 = mec.a;
                Symbol symbol = ay9.a;
                if (obj2 == symbol) {
                    mec.a = obj;
                    return e5f.a;
                }
                mec.a = symbol;
                throw new AbortFlowException(this);
        }
    }
}
