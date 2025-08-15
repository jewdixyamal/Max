package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: er3  reason: default package */
public final class er3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public er3(long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((er3) n((nn3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        er3 er3 = new er3(this.Y, continuation);
        er3.X = obj;
        return er3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        nn3 nn3 = (nn3) this.X;
        long j = nn3.a;
        String obj2 = nn3.b.toString();
        Uri uri = nn3.Z;
        String uri2 = uri != null ? uri.toString() : null;
        if (uri2 == null) {
            uri2 = "";
        }
        return new rya(this.Y, j, nn3.u0, obj2, uri2);
    }
}
