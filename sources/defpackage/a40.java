package defpackage;

import android.os.PowerManager;

/* renamed from: a40  reason: default package */
public final /* synthetic */ class a40 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f40 b;

    public /* synthetic */ a40(f40 f40, int i) {
        this.a = i;
        this.b = f40;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((PowerManager) this.b.a.getSystemService("power")).newWakeLock(32, "ru.ok.tamtam:tam-tam-prox");
            default:
                return ((PowerManager) this.b.a.getSystemService("power")).newWakeLock(536870918, "ru.ok.tamtam:tam-tam-screen-dim");
        }
    }
}
