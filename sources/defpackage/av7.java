package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: av7  reason: default package */
public final class av7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mv7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public av7(mv7 mv7, Continuation continuation) {
        super(2, continuation);
        this.Y = mv7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((av7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new av7(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            mv7 mv7 = this.Y;
            j31 j31 = new j31(new ArrayList(), new jp5((mn5) mv7.o.getValue(), 2), new wu7(3, (Continuation) null, 0));
            yu7 yu7 = new yu7(mv7, 0);
            this.X = 1;
            Object d = j31.d(new ix2(yu7, 26), this);
            if (d != tx3) {
                d = e5f;
            }
            if (d == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
