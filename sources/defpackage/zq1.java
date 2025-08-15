package defpackage;

import android.os.Handler;
import android.os.Looper;
import ru.ok.android.externcalls.sdk.AudioLevelListener;

/* renamed from: zq1  reason: default package */
public final /* synthetic */ class zq1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir1 b;

    public /* synthetic */ zq1(ir1 ir1, int i) {
        this.a = i;
        this.b = ir1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return r0e.a(((a11) this.b.b).b());
            case 1:
                return (ti9) this.b.p.getValue();
            case 2:
                ((si9) this.b.r.getValue()).g(Boolean.TRUE);
                return e5f.a;
            case 3:
                return (si9) this.b.r.getValue();
            case 4:
                return new AudioLevelListener(500, new Handler(Looper.getMainLooper()), new b(26, (Object) this.b));
            default:
                return new dr1(this.b);
        }
    }
}
