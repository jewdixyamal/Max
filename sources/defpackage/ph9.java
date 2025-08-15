package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;

/* renamed from: ph9  reason: default package */
public final class ph9 extends ffe implements a66 {
    public final /* synthetic */ uh9 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ ub8 s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ String u0;
    public final /* synthetic */ Bundle v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ph9(uh9 uh9, String str, String str2, ub8 ub8, String str3, String str4, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.X = uh9;
        this.Y = str;
        this.Z = str2;
        this.s0 = ub8;
        this.t0 = str3;
        this.u0 = str4;
        this.v0 = bundle;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ph9) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ph9(this.X, this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int i = uh9.K;
        uh9 uh9 = this.X;
        uh9.getClass();
        tb8 j = uh9.j(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0);
        a98 a98 = uh9.m;
        if (a98 != null) {
            a98.K();
            z88 z88 = a98.c;
            if (!z88.isConnected()) {
                z04.c0("The controller is not connected. Ignoring setMediaItem().");
            } else {
                z88.U0(j);
            }
        }
        uh9.r();
        return e5f.a;
    }
}
