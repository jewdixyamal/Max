package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.coroutines.Continuation;

/* renamed from: lv7  reason: default package */
public final class lv7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mv7 Y;
    public final /* synthetic */ CharSequence Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lv7(mv7 mv7, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.Y = mv7;
        this.Z = charSequence;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lv7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lv7(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        CharSequence charSequence = this.Z;
        mv7 mv7 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            j31 j31 = new j31(new ArrayList(), new jp5(new t03(od2.D(new t03(new qn5(1, mv7.b.g()), 25), new gv7(charSequence, (Continuation) null)), 26), 2), new wu7(3, (Continuation) null, 1));
            yu7 yu7 = new yu7(mv7, 1);
            this.X = 1;
            Object d = j31.d(new jv7(yu7, 0), this);
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
        if (mv7.Z.isEmpty()) {
            LinkedBlockingQueue linkedBlockingQueue = mv7.Z;
            linkedBlockingQueue.put(Collections.singletonList("По запросу \"" + charSequence + "\" ничего не найдено!"));
        }
        return e5f;
    }
}
