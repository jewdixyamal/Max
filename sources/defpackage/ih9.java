package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import kotlin.coroutines.Continuation;
import one.me.android.media.service.OneMeMediaSessionService;

/* renamed from: ih9  reason: default package */
public final class ih9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ uh9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ih9(uh9 uh9, Continuation continuation) {
        super(2, continuation);
        this.Y = uh9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ih9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ih9(this.Y, continuation);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [y88, java.lang.Object] */
    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long j = uh9.I;
            this.X = 1;
            if (j47.y(j, this) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = uh9.K;
        uh9 uh9 = this.Y;
        a98 a98 = uh9.m;
        if (a98 == null || !a98.c.isConnected()) {
            hm9.m("uh9", "connect", new Object[0]);
            uh9.k(true);
            Context context = uh9.a;
            obd obd = new obd(context, new ComponentName(context, OneMeMediaSessionService.class));
            Bundle bundle = Bundle.EMPTY;
            Looper w = oaf.w();
            ? obj3 = new Object();
            i98 i98 = new i98(w);
            oaf.W(new Handler(w), new w88(i98, new a98(context, obd, bundle, obj3, w, i98, obd.a.e() ? new imc(new v24(context)) : null), 0));
            i98.d(new v05((Object) uh9, (Object) i98, (Object) null, 21), ot3.a(context));
        } else {
            hm9.m("uh9", "connect request rejected, already connected", new Object[0]);
            uh9.i(uh9);
            uh9.u();
        }
        return e5f.a;
    }
}
