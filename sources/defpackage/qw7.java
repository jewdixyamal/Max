package defpackage;

import android.content.Intent;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.android.deeplink.LinkInterceptorActivity;

/* renamed from: qw7  reason: default package */
public final class qw7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MainActivity Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qw7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.Y = mainActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((qw7) n((ej7) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qw7 qw7 = new qw7(this.Y, continuation);
        qw7.X = obj;
        return qw7;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int i = LinkInterceptorActivity.K0;
        MainActivity mainActivity = this.Y;
        Intent intent = new Intent(mainActivity, LinkInterceptorActivity.class);
        intent.putExtra("link:result", (ej7) this.X);
        mainActivity.startActivity(intent);
        x77 x77 = mainActivity.Z0;
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        mainActivity.Z0 = null;
        return e5f.a;
    }
}
