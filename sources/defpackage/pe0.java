package defpackage;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.Continuation;

/* renamed from: pe0  reason: default package */
public final class pe0 extends ffe implements a66 {
    public final /* synthetic */ qe0 X;
    public final /* synthetic */ Context Y;
    public final /* synthetic */ fbf Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pe0(qe0 qe0, Context context, fbf fbf, Continuation continuation) {
        super(2, continuation);
        this.X = qe0;
        this.Y = context;
        this.Z = fbf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pe0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pe0(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        qe0 qe0 = this.X;
        Context context = this.Y;
        fbf fbf = this.Z;
        try {
            InputStream open = context.getAssets().open(fbf.a);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            return qe0.a(qe0, bArr, fbf);
        } catch (IOException e) {
            hm9.m("BackgroundDataLoader", "load assets failed: " + e, new Object[0]);
            return null;
        }
    }
}
