package defpackage;

import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

/* renamed from: ek1  reason: default package */
public final /* synthetic */ class ek1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ el1 b;
    public final /* synthetic */ m38 c;
    public final /* synthetic */ m38 o;

    public /* synthetic */ ek1(el1 el1, m38 m38, m38 m382, int i) {
        this.a = i;
        this.b = el1;
        this.c = m38;
        this.o = m382;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                m38 m38 = m38.b;
                boolean z = false;
                boolean z2 = this.c == m38;
                if (this.o == m38) {
                    z = true;
                }
                ir1 ir1 = this.b.c;
                MicrophoneManager c2 = ((a11) ir1.b).c();
                if (c2 != null) {
                    c2.setMicEnabled(z2);
                }
                if (z2) {
                    ((si9) ir1.r.getValue()).g(Boolean.FALSE);
                }
                ir1.g(z);
                return e5f.a;
            default:
                m38 m382 = m38.b;
                boolean z3 = false;
                boolean z4 = this.c == m382;
                if (this.o == m382) {
                    z3 = true;
                }
                ir1 ir12 = this.b.c;
                MicrophoneManager c3 = ((a11) ir12.b).c();
                if (c3 != null) {
                    c3.setMicEnabled(z4);
                }
                if (z4) {
                    ((si9) ir12.r.getValue()).g(Boolean.FALSE);
                }
                ir12.g(z3);
                return e5f.a;
        }
    }
}
