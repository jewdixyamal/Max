package defpackage;

import android.content.UriMatcher;
import android.net.Uri;
import kotlin.coroutines.Continuation;
import ru.ok.messages.NotificationsImagesProvider;

/* renamed from: gw9  reason: default package */
public final class gw9 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ NotificationsImagesProvider Z;
    public final /* synthetic */ Uri s0;
    public final /* synthetic */ ww0 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gw9(NotificationsImagesProvider notificationsImagesProvider, Uri uri, ww0 ww0, Continuation continuation) {
        super(2, continuation);
        this.Z = notificationsImagesProvider;
        this.s0 = uri;
        this.t0 = ww0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gw9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gw9 gw9 = new gw9(this.Z, this.s0, this.t0, continuation);
        gw9.Y = obj;
        return gw9;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        tx3 tx3 = tx3.a;
        int i = this.X;
        NotificationsImagesProvider notificationsImagesProvider = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.Y;
            this.Y = sx32;
            this.X = 1;
            UriMatcher uriMatcher = NotificationsImagesProvider.a;
            notificationsImagesProvider.getClass();
            sy1 sy1 = new sy1(1, v3c.u(this));
            sy1.n();
            g0 g = s36.o().g(wv6.a(this.s0));
            sy1.d(new af5(g, 1));
            g.m(new iw9(sy1, 0), qq1.a);
            Object m = sy1.m();
            if (m != tx3) {
                m = e5f.a;
            }
            if (m == tx3) {
                return tx3;
            }
            sx3 = sx32;
        } else if (i == 1) {
            sx3 = (sx3) this.Y;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.Y = null;
        this.X = 2;
        obj = NotificationsImagesProvider.a(notificationsImagesProvider, this.t0, sx3, this);
        return obj == tx3 ? tx3 : obj;
    }
}
