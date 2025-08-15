package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* renamed from: pw7  reason: default package */
public final class pw7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MainActivity Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pw7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.Y = mainActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pw7) n((Uri) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pw7 pw7 = new pw7(this.Y, continuation);
        pw7.X = obj;
        return pw7;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        Uri uri = (Uri) this.X;
        String name = this.Y.getClass().getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, name, "handle mytracker link " + uri, (Throwable) null);
        }
        return ((vj7) ((wj7) y8a.a.getAccessor().c(wj7.class)).b.getValue()).e(uri);
    }
}
