package defpackage;

import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: fk1  reason: default package */
public final /* synthetic */ class fk1 implements k56 {
    public final /* synthetic */ el1 a;
    public final /* synthetic */ m38 b;
    public final /* synthetic */ m38 c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ fk1(el1 el1, m38 m38, m38 m382, boolean z) {
        this.a = el1;
        this.b = m38;
        this.c = m382;
        this.o = z;
    }

    public final Object invoke() {
        m38 m38 = m38.b;
        int i = 1;
        boolean z = false;
        boolean z2 = this.b == m38;
        if (this.c == m38) {
            z = true;
        }
        el1 el1 = this.a;
        ir1 ir1 = el1.c;
        MicrophoneManager c2 = ((a11) ir1.b).c();
        if (c2 != null) {
            c2.setMicEnabled(z2);
        }
        if (z2) {
            ((si9) ir1.r.getValue()).g(Boolean.FALSE);
        }
        ir1.g(z);
        ir1 ir12 = el1.c;
        ir12.getClass();
        if (!this.o) {
            i = 2;
        }
        CameraManager a2 = ir12.e.a();
        if (a2 != null) {
            a2.switchCamera(new jx1(i));
        }
        return e5f.a;
    }
}
