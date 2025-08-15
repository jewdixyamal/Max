package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vk3  reason: default package */
public final class vk3 extends ffe implements a66 {
    public final /* synthetic */ zk3 X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vk3(zk3 zk3, String str, Continuation continuation) {
        super(2, continuation);
        this.X = zk3;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((vk3) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vk3(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        zk3 zk3 = this.X;
        zk3.p.set(((k4a) ((pk) zk3.l.getValue())).H(2, 0, (a20) null, (String) null, (String) null, (String) null, (String) null, this.Y));
        return e5f.a;
    }
}
