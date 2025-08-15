package defpackage;

import java.util.LinkedHashSet;

/* renamed from: f0e  reason: default package */
public final /* synthetic */ class f0e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vk8 b;
    public final /* synthetic */ zbg c;

    public /* synthetic */ f0e(vk8 vk8, zbg zbg, int i) {
        this.a = i;
        this.b = vk8;
        this.c = zbg;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m(this.c);
                return;
            default:
                ((LinkedHashSet) this.b.f).remove(this.c);
                return;
        }
    }
}
