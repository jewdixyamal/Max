package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* renamed from: xo3  reason: default package */
public final class xo3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ContactListWidget Y;
    public final /* synthetic */ rd6 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xo3(ContactListWidget contactListWidget, rd6 rd6, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
        this.Z = rd6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xo3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xo3(this.Y, this.Z, continuation);
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
        bc7[] bc7Arr2 = ContactListWidget.P0;
        int ordinal = contactListWidget.p0().b.ordinal();
        if (ordinal == 0) {
            contactListWidget.f(rd6.a, false);
        } else if (ordinal == 1) {
            tr3 tr3 = tr3.c;
            long j = rd6.a;
            tr3.getClass();
            tr3.P1().b(":profile?id=" + j + "&type=contact", (Bundle) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f;
    }
}
