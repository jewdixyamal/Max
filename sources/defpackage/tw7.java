package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* renamed from: tw7  reason: default package */
public final class tw7 extends ffe implements a66 {
    public final /* synthetic */ MainActivity X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tw7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.X = mainActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        Integer valueOf = Integer.valueOf(((Number) obj).intValue());
        e5f e5f = e5f.a;
        ((tw7) n(valueOf, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tw7(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        MainActivity mainActivity = this.X;
        mainActivity.X0.b(mainActivity);
        return e5f.a;
    }
}
