package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: ja2  reason: default package */
public final class ja2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ wu4 Y;
    public final /* synthetic */ ka2 Z;
    public final /* synthetic */ e52 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ja2(wu4 wu4, ka2 ka2, e52 e52, Continuation continuation) {
        super(2, continuation);
        this.Y = wu4;
        this.Z = ka2;
        this.s0 = e52;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ja2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ja2(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        Long l;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e52 e52 = this.s0;
        String str = null;
        ka2 ka2 = this.Z;
        wu4 wu4 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            String str2 = wu4.d;
            wu4 wu42 = (wu4) ka2.i.getValue();
            if (!tpa.f(str2, wu42 != null ? wu42.d : null) && wu4.d != null) {
                t12 t12 = (t12) ka2.v.getValue();
                long j = e52.a;
                this.X = 1;
                t12.getClass();
                String name = t12.class.getName();
                hm9.m(name, "changeChatTitle, chatId = " + j, new Object[0]);
                je7 je7 = t12.c;
                ((jz2) ((iy2) je7.getValue())).l().c(j, v82.a);
                String str3 = wu4.d;
                e52 f = ((jz2) ((iy2) je7.getValue())).f(j, new q12(str3, 1));
                if (f != null) {
                    ((av0) t12.b.getValue()).c(new vz2(Collections.singletonList(new Long(j)), false, false, (mg4) null, (h9b) null, 124));
                    l = new Long(((k4a) ((pk) t12.a.getValue())).m(j, f.b.a, str3, (String) null, (a20) null));
                } else {
                    l = new Long(0);
                }
                if (l == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str4 = wu4.f;
        wu4 wu43 = (wu4) ka2.i.getValue();
        if (wu43 != null) {
            str = wu43.f;
        }
        if (!tpa.f(str4, str)) {
            ((k4a) ((pk) ka2.q.getValue())).n(e52.a, wu4.f, e52.b.a);
        }
        return e5f.a;
    }
}
