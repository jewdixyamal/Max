package defpackage;

import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;

/* renamed from: bf  reason: default package */
public final /* synthetic */ class bf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ af b;

    public /* synthetic */ bf(af afVar, int i) {
        this.a = i;
        this.b = afVar;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                af afVar = this.b;
                afVar.b.r1.b();
                he.d(new bf(afVar, 1));
                return;
            default:
                AnimatedFileDrawable animatedFileDrawable = this.b.b;
                if (animatedFileDrawable.v1 != null) {
                    vo0.c();
                    animatedFileDrawable.v1 = null;
                }
                animatedFileDrawable.u1 = false;
                AnimatedFileDrawable.a(animatedFileDrawable);
                animatedFileDrawable.e();
                return;
        }
    }
}
