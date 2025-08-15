package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ss1  reason: default package */
public final class ss1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ss1(String str, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ss1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ss1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            hm9.m("CallsNotification", "handle loading notification image", new Object[0]);
            String str = this.Y;
            if (str == null || w9e.C0(str)) {
                hm9.m("CallsNotification", "avatar for call push is empty", new Object[0]);
                return null;
            }
            hm9.m("CallsNotification", "start loading call push avatar", new Object[0]);
            rs1 rs1 = new rs1(str, (Continuation) null);
            this.X = 1;
            obj = fp3.I(500, rs1, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
