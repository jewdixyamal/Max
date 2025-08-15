package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.b;

/* renamed from: xb3  reason: default package */
public final class xb3 extends rd7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb3(b bVar, int i) {
        super(0);
        this.a = i;
        this.b = bVar;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                yb3 yb3 = this.b;
                return new jsc(yb3.getApplication(), yb3, yb3.getIntent() != null ? yb3.getIntent().getExtras() : null);
            case 1:
                this.b.reportFullyDrawn();
                return e5f.a;
            case 2:
                yb3 yb32 = this.b;
                return new j56(yb32.Y, new xb3((b) yb32, 1));
            default:
                b bVar = (b) this.b;
                i3a i3a = new i3a(new ob3(bVar, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!tpa.f(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new wt1(bVar, 8, i3a));
                    } else {
                        bVar.a.a(new sb3(i3a, 0, bVar));
                    }
                }
                return i3a;
        }
    }
}
