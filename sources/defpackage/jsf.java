package defpackage;

import android.graphics.Path;
import kotlin.coroutines.Continuation;

/* renamed from: jsf  reason: default package */
public final class jsf extends ffe implements a66 {
    public final /* synthetic */ lsf X;
    public final /* synthetic */ byte[] Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jsf(lsf lsf, Continuation continuation, byte[] bArr) {
        super(2, continuation);
        this.X = lsf;
        this.Y = bArr;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jsf) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jsf(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        r70 waveView = this.X.getWaveView();
        waveView.u0 = true;
        Path path = waveView.z0;
        if (!path.isEmpty()) {
            path.reset();
        }
        byte[] bArr = this.Y;
        if (bArr != null) {
            float measuredHeight = ((float) waveView.getMeasuredHeight()) / 2.0f;
            path.reset();
            if (true ^ (bArr.length == 0)) {
                float f = waveView.o;
                float width = ((float) waveView.getWidth()) - (f / 2.0f);
                int length = bArr.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        float measuredHeight2 = (((float) waveView.getMeasuredHeight()) / 127.0f) * ((float) bArr[length]);
                        float f2 = waveView.b;
                        if (measuredHeight2 < f2) {
                            measuredHeight2 = f2;
                        }
                        float f3 = measuredHeight2 / 2.0f;
                        path.moveTo(width, measuredHeight - f3);
                        path.lineTo(width, f3 + measuredHeight);
                        width = (width - f) - waveView.c;
                        if (i < 0) {
                            break;
                        }
                        length = i;
                    }
                }
            }
            waveView.invalidate();
        }
        return e5f.a;
    }
}
