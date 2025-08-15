package defpackage;

import com.my.tracker.obfuscated.t;

/* renamed from: zcg  reason: default package */
public final /* synthetic */ class zcg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ zcg(t tVar, int i) {
        this.a = i;
        this.b = tVar;
    }

    public final void run() {
        int i = this.a;
        t tVar = this.b;
        switch (i) {
            case 0:
                tVar.f();
                return;
            default:
                tVar.e();
                return;
        }
    }
}
