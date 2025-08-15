package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import java.util.List;

/* renamed from: z64  reason: default package */
public final /* synthetic */ class z64 implements jm7, km7, b7b, b66, fa8, pj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ z64(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public void accept(Object obj) {
        x4b x4b = (x4b) obj;
        switch (this.a) {
            case 7:
                x4b.g0(this.b);
                return;
            case 8:
                x4b.N(this.b);
                return;
            case 9:
                x4b.setRepeatMode(this.b);
                return;
            default:
                x4b.I0(this.b);
                return;
        }
    }

    public Object apply(Object obj) {
        Bitmap bitmap = (Bitmap) ((List) obj).get(this.b);
        return bitmap == null ? m28.a : f28.e(bitmap);
    }

    public void c(w98 w98) {
        if (w98.isConnected()) {
            a98 a98 = w98.a;
            a98.getClass();
            fm9.k(Looper.myLooper() == a98.X.getLooper());
            a98.o.getClass();
            ew6 b2 = y88.b();
            b2.d(new si1((Object) w98, (Object) b2, this.b, 13), nk4.a);
        }
    }

    public void invoke(Object obj) {
        int i = this.b;
        switch (this.a) {
            case 0:
                ((u65) obj).getClass();
                hm9.m("u65", "onDroppedVideoFrames: " + i, new Object[0]);
                return;
            case 1:
                ((m3b) obj).onRepeatModeChanged(i);
                return;
            case 2:
                ((n3b) obj).onRepeatModeChanged(i);
                return;
            default:
                ((n3b) obj).onRepeatModeChanged(i);
                return;
        }
    }

    public boolean test(Object obj) {
        return this.b < ((List) obj).size();
    }

    public /* synthetic */ z64(int i, y9d y9d, Bundle bundle) {
        this.a = 6;
        this.b = i;
    }

    public /* synthetic */ z64(ed edVar, int i, long j) {
        this.a = 0;
        this.b = i;
    }
}
