package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: zw  reason: default package */
public final class zw extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bx Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zw(bx bxVar, Continuation continuation) {
        super(2, continuation);
        this.Y = bxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zw) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zw(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bx bxVar = this.Y;
            if (bxVar.e.a()) {
                ((v5d) bxVar.e.getValue()).c();
            }
            je7 je7 = bxVar.f;
            if (je7.a()) {
                ((v5d) je7.getValue()).c();
            }
            List<MessageModel> list = ((l29) bxVar.A.getValue()).a;
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            for (MessageModel messageModel : list) {
                arrayList.add(new Long(messageModel.a));
            }
            xu8 xu8 = new xu8(arrayList);
            this.X = 1;
            if (bxVar.n(xu8, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
