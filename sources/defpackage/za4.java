package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: za4  reason: default package */
public final /* synthetic */ class za4 implements cc3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lqb b;

    public /* synthetic */ za4(lqb lqb, int i) {
        this.a = i;
        this.b = lqb;
    }

    public final Object f(bg4 bg4) {
        switch (this.a) {
            case 0:
                return new bb4((Context) bg4.a(Context.class), ((fl5) bg4.a(fl5.class)).c(), bg4.b(lqb.a(kj6.class)), bg4.c(ef4.class), (Executor) bg4.f(this.b));
            default:
                return au1.r(bg4.a(kl5.class));
        }
    }
}
