package defpackage;

import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* renamed from: wo3  reason: default package */
public final class wo3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ContactListWidget Y;
    public final /* synthetic */ rd6 Z;
    public final /* synthetic */ boolean s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wo3(ContactListWidget contactListWidget, rd6 rd6, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
        this.Z = rd6;
        this.s0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wo3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wo3(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        rd6 rd6 = this.Z;
        ContactListWidget contactListWidget = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = ContactListWidget.P0;
            oo3 p0 = contactListWidget.p0();
            wm3 wm3 = rd6.Y;
            this.X = 1;
            Object t0 = j47.t0(((w9a) p0.c).b(), new go3(p0, wm3, (Continuation) null), this);
            if (t0 != tx3) {
                t0 = e5f;
            }
            if (t0 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        contactListWidget.f(rd6.a, this.s0);
        return e5f;
    }
}
