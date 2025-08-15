package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ydf  reason: default package */
public final /* synthetic */ class ydf implements q16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ sj3 c;

    public /* synthetic */ ydf(Runnable runnable, sj3 sj3, int i) {
        this.a = i;
        this.b = runnable;
        this.c = sj3;
    }

    public final void b(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                bef bef = (bef) bundle.getParcelable("VideoCompressionModeDialog:result:key");
                if (bef != null) {
                    if (bef.equals(zdf.a)) {
                        Runnable runnable = this.b;
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    } else if (bef instanceof aef) {
                        this.c.accept(((aef) bef).a);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
            default:
                okf okf = (okf) bundle.getParcelable("VideoQualityPickerDialog:result:key");
                if (okf != null) {
                    if (okf.equals(mkf.a)) {
                        Runnable runnable2 = this.b;
                        if (runnable2 != null) {
                            runnable2.run();
                            return;
                        }
                        return;
                    } else if (okf instanceof nkf) {
                        this.c.accept(((nkf) okf).a);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
        }
    }
}
