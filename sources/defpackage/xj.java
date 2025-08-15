package defpackage;

import kotlin.coroutines.Continuation;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieDrawableUtils;

/* renamed from: xj  reason: default package */
public final class xj extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zj Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xj(zj zjVar, Continuation continuation) {
        super(2, continuation);
        this.Y = zjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((xj) n((a3f) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xj xjVar = new xj(this.Y, continuation);
        xjVar.X = obj;
        return xjVar;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        a3f a3f = (a3f) this.X;
        long longValue = ((Number) a3f.a).longValue();
        String str = (String) a3f.b;
        String str2 = (String) a3f.c;
        zj zjVar = this.Y;
        String str3 = zjVar.s0;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str3, zr6.l(z7b.j("handleAnimoji #", longValue, ", ", str), ", ", str2), (Throwable) null);
        }
        if (str != null && str.length() != 0) {
            String str4 = zjVar.s0;
            ir6 ir62 = hm9.m;
            if (ir62 != null && ir62.c()) {
                ir62.d(us7.X, str4, zr6.l(z7b.j("handleLottie #", longValue, ", ", str), ", ", str2), (Throwable) null);
            }
            fi fiVar = zjVar.o;
            int i = zjVar.a;
            fiVar.getClass();
            RLottieDrawable rLottieDrawable = (RLottieDrawable) fiVar.a.computeIfAbsent(new ei(longValue, i), new di(0, new m8(i, 1, str)));
            rLottieDrawable.scaleByCanvas = true;
            if (rLottieDrawable.isLoadingFailed()) {
                RLottieDrawableUtils.restartDownloadFromUrl(rLottieDrawable, true);
            }
            rLottieDrawable.addDrawableLoadListener(new wj(zjVar, str2));
        } else if (!(str2 == null || str2.length() == 0)) {
            zjVar.c(str2);
        }
        return e5f.a;
    }
}
